package zoo_system;

import java.util.ArrayList;

public class Voliere extends Enclos<Aerien>{

	private double hauteur;
	private String etatToit;
	
	/**
	 * Creer un objet de type Voliere
	 * @param nom
	 * 			Nom de la voliere
	 * @param superficie
	 * 			Superficie de la voliere
	 * @param nbAnimauxMax
	 * 			Nombre maximum d'animux de la voliere
	 * @param hauteur
	 * 			Hauteur de la voliere en metre
	 */
	public Voliere(String nom, int superficie, int nbAnimauxMax, double hauteur) {
		super(nom, superficie, nbAnimauxMax);
		this.hauteur = hauteur;
		this.etatToit = "bon";
		this.listAnimaux = new ArrayList<Aerien>();
	}//Voliere()
	
	/**
	 * Modifie l'etat d'une voliere pour l'entretenir
	 * @return Retourne le resultat de la methode Enclos.entretenir
	 */
	public String entretenirVoliere(){
		if(!(this.getEtatToit().equals("bon"))){
			this.setEtatToit("bon");
		}
		return super.entretenir();
	}//entretenirVoliere()
	
	/**
	 * Retourne les caracteristiques d'une voliere et de ses animaux
	 * @return Caracteristiques d'une voliere et de ses animaux
	 */
	public String toString() {
		return  super.toString3() + "Hauteur : " + hauteur + " ; Etat du toit : " + etatToit + "\n" +
				"Animaux dans la voliere  : " + this.recupToStringDesAnimaux();
	}//toString()
	
	/**
	 * Retourne les caracteristiques d'une voliere sans les details sur ses animaux
	 * @return Caracteristiques d'une voliere sans la liste de ses animaux
	 */
	public String toString2() {
		return  super.toString3() + "Hauteur : " + hauteur + " ; Etat du toit : " + etatToit + "\n" +
				"Animaux dans la voliere  : ";
	}//toString()

	/**
	 * Retorune la hauteur de la voliere
	 * @return Un double contenant la hauteur
	 */
	public double getHauteur() {
		return hauteur;
	}//getHauteur()

	/**
	 * Modifie la hauteur de la voliere
	 * @param hauteur
	 * 				Nouvelle hauteur de la voliere
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
	 * 				Nouvelle etat du toit
	 */
	public void setEtatToit(String etatToit) {
		this.etatToit = etatToit;
	}//setEtatToit()
	
}//Voliere
