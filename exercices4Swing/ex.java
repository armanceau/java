package exercices4Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ex extends JPanel {

    public static void main(String[] args) {

        //Déclaration de la fenêtre
        JFrame frame = new JFrame("Morpion Game");

        JOptionPane.showMessageDialog(null, "Bienvenue dans le jeu du morpion !");

        // Déclaration des symboles pour le joueur et l'ordinateur
        char joueur = 'X';
        char ordinateur = 'O';
        char joueurActuel;

        Random random = new Random();

        // Le nombre est soit 0 soit 1
        int r = random.nextInt(0, 2);

        // Définition de qui commence la partie selon le nombre aléatoire
        if (r == 0) {
            System.out.println("Joueur commence la partie.");
            System.out.println();
            System.out.println();
            joueurActuel = joueur;
        } else {
            System.out.println("L'ordinateur commence.");
            joueurActuel = ordinateur;
        }

        //Déclaration de la classe panel
        ex panel = new ex();

        //Ajout à la fenêtre la classe
        frame.add(panel);

        //Permet de ferme la fenêtre avec la croix en haut à droite
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Définition de la taille de la fenêtre
        frame.setSize(800, 800);

        //Déclaration d'un anel qui sera la grille 3x3 du morpion
        JPanel gridPanel = new JPanel(new GridLayout(3, 3));

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                JButton button = new JButton(" ");
                button.setFont(new Font("Arial", Font.PLAIN, 48)); // Personnalisez la police et la taille du texte
                button.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Gérer l'action lorsqu'un bouton est cliqué
                        button.setText("X"); // Par exemple, définissez le texte du bouton sur "X"
                        button.setEnabled(false); // Désactivez le bouton pour qu'il ne puisse pas être cliqué à nouveau
                    }
                });
                gridPanel.add(button);
            }
        }

        frame.add(gridPanel);
        frame.setVisible(true);
    }
}
