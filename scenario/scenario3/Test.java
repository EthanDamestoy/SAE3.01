package scenario3;
import java.util.ArrayList;
import java.util.List;

final class Test
{
	/*--------------------*/
	/*      ATTRIBUTS     */
	/*--------------------*/
	protected static Scenario3 lien = null;
	protected final static String a = "a";
	protected final static String bb = "bb";
	protected final static String ccc = "ccc";
	protected final static String dddd = "dddd";
	/*--------------------*/
	/*       MÉTHODES     */
	/*--------------------*/
	public static void main (String[] args)
	{
		lien = new Scenario3() {};
		System.out.println (lien.toString());
	}
}