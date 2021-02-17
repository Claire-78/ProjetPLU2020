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
        setNumero(0);
        setProprietaire(new String());
        setForme(new Polygone());
    }
    
    ZN(Parcelle p){
        setNumero(p.getNumero());
        setProprietaire(p.getProprietaire());
        setForme(p.getForme());
    }
    
    public String toString(){
        return super.toString();
    }
}
