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
public class Groupe extends ObjetGraphique implements iDessiner {
    private ObjetGraphique[] oOGtab;

    @Override
    public void Dessiner() {
        System.out.println("----------------------");
        for(ObjetGraphique oOG : oOGtab) {
            oOG.Dessiner();
        }
        System.out.println("----------------------");
    }
    
    
    
    public Groupe (ObjetGraphique[] oOGtab) {
        this.oOGtab = oOGtab;
    }

    public ObjetGraphique[] getoOGtab() {
        return oOGtab;
    }
    
}
