/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author clair
 */
public class ZAU extends Parcelle {

    private int pConstructible;

    ZAU(){
        setNumero(0);
        setProprietaire(new String());
        setForme(new Polygone());
        pConstructible = 0;
    }
    
    ZAU(Parcelle p){
        setNumero(p.getNumero());
        setProprietaire(p.getProprietaire());
        setForme(p.getForme());
        pConstructible = 0;
    }
    
    public int getpConstructible() {
        return pConstructible;
    }

    public void setpConstructible(int p) {
        pConstructible = p;
    }

    public float surfaceConstructible() {
        return ((float) pConstructible * this.getSurface());
    }

    public String toString() {
        String s = ((Parcelle) this).toString();
        s += "  % constructible : " + pConstructible + "\n";
        return s;
    }
}
