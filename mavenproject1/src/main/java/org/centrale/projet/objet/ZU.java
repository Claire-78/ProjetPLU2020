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
public class ZU extends ZAU {

    private float surfaceConstruite;

    public float getSurfaceConstruite() {
        return surfaceConstruite;
    }

    public void setSurfaceConstruite(float s) {
        surfaceConstruite = s;
    }

    public float surfaceConstructible() {
        return (((ZAU) this).surfaceConstructible() - surfaceConstruite);
    }

    public String toString() {
        String s = ((ZAU) this).toString();
        s += "Surface construite : " + surfaceConstruite + "\n";
        s += "Surface constructible restante : " + surfaceConstructible() + "\n";
        return s;
    }
}
