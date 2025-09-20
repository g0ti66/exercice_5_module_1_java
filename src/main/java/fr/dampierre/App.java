package fr.dampierre;

import java.util.Scanner;
import java.util.Random;

public class App {
    
    public static void main(String[] args) {

        // Initialisation du clavier et du choix aléatoire
        Random random = new Random();
        Scanner clavier = new Scanner(System.in);

        System.out.println("EXERCICE 5");
        System.out.println("------------------------------------------------------------");
        
        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");

        // Initialiser un nombre random entre 1 et 100
        int nombreOrdinateur = random.nextInt(100)+1;

        System.out.print("Entrer un nombre : ");
        int nombreUtilisateur = clavier.nextInt();

        System.out.println("\n");

        System.out.println("Vous proposez : " + nombreUtilisateur);

        // Valeur absolue
        int pas = Math.abs(nombreUtilisateur - nombreOrdinateur);

        // Résultat
        if (nombreUtilisateur == nombreOrdinateur) {
            System.out.println("Bien joué ! Vous avez vu juste.");
        } else {
            System.out.println("Vous étiez à " + pas + " de la réponse");
            System.out.println("Le nombre auquel je pensais était " + nombreOrdinateur);
        }

        System.out.println("------------------------------------------------------------");

        // Fermer le clavier
        clavier.close();

    }
        
}