/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.*;
import java.io.*;

/**
 *
 * @author clair
 */
public class Map {

    LinkedList<Parcelle> parcelles;

    Map() {
        parcelles = new LinkedList<Parcelle>();
    }

    Map(LinkedList<Parcelle> listeParcelles){
        parcelles = listeParcelles;
    }
    
    Map(String fileName) {
        parcelles = new LinkedList<Parcelle>();
        String ligne1;
        String ligne2;
        try {
            BufferedReader fichier = new BufferedReader(new FileReader(fileName));
            ligne1 = fichier.readLine();
            ligne2 = fichier.readLine();
            while (ligne1 != null) {
                Parcelle parcelle = creerParcelle(ligne1, ligne2);
                parcelles.add(parcelle);
                ligne1 = fichier.readLine();
                ligne2 = fichier.readLine();
            }
            fichier.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Parcelle creerParcelle(String chaine, String sommets){
        Parcelle result;
        Polygone f = new Polygone();
        String[] chaineSplit = chaine.split(" ");
        String[] sommetsSplit = sommets.split(" ");
        //Remplir f
        for (String point : sommetsSplit){
            point = point.substring(1, point.length()-1);
            String[] valeurs = point.split(";");
            f.addPoint(new Point2D(Integer.parseInt(valeurs[0]), Integer.parseInt(valeurs[1])));
        }
        
        try{
           switch(chaineSplit[0]){
               case "ZU" :
                   result = new ZU(Integer.parseInt(chaineSplit[1]) , chaineSplit[2],f,Integer.parseInt(chaineSplit[3]),Float.parseFloat(chaineSplit[4]));
                   break;
               case "ZAU" :
                   result = new ZAU(Integer.parseInt(chaineSplit[1]) , chaineSplit[2],f,Integer.parseInt(chaineSplit[3]));
                   break;
               case "ZN" :
                   result = new ZN(Integer.parseInt(chaineSplit[1]) , chaineSplit[2],f);
                   break;
               case "ZA":
                   result= new ZA(Integer.parseInt(chaineSplit[1]) , chaineSplit[2],f, chaineSplit[3]);
                   break;
               default:
                   result = new Parcelle();
                   break;
           } 
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of Bounds"+e);
            return null;
        }
        return result;
    }
  
    public float calculSurface() {
        float total = 0;
        for (Parcelle p : parcelles) {
            total += p.getSurface();
        }
        return total;
    }

    public String toString() {
        String total = "";
        for (Parcelle p : parcelles) {
            total += p + "\n";
        }
        return total;
    }

    public void affiche() {
        System.out.println(toString());
    }
    
    public void sauvegarde(String fileName){
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter(fileName));
            //Ecrire toutes les parcelles
            for (Parcelle p : parcelles){
                String ligne1 = new String();
                String ligne2 = new String();
                ligne1 += p.getType() + " " + p.getNumero() + " " + p.getProprietaire();
                switch (p.getType()){
                    case "ZAU" :
                        ligne1 += " " + ((ZAU) p).getpConstructible();
                        break;
                    case "ZU" :
                        ligne1 += " " + ((ZU) p).getpConstructible()+ " " +((ZU) p).getSurfaceConstruite();
                        break;
                    case "ZA":
                        ligne1 += " " + ((ZA) p).getCulture();
                        break;
                     
                }
                for(Point2D point : p.getForme().getSommets()){
                    ligne2 += point +" ";
                }
                writer.write(ligne1);
                writer.newLine();
                writer.write(ligne2);
                writer.newLine();
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if (writer != null){
                    writer.flush();
                    writer.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
