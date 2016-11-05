package zoo_divers.stocks;

import zoo_divers.equipements.MaterielSoin;

/**
 * StockMaterielSoin represente l'endroit où va etre stocké les trousse de secours, pour soigner les animaux
 * @author Alexandre
 *
 */
public class StockMaterielSoin<T extends MaterielSoin> extends Stock<T>{

	/**
	 * Construit un objet de type StockMaterielSoin
	 * @param nom
	 * 			Nom du stock
	 */
	public StockMaterielSoin(String nom) {
		super(nom);
	}//StockMaterielSoin()
	
	/**
	 * Ajoute une instance de MaterielSoin dans le stock
	 * @param element
	 * 			Materiel de soin qui va etre ajouter
	 */
	public void ajouterMaterielSoin(MaterielSoin element){
		this.getStock().add((T) element);
	}//ajouterNourriture()

}//StockMaterielSoin
