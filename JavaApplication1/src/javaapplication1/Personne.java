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


enum TypeSexe {
    FEMME, HOMME;
}
public class Personne {
    private String Nom;
    private String Prenom;
    private int Age;
    private String Adresse;
    private String Ville;
    private String CodePostal;
    private TypeSexe Sexe;
     
    //Constructeur de la classe Personne
    public Personne(String Nom, String Prenom, int Age, String Adresse, String Ville, String CodePostal, TypeSexe Sexe) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
        this.Adresse = Adresse;
        this.Ville = Ville;
        this.CodePostal = CodePostal;
        this.Sexe = Sexe;
    }

    /*=====================================================================
    //Setters
    ==============*/
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }
    public void setCodePostal(String CodePostal) {
        this.CodePostal = CodePostal;
    }
    public void setVille(String Ville) {
        this.Ville = Ville;
    }
    public void setSexe(TypeSexe Sexe) {
        this.Sexe = Sexe;
    }
    
    
    
    
    
    
    /*=====================================================================
    //Getters
    ==============*/
    public String getNom() {
        return Nom;
    }
    public String getPrenom() {
        return Prenom;
    }
    public int getAge() {
        return Age;
    }
    public String getAdresse() {
        return Adresse;
    }
    public String getCodePostal() {
        return CodePostal;
    }
    public String getVille() {
        return Ville;
    }
    public TypeSexe getSexe() {
        return Sexe;
    }
    
  

}
