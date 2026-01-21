package scenario2.metier;

public interface IDeplacable {
    void deplacer(int x, int y);
    Position getPosition();
    boolean peutSeDeplacer(Tuile tuile);
}