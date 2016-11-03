package zoo_system;

import java.util.ArrayList;

public abstract class Enclos<T extends Animal> extends Model{
	protected String nom;
	protected int superficie; 
	protected int nbAnimaux;
	protected int nbAnimauxMax;
	protected String degreProprete;
	protected ArrayList<T> listAnimaux;
	
	public Enclos(String nom, int superficie, int nbAnimauxMax){
		this.nom = nom;
		this.superficie = superficie;
		this.nbAnimaux = 0;
		this.nbAnimauxMax = nbAnimauxMax;
		this.degreProprete = "bon";
	}//Enclos()
	
	public void ajouterAnimal(T animal){
		if(verifPourAjout(animal)){
			this.getListAnimaux().add(animal);
            this.setNbAnimaux(this.getNbAnimaux() + 1);
            animal.setEnclosResidence(this); 
		}
	}//ajouterAnimal()
	
	public void enleverAnimal(T animal){
		if(verifPourEnlever(animal)){
			this.getListAnimaux().remove(animal);
			this.setNbAnimaux(this.getNbAnimaux() - 1);
		}
	}//enleverAnimal()
	
	public boolean verifPourAjout(T animal){
		if(!(this.isFull())){
			//si l'enclos est vide on peut mettre l'animal car l'enclos n'a pas de type d'animal pr�d�finit
			//sinon on verifie l'espece du premiere animal, si elle est la memme que celui de "animal" on ajoute
            if(this.getListAnimaux().isEmpty() || this.getListAnimaux().get(0).getNom().equals(animal.getNom())){
                if(this instanceof Cage && animal instanceof Terrestre){
                	return true;
                }else if(this instanceof Aquarium && animal instanceof Aquatique){
                	return true;
                }else if(this instanceof Voliere && animal instanceof Aerien){
                	return true;
                }else{
                	return false;
                }
            }else{
            	return false;
            }
		}else{
			return false;
		}	
	}//verifPourAjout()
	
	public boolean verifPourEnlever(T animal){
		//si l'animal est dans l'enclo on peut l'en retirer
		if(this.getListAnimaux().contains(animal)){
			return true;
		}else{
			return false;
		}
	}//verifPourEnlever()
	
	public boolean isFull(){
		if(this.getListAnimaux().size() == this.getNbAnimauxMax()){
			return true;
		}else{
			return false;
		}		
	}//isFull()
	
	public Animal getFemelle(){
		Animal retour = null;
		for(Animal animal : this.getListAnimaux()){
			if(animal.getSexe() == 'F' && animal.getAge() >= animal.getMaturiteSexuelle()){
				if(!(((Femelle) animal).isEnceinte())){
					retour = animal;
				}
			}
		}
		return retour;
	}
	
	public String entretenir(){
		this.setDegreProprete("bon");	

		return this.getNom() +  " � �tait entretenu";
	}//entretenir()
	
	public String nourir(){
		Boeuf v = new Boeuf();
		for(Animal animal : this.getListAnimaux()){
			animal.manger(v);
		}	
		return "Les animaux de l'enclos " + this.getNom() + " ont etes nourri";
	}//nourir()
	
	protected String recupToStringDesAnimaux(){
		String retour = "\n";
		for(Animal animal : this.getListAnimaux()){
			retour += animal.toString() + "\n\n";
		}
		return retour;
	}//recupToStringDesAnimaux()
	
	public String toString() {//methode classique retournant les detail de l'objet
		return "Nom de l'enclos : " + nom + " ; Superficie : " + superficie + "m� ; DegreProprete : " + degreProprete + "\n" +
				"Nombre d'animaux dans l'enclos : " + nbAnimaux + "; Nombre max d'animaux autoris� : " + nbAnimauxMax +  "\n" +
				"Animaux dans l'enclos : " + this.recupToStringDesAnimaux();
	}//toString()
	
	public String toString2() {//methode retournant les detail de l'objet sans les detail des animaux qu'il contient
		return "Nom de l'enclos : " + nom + " ; Superficie : " + superficie + " ; DegreProprete : " + degreProprete + "\n" +
				"Nombre d'animaux dans l'enclos : " + nbAnimaux + "; Nombre max d'animaux autoris� : " + nbAnimauxMax +  "\n" +
				"Animaux dans l'enclos : ";
	}//toString2()
	
	protected String toString3() {//methode destiner aux classes filles comme base de leur methode toString()
		return "Nom de l'enclos : " + nom + " ; Superficie : " + superficie + " ; DegreProprete : " + degreProprete + "\n" +
				"Nombre d'animaux dans l'enclos : " + nbAnimaux + "; Nombre max d'animaux autoris� : " + nbAnimauxMax +  "\n";
	}//toString3()

	public String getNom() {
		return nom;
	}//getNom()

	public void setNom(String nom) {
		this.nom = nom;
	}//setNom()

	public int getSuperficie() {
		return superficie;
	}//getSuperficie()

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}//setSuperficie()

	public int getNbAnimaux() {
		return nbAnimaux;
	}//getNbAnimaux()

	public void setNbAnimaux(int nbAnimaux) {
		this.nbAnimaux = nbAnimaux;
	}//setNbAnimaux()

	public int getNbAnimauxMax() {
		return nbAnimauxMax;
	}//getNbAnimauxMax()

	public void setNbAnimauxMax(int nbAnimauxMax) {
		this.nbAnimauxMax = nbAnimauxMax;
	}//setNbAnimauxMax()

	public String getDegreProprete() {
		return degreProprete;
	}//getDegreProprete()

	public void setDegreProprete(String degreProprete) {
		this.degreProprete = degreProprete;
	}//setDegreProprete()

	public ArrayList<T> getListAnimaux() {
		return listAnimaux;
	}//getListAnimaux()
	
}//Enclos
