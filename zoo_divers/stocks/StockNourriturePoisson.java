package zoo_divers.stocks;

import zoo_divers.equipements.NourriturePoisson;

/**
 * StockNourriturePoisson represente l'endroit où va etre stocké la nourrture pour poisson, pour nourir les animaux
 * @author Alexandre
 *
 */
public class StockNourriturePoisson extends StockNourriture<NourriturePoisson>{

	/**
	 * Construit un objet de type StockNourriturePoisson
	 * @param nom
	 * 			Nom du stock
	 */
	public StockNourriturePoisson(String nom) {
		super(nom);
	}//StockNourriturePoisson()

}//StockNourriturePoisson
