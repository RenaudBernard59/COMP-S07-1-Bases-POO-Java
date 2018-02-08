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
public class JavaApplication1 {
    public static void main(String[] args) {
        JavaApplication1 oMain = new JavaApplication1();
        //Déclaration d'un tableau  oPtab 
        //de type Personne[]
        //avec 10 éléments : new Personne[10]
        Personne[] oPtab = new Personne[10];
        //Déclaration d'un tableau  oFtab 
        //de type Facteur[]
        //avec 10 éléments : new Facteur[10]
        Facteur[] oFtab = new Facteur[10];
        
        //Utilisation et gestion du tableau oPtab
        int indice = 0; //Un indice de tableau temporaire
        System.out.println("------DEB TABLEAU : PERSONNE"); 
        for (Personne oPi : oPtab) //Foreach sur le tableau oPtab
                { //Création des 10 personnes dans le tableau
                    int i = indice + 1;
                    oPi = new Personne("GERMAIN"+i,"Christophe"+i, 
                        (35+i), "Rue du Mans", "Le Mans", 
                            "72000",TypeSexe.HOMME);
                    oPtab[indice] = oPi;
                    indice++;
                }
        //Boucle qui affiche les données du tableau à l'écran
        for(Personne oPi : oPtab) oMain.afficherUnePersonne(oPi);
        System.out.println("------FIN TABLEAU : PERSONNE"); 

        indice = 0;//Remise à 0 l'indice du tableau
        System.out.println("------DEB TABLEAU : FACTEUR"); 
        for (Facteur oPi : oFtab)
                {
                    int i = indice + 1;
                    TypeSexe sexe;
                    if((i%2)==0) 
                    {sexe = TypeSexe.HOMME;}
                    else
                     {sexe = TypeSexe.FEMME;}  
                    oPi = new Facteur("GERMAIN"+"F"+i,
                            "Victor"+"F"+i, 
                        46, "Rue du Mans", "Le Mans", "72000",
                            sexe,10+i);
                    oFtab[indice] = oPi;
                    indice++;
                }
        for(Facteur oPi : oFtab) oMain.afficherUnePersonne(oPi);
         System.out.println("------FIN TABLEAU : FACTEUR"); 
         
        Personne oPersonne = 
                new Personne("GERMAIN","Christophe", 
                        46, "Rue du Mans", "Le Mans", "72000",TypeSexe.HOMME);
        
        //déclarations des variables
        Personne oPersonne2;
        Facteur oFacteur1,oFacteur2;
        
        //Instanciation des variables
        oPersonne2 = new Personne("GERMAIN","André", 
                        46, "Rue du Mans", "Le Mans", "72000",TypeSexe.HOMME);
        oFacteur1 = new Facteur("GERMAIN","Victor", 
                        46, "Rue du Mans", "Le Mans", "72000",TypeSexe.HOMME,10);
        //1 instance de la classe Personne et
        //1 instance de la classe Facteur
        oFacteur2 = new Facteur("GERMAIN","Marine", 
                        46, "Rue du Mans", "Le Mans", "72000",TypeSexe.FEMME,2);
        

        //Remplace le bloc d'affichage par l'appel de la méthode
        oMain.afficherUnePersonne(oPersonne);
         System.out.println("------");
         oMain.afficherUnePersonne(oPersonne2);
        System.out.println("------");
        oMain.afficherUnePersonne(oFacteur1);
         System.out.println("------");
         oMain.afficherUnePersonne(oFacteur2);
         
       
         
        
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
        if(oP.getSexe() == TypeSexe.FEMME)
        {
             System.out.println(" - Sexe : F");
        }
        else
        {
            System.out.println(" - Sexe : H");
        }
        
        if (oP instanceof Facteur)
        {
            System.out.println(" - Annienneté : "+
               ((Facteur)oP).getNbAnneeAnc());
                ((Facteur)oP).DistribuerLeCourrier(new Courrier());
        }
    }
}


