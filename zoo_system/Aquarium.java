package zoo_system;

import java.util.ArrayList;

public class Aquarium extends Enclos<Aquatique>{
	
	private  String salinite;
	private double profondeur;

	/**
	 * Construit un bojet de type Aquarium
	 * @param nom
	 * 			Nom de l'aquarium
	 * @param superficie
	 * 			Superficie de l'aquarium
	 * @param nbAnimauxMax
	 * 			Nombre maximum d'animux de l'aquarium
	 */
	public Aquarium(String nom, int superficie, int nbAnimauxMax) {
		super(nom, superficie, nbAnimauxMax);
		this.salinite = "bon";
		this.profondeur = 10.0;
		this.listAnimaux = new ArrayList<Aquatique>();
	}//Aquarium()
	
	/**
	 * Change l'attribut salinite et profondeur
	 * @return Message de confirmation de l'action
	 */
	public String entretenirBassin(){
		if(!(this.getSalinite().equals("bon"))){
			this.setSalinite("bon");			
		}
		if(this.getProfondeur() < 10.0){
			/*
			 * si le niveau d'eau est < à 10 metres on rajoute assez d'eau 
			 * pour que la profondeur atteint  10 metres
			 */
			this.setProfondeur(this.getProfondeur() + (10.0 - this.getProfondeur()));
		}
		return this.getNom() +  " à était entretenu";
	}//entretenirBassin()
	
	/**
	 * Retourne les caractéristiques de l'aquarium et de ses animaux
	 * @return Caractéristiques de l'aquarium et de ses animaux
	 */
	public String toString() {
		return  super.toString3() + "Salinite : " + salinite + " ; Profondeur : " + profondeur + "\n" +
				"Animaux dans le bassin : " + this.recupToStringDesAnimaux();
	}//toString()
	
	/**
	 * Retourne les caractéristiques de l'aquarium seulement
	 * @return Caractéristiques de l'aquarium seulement
	 */
	public String toString2() {
		return  super.toString3() + "Salinite : " + salinite + " ; Profondeur : " + profondeur + "\n" +
				"Animaux dans le bassin : ";
	}//toString()

	/**
	 * Retourne la valeur de l'attribut salinite
	 * @return Valeur de l'attribut salinite
	 */
	public String getSalinite() {
		return salinite;
	}//getSalinite()
	/**
	 * Modifie la valeur de l'attribut salinite
	 * @param salinite
	 * 				Futur valeur de salinite
	 */
	public void setSalinite(String salinite) {
		this.salinite = salinite;
	}//setSalinite()

	/**
	 * Retourne la valeur de l'attribut profondeur
	 * @return Valeur de l'attribut profondeur
	 */
	public double getProfondeur() {
		return profondeur;
	}//getProfondeur()
	
	/**
	 * Modifie la valeur de l'attribut profondeur
	 * @param profondeur
	 * 				Futur valeur de profondeur
	 */
	public void setProfondeur(double profondeur) {
		this.profondeur = profondeur;
	}//setProfondeur()

}//Aquarium
