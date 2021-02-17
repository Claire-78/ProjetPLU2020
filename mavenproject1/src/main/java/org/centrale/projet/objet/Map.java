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
    
    public void creeMapAlea(){
        Random generateur = new Random();
        
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
        String nom = "";
        for (int i = 0;i<4;i++){
            nom +=(char)(generateur.nextInt(26) + 97);
            parcelles[i].setProprietaire(nom);
        }
        
        //Surfaces
        num = generateur.nextInt(100);
        parcelles[0].setSurface((float)num);
        
        while (num == (int)parcelles[0].getNumero()) {
            num = generateur.nextInt(100);
        }
        parcelles[1].setSurface((float)num);
        
        while ((num == (int)parcelles[0].getNumero())||(num == (int)parcelles[1].getNumero())) {
            num = generateur.nextInt(100);
        }
        parcelles[2].setSurface((float)num);
        
        while ((num == (int)parcelles[0].getNumero())||(num == (int)parcelles[1].getNumero())||(num == (int)parcelles[2].getNumero())) {
            num = generateur.nextInt(100);
        }
        parcelles[3].setSurface((float)num);
        
        //pConstructible
        for (int i = 0;i<4;i++){
            parcelles[i].setpConstructible(generateur.nextInt(101));
        }
    }
    
    public float getSurface(){
        float total = 0;
        for (int i = 0;i<4;i++){
            total += parcelles[i].getSurface();
        }
        return total;
    }
    
    public float getSurfaceConstructible(){
        float total = 0;
        for (int i = 0;i<4;i++){
            total += parcelles[i].surfaceConstructible();
        }
        return total;
    }
    
    public String toString(){
        String total = "";
        for (int i = 0;i<4;i++){
            total += parcelles[i].toString();
            total += "\n";
        }
        return total;
    }
    
    public void affiche(){
        System.out.println(toString());
    }
    
}
