/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Formation
 */
//extends = héritage
//Facteur (fille) hérite de la classe Personne (mère)
public class Facteur extends Personne implements iFacteur {
    private int NbAnneeAnc;
 
    public Facteur(String Nom, String Prenom, int Age, String Adresse, String Ville, 
            String CodePostal,TypeSexe sexe,int NbAnneeAnc) {
        super(Nom, Prenom, Age, Adresse, 
                Ville, CodePostal,sexe);
        this.NbAnneeAnc = NbAnneeAnc;
       
    }
    //Constructeur de la classe Facteur
    /*
    public Facteur() {
        super(); //Appel le constructeur de la classe mère
        System.out.println("Création de l'objet Facteur");
        //super(); INTERDIT !!!
    }
*/

    public int getNbAnneeAnc() {
        return NbAnneeAnc;
    }
    
    //surcharge de méthode de classe Mère : Personne
    @Override // veut dire Surcharge en JAVA
    public String getNom() {
        return super.getNom()+" (Facteur) "; //To change body of generated methods, choose Tools | Templates.
    }
    //Par le polymorphisme : 
    //java reconnaît la bonne méthode selon l'objet

    @Override
    public void DistribuerLeCourrier(Courrier c) {
        System.out.println("Je distribue le courrier !");
    }
    
}
