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
    private int numero;
    private String proprietaire;
    private Polygone forme;
    private float surface;
    private int pConstructible;
    
    Parcelle(int num, String proprio, Polygone f, int pConst){
        numero = num;
        proprietaire = proprio;
        forme = f;
        surface = f.getSurface();
        pConstructible = pConst;
    }
    
    Parcelle(Parcelle p){
        numero = p.getNumero();
        proprietaire = p.getProprietaire();
        forme = p.forme;
        surface = forme.getSurface();
        pConstructible = p.getpConstructible();
    }
    
    Parcelle(){
        numero = 0;
        proprietaire = "";
        forme = new Polygone();
        surface = forme.getSurface();
        pConstructible = 0;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getProprietaire(){
        return proprietaire;
    }
    
    public Polygone getForme(){
        return forme;
    }
    
    public float getSurface(){
        return surface;
    }
    
    public int getpConstructible(){
        return pConstructible;
    }
    
    /*
    public String getType(){
        return this.getClass().GetSimpleName();
    }*/
    
    public void setNumero(int num){
        numero = num;
    }
    
    public void setProprietaire(String proprio){
        proprietaire = proprio;
    }
    
    public void setForme(Polygone poly){
        forme = poly;
        surface = forme.getSurface();
    }
    
    public void setpConstructible(int pConst){
        pConstructible = pConst;
    }
    
    public float surfaceConstructible() {
        return surface * (float)pConstructible;
    }
    
    public String toString(){
        return ("Parcelle numero " + numero + " appartenant à " + proprietaire + " avec une surface de " + surface + " dont " + pConstructible + "% constructibles, et dont la forme est :\n"+ forme.toString());
    }
}
