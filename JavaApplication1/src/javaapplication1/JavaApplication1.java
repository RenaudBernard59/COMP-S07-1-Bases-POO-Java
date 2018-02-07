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
        JavaApplication1 oMain = new JavaApplication1();
        Personne[] oPtab = new Personne[10];
        Facteur[] oFtab = new Facteur[10];

        int indice = 0;
        System.out.println("---Début tableau juste personne---");
        for (Personne oPi : oPtab) {
            int i = indice + 1;
            oPi = new Personne("Germain"+i,"André"+i,(35+i),"Rue du Maine","53000","Laval",TypeSexe.HOMME);
            oPtab[indice] = oPi;
            indice++;
        }   
         
        System.out.println("---Fin tableau Personne---");
        indice = 0;
        System.out.println("---Début tableau Facteur---");
        for (Facteur oPi : oFtab) {
            int i = indice + 1;
            TypeSexe sexe;
            if ((i%2)==0) { sexe = TypeSexe.HOMME;}
            else {sexe = TypeSexe.FEMME;}
            
            oPi = new Facteur(
                    "Victor"+"F"+i,
                    "Machin"+"F"+i,
                    45, "Rue du Mans","Le Mans","53000",
                    sexe, 10+i);
            oFtab[indice] = oPi;
            indice++;
        }
        for(Facteur oPi : oFtab) oMain.afficherUnePersonne(oPi);
        
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
            System.out.println(" - Sexe : F");
        } else {
            System.out.println(" - Sexe : M");
        }
        
        if (oP instanceof Facteur) {
            System.out.println(" - Annienneté : " + 
                ((Facteur)oP).getAnneesAnciennetees());
        }
    }
}


