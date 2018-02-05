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
        
        //déclaration des variables
        Personne oPersonne, oPersonne2;
        Facteur oFacteur1, oFacteur2;
                
        //Instanciation des variab;es
        oPersonne = new Personne();
        oPersonne2 = new Personne();
        oFacteur1 = new Facteur();
        oFacteur2 = new Facteur();
        
        
        //Variables de Personne
        oPersonne.setNom("BERNARD");
        oPersonne.setPrenom("Renaud");
        oPersonne.setAge(26);
        oPersonne.setCodePostal(59270);
        oPersonne.setVille("Bailleul");
        oPersonne.setNRue(1158);
        oPersonne.setRue("Route de Méteren");
        
        //Variables de Facteur1
        oPersonne2.setNom("ROBERT");
        oPersonne2.setPrenom("Régis");
        oPersonne2.setAge(35);
        oPersonne2.setCodePostal(01000);
        oPersonne2.setVille("Plouc-Ville");
        oPersonne2.setNRue(1);
        oPersonne2.setRue("Rue du trou du cul du monde");
        
        //Variables de Facteur3=1
        oFacteur1.setNom("SMITH");
        oFacteur1.setPrenom("Johns");
        oFacteur1.setAge(1235);
        oFacteur1.setCodePostal(20567);
        oFacteur1.setVille("Taridis");
        oFacteur1.setNRue(14);
        oFacteur1.setRue("Rue des Docteurs");
        
        //Variables de Facteur2
        oFacteur2.setNom("HAMOND");
        oFacteur2.setPrenom("John");
        oFacteur2.setAge(65);
        oFacteur2.setCodePostal(75004);
        oFacteur2.setVille("Paris");
        oFacteur2.setNRue(12);
        oFacteur2.setRue("Rue du Musée des Dinosaues");
        
       
        //Imprimante
        System.out.print(
            "Nom : " + oPersonne.getNom() + " - Prenom : " + oPersonne.getPrenom()
            + ".\nAge : " + oPersonne.getAge()+ " ans.\nHabite : \n\t" +
            oPersonne.getNRue() + ", " + oPersonne.getRue() + "\n\t" +
            oPersonne.getCodePostal() + " " + oPersonne.getVille() + ".\n\n"
            +    
            "Nom : " + oPersonne2.getNom() + " - Prenom : " + oPersonne2.getPrenom()
            + ".\nAge : " + oPersonne2.getAge()+ " ans.\nHabite : \n\t" +
            oPersonne2.getNRue() + ", " + oPersonne2.getRue() + "\n\t" +
            oPersonne2.getCodePostal() + " " + oPersonne2.getVille() + ".\n\n"
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
            ); 


    }
    
}
