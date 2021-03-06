package zoo_animaux;

import java.util.ArrayList;

/**
 * Ours est la classe qui represente un animal du m�me nom
 * @author Alexandre
 *
 */
public abstract class Ours extends Terrestre{
	
	/**
	 * Age auquel l'ours aura atteint sa maturit� sexuelle
	 */	
	protected static final int maturiteSexuelle = 4;
	
	/**
	 * Age � partir duquel l'ours aura depass� son esperance de vie
	 */
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
	 * Permet � l'ours de pousser son cri
	 * @return Son emit par l'ours
	 */
	public String emmetreSon() {
		return "Grrrrrrrrrrrrrrrrrrrr";
	}//emmetreSon()
	
	/**
	 * Retourne la valeur de l'attribut maturiteSexuelle
	 * @return Valeur de l'attribut maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Ours.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * Retourne la valeur de l'attribut esperanceVie
	 * @return Valeur de l'attribut esperanceVie
	 */
	public int getEsperanceVie(){
		return Ours.esperanceVie;
	}//getMaturiteSexuelle()
	
	/**
	 * Retourne la valeur de l'attribut consoNourriture
	 * @return Valeur de l'attribut consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()
}//Ours
