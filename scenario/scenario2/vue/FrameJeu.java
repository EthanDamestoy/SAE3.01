package scenario2.vue;

import controleur.Controleur;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class FrameJeu extends JFrame {
    private Controleur controleur;  // Association bilatérale avec Controleur
    private PanelJeu panelJeu;    // Association avec GamePanel

    private JMenuBar menuBar;
    
    public FrameJeu() {
        super("Jeu 2D - Aventure");
        configurerFenetre();
        creerMenu();
    }
    
    // Association bilatérale avec Controleur
    public void setControleur(Controleur controleur) { }
    public Controleur getControleur() { return controleur; }
    
    // Configuration de la frame
    private void configurerFenetre() { }
    private void creerMenu() { }
    
    // Initialisation du panel
    public void initialiserPanel() { }
    
    // Actions des menus
    private void nouvellePartie() { }
    private void sauvegarder() { }
    private void charger() { }
    private void quitter() { }
    private void afficherAide() { }
}
