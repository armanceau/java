package exercices5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class generateArray {
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void generate(int tailleTableau, int nombreMaximum) {
        Random random = new Random();

        for (int i = 0; i < tailleTableau; i++) {
            int valeur = random.nextInt(nombreMaximum + 1);
            list.add(valeur); // Ajoute la valeur générée à la liste
        }
    }

    public static ArrayList<Integer> getList() {
        return list;
    }

    public static void addItem(int number) {
        list.add(number);
    }

    public static void main(String[] args) {
        generate(10, 100);

        ArrayList<Integer> generatedList = getList();

        // Vous pouvez maintenant utiliser la liste générée.
        System.out.println("Liste générée aléatoirement :");
        for (Integer valeur : generatedList) {
            System.out.print(valeur + " ");
        }

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("\nEntrez un nombre : ");
            try {
                int num = Integer.parseInt(scan.nextLine());
                addItem(num);
            } catch (NumberFormatException e) {
                System.out.println("Ce n'est pas un nombre valide. Veuillez réessayer.");
                i--; // Décrémenter i pour que l'utilisateur refasse l'entrée
            }
        }

        String ordre = "";
        boolean ordreValide = false;

        while (!ordreValide) {
            System.out.println("Par quel ordre voulez-vous organiser cette liste (croissant/decroissant) : ");
            ordre = scan.nextLine();
    
            if (ordre.equals("croissant")) {
                 System.out.println();

                // Afficher la liste génrée aléatoirement
                System.out.println("Liste générée aléatoirement :");
                for (Integer valeur : generatedList) {
                    System.out.print(valeur + " ");
                }

                System.out.println();

                triArray.trier(list);

                // Afficher la liste triée
                System.out.println("\nListe triée par ordre croissant:");
                for (Integer valeur : list) {
                    System.out.print(valeur + " ");
                }
                System.out.println();

                ordreValide = true;

            } else if (ordre.equals("decroissant")) {
                System.out.println();

            // Afficher la liste génrée aléatoirement
            System.out.println("Liste générée aléatoirement :");
            for (Integer valeur : generatedList) {
                System.out.print(valeur + " ");
            }

            System.out.println();

            triArray.trier(list);

            // Afficher la liste triée
            System.out.println("\nListe triée par ordre decroissant:");
            for (Integer valeur : list) {
                System.out.print(valeur + " ");
            }

            System.out.println();
                ordreValide = true;

            } else {
                System.out.println("Désolé, je n'ai pas compris votre demande. Assurez-vous de bien écrire croissant/decroissant.");
            }
        }
        System.out.println();
    
        scan.close();
    }
}
