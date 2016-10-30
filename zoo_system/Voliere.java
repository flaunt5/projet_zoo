package zoo_system;

import java.util.ArrayList;

public class Voliere extends Enclos<Aerien>{

	private double hauteur;
	private String etatToit;
	
	public Voliere(String nom, int superficie, int nbAnimauxMax, double hauteur) {
		super(nom, superficie, nbAnimauxMax);
		this.hauteur = hauteur;
		this.etatToit = "bon";
		this.listAnimaux = new ArrayList<Aerien>();
	}//Voliere()
	
	public String entretenirVoliere(){
		if(!(this.getEtatToit().equals("bon"))){
			this.setEtatToit("bon");
		}
		return super.entretenir();
	}//entretenirVoliere()
	
	public String toString() {
		return  super.toString3() + "Hauteur : " + hauteur + " ; Etat du toit : " + etatToit + "\n" +
				"Animaux dans la voliere  : " + this.recupToStringDesAnimaux();
	}//toString()
	
	public String toString2() {
		return  super.toString3() + "Hauteur : " + hauteur + " ; Etat du toit : " + etatToit + "\n" +
				"Animaux dans la voliere  : ";
	}//toString()

	public double getHauteur() {
		return hauteur;
	}//getHauteur()

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}//setHauteur()

	public String getEtatToit() {
		return etatToit;
	}//getEtatToit()

	public void setEtatToit(String etatToit) {
		this.etatToit = etatToit;
	}//setEtatToit()
	
}//Voliere
