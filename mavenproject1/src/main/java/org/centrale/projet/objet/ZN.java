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
public class ZN extends Parcelle {
    
    ZN(){
        super();
    }
    
    ZN(int num, String proprio, Polygone f) {
        super(num,proprio,f);
    }
    
    ZN(ZN p){
        super(p);
    }
    
    public String toString(){
        return super.toString();
    }
}
