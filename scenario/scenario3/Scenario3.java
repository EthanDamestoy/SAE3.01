package scenario3;
import java.util.ArrayList;
import java.util.List;

abstract class Scenario3
{
	/*--------------------*/
	/*      ATTRIBUTS     */
	/*--------------------*/
	public static final String          sCommentee  = "// /**/ {"; 
	public static final int             staticFinal = 2;
	public static final long            longEcrit   = 2198204912L;
	public static final long            nouveauLong = new Long (5);
	public static final boolean         estVrai     = true;
	public static final List<String>    lstString1  = new ArrayList<>();

	// Final avec contenu d'une méthode 
	public final String sMethode = methodeQuiRetourneUnString();

	// Attribut sur plusieurs lignes
	public int a1 , a2 , a3 , a4;

	// Formatage avec espace
	public   List  <  String   >   lstString2;
	private  Integer  [   ]        ensInteger;  

	/*--------------------*/
	/*       MÉTHODES     */
	/*--------------------*/
	public boolean methodeAvecPlusieursParametres (int un,     int deux, int trois, 
												   int quatre, int cinq, int six,
												   int sept,   int huit, int neuf, 
												   int dix,    int onze, int douze  )
	{
		return true;
	}
	
	@Override
	public String toString()
	{
		return "";
	}

	/* private? */ public /* ou un tableau de char[] ? */ String methodeQuiRetourneUnString() /* a changer */
	{
		return "TEXTE";
	}
		
}