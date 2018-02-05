/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author renob
 */
public class Rectangle {
    
     //Constructeur
    public Rectangle(){
        super();
        System.out.println("Création d'un Rectangle");
    };
    //Méthode
    @Override
    public void Dessiner(){
        //super Dessiner();
        System.out.println("Dessiner Rectangle");
    };
}