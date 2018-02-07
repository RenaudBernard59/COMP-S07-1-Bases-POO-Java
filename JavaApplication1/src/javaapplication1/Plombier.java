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
   this.Tarif = Tarif;
   System.out.println("Création de l'objet Plombier");
}
    
public void offreService() {}
    
public void setTarif(double Tarif) {
    this.Tarif = Tarif;
}
    
public String getTarif() {
    return super.getTarif() + " est son tarif.\n";
}

public void afficherTarifs() {
    System.out.printf("Le prix est %2.2f € \n")((Plombier)oPi.getTarif();
} 
}/*END Class Plombier!*/