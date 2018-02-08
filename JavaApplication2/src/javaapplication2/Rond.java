/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Formation
 */
public class Rond extends FormeGeometrique{
    
    public Rond(int x, int y) {
        super(x, y);
    }

    @Override
    public void Dessiner() {
        System.out.println(" ** ");
        System.out.println("*  *");
        System.out.println("*  *");
        System.out.println(" ** ");
    }
    
}
