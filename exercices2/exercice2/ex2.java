package exercices2.exercice2;

import java.util.ArrayList;

public class ex2 {
    public static void main(String[] args) {

        // Vous devez, dans un premier temps, vérifier que la variable d’argument « args » passé en
        // paramètre de la méthode « main » contient strictement une valeur à l’intérieur. Si cela n’est
        // pas le cas, vous pouvez afficher un message d’erreur et terminer le processus en retournant
        // une valeur vide.

        if (args.length == 0) {
            System.out.println("Aucun argument n'a été passé.");
            return;
        }        

        // A la suite, écrivez une variable appelée « tab » de type « ArrayList » de type « String », qui devra
        // être construit avec aucun argument. À la suite de cela, vous devrez ajouter plusieurs fruits à
        // votre liste, ces fruits sont les suivants : kiwi, pomme, poire, litchi et rhubarbe.

        ArrayList<String> tab = new ArrayList<>();
        tab.add("kiwi");
        tab.add("pomme");
        tab.add("poire");
        tab.add("litchi");
        tab.add("rhubarbe");

        // Ensuite, créez une méthode privée et statique nommé « findFruit() » qui aura en paramètre
        // votre liste tab et votre argument « args[0] » de type « String » qui sera appelé « str » dans la
        // méthode. Elle retournera un entier correspondant à l’index dans le tableau ou à « -1 » si le fruit
        // n’est pas dans le tableau.

        Integer findIndex = findFruit(tab, args[0]);

        // De retour dans la méthode « main », vous allez devoir instancier une variable nommé
        // « findIndex » qui sera le retour de votre méthode « findFruit(…) ». Vous ferez ensuite une
        // comparaison afin d’afficher le bon message en fonction de l’index. Les messages d’exemple
        // sont ci-dessous.

        if (findIndex != -1) {
            System.out.println("Le fruit " + args[0] + " est a l'index " + findIndex);
        }
        else{
            System.out.println(args[0] + " n'est pas dans le tableau !");
        }


    }

    private static Integer findFruit(ArrayList<String> tab, String string) {
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i).equals(string)) {
                return i;
            }
        }
        return -1;
    }
    
}
