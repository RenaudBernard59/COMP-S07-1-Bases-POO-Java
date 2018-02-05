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
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Personne oPersonne = new Facteur();
        //Instanciation des personnes
        Personne oPersonne = new Personne();
        
        //Variables de Personne
        oPersonne.setNom("BERNARD");
        oPersonne.setPrenom("Renaud");
        oPersonne.setAge(26);
        oPersonne.setCodePostal(59270);
        oPersonne.setVille("Bailleul");
        oPersonne.setNRue(1158);
        oPersonne.setRue("Route de Méteren");
        
           
        System.out.print(
            "Nom : " + oPersonne.getNom() + " - Prenom : " + oPersonne.getPrenom()
            + ".\nAge : " + oPersonne.getAge()+ " ans.\nHabite : \n\t" +
            oPersonne.getNRue() + ", " + oPersonne.getRue() + "\n\t" +
            oPersonne.getCodePostal() + " " + oPersonne.getVille() + ".\n\n"
          
        );

    }
    
}
