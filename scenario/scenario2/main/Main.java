package scenario2.main;

import controleur.Controleur;
import vue.FrameJeu;

public class Main {
    public static void main(String[] args) {
        // Création du contrôleur
        Controleur controleur = new Controleur();
        
        // Création de la frame
        FrameJeu frame = new FrameJeu();
        
        // Établissement de l'association bilatérale
        controleur.setFrame(frame);
        frame.setControleur(controleur);
        
        // Initialisation du panel dans la frame
        frame.initialiserPanel();
        
        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}