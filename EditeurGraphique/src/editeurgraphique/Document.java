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
public class Document implements iDessiner {
    private Feuille[] oFtab;
    
    public Document (Feuille[] oFtab) {
        this.oFtab = oFtab;
    }

    @Override
    public void Dessiner() {
        System.out.println("****************************************************");
        for(Feuille oF : oFtab) {
            oF.Dessiner();
        }
        System.out.println("****************************************************");
    }

    
    
    public void setoFtab(Feuille[] oFtab) {
        this.oFtab = oFtab;
    }

    public Feuille[] getoFtab() {
        return oFtab;
    }
    
    
}
