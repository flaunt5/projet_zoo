package zoo_divers.stocks;

import java.util.ArrayList;

public abstract class Stock<T> {
	private String nom;
	private ArrayList<T> stock;

	/**
	 * Construit un objet de type Stock
	 * @param nom
	 * 			Nom du stock
	 */
	public Stock(String nom){
		this.stock = new ArrayList<T>();
		this.nom = nom;
	}//Stock()
	
	/**
	 * Retourne le nombre d'�l�ments pr�sents dans le stock
	 * @return Nombre d'�l�ment dans le stock
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
	 * Modifie la valeur de l'attribut nom
	 * @return Valeur de l'attribut nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}//setNom()

	/**
	 * Retourne la valeur de l'attribut stock
	 * @return Valeur de l'attribut stock
	 */
	public ArrayList<T> getStock() {
		return stock;
	}//getStock()
}
