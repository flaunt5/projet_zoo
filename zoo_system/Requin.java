package zoo_system;

import java.util.ArrayList;

public abstract class Requin extends Aquatique implements MarinAction{
	
	protected static final int maturiteSexuelle = 4;
	protected static final int esperanceVie = 25;
	
	/**
	 * Construit un objet de type Requin
	 * @param poids
	 * 				Futur poids du requin
	 * @param taille
	 * 				Futur taille du requin
	 * @param age
	 * 				Futur age du requin
	 * @param pseudo
	 * 				Futur pseudo du requin
	 */
	public Requin(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "requin";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Poisson");
		this.consoNourriture = 4;
	}//Requin()
	
	/**
	 * Permet au requin de pousser son cri
	 * @return Son emit par le requin
	 */
	public String emmetreSon() {
		return "Reeeeeeeeeeeeeeeequin";
	}//emmetreSon()

	/**
	 * Retourne la maniere de nager du requin
	 * @return maniere de nager du requin
	 */
	public String nager() {
		return "Nage comme un requin";
	}//nager()
	
	/**
	 * retourne la valeur de l'attribut maturiteSexuelle
	 * @return valeur de l'attribut maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Requin.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * retourne la valeur de l'attribut esperanceVie
	 * @return valeur de l'attribut esperanceVie
	 */
	public int getEsperanceVie(){
		return Requin.esperanceVie;
	}//getMaturiteSexuelle()
	
	/**
	 * retourne la valeur de l'attribut consoNourriture
	 * @return valeur de l'attribut consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()

}//Requin
