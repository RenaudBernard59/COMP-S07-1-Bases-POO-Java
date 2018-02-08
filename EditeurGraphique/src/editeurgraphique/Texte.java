/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editeurgraphique;

/**
 *
 * @author Formation
 */
public class Texte extends ObjetGraphique implements iDessiner {

    @Override
    public void Dessiner() {
        System.out.println("Ardeo, mihi credite, Patres conscripti (id quod vosmet de me existimatis et facitis ipsi)");
        System.out.println(" incredibili quodam amore patriae, qui me amor et subvenire olim impendentibus periculis maximis");
        System.out.println(" cum dimicatione capitis, et rursum, cum omnia tela undique esse intenta in patriam viderem,");
        System.out.println(" subire coegit atque excipere unum pro universis. Hic me meus in rem publicam animus pristinus");
        System.out.println(" ac perennis cum C. Caesare reducit, reconciliat, restituit in gratiam.");
    }
    
    
    
}
