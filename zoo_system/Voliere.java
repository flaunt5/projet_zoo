package zoo_system;

import java.util.ArrayList;

public class Voliere extends Enclos<Aerien>{

	private double hauteur;
	private String etatToit;
	
	/**
	 * Creer un objet de type Voliere
	 * @param nom
	 * @param superficie
	 * @param nbAnimauxMax
	 * @param hauteur
	 */
	public Voliere(String nom, int superficie, int nbAnimauxMax, double hauteur) {
		super(nom, superficie, nbAnimauxMax);
		this.hauteur = hauteur;
		this.etatToit = "bon";
		this.listAnimaux = new ArrayList<Aerien>();
	}//Voliere()
	
	/**
	 * Modifie l'etat d'une voliere pour l'entretenir
	 * @return retourne le resultat de la methode entretenir
	 */
	public String entretenirVoliere(){
		if(!(this.getEtatToit().equals("bon"))){
			this.setEtatToit("bon");
		}
		return super.entretenir();
	}//entretenirVoliere()
	
	/**
	 * retourne les details d'une voliere et les animaux
	 * @return string decrivant les details de la voliere et les animaux présents dedans
	 */
	public String toString() {
		return  super.toString3() + "Hauteur : " + hauteur + " ; Etat du toit : " + etatToit + "\n" +
				"Animaux dans la voliere  : " + this.recupToStringDesAnimaux();
	}//toString()
	
	/**
	 * Retourne les details d'une voliere vide
	 * @return string decrivant les details de la voliere
	 */
	public String toString2() {
		return  super.toString3() + "Hauteur : " + hauteur + " ; Etat du toit : " + etatToit + "\n" +
				"Animaux dans la voliere  : ";
	}//toString()

	/**
	 * retorune la hauteur de la voliere
	 * @return un double contenant la hauteur
	 */
	public double getHauteur() {
		return hauteur;
	}//getHauteur()

	/**
	 * modifier la hauteur d'une voliere
	 * @param hauteur
	 */
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}//setHauteur()
	
	/**
	 * Retourne l'etat du toit
	 * @return string contenant l'etat du toit
	 */
	public String getEtatToit() {
		return etatToit;
	}//getEtatToit()

	/**
	 * Modifie l'etat du toit de la voliere
	 * @param etatToit
	 */
	public void setEtatToit(String etatToit) {
		this.etatToit = etatToit;
	}//setEtatToit()
	
}//Voliere
