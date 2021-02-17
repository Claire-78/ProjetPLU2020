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

    public ZAU(){
        super();
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
        return ((float) pConstructible * this.getSurface()/100f);
    }

    @Override
    public String toString() {
        var s = super.toString();
        s += "  % constructible : " + pConstructible + "%\n";
        return s;
    }
}
