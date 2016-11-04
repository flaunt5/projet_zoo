package zoo_system;

import java.util.ArrayList;

public abstract class Pingouin extends Aquatique implements MarinAction, VolantAction{
	
	protected static final int maturiteSexuelle = 4;
	protected static final int esperanceVie = 20;
	
	/**
	 * Construit un objet de type Aigle
	 * @param poids
	 * 				Futur poids de pinguoin
	 * @param taille
	 * 				Futur taille de pinguoin
	 * @param age
	 * 				Futur age de pinguoin
	 * @param pseudo
	 * 				Futur pseudo de pinguoin
	 */
	public Pingouin(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "pingouin";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Poisson");
		this.consoNourriture = 2;
	}//Pinguoin()
	
	/**
	 * Permet au pingouin de pousser son cri
	 * @return Son emit par le pingouin
	 */
	public String emmetreSon() {
		return "NUTNUT";
	}//emmetreSon()


	/**
	 * Retourne la maniere de voler du pingouin
	 * @return maniere de voler du pingouin
	 */
	public String voler() {
		return "Vole comme un pinguoin";
	}//voler()


	/**
	 * Retourne la maniere de voler du pingouin
	 * @return maniere de voler du pingouin
	 */
	public String nager() {
		return "Nage comme un pinguoin";
	}//nager()
	
	/**
	 * retourne la valeur de l'attribut maturiteSexuelle
	 * @return valeur de l'attribut maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Pingouin.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * retourne la valeur de l'attribut esperanceVie
	 * @return valeur de l'attribut esperanceVie
	 */
	public int getEsperanceVie(){
		return Pingouin.esperanceVie;
	}//getMaturiteSexuelle()
	
	/**
	 * retourne la valeur de l'attribut consoNourriture
	 * @return valeur de l'attribut consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()
}//Pingouin
