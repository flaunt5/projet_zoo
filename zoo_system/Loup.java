package zoo_system;

import java.util.ArrayList;

public abstract class Loup extends Terrestre implements PredateurAction{
	
	protected static final int maturiteSexuelle = 2;
	protected static final int esperanceVie = 15;
	
	/**
	 * Construit un objet de type Loup
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 */
	public Loup(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "loup";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Boeuf");
		this.listNourritureAccepte.add("Poisson");
		this.consoNourriture = 3;
	}//Loup()
	
	/**
	 * Permet à la baleine de pousser son cri
	 * @return Son emit par le loup
	 */
	public String emmetreSon() {
		return "Louuuuuuuuuuuuuuuuuuup";		
	}//emmetreSon()

	/**
	 * Retourne la maniere de vagabonder du loup
	 * @return maniere de vagabonder du loup
	 */
	public String vagabonder() {
		return "Vagabonde comme un loup";
	}//vagabonder()
	
	/**
	 * retourne la valeur de l'attribut maturiteSexuelle
	 * @return valeur de l'attribut  maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Loup.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * retourne la valeur de l'attribut esperanceVie
	 * @return valeur de l'attribut  esperanceVie
	 */
	public int getEsperanceVie(){
		return Loup.esperanceVie;
	}//getMaturiteSexuelle()
	
	/**
	 * retourne la valeur de l'attribut consoNourriture
	 * @return valeur de l'attribut  consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()

}//Loup
