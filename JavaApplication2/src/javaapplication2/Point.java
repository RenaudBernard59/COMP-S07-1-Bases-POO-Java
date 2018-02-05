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
public class Point extends Object {
    
    //Instanciation Variables
    private int X;
    private int Y;
    
    //Setter
    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    
    //Getter
    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
    
    //Méthodes  
    public void Dessiner(){}/*MéthodeDessiner*/;
   
    
    //Constructeur
    public Point(){
        super();
        System.out.println("Création d'un point");
    }/*Constructeur*/;
}
