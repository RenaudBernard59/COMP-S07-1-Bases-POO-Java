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
public class EditeurGraphique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Feuille[] oFtab = new Feuille[3];
        Document oDoc = new Document(oFtab);
        ObjetGraphique[] oOGtab1 = new ObjetGraphique[2];
        ObjetGraphique[] oOGtab2 = new ObjetGraphique[4];
        ObjetGraphique[] oOGtab3 = new ObjetGraphique[2];

        oFtab[0] = new Feuille(oOGtab1);
        oFtab[1] = new Feuille(oOGtab2);
        oFtab[2] = new Feuille(oOGtab3);
        
        ObjetGraphique[] oGtab = new ObjetGraphique[2];
        
        oGtab[0] = new Rectangle();
        oGtab[1] = new Texte();
        
        oOGtab1[0]= new Carre();
        oOGtab1[1]= new Texte();
        oOGtab2[0]= new Cercle();
        oOGtab2[1]= new Ellipse();
        oOGtab2[2]= new Groupe(oGtab);
        oOGtab2[3]= new Ellipse();
        oOGtab3[0]= new Cercle();
        oOGtab3[1]= new Ligne();
        
        oDoc.Dessiner();
    }
    
}
