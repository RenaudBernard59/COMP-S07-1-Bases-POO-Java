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
public class Plombier extends Personne {
    private double Tarif;
    
    public Plombier(String Nom, String Prenom, int Age, String Adresse, String Ville, String CodePostal, TypeSexe Sexe, double Tarif) {
       super(Nom, Prenom, Age, Adresse, Ville, CodePostal, Sexe);
       System.out.println("Création de l'objet Plombier");
    }
    
    public void offreService(double Tarif) {}
    
    
     public void setTarif(double Tarif) {
        this.Tarif = Tarif;
    }
    
    @Override
    public String getTarif() {
        return super.getTarif() + " est son tarif.\n";
    }
    
    
    
}/*END Class Plombier!*/
