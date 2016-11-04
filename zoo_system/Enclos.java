package zoo_system;

import java.util.ArrayList;

public abstract class Enclos<T extends Animal> extends Model{
	protected String nom;
	protected int superficie; 
	protected int nbAnimaux;
	protected int nbAnimauxMax;
	protected String degreProprete;
	protected ArrayList<T> listAnimaux;
	protected Tri<T> tri;
	
	/**
	 * Construit un objet de type Enclo<T>
	 * @param nom
	 * @param superficie
	 * @param nbAnimauxMax
	 */
	public Enclos(String nom, int superficie, int nbAnimauxMax){
		this.nom = nom;
		this.superficie = superficie;
		this.nbAnimaux = 0;
		this.nbAnimauxMax = nbAnimauxMax;
		this.degreProprete = "bon";
	}//Enclos()
	
	/**
	 * Effectue un tri sur la liste des animaux
	 * @return Message de confirmation de l'action + caracteristiques de l'enclos trié
	 */
	public String effectuerTri(){
		this.getTri().trier(this.getListAnimaux());
		return this.getNom() + " à été trié : \n" + this.toString();
	}//effectuerTri()
	
	/**
	 * Retourne un type de tri en fonction d'une saisie réaliser par l'utilisateur
	 * @param saisie
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
	 * @return true ou false
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
	 * @return true ou false
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
	 * @return true ou false
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
	 * @return retour
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
		this.setDegreProprete("bon");	

		return this.getNom() +  " à était entretenu";
	}//entretenir()
	
	/**
	 * Nouri un animal avec un type de nourriture
	 * @param animal
	 * @param nourriture
	 * @param ratio
	 * @return
	 */
	public String nourir(T animal, Nourriture nourriture, double ratio){	
		return animal.manger(nourriture, ratio);
	}//nourir()
	
	/**
	 * recupere les caracteristiques de tout les animaux de l'enclos
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
	 * Retourne les caractéristique de l'enclos et des ses animaux
	 * @return Caractéristique de l'enclos et des ses animaux
	 */
	public String toString() {//methode classique retournant les detail de l'objet
		return "Nom de l'enclos : " + nom + " ; Superficie : " + superficie + "m² ; DegreProprete : " + degreProprete + "\n" +
				"Nombre d'animaux dans l'enclos : " + nbAnimaux + "; Nombre max d'animaux autorisé : " + nbAnimauxMax +  "\n" +
				"Animaux dans l'enclos : " + this.recupToStringDesAnimaux();
	}//toString()
	
	/**
	 * Retourne les caracteristique de l'enclos sans les caracteristique des animaux
	 * @return Caractéristique de l'enclos
	 */
	public String toString2() {//methode retournant les detail de l'objet sans les detail des animaux qu'il contient
		return "Nom de l'enclos : " + nom + " ; Superficie : " + superficie + " ; DegreProprete : " + degreProprete + "\n" +
				"Nombre d'animaux dans l'enclos : " + nbAnimaux + "; Nombre max d'animaux autorisé : " + nbAnimauxMax +  "\n" +
				"Animaux dans l'enclos : ";
	}//toString2()
	
	/**
	 * Retourne les details d'un enclos
	 * @return Caractéristique de l'enclos
	 */
	protected String toString3() {//methode destiner aux classes filles comme base de leur methode toString()
		return "Nom de l'enclos : " + nom + " ; Superficie : " + superficie + " ; DegreProprete : " + degreProprete + "\n" +
				"Nombre d'animaux dans l'enclos : " + nbAnimaux + "; Nombre max d'animaux autorisé : " + nbAnimauxMax +  "\n";
	}//toString3()
	
	/**
	 * Retourne la valeur de l'attribut nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}//getNom()

	/**
	 * Modifie la valeur de l'attribut nom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}//setNom()

	/**
	 * Retourne la valeur de l'attribut superficie
	 * @return superficie
	 */
	public int getSuperficie() {
		return superficie;
	}//getSuperficie()

	/**
	 * Modifie la valeur de l'attribut superficie
	 * @param superficie
	 */
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}//setSuperficie()

	/**
	 * Retourne la valeur de l'attribut v
	 * @return nbAnimaux
	 */
	public int getNbAnimaux() {
		return nbAnimaux;
	}//getNbAnimaux()

	/**
	 * Modifie la valeur de l'attribut nbAnimaux
	 * @param nbAnimaux
	 */
	public void setNbAnimaux(int nbAnimaux) {
		this.nbAnimaux = nbAnimaux;
	}//setNbAnimaux()

	/**
	 * Retourne la valeur de l'attribut nbAnimauxMax
	 * @return nbAnimauxMax
	 */
	public int getNbAnimauxMax() {
		return nbAnimauxMax;
	}//getNbAnimauxMax()

	/**
	 * Modifie la valeur de l'attribut nbAnimauxMax
	 * @param nbAnimauxMax
	 */
	public void setNbAnimauxMax(int nbAnimauxMax) {
		this.nbAnimauxMax = nbAnimauxMax;
	}//setNbAnimauxMax()

	/**
	 * Retourne la valeur de l'attribut degreProprete
	 * @return degreProprete
	 */
	public String getDegreProprete() {
		return degreProprete;
	}//getDegreProprete()

	/**
	 * Modifie la valeur de l'attribut degreProprete
	 * @param degreProprete
	 */
	public void setDegreProprete(String degreProprete) {
		this.degreProprete = degreProprete;
	}//setDegreProprete()

	/**
	 * Retourne la valeur de l'attribut listAnimaux
	 * @return listAnimaux
	 */
	public ArrayList<T> getListAnimaux() {
		return listAnimaux;
	}//getListAnimaux()
	
	/**
	 * Modifie la valeur de l'attribut tri
	 * @param tri
	 */
	public void setTri(Tri<T> tri){
		this.tri = tri;
	}//setTri()
	
	/**
	 * Retourne la valeur de l'attribut tri
	 * @return tri
	 */
	public Tri<T> getTri(){
		return this.tri;
	}//getTri()
	
}//Enclos
