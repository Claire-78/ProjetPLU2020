/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.*;

/**
 *
 * @author clair
 */
public class TestPolygone {

    public static void main(String[] args) {
        //Création des points
        List<Point2D> liste = new ArrayList();
        Point2D p1 = new Point2D();
        liste.add(p1);
        liste.add(new Point2D(1, 0));
        liste.add(new Point2D(0, 1));

        //Création et translation des polygones
        Polygone poly1 = new Polygone(liste);
        Polygone poly2 = new Polygone(poly1);
        poly2.translate(2, 0);

        //Affichage
        System.out.println("Polygone 1 :\n" + poly1.toString());
        System.out.println("Polygone 2 :\n" + poly2.toString());

        //Calcul des surfaces
        System.out.println("Surface du polygone 1 : " + poly1.getSurface());
        System.out.println("Surface du polygone 2 : " + poly2.getSurface());
    }
}
