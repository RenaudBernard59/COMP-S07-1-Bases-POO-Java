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
public class Feuille implements iDessiner{
    private ObjetGraphique[] oOGtab;

    public Feuille(ObjetGraphique[] oOGtab) {
        this.oOGtab = oOGtab;
    }

    public ObjetGraphique[] getoOGtab() {
        return oOGtab;
    }

    @Override
    public void Dessiner() {
        System.out.println("Je dessine un Feuille !");
        for(ObjetGraphique oOG : getoOGtab())
        {
            oOG.Dessiner();
        }
    }
    
    
    
}
