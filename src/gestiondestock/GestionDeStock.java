/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondestock;

import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ir Josue KAZIMOTO
 */
public class GestionDeStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String productName;
        int productQuantity,productPriceU;
        // 1. CRÉATION Du fichier .csv
        File fichier = new File("stock.csv"); //cree l'objet fichier qui represente  monFichier.txt

         if(fichier.exists()) {// tester si le fichier existe
             System.out.println("le fichier :" + fichier.getName()+" existe deja");//s'il existe 
        } else {
            // si le fichier n'existe pas .....
            if (fichier.createNewFile()) {//teste en creant le fichier
                System.out.println("Fichier créé avec succès : " + fichier.getName());
                FileWriter fw;
                fw = new FileWriter(fichier, true);
                fw.append("id,nom,quantite,prix\n");
            } else {//si le fichier n'est pas cree
                System.out.println("Échec de la création du fichier.");
            }
        }
         
        
    }
    
}
