package zoo_animaux;

import java.util.ArrayList;

/**
 * Loup est la classe qui represente un animal du même nom
 * @author Alexandre
 *
 */
public abstract class Loup extends Terrestre implements PredateurAction{

	/**
	 * Age auquel le loup aura atteint sa maturité sexuelle
	 */
	protected static final int maturiteSexuelle = 2;
	
	/**
	 * Age à partir duquel le loup aura depassé son esperance de vie
	 */
	protected static final int esperanceVie = 15;
	
	/**
	 * Construit un objet de type Loup
	 * @param poids
	 * 				Futur poids du loup
	 * @param taille
	 * 				Futur taille du loup
	 * @param age
	 * 				Futur age du loup
	 * @param pseudo
	 * 				Futur pseudo du loup
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
	 * Permet au loup de pousser son cri
	 * @return Son emit par le loup
	 */
	public String emmetreSon() {
		return "Louuuuuuuuuuuuuuuuuuup";		
	}//emmetreSon()

	/**
	 * Retourne la maniere de vagabonder du loup
	 * @return Maniere de vagabonder du loup
	 */
	public String vagabonder() {
		return "Vagabonde comme un loup";
	}//vagabonder()
	
	/**
	 * Retourne la valeur de l'attribut maturiteSexuelle
	 * @return Valeur de l'attribut  maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Loup.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * Retourne la valeur de l'attribut esperanceVie
	 * @return Valeur de l'attribut  esperanceVie
	 */
	public int getEsperanceVie(){
		return Loup.esperanceVie;
	}//getMaturiteSexuelle()
	
	/**
	 * Retourne la valeur de l'attribut consoNourriture
	 * @return Valeur de l'attribut  consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()

}//Loup
