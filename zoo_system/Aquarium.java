package zoo_system;

import java.util.ArrayList;

public class Aquarium extends Enclos{
	
	private  String salinite;
	private double profondeur;
	private ArrayList<Aquatique> listAquatiques;

	public Aquarium(String nom, int superficie, int nbAnimauxMax) {
		super(nom, superficie, nbAnimauxMax);
		this.salinite = "bon";
		this.profondeur = 10.0;
		this.listAquatiques = new ArrayList<Aquatique>();
	}//Aquarium()
	
	public void entretenirBassin(){
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
	}//entretenirBassin()
	
	public void ajouterAnimal(Aquatique animal){
		if(verifPourAjout(animal)){
			this.getListAquatiques().add(animal);
            this.setNbAnimaux(this.getNbAnimaux() + 1);
            animal.setEnclosResidence(this); 
		}
	}//ajouterAnimal()
	
	public void enleverAnimal(Aquatique animal){
		if(verifPourEnlever(animal)){
			this.getListAnimaux().remove(animal);
			this.setNbAnimaux(this.getNbAnimaux() - 1);
		}
	}//enleverAnimal()
	
	public boolean verifPourAjout(Aquatique animal){
		if(!(this.isFull())){
			//si l'enclos est vide on peut mettre l'animal car l'enclos n'a pas de type d'animal prédéfinit
			//sinon on verifie l'espece du premiere animal, si elle est la memme que celui de "animal" on ajoute
            if(this.getListAquatiques().isEmpty() || this.getListAquatiques().get(0).getNom().equals(animal.getNom())){
                return true;
            }else{
            	return false;
            }
		}else{
			return false;
		}	
	}//verifPourAjout()
	
	public boolean isFull(){
		if(this.getListAquatiques().size() == this.getNbAnimauxMax()){
			return true;
		}else{
			return false;
		}		
	}//isFull()
	
	public boolean verifPourEnlever(Aquatique animal){
		//si l'animal est dans l'enclo on peut l'en retirer
		if(this.getListAquatiques().contains(animal)){
			return true;
		}else{
			return false;
		}
	}//verifPourEnlever()
	
	private String recupToStringDesAnimaux(){
		String retour = "\n";
		for(Animal animal : this.getListAquatiques()){
			retour += animal.toString() + "\n\n";
		}
		return retour;
	}//recupToStringDesAnimaux()

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

	public ArrayList<Aquatique> getListAquatiques() {
		return listAquatiques;
	}//getListAquatiques()

}//Aquarium
