package scenario2.metier;

import java.util.ArrayList;
import java.util.List;

public class Joueur implements IDeplacable {
    private String pseudo;
    private Position position;
    private int pointsVie;
    private int niveau;
    
    // Auto-association : liste d'amis (autres joueurs)
    private List<Joueur> amis;
    
    public Joueur(String pseudo, Position position) {
        this.pseudo = pseudo;
        this.position = position;
        this.pointsVie = 100;
        this.niveau = 1;
        this.amis = new ArrayList<>();
    }
    
    // Méthodes de l'interface Deplacable
    @Override
    public void deplacer(int x, int y) { }
    
    @Override
    public Position getPosition() { return position; }
    
    @Override
    public boolean peutSeDeplacer(Tuile tuile) { return false; }
    
    // Gestion de l'auto-association
    public void ajouterAmi(Joueur ami) { }
    public void retirerAmi(Joueur ami) { }
    public List<Joueur> getAmis() { return amis; }
    public boolean estAmiAvec(Joueur autreJoueur) { return false; }
    
    // Autres méthodes métier
    public void recevoirDegats(int degats) { }
    public void soigner(int montant) { }
    public void monterNiveau() { }
    
    // Getters/Setters
    public String getPseudo() { return pseudo; }
    public int getPointsVie() { return pointsVie; }
    public int getNiveau() { return niveau; }
}