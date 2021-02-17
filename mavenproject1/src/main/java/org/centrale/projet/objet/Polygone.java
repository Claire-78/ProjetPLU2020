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
public class Polygone {
    private List<Point2D> sommets;
    
    Polygone(){
        sommets = new ArrayList();
    }
    
    Polygone(List<Point2D> points){
        sommets = points;
    }
    
    Polygone(Polygone p){
        sommets = new ArrayList<Point2D>();
        for (Point2D point :p.getSommets()){
            sommets.add(new Point2D(point));
        }
    }
    
    public List<Point2D> getSommets(){
        return sommets;
    }
    
    public void setSommets(List<Point2D> points){
        sommets = points;
    }
    
    public void addPoint(Point2D p){
        sommets.add(p);
    }
    
    public void translate(int a, int b){
        sommets.forEach(sommet -> {
            sommet.translate(a,b);
        });
    }
    
    public float getSurface(){
        float surface = 0;
        Point2D pi;
        Point2D pi1;
        for (int i=0;i<sommets.size();i++){
            pi = sommets.get(i);
            pi1 = sommets.get((i+1)%sommets.size());
            
            surface += (float) (pi.getX()*pi1.getY() - pi1.getX()*pi.getY());
        }
        return (surface/2.0f);
    }
    
    public String toString(){
        String affichage = new String();
        affichage += "Polygone à " + sommets.size() + " points :\n";
        
        for (Point2D sommet : sommets) {
            affichage += sommet.toString() + "\n";
        }
        return affichage;
    }
    
}
