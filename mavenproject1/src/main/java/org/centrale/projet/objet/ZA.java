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

    public String getCulture() {
        return culture;
    }

    public void setCulture(String cult) {
        culture = cult;
    }

    public String toString() {
        String s = ((Parcelle) this).toString();
        s += "Type de culture : " + culture + "\n";
        return s;
    }
}
