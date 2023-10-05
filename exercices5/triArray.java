package exercices5;

import java.util.ArrayList;

public class triArray {
    public static void main(String[] args) {
        generateArray.generate(10, 100);

        ArrayList<Integer> generatedList = generateArray.getList();

        System.out.println("\nListe d'origine :");
        for (Integer value : generatedList) {
            System.out.print(value + " ");
        }

        int tailleTableau = generatedList.size();
        int newTab = 0;

        for(int i = 0; i < tailleTableau; i++){
            for(int j=1; j < (tailleTableau-i); j++)
                {  
                    if(generatedList.get(j-1) > generatedList.get(j))
                    {
                        //echanges des elements
                        newTab = generatedList.get(j-1);  
                        generatedList.set(j - 1, generatedList.get(j));
                        generatedList.set(j, newTab);  
                    }
                }
        }

        // Afficher la liste triée
        System.out.println("\nListe triée :");
        for (Integer value : generatedList) {
            System.out.print(value + " ");
        }
    }
}
