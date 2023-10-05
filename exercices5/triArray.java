package exercices5;

import java.util.ArrayList;

public class triArray {
    public static void trier(ArrayList<Integer> liste) {
        int tailleTableau = liste.size();
        int temp;
        for (int i = 0; i < tailleTableau; i++) {
            for (int j = 1; j < (tailleTableau - i); j++) {
                if (liste.get(j - 1) > liste.get(j)) {
                    // Échange des éléments
                    temp = liste.get(j - 1);
                    liste.set(j - 1, liste.get(j));
                    liste.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        generateArray.generate(10, 100);

        ArrayList<Integer> generatedList = generateArray.getList();

        System.out.println("\nListe d'origine :");
        for (Integer value : generatedList) {
            System.out.print(value + " ");
        }

        // Appeler la méthode de tri en passant la liste générée
        trier(generatedList);

        // Afficher la liste triée
        System.out.println("\nListe triée :");
        for (Integer value : generatedList) {
            System.out.print(value + " ");
        }
    }
}
