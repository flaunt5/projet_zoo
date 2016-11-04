package zoo_system;

import java.util.ArrayList;

public abstract class Aigle extends Aerien implements VolantAction{
	
	protected static final int maturiteSexuelle = 4;
	protected static final int esperanceVie = 25;
	
	/**
	 * Construit un objet de type Aigle
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 */
	public Aigle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "aigle";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Boeuf");
		this.listNourritureAccepte.add("Poisson");
		this.consoNourriture = 3;
	}//Aigle()
	
	/**
	 * Permet à l'aigles de pousser son cri
	 * @return Son emit par l'animal
	 */
	public String emmetreSon() {
		return "Aiiiiiiigle";
	}//emmetreSon()

	/**
	 * Retourne la maniere de voler de l'Aigle
	 * @return maniere de voler de l'aigle
	 */
	public String voler() {
		return "Vole comme un aigle";
	}//voler()
	
	/**
	 * retourne la valeur de l'attribut maturiteSexuelle
	 * @return maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Aigle.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * retourne la valeur de l'attribut esperanceVie
	 * @return esperanceVie
	 */
	public int getEsperanceVie(){
		return Aigle.esperanceVie;
	}//getMaturiteSexuelle()
	
	
	/**
	 * retourne la valeur de l'attribut consoNourriture
	 * @return consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()

}//Aigle
