package zoo_system;

import java.util.ArrayList;

public abstract class Tigre extends Terrestre implements PredateurAction{
	
	protected static final int maturiteSexuelle = 3;
	protected static final int esperanceVie = 20;
	
	/**
	 * Construit un objet de type Tigre
	 * @param poids
	 * 				Futur poids du tigre
	 * @param taille
	 * 				Futur taille du tigre
	 * @param age
	 * 				Futur age du tigre
	 * @param pseudo
	 * 				Futur pseudo du tigre
	 */
	public Tigre(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "tigre";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Boeuf");
		this.listNourritureAccepte.add("Poisson");
		this.consoNourriture = 4;
	}//Tigre()
	
	/**
	 * Permet au tigre de pousser son cri
	 * @return Son emit par le tigre
	 */
	public String emmetreSon() {
		return "Tiiiiiiiiiiiiiigre";
	}//emmetreSon()

	/**
	 * Retourne la maniere de vagabonder du tigre
	 * @return Maniere de vagabonder du tigre
	 */
	public String vagabonder() {
		return "Vagabonde comme un tigre";
	}//vagabonder()
	
	/**
	 * Retourne la valeur de l'attribut maturiteSexuelle
	 * @return Valeur de l'attribut maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Tigre.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * Retourne la valeur de l'attribut esperanceVie
	 * @return Valeur de l'attribut esperanceVie
	 */
	public int getEsperanceVie(){
		return Tigre.esperanceVie;
	}//getMaturiteSexuelle()
	
	/**
	 * Retourne la valeur de l'attribut consoNourriture
	 * @return Valeur de l'attribut consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()

}//Tigre
