package zoo_divers.stocks;

import zoo_divers.equipements.Boeuf;

/**
 * StockBoeuf represente l'endroit où va etre stocké la viande de boeuf, pour nourir les animaux
 * @author Alexandre
 *
 */
public class StockBoeuf extends StockNourriture<Boeuf>{
	
	/**
	 * Construit un objet de type stockBoeuf
	 * @param nom
	 * 			Nom du stock
	 */
	public StockBoeuf(String nom) {
		super(nom);
	}//StockBoeuf

}//StockBoeuf()
