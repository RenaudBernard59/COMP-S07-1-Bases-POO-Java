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
public class Facteur extends Personne {
    
    private int AnneesAnciennetees;
    
    public Facteur(String Nom, String Prenom, int Age, String Adresse, String Ville, String CodePostal, TypeSexe Sexe, int AnneesAnciennetees) {
       super(Nom, Prenom, Age, Adresse, Ville, CodePostal, Sexe);
        this.AnneesAnciennetees = AnneesAnciennetees;
        
    }
    //Constructeur de la classe Facteur
    /*
    public Facteur() {
        super(); //Appel le constructeur de la classe mère
        System.out.println("Création de l'objet Facteur");
        //super(); INTERDIT !!!
    }
*/
    
    //surcharge de méthode de classe Mère : Personne
    @Override // veut dire Surcharge en JAVA
    public String getNom() {
        return super.getNom()+" (Facteur) "; //To change body of generated methods, choose Tools | Templates.
    }
    public String getAnneesAnciennetees() {
        return super.getNom()+" (Facteur) "; //To change body of generated methods, choose Tools | Templates.
    }
    //Par le polymorphisme : 
    //java reconnaît la bonne méthode selon l'objet
    
}
