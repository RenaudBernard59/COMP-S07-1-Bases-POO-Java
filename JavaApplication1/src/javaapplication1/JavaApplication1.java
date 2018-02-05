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
        //Personne oPersonne = new Personne();
        //Instanciation des personnes
        Personne oPersonne = new Personne();
        Personne oFacteur1 = new Facteur();
        Personne oFacteur2 = new Personne();
        Personne oFacteur3 = new Facteur();
        
        //Variables de Personne
        oPersonne.setNom("BERNARD");
        oPersonne.setPrenom("Renaud");
        oPersonne.setAge(26);
        oPersonne.setCodePostal(59270);
        oPersonne.setVille("Bailleul");
        oPersonne.setNRue(1158);
        oPersonne.setRue("Route de Méteren");
        
        //Variables de Facteur1
        oFacteur1.setNom("ROBERT");
        oFacteur1.setPrenom("Régis");
        oFacteur1.setAge(35);
        oFacteur1.setCodePostal(01000);
        oFacteur1.setVille("Plouc-Ville");
        oFacteur1.setNRue(1);
        oFacteur1.setRue("Rue du trou du cul du monde");
        
        //Variables de Facteur2
        oFacteur2.setNom("HAMOND");
        oFacteur2.setPrenom("John");
        oFacteur2.setAge(65);
        oFacteur2.setCodePostal(75004);
        oFacteur2.setVille("Paris");
        oFacteur2.setNRue(12);
        oFacteur2.setRue("Rue du Musée des Dinosaues");
        
        //Variables de Facteur3
        oFacteur3.setNom("SMITH");
        oFacteur3.setPrenom("JOHN");
        oFacteur3.setAge(1235);
        oFacteur3.setCodePostal(20567);
        oFacteur3.setVille("Taridis");
        oFacteur3.setNRue(14);
        oFacteur3.setRue("Rue des Docteurs");
        
        
        
        System.out.print(
            "Nom : " + oPersonne.getNom() + " - Prenom : " + oPersonne.getPrenom()
            + ".\nAge : " + oPersonne.getAge()+ " ans.\nHabite : \n\t" +
            oPersonne.getNRue() + ", " + oPersonne.getRue() + "\n\t" +
            oPersonne.getCodePostal() + " " + oPersonne.getVille() + ".\n\n"
            +    
            "Nom : " + oFacteur1.getNom() + " - Prenom : " + oFacteur1.getPrenom()
            + ".\nAge : " + oFacteur1.getAge()+ " ans.\nHabite : \n\t" +
            oFacteur1.getNRue() + ", " + oFacteur1.getRue() + "\n\t" +
            oFacteur1.getCodePostal() + " " + oFacteur1.getVille() + ".\n\n"
            +
            "Nom : " + oFacteur2.getNom() + " - Prenom : " + oFacteur2.getPrenom()
            + ".\nAge : " + oFacteur2.getAge()+ " ans.\nHabite : \n\t" +
            oFacteur2.getNRue() + ", " + oFacteur2.getRue() + "\n\t" +
            oFacteur2.getCodePostal() + " " + oFacteur2.getVille() + ".\n\n"   
            +
            "Nom : " + oFacteur3.getNom() + " - Prenom : " + oFacteur3.getPrenom()
            + ".\nAge : " + oFacteur3.getAge()+ " ans.\nHabite : \n\t" +
            oFacteur3.getNRue() + ", " + oFacteur3.getRue() + "\n\t" +
            oFacteur3.getCodePostal() + " " + oFacteur3.getVille() + ".\n\n"
        );

    }
    
}
