package zoo_system;

import java.util.ArrayList;

public abstract class Baleine extends Aquatique implements MarinAction{
	
	protected static final int maturiteSexuelle = 5;
	protected static final int esperanceVie = 80;
	
	/**
	 * Construit un objet de type Baleine
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 */
	public Baleine(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "baleine";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Poisson");
		this.consoNourriture = 10;
	}//Baleine()
	
	/**
	 * Permet à la baleine de pousser son cri
	 * @return Son emit par la balaine
	 */
	public String emmetreSon() {
		return "Baleiiiiiiiiiiiiiine";
	}//emmetreSon()

	/**
	 * Retourne la maniere de nager de la baleine
	 * @return maniere de voler de la baleine
	 */
	public String nager() {
		return "Nage comme une baleine";
	}//nager()
	
	/**
	 * retourne la valeur de l'attribut maturiteSexuelle
	 * @return maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Baleine.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * retourne la valeur de l'attribut esperanceVie
	 * @return esperanceVie
	 */
	public int getEsperanceVie(){
		return Baleine.esperanceVie;
	}//getMaturiteSexuelle()
	
	/**
	 * retourne la valeur de l'attribut consoNourriture
	 * @return consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()

}//Baleine
