package zoo_models;

import java.util.ArrayList;

import zoo_animaux.Aerien;
import zoo_animaux.Animal;
import zoo_animaux.Aquatique;
import zoo_animaux.Femelle;
import zoo_animaux.Terrestre;
import zoo_divers.equipements.Nourriture;

public abstract class Enclos<T extends Animal> extends Model{
	protected String nom;
	protected int superficie; 
	protected int nbAnimaux;
	protected int nbAnimauxMax;
	protected String degreProprete;
	protected int niveauProprete;
	protected ArrayList<T> listAnimaux;
	protected Tri<T> tri;
	
	/**
	 * Construit un objet de type Enclo<T>
	 * @param nom
	 * 			Nom de l'enclos
	 * @param superficie
	 * 			Superficie de l'enclos
	 * @param nbAnimauxMax
	 * 			Nombre maximum d'animux de l'enclos
	 */
	public Enclos(String nom, int superficie, int nbAnimauxMax){
		this.nom = nom;
		this.superficie = superficie;
		this.nbAnimaux = 0;
		this.nbAnimauxMax = nbAnimauxMax;
		this.degreProprete = "bon";
		this.niveauProprete = 100;
	}//Enclos()

	/**
	 * Effectue un tri sur la liste des animaux
	 * @return Message de confirmation de l'action et caracteristiques de l'enclos trié
	 */
	public String effectuerTri(){
		this.getTri().trier(this.getListAnimaux());
		return this.getNom() + " à été trié : \n" + this.toString();
	}//effectuerTri()
	
	/**
	 * Retourne un type de tri en fonction d'une saisie réaliser par l'utilisateur
	 * @param saisie
	 * 				Saisie de l'utilisateur designant le type de tri
	 * @return Tri<T>
	 */
	public Tri<T> getTypeTri(int saisie){
		switch(saisie){
			case 1 :
				return new TriAge<T>();
			case 2 : 
				return new TriAlphabetique<T>();
			default : 
				return null;
		}
	}//getTypeTri()
	
	/**
	 * Ajoute un animal dans la liste des animaux de l'enclos, en verifiant que c'est possible
	 * @param animal
	 * 				Animal qui va etre ajouter
	 */
	public void ajouterAnimal(T animal){
		if(verifPourAjout(animal)){
			this.getListAnimaux().add(animal);
            this.setNbAnimaux(this.getNbAnimaux() + 1);
            animal.setEnclosResidence(this); 
		}
	}//ajouterAnimal()
	
	/**
	 * Retire un animal de la liste des animaux de l'enclos
	 * @param animal
	 * 				Animal qui va etre ajouter		
	 */
	public void enleverAnimal(T animal){
		if(verifPourEnlever(animal)){
			this.getListAnimaux().remove(animal);
			this.setNbAnimaux(this.getNbAnimaux() - 1);
		}
	}//enleverAnimal()
	
	/**
	 * Verifie qu'un animal puisse etre ajoute dans l'enclos
	 * @param animal
	 * 				Animal qui va etre vérifier
	 * @return Booleen montrant la reussite ou l'echec du test
	 */
	public boolean verifPourAjout(T animal){
		if(!(this.isFull())){
			//si l'enclos est vide on peut mettre l'animal car l'enclos n'a pas de type d'animal prédéfinit
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
	
	/**
	 * Verifie qu'un animal peut etre retire de la liste des animaux de l'enclos
	 * @param animal
	 * @return Booleen montrant la reussite ou l'echec du test
	 */
	public boolean verifPourEnlever(T animal){
		//si l'animal est dans l'enclo on peut l'en retirer
		if(this.getListAnimaux().contains(animal)){
			return true;
		}else{
			return false;
		}
	}//verifPourEnlever()
	
	/**
	 * Verifie si la liste des animaux de l'enclos est pleine
	 * @return Booleen montrant la reussite ou l'echec du test
	 */
	public boolean isFull(){
		if(this.getListAnimaux().size() == this.getNbAnimauxMax()){
			return true;
		}else{
			return false;
		}		
	}//isFull()
	
	/**
	 * Recupere un femelle capable d'etre fécondé
	 * @return L'animal femelle pouvant etre fecondé
	 */
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
	
	/**
	 * Modifie le degré de propreté d'un enclos pour qu'il soit à : bon
	 * @return Message de confirmation de l'action
	 */
	public String entretenir(){
		this.setNiveauProprete(100);
		this.redefiniDegreProprete();	
		return this.getNom() +  " à était entretenu";
	}//entretenir()
	
	/**
	 * Nouri un animal avec un type de nourriture
	 * @param animal
	 * 			Animal à nourir
	 * @param nourriture
	 * 			Nourriture à donner à l'animal
	 * @param ratio
	 * 			Nombre qui represente le % des gain en "niveau de faim" de l'animal quand il va manger
	 * @return Retour de la fonction Animal.manger()
	 */
	public String nourir(T animal, Nourriture nourriture, double ratio){	
		return animal.manger(nourriture, ratio);
	}//nourir()
	
	/**
	 * Recupere les caracteristiques de tout les animaux de l'enclos
	 * @return Caracteristique des animaux
	 */
	protected String recupToStringDesAnimaux(){
		String retour = "\n";
		for(Animal animal : this.getListAnimaux()){
			retour += animal.toString() + "\n\n";
		}
		return retour;
	}//recupToStringDesAnimaux()
	
	/**
	 * Retourne les caractéristiques de l'enclos et de ses animaux
	 * @return Caractéristique de l'enclos et de ses animaux
	 */
	public String toString() {//methode classique retournant les detail de l'objet
		return "Nom de l'enclos : " + nom + " ; Superficie : " + superficie + " ; Niveau de propreté : "+ niveauProprete + "\n" +
				"DegreProprete : " + degreProprete + "Nombre d'animaux dans l'enclos : " + nbAnimaux + "\n"+
				"Nombre max d'animaux autorisé : " + nbAnimauxMax +  "\n" +
				"Animaux dans l'enclos : " + this.recupToStringDesAnimaux();
	}//toString()
	
	/**
	 * Retourne les caracteristiques de l'enclos sans les caracteristique des animaux
	 * @return Caractéristique de l'enclos
	 */
	public String toString2() {//methode retournant les detail de l'objet sans les detail des animaux qu'il contient
		return "Nom de l'enclos : " + nom + " ; Superficie : " + superficie + " ; Niveau de propreté : "+ niveauProprete + "\n" +
				"DegreProprete : " + degreProprete + "Nombre d'animaux dans l'enclos : " + nbAnimaux + "\n"+
				"Nombre max d'animaux autorisé : " + nbAnimauxMax +  "\n" +
				"Animaux dans l'enclos : ";
	}//toString2()
	
	/**
	 * Retourne les caracteristiques d'un enclos
	 * @return Caractéristiques de l'enclos
	 */
	protected String toString3() {//methode destiner aux classes filles comme base de leur methode toString()
		return "Nom de l'enclos : " + nom + " ; Superficie : " + superficie + " ; Niveau de propreté : "+ niveauProprete + "\n" +
				"DegreProprete : " + degreProprete + "Nombre d'animaux dans l'enclos : " + nbAnimaux + "\n"+
				"Nombre max d'animaux autorisé : " + nbAnimauxMax +  "\n";
	}//toString3()
	
	/**
	 * Retourne la valeur de l'attribut nom
	 * @return Valeur de l'attribut nom
	 */
	public String getNom() {
		return nom;
	}//getNom()

	/**
	 * Modifie la valeur de l'attribut nom
	 * @param nom
	 * 			Futur nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}//setNom()

	/**
	 * Retourne la valeur de l'attribut superficie
	 * @return Valeur de l'attribut superficie
	 */
	public int getSuperficie() {
		return superficie;
	}//getSuperficie()

	/**
	 * Modifie la valeur de l'attribut superficie
	 * @param superficie
	 * 			Futur superficie
	 */
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}//setSuperficie()

	/**
	 * Retourne la valeur de l'attribut nbAnimaux
	 * @return Valeur de l'attribut nbAnimaux
	 */
	public int getNbAnimaux() {
		return nbAnimaux;
	}//getNbAnimaux()

	/**
	 * Modifie la valeur de l'attribut nbAnimaux
	 * @param nbAnimaux
	 * 			Futur nbAnimaux
	 */
	public void setNbAnimaux(int nbAnimaux) {
		this.nbAnimaux = nbAnimaux;
	}//setNbAnimaux()

	/**
	 * Retourne la valeur de l'attribut nbAnimauxMax
	 * @return Valeur de l'attribut nbAnimauxMax
	 */
	public int getNbAnimauxMax() {
		return nbAnimauxMax;
	}//getNbAnimauxMax()

	/**
	 * Modifie la valeur de l'attribut nbAnimauxMax
	 * @param nbAnimauxMax
	 * 			Futur nbAnimauxMax
	 */
	public void setNbAnimauxMax(int nbAnimauxMax) {
		this.nbAnimauxMax = nbAnimauxMax;
	}//setNbAnimauxMax()

	/**
	 * Retourne la valeur de l'attribut degreProprete
	 * @return Valeur de l'attribut degreProprete
	 */
	public String getDegreProprete() {
		return degreProprete;
	}//getDegreProprete()

	/**
	 * Modifie la valeur de l'attribut degreProprete
	 * @param degreProprete
	 * 			Futur degreProprete
	 */
	public void redefiniDegreProprete() {
		if(this.getNiveauProprete() > 60){
			this.degreProprete = "bon";
		}else if(this.getNiveauProprete() < 60 && this.getNiveauProprete() > 30){
			this.degreProprete = "correct";
		}else{
			this.degreProprete = "mauvais";			
		}
	}//setDegreProprete()

	/**
	 * Retourne la valeur de l'attribut listAnimaux
	 * @return Valeur de l'attribut listAnimaux
	 */
	public ArrayList<T> getListAnimaux() {
		return listAnimaux;
	}//getListAnimaux()
	
	/**
	 * Modifie la valeur de l'attribut tri
	 * @param tri
	 * 			Futur tri
	 */
	public void setTri(Tri<T> tri){
		this.tri = tri;
	}//setTri()
	
	/**
	 * Retourne la valeur de l'attribut tri
	 * @return Valeur de l'attribut tri
	 */
	public Tri<T> getTri(){
		return this.tri;
	}//getTri()
	
	/**
	 * Retourne la valeur de l'attribut niveauProprete
	 * @return Valeur de l'attribut niveauProprete
	 */
	public int getNiveauProprete() {
		return niveauProprete;
	}//getNiveauProprete()

	/**
	 * Modifie la valeur de l'attribut niveauProprete
	 * @param niveauProprete
	 * 			Futur niveauProprete
	 */
	public void setNiveauProprete(int niveauProprete) {
		this.niveauProprete = niveauProprete;
		if(this.niveauProprete > 100){
			this.niveauProprete = 100;
		}
	}//setNiveauProprete()
	
}//Enclos
