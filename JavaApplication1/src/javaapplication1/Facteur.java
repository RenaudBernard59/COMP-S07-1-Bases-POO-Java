/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javaapplication1.Personne;

/**
 *
 * @author renob
 */
//Extends = héritage
// Facteur Hérite de la classe Perosnne
public class Facteur extends Personne {
    public Facteur() {
        super();
        System.out.println("Création de l'objet Facteur\n");
    }

    @Override
    public String getNom() {
        return "F : " + super.getNom();
    }
    

}

