/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.text.DecimalFormat;
/**
 *
 * @author clair
 */
public class ZU extends ZAU {

    private static DecimalFormat df = new DecimalFormat("0.00");
    private float surfaceConstruite;

    ZU(){
        super();
        surfaceConstruite = 0;
    }
    
    ZU(int num, String proprio, Polygone f, int pConst, float surfConstruite){
        super(num,proprio,f,pConst);
        surfaceConstruite = surfConstruite;
    }
    
    ZU(ZU p){
        super(p);
        surfaceConstruite = p.getSurfaceConstruite();
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
        s += "  Surface construite : " + df.format(surfaceConstruite) + "\n";
        s += "  Surface constructible restante : " + df.format(surfaceConstructible()) + "\n";
        return s;
    }
}
