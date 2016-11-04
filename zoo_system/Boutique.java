package zoo_system;

import java.util.Map;
import java.util.TreeMap;

public class Boutique {
	private static Boutique instance;
	Map<String, Integer> stockAVendre;
	
	/**
	 * Construit un objet de type Boutique
	 */
	private Boutique(){
		this.stockAVendre = new TreeMap<String, Integer>();
		this.stockAVendre.put("Viande de boeuf x1", 150);
		this.stockAVendre.put("Viande de boeuf x10", 1000);
		this.stockAVendre.put("Poisson x1", 100);
		this.stockAVendre.put("Poisson x10", 700);
		this.stockAVendre.put("Nourriture pour poisson x1", 90);
		this.stockAVendre.put("Nourriture pour poisson x10", 500);
	}//Boutique()
	
	/**
	 * Retourne l'affichage de la liste des article en vente dans la boutique
	 * @return Liste des article pour affichage
	 */
	public String getListArticles(){
		String retour = "Objets que vous pouvez acheter : \n \t0 - Quitter la boutique\n";
		int count = 1;
		for(String key : this.getStockAVendre().keySet()){
			retour += "\t" + count + " - " + key + " : " + this.getStockAVendre().get(key) + " euros\n";
			++count;
		}
		return retour;
	}//getListArticles()

	/**
	 * Creer un instance de Boutique si la varialbe instance est à null
	 * sinon, retourne la valeur de l'attribut instance
	 * @return instance unique de Boutique
	 */
	public static Boutique getInstance(){
		if(instance == null){
			instance = new Boutique();
		}
		return instance;
	}//getInstance()
	
	/**
	 * retourne la valeur de l'attribut stockAVendre
	 * @return liste des article en vente
	 */
	public Map<String, Integer> getStockAVendre() {
		return stockAVendre;
	}//getStockAVendre()
}//Boutique
