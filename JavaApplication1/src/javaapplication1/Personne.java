/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author renob
 */
public class Personne {
    
    private String Nom;
    private String Prenom;
    private int Age;
    private int CodePostal;
    private String Ville;
    private int NRue;
    private String Rue;
    
    
    // Setters
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setCodePostal(int CodePostal) {
        this.CodePostal = CodePostal;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public void setRue(String Rue) {
        this.Rue = Rue;
    }

    public void setNRue(int NRue) {
        this.NRue = NRue;
    }
    
    
    
    
    //Getters
    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public int getAge() {
        return Age;
    }

    public int getCodePostal() {
        return CodePostal;
    }

    public String getVille() {
        return Ville;
    }

    public String getRue() {
        return Rue;
    }

    public int getNRue() {
        return NRue;
    }
    
    
    
 
    
    
    
    //Constructeur de la classe Personne
    public Personne() {
        System.out.print("Création de l'objet personne \n\n");
        Ville = "Lille";
        CodePostal = 59000;
    }
}
