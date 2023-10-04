package exercices4;

import java.util.Random;
import java.util.Scanner;

public class ex1 {

    static String nomJoueur = "";
    public static void main(String[] args) {
        // Création du tableau à 2 dimensions de 3 par 3 avec des blancs
        char[][] grille = new char[][] {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        // Déclaration des symboles pour le joueur et l'ordinateur
        char joueur = 'X';
        char ordinateur = 'O';
        char joueurActuel;
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Le nombre est soit 0 soit 1
        int r = random.nextInt(0, 2);

        System.out.println("Bienvenue dans le jeu du morpion !");
        System.out.println();

        // Récupération du nom du joueur dans la variable nomJoueur
        System.out.print("Rentrez un nom de joueur : ");
        nomJoueur = scanner.nextLine();
        System.out.println();

        // Définition de qui commence la partie selon le nombre aléatoire
        if (r == 0) {
            System.out.println(nomJoueur + " commence la partie.");
            System.out.println();
            System.out.println();
            joueurActuel = joueur;
        } else {
            System.out.println("L'ordinateur commence.");
            joueurActuel = ordinateur;
        }

        afficherGrille(grille);

        // Boucle principale du jeu
        while (!partieTerminee(grille)) {
            if (joueurActuel == joueur) {
                // Tour du joueur
                jouerCoup(scanner, grille, joueur);
                joueurActuel = ordinateur; // Passe au tour de l'ordinateur
            } else {
                // Tour de l'ordinateur
                jouerCoupOrdinateur(grille, ordinateur);
                joueurActuel = joueur; // Passe au tour du joueur
            }
            
            afficherGrille(grille);
        }

        // Affichage du résultat de la partie
        char resultat = resultatPartie(grille);
        if (resultat == joueur) {
            System.out.println();
            System.out.println(nomJoueur + " a gagné !");
            System.out.println();
        } else if (resultat == ordinateur) {
            System.out.println();
            System.out.println("L'ordinateur a gagné !");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Match nul !");
            System.out.println();
        }

        scanner.close();
    }

    private static void afficherGrille(char[][] grille) {
        System.out.println("Grille actuelle :");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grille[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    private static void jouerCoup(Scanner scanner, char[][] grille, char symbole) {
        int ligne, colonne;
        do {
            System.out.println();
            System.out.println("--- Tour de " + nomJoueur + " --- ");
            System.out.println();
            System.out.print("Entrez la ligne (0, 1, ou 2) : ");
            ligne = scanner.nextInt();
            System.out.print("Entrez la colonne (0, 1, ou 2) : ");
            colonne = scanner.nextInt();
        } while (!coupValide(grille, ligne, colonne));
        
        grille[ligne][colonne] = symbole;
    }

    private static boolean coupValide(char[][] grille, int ligne, int colonne) {
        return (ligne >= 0 && ligne < 3 && colonne >= 0 && colonne < 3 && grille[ligne][colonne] == ' ');
    }

    private static void jouerCoupOrdinateur(char[][] grille, char symbole) {
        Random random = new Random();
        int ligne, colonne;
        do {
            System.out.println();
            System.out.println("--- Tour de l'ordinateur --- ");
            System.out.println();
            ligne = random.nextInt(3);
            colonne = random.nextInt(3);
        } while (!coupValide(grille, ligne, colonne));
        
        grille[ligne][colonne] = symbole;
    }

    private static boolean partieTerminee(char[][] grille) {
        return (resultatPartie(grille) != ' ' || grillePleine(grille));
    }

    private static boolean grillePleine(char[][] grille) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grille[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static char resultatPartie(char[][] grille) {
        // Vérification des lignes
        for (int i = 0; i < 3; i++) {
            if (grille[i][0] == grille[i][1] && grille[i][1] == grille[i][2] && grille[i][0] != ' ') {
                return grille[i][0];
            }
        }

        // Vérification des colonnes
        for (int j = 0; j < 3; j++) {
            if (grille[0][j] == grille[1][j] && grille[1][j] == grille[2][j] && grille[0][j] != ' ') {
                return grille[0][j];
            }
        }

        // Vérification des diagonales
        if (grille[0][0] == grille[1][1] && grille[1][1] == grille[2][2] && grille[0][0] != ' ') {
            return grille[0][0];
        }
        if (grille[0][2] == grille[1][1] && grille[1][1] == grille[2][0] && grille[0][2] != ' ') {
            return grille[0][2];
        }

        return ' '; // Aucun gagnant
    }
}
