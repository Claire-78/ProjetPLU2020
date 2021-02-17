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
public class Point2D {
    private int x;
    private int y;
    
    Point2D(){
        x = 0;
        y = 0;
    }
    
    Point2D(int a, int b){
        x = a;
        y = b;
    }
    
    Point2D(Point2D p){
        x = p.getX();
        y = p.getY();
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int a){
        x = a;
    }
    
    public void setY(int b){
        x = b;
    }
    
    public void setPosition(int a, int b){
        x = a;
        y = b;
    }
    
    public void translate(int a, int b){
        x += a;
        y += b;
    }
    
    public String toString(){
        return("["+x+","+y+"]");
    }
    
    public void affiche(){
        System.out.println(toString());
    }

}
