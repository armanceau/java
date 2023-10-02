package exercices1.exercice8;

public class ex8 {
    public static void main(String[] args) {
        String[] colors = {"bleu", "rouge", "jaune"};

        for (String value : colors) {
            String phrase;

            // Utilisation d'une comparaison pour afficher la phrase appropriée en fonction de la couleur
            switch (value) {
                case "bleu":
                    phrase = "La couleur préférée de Louis est le " + value + ".";
                    break;
                case "rouge":
                    phrase = "Pour sa peinture, Andrée a utilisé du " + value + ".";
                    break;
                case "jaune":
                    phrase = "Anis n'a pas de chemise " + value + ".";
                    break;
                default:
                    phrase = "La couleur " + value + " n'est pas gérée.";
                    break;
            }

            System.out.println(phrase);
        }
    }
}
