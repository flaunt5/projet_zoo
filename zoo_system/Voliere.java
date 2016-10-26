package zoo_system;

import java.util.ArrayList;

public class Voliere extends Enclos{

	private double hauteur;
	private String etatToit;
	private ArrayList<Aerien> listOiseaux;
	
	public Voliere(String nom, int superficie, int nbAnimauxMax, double hauteur) {
		super(nom, superficie, nbAnimauxMax);
		this.hauteur = hauteur;
		this.etatToit = "bon";
		this.listOiseaux = new ArrayList<Aerien>();
	}//Voliere()
	
	public void entretenirVoliere(){
		super.entretenir();
		if(!(this.getEtatToit().equals("bon"))){
			this.setEtatToit("bon");
		}
	}//entretenirVoliere()
	
	public void ajouterAnimal(Aerien animal){
		if(verifPourAjout(animal)){
			this.getListOiseaux().add(animal);
            this.setNbAnimaux(this.getNbAnimaux() + 1);
            animal.setEnclosResidence(this); 
		}
	}//ajouterAnimal()
	
	public void enleverAnimal(Aerien animal){
		if(verifPourEnlever(animal)){
			this.getListOiseaux().remove(animal);
			this.setNbAnimaux(this.getNbAnimaux() - 1);
		}
	}//enleverAnimal()
	
	public boolean verifPourAjout(Aerien animal){
		if(!(this.isFull())){
			//si l'enclos est vide on peut mettre l'animal car l'enclos n'a pas de type d'animal prédéfinit
			//sinon on verifie l'espece du premiere animal, si elle est la memme que celui de "animal" on ajoute
            if(this.getListOiseaux().isEmpty() || this.getListOiseaux().get(0).getNom().equals(animal.getNom())){
                return true;
            }else{
            	return false;
            }
		}else{
			return false;
		}	
	}//verifPourAjout()
	
	public boolean verifPourEnlever(Aerien animal){
		//si l'animal est dans l'enclo on peut l'en retirer
		if(this.getListOiseaux().contains(animal)){
			return true;
		}else{
			return false;
		}
	}//verifPourEnlever()
	
	public boolean isFull(){
		if(this.getListOiseaux().size() == this.getNbAnimauxMax()){
			return true;
		}else{
			return false;
		}		
	}//isFull()
	
	private String recupToStringDesAnimaux(){
		String retour = "\n";
		for(Animal animal : this.getListOiseaux()){
			retour += animal.toString() + "\n\n";
		}
		return retour;
	}//recupToStringDesAnimaux()
	
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

	public ArrayList<Aerien> getListOiseaux() {
		return listOiseaux;
	}//getListOiseaux()
	
}//Voliere
