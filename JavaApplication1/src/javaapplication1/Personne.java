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
public class Personne {
    private String Nom;
    private String Prenom;
    private int Age;
    private String Adresse;
    private String Ville;
    private String CodePostal;
     
    //Constructeur de la classe Personne
    /*
    public Personne() {
        System.out.println("Création de l'objet Personne");
        this.Age = 10;
        
    }
    */
    
    public Personne(String Nom, String Prenom, 
            int Age, String Adresse, String Ville, String CodePostal) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
        this.Adresse = Adresse;
        this.Ville = Ville;
        this.CodePostal = CodePostal;
    }

    

    
   
    //un procédure = retourne rien
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    //Affecte le prénom dans la donnée privée Prenom
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    //une fonctionne = retourne une variable = résultat
    public String getPrenom() {
        return Prenom;
    }

    public String getNom() {
        return Nom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
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

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public void setCodePostal(String CodePostal) {
        this.CodePostal = CodePostal;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

}
