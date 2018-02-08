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
public class Feuille implements iDessiner {
    private ObjetGraphique[] oOGtab;
    
    public Feuille (ObjetGraphique[] oOGtab) {
        this.oOGtab = oOGtab;
    }

    @Override
    public void Dessiner() {
        System.out.println("___________________________________");
        for(ObjetGraphique oOG : oOGtab) {
            oOG.Dessiner();
        }
        System.out.println("___________________________________");
    }

    
    
    public void setoOGtab(ObjetGraphique[] oOGtab) {
        this.oOGtab = oOGtab;
    }

    public ObjetGraphique[] getoOGtab() {
        return oOGtab;
    }
    
    
}
