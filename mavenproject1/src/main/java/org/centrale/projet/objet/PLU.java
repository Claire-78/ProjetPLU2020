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
public class PLU {

    
    public static void main(String[] args) {
        //Creation de la Map
        Map map = new Map("Parcelles.txt");
        
        
        //Affichage
        map.affiche();
        
        //Sauvegarde
        map.sauvegarde("source.txt");
    }
}
