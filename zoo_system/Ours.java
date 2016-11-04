package zoo_system;

import java.util.ArrayList;

public abstract class Ours extends Terrestre{
	
	protected static final int maturiteSexuelle = 4;
	protected static final int esperanceVie = 25;
	
	/**
	 * Construit un objet de type Ours
	 * @param poids
	 * 				Futur poids de l'ours
	 * @param taille
	 * 				Futur taille de l'ours
	 * @param age
	 * 				Futur age de l'ours
	 * @param pseudo
	 * 				Futur pseudo de l'ours
	 */
	public Ours(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "ours";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Boeuf");
		this.listNourritureAccepte.add("Poisson");
		this.consoNourriture = 3;
	}//Ours()
	
	/**
	 * Permet à l'ours de pousser son cri
	 * @return Son emit par l'ours
	 */
	public String emmetreSon() {
		return "Grrrrrrrrrrrrrrrrrrrr";
	}//emmetreSon()
	
	/**
	 * retourne la valeur de l'attribut maturiteSexuelle
	 * @return valeur de l'attribut maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Ours.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * retourne la valeur de l'attribut esperanceVie
	 * @return valeur de l'attribut esperanceVie
	 */
	public int getEsperanceVie(){
		return Ours.esperanceVie;
	}//getMaturiteSexuelle()
	
	/**
	 * retourne la valeur de l'attribut consoNourriture
	 * @return valeur de l'attribut consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()
}//Ours
