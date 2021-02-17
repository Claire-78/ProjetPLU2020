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

    Parcelle(int num, String proprio, Polygone f) {
        numero = num;
        proprietaire = proprio;
        forme = f;
        surface = f.getSurface();
    }

    Parcelle(Parcelle p) {
        numero = p.getNumero();
        proprietaire = p.getProprietaire();
        forme = p.getForme();
        surface = forme.getSurface();
    }

    Parcelle() {
        numero = 0;
        proprietaire = "";
        forme = new Polygone();
        surface = forme.getSurface();
    }

    public int getNumero() {
        return numero;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public Polygone getForme() {
        return forme;
    }

    public float getSurface() {
        return surface;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public void setNumero(int num) {
        numero = num;
    }

    public void setProprietaire(String proprio) {
        proprietaire = proprio;
    }

    public void setForme(Polygone poly) {
        forme = poly;
        surface = forme.getSurface();
    }

    public String toString() {
        String s = "Parcelle numero " + numero + "\n";
        s += "  Type : " + getType() + "\n";
        s += "  Propriétaire : " + proprietaire + "\n";
        s += "  Forme : " + forme + "\n";
        s += "  Surface : " + surface + "m²\n";
        return (s);
    }
}
