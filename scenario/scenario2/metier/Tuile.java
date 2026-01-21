package scenario2.metier;

public enum Tuile {
    HERBE,
    EAU,
    MONTAGNE,
    SABLE,
    FORET;
    
    private String texturePath;
    private boolean traversable;
    
    public String getTexturePath() { return texturePath; }
    public boolean isTraversable() { return traversable; }
}