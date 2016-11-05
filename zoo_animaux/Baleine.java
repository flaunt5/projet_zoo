package zoo_animaux;

import java.util.ArrayList;

/**
 * Baleine est la classe qui represente un animal du même nom
 * @author Alexandre
 *
 */
public abstract class Baleine extends Aquatique implements MarinAction{

	/**
	 * Age auquel la baleine aura atteint sa maturité sexuelle
	 */
	protected static final int maturiteSexuelle = 5;
	
	/**
	 * Age à partir duquel la baleine aura depassé son esperance de vie
	 */
	protected static final int esperanceVie = 80;
	
	/**
	 * Construit un objet de type Baleine
	 * @param poids
	 * 				Futur poids de la baleine
	 * @param taille
	 * 				Futur taille de la baleine
	 * @param age
	 * 				Futur age de la baleine
	 * @param pseudo
	 * 				Futur pseudo de la baleine
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
	 * @return maniere de nager de la baleine
	 */
	public String nager() {
		return "Nage comme une baleine";
	}//nager()
	
	/**
	 * Retourne la valeur de l'attribut maturiteSexuelle
	 * @return Valeur de l'attribut  maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Baleine.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * Retourne la valeur de l'attribut esperanceVie
	 * @return Valeur de l'attribut  esperanceVie
	 */
	public int getEsperanceVie(){
		return Baleine.esperanceVie;
	}//getMaturiteSexuelle()
	
	/**
	 * Retourne la valeur de l'attribut consoNourriture
	 * @return Valeur de l'attribut  consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()

}//Baleine
