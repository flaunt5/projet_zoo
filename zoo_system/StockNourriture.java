package zoo_system;

import java.util.ArrayList;

public class StockNourriture<T extends Nourriture> {
	private String nom;
	private ArrayList<T> stock;
	
	/**
	 * Construit un objet de type StockNourriture<T>
	 * @param nom
	 */
	public StockNourriture(String nom){
		this.stock = new ArrayList<T>();
		this.nom = nom;
	}//StockNourriture()
	
	/**
	 * Ajoute une instance de Nourriture dans le stock
	 * @param element
	 */
	public void ajouterNourriture(Nourriture element){
		this.getStock().add((T) element);
	}//ajouterNourriture()
	
	/**
	 * Retourne le nombre d'éléments présents dans le stock
	 * @return
	 */
	public int getNombreElementsDansStock(){
		int count = 0;
		for(T element : this.getStock()){
			++count;
		}
		return count;
	}
	
	public String getNom() {
		return nom;
	}//getNom()

	public void setNom(String nom) {
		this.nom = nom;
	}//setNom()

	public ArrayList<T> getStock() {
		return stock;
	}//getStock()

}//StockNourriture
