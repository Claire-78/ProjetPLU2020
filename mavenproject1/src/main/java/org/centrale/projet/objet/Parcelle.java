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
public class Parcelle {
    int numero;
    String proprietaire;
    float surface;
    int pConstructible;
    
    Parcelle(int num, String proprio, float s, int pConst){
        numero = num;
        proprietaire = proprio;
        surface = s;
        pConstructible = pConst;
    }
    
    Parcelle(Parcelle p){
        numero = p.numero;
        proprietaire = p.proprietaire;
        surface = p.surface;
        pConstructible = p.pConstructible;
    }
    
    Parcelle(){
        numero = 0;
        proprietaire = "";
        surface = 0;
        pConstructible = 0;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getProprietaire(){
        return proprietaire;
    }
    
    public float getSurface(){
        return surface;
    }
    
    public int getpConstructible(){
        return pConstructible;
    }
    
    public void setNumero(int num){
        numero = num;
    }
    
    public void setProprietaire(String proprio){
        proprietaire = proprio;
    }
    
    public void setSurface(float s){
        surface = s;
    }
    
    public void setpConstructible(int pConst){
        pConstructible = pConst;
    }
    
    public float surfaceConstructible() {
        return surface * (float)pConstructible;
    }
    
    public String toString(){
        return ("Parcelle numero " + numero + " appartenant à " + proprietaire + " avec une surface de " + surface + " dont " + pConstructible + "% constructibles.");
    }
}
