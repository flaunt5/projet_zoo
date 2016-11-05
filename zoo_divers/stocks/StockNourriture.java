package zoo_divers.stocks;

import java.util.ArrayList;

import zoo_divers.equipements.Nourriture;

public class StockNourriture<T extends Nourriture> extends Stock<T>{
	
	/**
	 * Construit un objet de type StockNourriture
	 * @param nom
	 * 			Nom du stock
	 */
	public StockNourriture(String nom){
		super(nom);
	}//StockNourriture()
	
	/**
	 * Ajoute une instance de Nourriture dans le stock
	 * @param element
	 * 			Nourriture qui va etre ajouter
	 */
	public void ajouterNourriture(Nourriture element){
		this.getStock().add((T) element);
	}//ajouterNourriture()
	


}//StockNourriture
