package zoo_models;

import java.util.ArrayList;

import zoo_animaux.Aerien;

/**
 * Voliere est la classe qui représente un enclos pour les animaux volant
 * @author Alexandre
 *
 */
public class Voliere extends Enclos<Aerien>{

	/**
	 * Hauteur de la voliere
	 */
	private double hauteur;
	
	/**
	 * Indication sur l'état du toit
	 */
	private String etatToit;
	
	/**
	 * Indicateur en % sur l'état du toit, 100 = bon , 0 = mauvais
	 */
	private int niveauEtatToit;
	
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
		this.niveauEtatToit = 100;
		this.listAnimaux = new ArrayList<Aerien>();
	}//Voliere()
	
	/**
	 * Modifie l'etat d'une voliere pour l'entretenir
	 * @return Retourne le resultat de la methode Enclos.entretenir
	 */
	public String entretenirVoliere(){
		this.setNiveauEtatToit(100);
		this.redefiniDegreProprete();
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
	public void redefiniEtatToit() {
		if(this.getNiveauEtatToit() > 60){
			this.etatToit = "bon";
		}else if(this.getNiveauEtatToit() < 60 && this.getNiveauEtatToit() > 30){
			this.etatToit = "correct";
		}else{
			this.etatToit = "mauvais";			
		}
	}//setEtatToit()

	/**
	 * Retourne la valeur de l'attribut niveauEtatToit
	 * @return Valeur de l'attribut niveauEtatToit
	 */
	public int getNiveauEtatToit() {
		return niveauEtatToit;
	}//getNiveauEtatToit()

	/**
	 * Modifie la valeur de l'attribut niveauEtatToit
	 * @param niveauEtatToit
	 * 				Nouveau niveau de l'état du toit
	 */
	public void setNiveauEtatToit(int niveauEtatToit) {
		this.niveauEtatToit = niveauEtatToit;
		if(this.niveauEtatToit > 100){
			this.niveauEtatToit = 100;
		}
	}//setNiveauEtatToit()
	
}//Voliere
