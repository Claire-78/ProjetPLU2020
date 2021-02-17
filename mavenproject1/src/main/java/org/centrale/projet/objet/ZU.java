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
public class ZU extends ZAU {

    private float surfaceConstruite;

    ZU(){
        setNumero(0);
        setProprietaire(new String());
        setForme(new Polygone());
        setpConstructible(0);
        surfaceConstruite = 0;
    }
    
    ZU(Parcelle p, int pConst, float surfConstruite){
        setNumero(p.getNumero());
        setProprietaire(p.getProprietaire());
        setForme(p.getForme());
        setpConstructible(pConst);
        surfaceConstruite = surfConstruite;
    }
    
    public float getSurfaceConstruite() {
        return surfaceConstruite;
    }

    public void setSurfaceConstruite(float s) {
        surfaceConstruite = s;
    }

    public float surfaceConstructible() {
        return (super.surfaceConstructible() - surfaceConstruite);
    }

    public String toString() {
        String s = super.toString();
        s += "  Surface construite : " + surfaceConstruite + "\n";
        s += "  Surface constructible restante : " + surfaceConstructible() + "\n";
        return s;
    }
}
