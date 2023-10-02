package exercices2.exercice3;

import java.util.ArrayList;

// Le but de cet exercice est d’afficher le nombre de voyelles contenues dans une phrase.

public class ex3 {
    public static void main(String[] args) {

        // if (args.length == 0) {
        //     System.out.println("Aucun argument n'a été passé.");
        //     return;
        // }  

        // Écrivez une variable appelée « quotations » de type « ArrayList » de type « String » qui devra
        // être construit avec aucun argument. À la suite de cela, vous devrez ajouter plusieurs nombres
        // à votre liste, ces nombres sont les suivants : ["Quand Paris s’enrhume, l’Europe a froid", "S'il y
        // a un diamant dans la poitrine, il brille sur le visage", " La joie de vivre n'est pas un but, mais un
        // devoir"].


        // Ajout des élements dans l'arraylist
        ArrayList<String> quotations = new ArrayList<>();
        quotations.add("Quand Paris s'enrhume, l'Europe a froid");
        quotations.add("S'il y a un diamant dans la poitrine, il brille sur le visage");
        quotations.add("La joie de vivre n'est pas un but, mais un devoir");


        // Puis, créez une méthode « countVowels » qui prendra en paramètres une « String » nommé
        // « str ». Dans cette méthode, vous devrez compter puis retourner le nombre de voyelles dans
        // la phrase « str »

        for(String quote : quotations){
            int vowelCount = countVowels(quotations, quote);
            System.out.println(quote + " : " + vowelCount + " voyelles");
        }

    }

    private static Integer countVowels(ArrayList<String> quotations, String str) {
        
        str = str.toLowerCase();

        // Déclarer une chaîne contenant les voyelles
        String vowels = "aeiou";

        int count = 0;

        // Parcourir chaque caractère de la chaîne
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Vérifier si le caractère est une voyelle
            if (vowels.contains(String.valueOf(currentChar))) {
                count ++;

            }
        }
        return count;
    }
}
