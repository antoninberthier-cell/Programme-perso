/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programme.saison.version.pkgfinal;
import java.util.Scanner;

/**
 *
 * @author Antonin
 */
public class ProgrammeSaisonVersionFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Quel jour etes-vous ne ? ");
        int jour = sc.nextInt();
        
        while(jour < 1 || jour > 31){
            System.out.print(" Saisissez un jour valide : ");
            jour = sc.nextInt();
        }
        
        System.out.print(" Quel mois etes-vous ne (chiffre entre 1 et 12) ? ");
        int mois = sc.nextInt();
        
        while(mois < 1 || mois > 12){
            System.out.print(" Saisissez un mois valide : ");
            mois = sc.nextInt();
        }
        
        System.out.print(" Saisissez votre annee de naissance : ");
        int annee = sc.nextInt();
        
        while(annee < 1 || annee > 2026){
            System.out.print(" Saisissez une annee valide : ");
            annee = sc.nextInt();
        }
        
     
        if((mois == 2 && jour > 28) || (mois == 4 && jour > 30) || (mois == 6 && jour > 30) || (mois == 9 && jour > 30) || (mois == 11 && jour > 30)){
            System.out.println("Date invalide");
        }
        else {
          
            System.out.println(" Vous etes ne le " + jour + " " + nom(mois) + " " + annee + " durant " + saison(jour, mois) + ".");
            
            int ageUtilisateur = age(annee);
           
            if (mois > 10) {
                System.out.println(" Vous allez avoir " + ageUtilisateur + " ans cette annee.");
            } else {
                System.out.println(" Vous avez eu " + ageUtilisateur + " ans.");
            }
        }
        
        
    }

    static String saison(int jour, int mois){
        if((mois == 12 && jour >= 21) || mois == 1 || mois == 2 || (mois == 3 && jour <= 19)){
            return "l'hiver";
        }
        else if((mois == 3 && jour >= 20) || mois == 4 || mois == 5 || (mois == 6 && jour <= 20)){
            return "le printemps";
        }
        else if((mois == 6 && jour >= 21) || mois == 7 || mois == 8 || (mois == 9 && jour <= 22)){
            return "l'ete";
        }
        else{
            return "l'automne";
        }
    }

    static String nom(int mois){
        if(mois == 1){ 
            return "janvier"; 
        }
        else if(mois == 2){ 
            return "fevrier"; 
        }
        else if(mois == 3){
            return "mars"; 
        }
        else if(mois == 4){
            return "avril";
        }
        else if(mois == 5){
            return "mai"; 
        }
        else if(mois == 6){
            return "juin"; 
        }
        else if(mois == 7){
            return "juillet";
        }
        else if(mois == 8){
            return "aout";
        }
        else if(mois == 9){
            return "septembre"; 
        }
        else if(mois == 10){
            return "octobre";
        }
        else if(mois == 11){
            return "novembre";
        }
        else{
            return "decembre";
        }
    }

    static int age(int annee){
        return 2026 - annee; 
    }
}

    
    

