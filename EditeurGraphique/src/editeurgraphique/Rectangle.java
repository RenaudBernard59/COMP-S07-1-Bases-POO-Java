/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editeurgraphique;

/**
 *
 * @author Formation
 */
public class Rectangle extends Forme implements iDessiner {

    @Override
    public void Dessiner() {
        System.out.println("_____________________");
        System.out.println("|                   |");
        System.out.println("|                   |");
        System.out.println("|___________________|");
    }
    
}
