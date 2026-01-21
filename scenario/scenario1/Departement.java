package scenario1;
public class Departement{
	/*--------------------*/
	/*      ATTRIBUTS     */
	/*--------------------*/
    private String numero;
    private String nom;
    private int    population;
    private int    superficie;

    /*--------------------*/
    /*       MÉTHODES     */
    /*--------------------*/

    /*--------------------*/
    /*    Constructeur    */
    /*--------------------*/
    /**Departement
     * @param numero
     * @param nom
     * @param population
     * @param superficie
     * 
     * @description : permet de construire un department 
     */
    public Departement (String numero, String nom, int population, int superficie) {
        this.numero     = numero;
        this.nom        = nom;
        this.population = population;
        this.superficie = superficie;
    }

    /*--------------------*/
    /*     Accesseurs     */
    /*--------------------*/
    /**getNumero
     * @return this.numero
     */
    public String getNumero () { 
        return this.numero;
    }
    
    /**getNom
     * @return this.nom
     */
    public String getNom () { 
        return this.nom; 
    }

    /**getPopulation
     * @return this.population
     */
    public int getPopulation () { 
        return this.population; 
    }

    /**getSuperficie
     * @return this.superficie
     */
    public int getSuperficie () { 
        return this.superficie; 
    }

    /*--------------------*/
    /*   Autres méthodes  */
    /*--------------------*/
    /**densite
     * @return densite
     */
    public double densite () { 
        return 1.0 * this.population / this.superficie; 
    }

}