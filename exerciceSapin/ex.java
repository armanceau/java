package exerciceSapin;

public class ex {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez spécifier la taille du sapin en argument.");
            return;
        }

        int tailleSapin = Integer.parseInt(args[0]);

        if (tailleSapin == 0) {
            System.out.println("Le sapin est de taille 0, donc rien à afficher.");
            return;
        }

        for (int i = 1; i <= tailleSapin; i++) {
            // Imprimer des espaces pour décaler le sapin vers la droite
            for (int j = 0; j < tailleSapin - i; j++) {
                System.out.print(" ");
            }

            // Imprimer des étoiles pour représenter les branches du sapin
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Passer à la ligne suivante pour la prochaine rangée du sapin
            System.out.println();
        }

        // Imprimer le tronc du sapin
        for (int i = 0; i < tailleSapin - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
