package zoo_animaux;

import java.util.ArrayList;

/**
 * Aigle est la classe qui represente un animal du même nom
 * @author Alexandre
 *
 */
public abstract class Aigle extends Aerien implements VolantAction{
	
	/**
	 * Age auquel l'aigle aura atteint sa maturité sexuelle
	 */
	protected static final int maturiteSexuelle = 4;
	
	/**
	 * Age à partir duquel l'aigle  aura depassé son esperance de vie
	 */
	protected static final int esperanceVie = 25;
	
	/**
	 * Construit un objet de type Aigle
	 * @param poids
	 * 				Futur poids de l'aigle
	 * @param taille
	 * 				Futur taille de l'aigle
	 * @param age
	 * 				Futur age de l'aigle
	 * @param pseudo
	 * 				Futur pseudo de l'aigle
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
	 * @return Son emit par l'aigle
	 */
	public String emmetreSon() {
		return "Aiiiiiiigle";
	}//emmetreSon()

	/**
	 * Retourne la maniere de voler de l'aigle
	 * @return Maniere de voler de l'aigle
	 */
	public String voler() {
		return "Vole comme un aigle";
	}//voler()
	
	/**
	 * Retourne la valeur de l'attribut maturiteSexuelle
	 * @return Valeur de l'attribut maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Aigle.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * Retourne la valeur de l'attribut esperanceVie
	 * @return Valeur de l'attribut esperanceVie
	 */
	public int getEsperanceVie(){
		return Aigle.esperanceVie;
	}//getMaturiteSexuelle()
	
	
	/**
	 * Retourne la valeur de l'attribut consoNourriture
	 * @return Valeur de l'attribut consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()

}//Aigle
