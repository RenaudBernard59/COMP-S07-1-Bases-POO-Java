/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Formation
 */
public class ObjetGraphique implements iDessiner {

    @Override
    public void Dessiner() {
        System.out.println("Je dessine :"+this.getClass().getName());
    }
    
}
