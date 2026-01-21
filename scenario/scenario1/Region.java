package scenario1;
public class Region
{
	/*--------------------*/
	/*      ATTRIBUTS     */
	/*--------------------*/
    private int           numero;
    private String        nom;
    private int           nbDeptTotal;

    private Departement[] esnDept;     //pour modeliser l'association
    private int           nbDept ;

	/*--------------------*/
	/*       MÉTHODES     */
	/*--------------------*/
		public Region (int numero, String nom, int nbDeptTotal)
		{
			this.numero      = numero;
			this.nom         = nom;
			this.nbDeptTotal = nbDeptTotal;


			this.esnDept    = new Departement[this.nbDeptTotal];
			this.nbDept     = 0;
		}

		public boolean ajouterDepartement (Departement dep)
		{
			if (dep == null || this.nbDept >= this.esnDept.length) { return false; }

			this.esnDept[this.nbDept++] = dep;
			return true;
		}

		public int    getNumero      () { return this.numero;      }
		public String getNom         () { return this.nom;         }
		public int    getNbDept      () { return this.nbDept;      }
		public int    getNbDeptTotal () { return this.nbDeptTotal; }

		public Departement getDept (int indice) 
		{
			if (indice <0 || indice > nbDept) {return null;}
			return this.esnDept[indice];
		}
	

		public int getSuperficie()
        {
            int superficie = 0 ;
            for (int cpt = 0; cpt < this.nbDept; cpt++)
            {
                superficie += this.esnDept[cpt].getSuperficie();
            }
            return superficie;
        }
    
        public int getPopulation()
        {
            int population = 0 ;
            for (int cpt = 0; cpt < this.nbDept; cpt++)
            {
                population += this.esnDept[cpt].getPopulation();
            }
            return population;
        }
    
        public Double densite()
        {
            if (this.getSuperficie() == 0 ) return null;
            
            return 1.0 * this.getPopulation() / this.getSuperficie();
        }

		
		public String toString()
		{
			String sRet = String.format(  "%3d", this.numero) + " "  +
			              String.format( "%-35s", this.nom   ) + " "  +
				          "(densité : "                               + " "  +
				          String.format("%,9.2f", densite()   ) + " hab/km²)\n";
			for (int cpt=0; cpt < this.nbDept; cpt++)
				sRet+= "   " + this.esnDept[cpt].toString() + "\n";

			return sRet;
		}
		/*
		public String toString() 
		{
			String result = String.format("%02d %s  (densité : %8.2f hab/km²)\n", 
				this.numero, 
				this.nom, 
				this.densite());
		
			for (int i = 0; i < this.nbDept; i++) 
			{
				Departement dept = this.esnDept[i];
				result += String.format("   %s %-20s (densité : %8.2f hab/km²)\n", 
					dept.getNumero(), 
					dept.getNom(), 
					dept.densite());
			}
			return result;
		}
		*/
		
}
