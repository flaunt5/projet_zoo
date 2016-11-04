package zoo_system;

import java.util.ArrayList;

public abstract class PoissonRouge extends Aquatique implements MarinAction{
	
	protected static final int maturiteSexuelle = 2;
	protected static final int esperanceVie = 30;
	
	/**
	 * Construit un objet de type PoissonRouge
	 * @param poids
	 * 				Futur poids du poisson
	 * @param taille
	 * 				Futur taille du poisson
	 * @param age
	 * 				Futur age du poisson
	 * @param pseudo
	 * 				Futur pseudo du poisson
	 */
	public PoissonRouge(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "poisson rouge";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("NourriturePoisson");
		this.consoNourriture = 2;
	}//PoissonRouge()
	
	/**
	 * Permet au poisson rouge de pousser son cri
	 * @return Son emit par le poisson rouge
	 */
	public String emmetreSon() {
		return "BlouBloup";
	}//emmetreSon()
	
	/**
	 * Retourne la maniere de nager du poisson rouge
	 * @return Maniere de nager du poisson rouge
	 */
	public String nager() {
		return "Nage comme un poisson rouge";
	}//nager()
	
	/**
	 * Retourne la valeur de l'attribut maturiteSexuelle
	 * @return Valeur de l'attribut maturiteSexuelle
	 */
	public int getMaturiteSexuelle(){
		return Requin.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	/**
	 * Retourne la valeur de l'attribut esperanceVie
	 * @return Valeur de l'attribut esperanceVie
	 */
	public int getEsperanceVie(){
		return Requin.esperanceVie;
	}//getMaturiteSexuelle()
	
	/**
	 * Retourne la valeur de l'attribut consoNourriture
	 * @return Valeur de l'attribut consoNourriture
	 */
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()
}//PoissonRouge
