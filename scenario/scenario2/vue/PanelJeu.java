package scenario2.vue;

import controleur.Controleur;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class PanelJeu extends JPanel implements KeyListener {
    private Controleur controleur;  // Association unidirectionnelle vers Controleur
    private PanelAffichage panelAffichage;
    private final int TAILLE_TUILE = 32;
    
    public PanelJeu(Controleur controleur) {
        this.controleur = controleur;
        configurerPanel();
    }
    
    private void configurerPanel() { }
    
    // Méthodes de dessin
    @Override
    protected void paintComponent(Graphics g) { }
    
    private void dessinerCarte(Graphics g) { }
    private void dessinerJoueur(Graphics g) { }
    private void dessinerAmis(Graphics g) { }
    private void dessinerInterface(Graphics g) { }
    
    // Gestion des événements clavier (KeyListener)
    @Override
    public void keyPressed(KeyEvent e) { }
    
    @Override
    public void keyReleased(KeyEvent e) { }
    
    @Override
    public void keyTyped(KeyEvent e) { }
    
    // Méthode de rafraîchissement
    public void rafraichir() { }
}
