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
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables pour la méthode main
        Document oDoc;
        Feuille[] oFtab = new Feuille[2];
        ObjetGraphique[] oOGtab1 = new ObjetGraphique[3];
        ObjetGraphique[] oOGtab2 = new ObjetGraphique[3];
        ObjetGraphique[] oOGtabGroup1 = new ObjetGraphique[2];
        ObjetGraphique[] oOGtabGroup2 = new ObjetGraphique[2];
        
        //Instances et liaisons
        //On alimente les 2 tableaux pour les groupes d'ObjetGraphique
        oOGtabGroup1[0] = new Texte();
        oOGtabGroup1[1] = new Rectangle();
        oOGtabGroup2[0] = new Carre();
        oOGtabGroup2[1] = new Cercle();
        
        //On alimente les 2 tableaux d'ObjetGraphique pour les Feuilles
        oOGtab1[0] = new Texte();
        oOGtab1[1] = new Carre();
        oOGtab1[2] = new Groupe(oOGtabGroup1);//Avec le lien du tableau d'ObjetGraphique
        
        oOGtab2[0] = new Texte();
        oOGtab2[1] = new Ellipse();
        oOGtab2[2] = new Groupe(oOGtabGroup2);//Avec le lien du tableau d'ObjetGraphique
        
        //On fait le lien entre nos tableaux d'ObjetGraphique et les Feulles
        oFtab[0] = new Feuille(oOGtab1);
        oFtab[1] = new Feuille(oOGtab2);
        
        //On fait le lien entre l'objet Document et le tableau de Feuille
        oDoc = new Document(oFtab);
        
        oDoc.Dessiner();
        
    }
    
}
