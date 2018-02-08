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
public class Groupe extends ObjetGraphique {
   private ObjetGraphique[] oOGtab;

    public Groupe(ObjetGraphique[] oOGtab) {
        this.oOGtab = oOGtab;
    }

    public ObjetGraphique[] getoOGtab() {
        return oOGtab;
    }

    @Override
    public void Dessiner() {
        super.Dessiner(); //To change body of generated methods, choose Tools | Templates.
        for(ObjetGraphique oOG : getoOGtab())
        {
            oOG.Dessiner();
        }
    }
   
    
   
}
