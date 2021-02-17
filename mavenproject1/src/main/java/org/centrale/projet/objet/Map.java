/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;
/**
 *
 * @author clair
 */
public class Map {
    Parcelle[] parcelles;
    
    Map(){
        parcelles = new Parcelle[4];
    }
    
    public void creeMapAlea(Polygone poly1,Polygone poly2, Polygone poly3, Polygone poly4){
        Random generateur = new Random();
        parcelles[0] = new ZAU();
        parcelles[1] = new ZU();
        parcelles[2] = new ZN();
        parcelles[3] = new ZA();
        
        //Numeros
        int num;
        num = generateur.nextInt(100);
        parcelles[0].setNumero(num);
        
        while (num == parcelles[0].getNumero()) {
            num = generateur.nextInt(100);
        }
        parcelles[1].setNumero(num);
        
        while ((num == parcelles[0].getNumero())||(num == parcelles[1].getNumero())) {
            num = generateur.nextInt(100);
        }
        parcelles[2].setNumero(num);
        
        while ((num == parcelles[0].getNumero())||(num == parcelles[1].getNumero())||(num == parcelles[2].getNumero())) {
            num = generateur.nextInt(100);
        }
        parcelles[3].setNumero(num);
        
        //Propriétaires
        String nom;
        for (int i = 0;i<4;i++){
            nom = "";
            for (int j = 0; j < 6; j++) {
                nom += (char) (generateur.nextInt(26) + 97);
            }
            parcelles[i].setProprietaire(nom);
        }
        
        //Formes
        parcelles[0].setForme(poly1);
        parcelles[1].setForme(poly2);
        parcelles[2].setForme(poly3);
        parcelles[3].setForme(poly4);
        
        //Différentiation des types
            //ZAU
        num = generateur.nextInt(100);
        ((ZAU)parcelles[0]).setpConstructible(num);
        
            //ZU
        num = generateur.nextInt(100);
        ((ZU)parcelles[1]).setpConstructible(num);
        num = generateur.nextInt((int)((ZAU)parcelles[1]).surfaceConstructible());
        System.out.println(((ZAU)parcelles[0]).surfaceConstructible());
        ((ZU)parcelles[1]).setSurfaceConstruite(num);
        
            //ZN : rien à faire de plus
            //ZA
        String culture = "";
        for (int j = 0; j < 6; j++) {
            culture += (char) (generateur.nextInt(26) + 97);
        }
        ((ZA)parcelles[3]).setCulture(culture);
    }
    
    public float getSurface(){
        float total = 0;
        for (int i = 0;i<4;i++){
            total += parcelles[i].getSurface();
        }
        return total;
    }
    
    /*
    public float getSurfaceConstructible(){
        float total = 0;
        for (int i = 0;i<4;i++){
            total += parcelles[i].surfaceConstructible();
        }
        return total;
    }*/
    
    public String toString(){
        String total = "";
        for (int i = 0;i<4;i++){
            total += parcelles[i].toString() +"\n";
        }
        return total;
    }
    
    public void affiche(){
        System.out.println(toString());
    }
}
