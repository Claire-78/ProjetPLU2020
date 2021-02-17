/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author clair
 */
public class PLU {
    public static void main(String[] args) {
        //Création des points
        List<Point2D> liste = new ArrayList();
        liste.add(new Point2D(2,3));
        liste.add(new Point2D(1,4));
        liste.add(new Point2D(-1,2));
        liste.add(new Point2D(0,1));
        
        //Création et translation des polygones
        Polygone poly1 = new Polygone(liste);
        Polygone poly2 = new Polygone(poly1);
        Polygone poly3 = new Polygone(poly1);
        Polygone poly4 = new Polygone(poly1);
        poly2.translate(2,0);
        poly3.addPoint(new Point2D(1,1));
        poly3.translate(4,0);
        poly4.translate(3,2);
        
        //Creation de la Map
        Map map = new Map();
        
        map.creeMapAlea(poly1,poly2,poly3,poly4);
        
        //Affichage
        map.affiche();
    }
}
