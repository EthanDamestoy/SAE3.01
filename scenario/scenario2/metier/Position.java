package scenario2.metier;

public record Position(int x, int y) {
    public double distanceVers(Position autre) { return 0.0; }
    public Position deplacerVers(int dx, int dy) { return null; }
}