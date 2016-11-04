package zoo_system;

import java.util.ArrayList;

public class StockNourriture<T extends Nourriture> {
	private String nom;
	private ArrayList<T> stock;
	
	/**
	 * Construit un objet de type StockNourriture<T>
	 * @param nom
	 * 			Nom du stock
	 */
	public StockNourriture(String nom){
		this.stock = new ArrayList<T>();
		this.nom = nom;
	}//StockNourriture()
	
	/**
	 * Ajoute une instance de Nourriture dans le stock
	 * @param element
	 * 			Nourriture qui va etre ajouter
	 */
	public void ajouterNourriture(Nourriture element){
		this.getStock().add((T) element);
	}//ajouterNourriture()
	
	/**
	 * Retourne le nombre d'éléments présents dans le stock
	 * @return nombre d'élément dans le stock
	 */
	public int getNombreElementsDansStock(){
		int count = 0;
		for(T element : this.getStock()){
			++count;
		}
		return count;
	}//getNombreElementsDansStock()
	
	/**
	 * Retourne la valeur de l'attribut nom
	 * @return Valeur de l'attribut nom
	 */
	public String getNom() {
		return nom;
	}//getNom()

	/**
	 * Modifi la valeur de l'attribut nom
	 * @return valeur de l'attribut nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}//setNom()

	/**
	 * retourne la valeur de l'attribut stock
	 * @return valeur de l'attribut stock
	 */
	public ArrayList<T> getStock() {
		return stock;
	}//getStock()

}//StockNourriture
