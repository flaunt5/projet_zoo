package zoo_system;

import java.util.ArrayList;

public class Aquarium extends Enclos<Aquatique>{
	
	private  String salinite;
	private double profondeur;

	public Aquarium(String nom, int superficie, int nbAnimauxMax) {
		super(nom, superficie, nbAnimauxMax);
		this.salinite = "bon";
		this.profondeur = 10.0;
		this.listAnimaux = new ArrayList<Aquatique>();
	}//Aquarium()
	
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
	
	public String toString() {
		return  super.toString3() + "Salinite : " + salinite + " ; Profondeur : " + profondeur + "\n" +
				"Animaux dans le bassin : " + this.recupToStringDesAnimaux();
	}//toString()
	
	public String toString2() {
		return  super.toString3() + "Salinite : " + salinite + " ; Profondeur : " + profondeur + "\n" +
				"Animaux dans le bassin : ";
	}//toString()

	public String getSalinite() {
		return salinite;
	}//getSalinite()

	public void setSalinite(String salinite) {
		this.salinite = salinite;
	}//setSalinite()

	public double getProfondeur() {
		return profondeur;
	}//getProfondeur()

	public void setProfondeur(double profondeur) {
		this.profondeur = profondeur;
	}//setProfondeur()

}//Aquarium
