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

//Création tableaux






public class JavaApplication1 {
    public static void main(String[] args) {
        // TODO code application logic here
        // Je suis obligé de créer une objet de la classe
        // JavaApplication1 pour utiliser la méthode
        // afficherUnePersonne
        //création de l'objet oPersonne de l'instance
        //de la classe Personne 
        //oPersonne devient un objet de type 
        // de la classe Facteur
        // qui a automatiquement une instance de le classe
        // Personne
        //Personne oPersonne = new Personne();
          //Object o1 = new Object(); 
        //Object o1;
        //o1 = new Object();
        //Objet o1 et la classe object du Java
        //la classe Object est la méta classe de Java
        
       //Mis en commentaire des Setter car j'ai 
       //  utilisé un autre constructeur avec paramètres
       /*
        oPersonne.setNom("Germain");
        oPersonne.setPrenom("Christophe");
        //oPersonne.setAge(46);
        oPersonne.setCodePostal("72000");
        oPersonne.setVille("Le Mans");
        oPersonne.setAdresse("Rue du Mans");
        */      
       
        JavaApplication1 oMain = new JavaApplication1();
        
        Personne[] oPtab = new Personne[10];

        int indice = 0;
        System.out.println("---Début tableau juste personne---");
        for (Personne oPi : oPtab) {
            int i = indice + 1;
            oPi = new Personne("Germain"+i,"André"+i,(35+i),"Rue du Maine","53000","Laval",TypeSexe.HOMME);
            oPtab[indice] = oPi;
            indice++;
        }   

        //déclarations des variables
        Personne oPersonne1, oPersonne2;
        Facteur oFacteur1,oFacteur2;
        
        //Instanciation des variables
        /*oPersonne1 = new Personne();
        oPersonne2 = new Personne();
        oFacteur1 = new Facteur();
        oFacteur2 = new Facteur();
        

        //Remplace le bloc d'affichage par l'appel de la méthode
        oMain.afficherUnePersonne(oPersonne1);
         System.out.println("------");
         oMain.afficherUnePersonne(oPersonne2);
        System.out.println("------");
        oMain.afficherUnePersonne(oFacteur1);
         System.out.println("------");
         oMain.afficherUnePersonne(oFacteur2);
         
        
        oFacteur1.setNom("Germain");
        oFacteur1.setPrenom("André");
        oFacteur1.setAge(20);
        oFacteur1.setCodePostal("53000");
        oFacteur1.setVille("Laval");
        oFacteur1.setAdresse("Rue du Maine");
        oFacteur1.setSexe(HOMME);
        oFacteur1.setAnneesAnciennetees(30);*/
    }
    //Méthode publique de la classe JavaApplication1
    // Elle ne peut être manipulée uniquement que par un objet
    // de la classe JavaApplication1
    // Elle attend en paramètre un objet d'une classe 
    // de type Personne et
    // de ses filles
    public void afficherUnePersonne(Personne oP)
    {
        System.out.println("Nom : "+
                oP.getNom()+ " - Prénom : "+
                oP.getPrenom());
        System.out.println("Age : " + 
                oP.getAge()+" ans");
        System.out.println("Habite : ");
        System.out.println("\t Rue : "+
                oP.getAdresse());
        System.out.print("\t Code Postal : "+
                oP.getCodePostal());
        System.out.println(" - Ville : "+
                oP.getVille());
        if(oP.getSexe() == TypeSexe.FEMME) {
            Ststem.out.println(" - Sexe : F");
        } else {
            Ststem.out.println(" - Sexe : M");
        }
        
        if (oP instanceof Facteur) {
            System.out.println(" - Annienneté : " + 
                ((facteur)oP).getAnneesAnciennetees());
        }
    }
}


