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
public class Ellipse extends Forme implements iDessiner {

    @Override
    public void Dessiner() {
        System.out.println("  ______________________  ");
        System.out.println(" /                      \\ ");
        System.out.println("/                        \\");
        System.out.println("|                        |");
        System.out.println("|                        |");
        System.out.println("\\                        /");
        System.out.println(" \\______________________/ ");
    }
    
    
    
}
