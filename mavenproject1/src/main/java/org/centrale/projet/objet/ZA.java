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
public class ZA extends ZN {

    private String culture;

    ZA() {
        super();
        culture = new String();
    }

    ZA(int num, String proprio, Polygone f, String cult) {
        super(num, proprio, f);
        culture = cult;
    }

    ZA(ZA p) {
        super(p);
        culture = p.getCulture();
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String cult) {
        culture = cult;
    }

    public String toString() {
        String s = super.toString();
        s += "  Type de culture : " + culture + "\n";
        return s;
    }
}
