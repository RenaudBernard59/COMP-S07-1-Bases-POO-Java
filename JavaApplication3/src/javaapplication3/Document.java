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
public class Document implements iDessiner{
    private Feuille[] oFtab;

    public Document(Feuille[] oFtab) {
        this.oFtab = oFtab;
    }

    public Feuille[] getoFtab() {
        return oFtab;
    }

    @Override
    public void Dessiner() {
        System.out.println("Je dessine un Document !");
        for(Feuille f : getoFtab())
        {
            f.Dessiner();
        }
    }
    
    
    
}
