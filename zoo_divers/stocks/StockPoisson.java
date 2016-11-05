package zoo_divers.stocks;

import zoo_divers.equipements.Poisson;

/**
 * StockPoisson represente l'endroit où va etre stocké le poisson, pour nourir les animaux
 * @author Alexandre
 *
 */
public class StockPoisson extends StockNourriture<Poisson>{

	/**
	 * Construit un objet de type StockPoisson
	 * @param nom
	 * 			Nom du stock
	 */
	public StockPoisson(String nom) {
		super(nom);
	}//StockPoisson()

}//StockPoisson()
