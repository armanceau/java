package testSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        // Créez une fenêtre JFrame
        JFrame frame = new JFrame("Exemple Swing");

        // Créez un panneau JPanel
        JPanel panel = new JPanel();

        // Créez un bouton JButton
        JButton button = new JButton("Cliquez ici");

        // Ajoutez un écouteur d'événements au bouton
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code à exécuter lorsque le bouton est cliqué
                System.out.println("Bouton cliqué !");
            }
        });

        // Ajoutez le bouton au panneau
        panel.add(button);

        // Ajoutez le panneau à la fenêtre
        frame.add(panel);

        // Configurez la fermeture de la fenêtre lorsque vous appuyez sur la croix de fermeture
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Définissez la taille de la fenêtre
        frame.setSize(300, 200);

        // Rendez la fenêtre visible
        frame.setVisible(true);
    }
}