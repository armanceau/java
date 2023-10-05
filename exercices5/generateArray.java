package exercices5;

import java.util.ArrayList;
import java.util.Random;

public class generateArray {
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void generate(int tailleTableau, int nombreMaximum) {
        int[] tableau = new int[tailleTableau];
        Random random = new Random();

        for (int i = 0; i < tailleTableau; i++) {
            int valeur = random.nextInt(nombreMaximum + 1);
            tableau[i] = valeur;
            list.add(valeur); // Ajoute la valeur générée à la liste
        }
    }

    public static ArrayList<Integer> getList() {
        return list;
    }

    public static void main(String[] args) {
        generate(15, 100);

        ArrayList<Integer> generatedList = getList();

        // Vous pouvez maintenant utiliser la liste générée.
        for (Integer valeur : generatedList) {
            System.out.print(valeur + " ");
        }
    }
}
