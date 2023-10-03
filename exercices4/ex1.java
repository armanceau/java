package exercices4;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        //Création du tableau à 2 dimensions de 3 par 3 avec des blancs
        char[][] grille = new char[][] {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        //Déclaration des variables
        String joueur = "X";
        String ordinateur = "O";
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Le nombre est soit 0 soit 1
        int r = random.nextInt(0, 2);

        System.out.println("Bienvenue dans le jeu du morpion !");

        //Récupération du nom du joueur dans la variable nomJoueur
        System.out.print("Rentrez un nom de joueur : ");
        String nomJoueur = scanner.nextLine();

        //Définition de qui commence la partie selon le nombre aléatoire
        if (r == 0) {
            System.out.println(nomJoueur + " commence.");
        } else {
            System.out.println("L'ordinateur commence.");
        }

        afficherGrille(grille);

        
        
        scanner.close();
    }

    private static void afficherGrille(char[][] grille) {
        // Parcours des lignes de la grille
        for (int l = 0; l < grille.length; l++) { 

            // Parcours des colonnes de la grille
            for (int c = 0; c < grille[l].length; c++) { 
                // Affiche le caractère de la case (joueur 'X', ordinateur 'O' ou espace ' ')
                System.out.print(grille[l][c]); 
                if (c < grille[l].length) {
                    // Ajoute une barre verticale pour séparer les cases
                    System.out.print(" | "); 
                }
            }
            // Passe à la ligne suivante après avoir affiché une ligne complète
            System.out.println(); 

            if (l < grille.length - 1) {
                // Ajoute une ligne de séparation entre les lignes (sauf pour la dernière ligne)
                System.out.println("-----------"); 
            }
        }
    }
}
