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
        pConstructible = 0;
    }
    
    ZAU(int num, String proprio, Polygone f,int pConst){
        super(num,proprio,f);
        pConstructible = pConst;
    }
    
    ZAU(ZAU p){
        super(p);
        pConstructible = p.getpConstructible();
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
