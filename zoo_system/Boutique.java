package zoo_system;

import java.util.HashMap;
import java.util.Map;

public class Boutique {
	private static Boutique instance;
	Map<String, Integer> stockAVendre;
	
	private Boutique(){
		this.stockAVendre = new HashMap<String, Integer>();
		this.stockAVendre.put("Viande de boeuf x1", 150);
		this.stockAVendre.put("Viande de boeuf x10", 1000);
		this.stockAVendre.put("Poisson x1", 100);
		this.stockAVendre.put("Poisson x10", 700);
		this.stockAVendre.put("Nourriture pour poisson x1", 90);
		this.stockAVendre.put("Nourriture pour poisson x10", 500);
	}//Boutique()
	
	public String getListArticles(){
		String retour = "Objets que vous pouvez acheter : \n \t0 - Quitter la boutique\n";
		int count = 1;
		for(String key : this.getStockAVendre().keySet()){
			retour += "\t" + count + " - " + key + " : " + this.getStockAVendre().get(key) + "\n";
			++count;
		}
		return retour;
	}//getListArticles()

	public static Boutique getInstance(){
		if(instance == null){
			instance = new Boutique();
		}
		return instance;
	}//getInstance()
	
	public Map<String, Integer> getStockAVendre() {
		return stockAVendre;
	}//getStockAVendre()
}//Boutique
