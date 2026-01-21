package scenario2.controleur;

import metier.*;
import vue.*;
import java.util.List;

public class Controleur {
    private Joueur joueurPrincipal;
    private Tuile[][] carte;
    private FrameJeu frame;  // Association bilatérale avec GameFrame
    
    public Controleur() {
        this.carte = new Tuile[50][50];
        initialiserCarte();
    }
    
    // Association bilatérale avec GameFrame
    public void setFrame(FrameJeu frame) { }
    public FrameJeu getFrame() { return frame; }
    
    // Logique du jeu
    private void initialiserCarte() { }
    public void deplacerJoueur(int dx, int dy) { }
    public void ajouterAmiAuJoueur(Joueur ami) { }
    public Tuile getTuile(int x, int y) { return null; }
    public void nouvellePartie(String pseudoJoueur) { }
    public void sauvegarderPartie() { }
    public void chargerPartie() { }
    
    // Getters
    public Joueur getJoueurPrincipal() { return joueurPrincipal; }
    public Tuile[][] getCarte() { return carte; }
}
