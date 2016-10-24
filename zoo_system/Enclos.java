package zoo_system;

import java.util.ArrayList;

public class Enclos extends Model{
	protected String nom;
	protected int superficie; 
	protected int nbAnimaux;
	protected int nbAnimauxMax;
	protected String degreProprete;
	private ArrayList<Animal> listAnimaux;

	public static void main(String args[]){
		Enclos en = new Enclos("enclosLoup", 3, 2);
		Enclos enL2 = new Enclos("enclosLoup", 3, 2);
		Enclos en2 = new Enclos("enclosTigre", 3, 2);
		Animal loup1 = new LoupMale(30.0, 1.3, 15, null);
		Animal loup2 = new LoupMale(35.0, 1.9, 55, null);
		Animal loup3 = new LoupMale(70.0, 1.0, 2, null);
		Animal tigre = new TigreMale(85.0, 2.0, 100, null);
		Animal tigre2 = new TigreMale(85.0, 2.0, 150, null);
		System.out.println(en.ajouterAnimal(loup1));
		System.out.println(en.toString());
		System.out.println(en2.ajouterAnimal(tigre));
		System.out.println(en.toString());
		System.out.println(en.ajouterAnimal(loup2));
		System.out.println(en.toString());
		System.out.println(en.ajouterAnimal(loup3));
		System.out.println(en.toString());
		System.out.println(en2.ajouterAnimal(tigre));
		System.out.println(en.toString());
	}//main pour test
	
	public Enclos(String nom, int superficie, int nbAnimauxMax){
		this.nom = nom;
		this.superficie = superficie;
		this.nbAnimaux = 0;
		this.nbAnimauxMax = nbAnimauxMax;
		this.degreProprete = "propre";
		this.listAnimaux = new ArrayList<Animal>();
	}//Enclos()
	
	public String ajouterAnimal(Animal animal){
		//verifie si enclos plein
		if(!(this.isFull())){
			//si l'enclos est vide on peut mettre l'animal car l'enclos n'a pas de type d'animal prédéfinit
			//sinon on verifie l'espece du premiere animal, si elle est la memme que celui de "animal" on ajoute
            if(this.getListAnimaux().isEmpty() || this.getListAnimaux().get(0).getNom().equals(animal.getNom())){
            	this.getListAnimaux().add(animal);
                this.setNbAnimaux(this.getNbAnimaux() + 1);
                return animal.getNom() + "  a etait ajouté à l'enclos " + this.getNom();    
            }else{
                return "vous ne pouvez pas mettre un(e) " + animal.getNom() + " dans un enclos contenant des " 
                        + this.getListAnimaux().get(0).getNom();
            }
		}else{
			return "l'enclos " + this.getNom() + " est plein, vous ne pouvez pas rajouter plus d'animaux";
		}		
	}//ajouterAnimal()
	
	public String enleverAnimal(Animal animal){
		if(this.getListAnimaux().contains(animal)){
			this.getListAnimaux().remove(animal);	
			return "ce(tte) "+  animal.getNom() + " a ete retire de l'enclos " + this.getNom();		
		}else{
			return "ce(tte) "+  animal.getNom() + " n'existe pas";
		}
	}//enleverAnimal()
	
	public boolean isFull(){
		if(this.getListAnimaux().size() == this.getNbAnimauxMax()){
			return true;
		}else{
			return false;
		}		
	}//isFull()
	
	public String entretenir(){
		if(!(this.getListAnimaux().isEmpty())){
			return "Vous devez vider l'enclos pour pouvoir le nettoyer";
		}else{
			this.setDegreProprete("propre");
			return "Enclos " +  this.getNom() + " a ete nettoyer"; 
		}		
	}//entretenir()
	
	public String nourir(){
		for(Animal animal : this.getListAnimaux()){
			animal.manger();
		}	
		return "Les animaux de l'enclos " + this.getNom() + "ont etes nourri";
	}//nourir()
	
	public String toString() {
		return "Enclos [nom=" + nom + ", superficie=" + superficie + ", nbAnimaux=" + nbAnimaux + ", nbAnimauxMax="
				+ nbAnimauxMax + ", degreProprete=" + degreProprete + ", listAnimaux=" + listAnimaux + "]";
	}//toString()
	
	public String toString2() {
		return "Enclos [nom=" + nom + ", superficie=" + superficie + ", nbAnimaux=" + nbAnimaux + ", nbAnimauxMax="
				+ nbAnimauxMax + ", degreProprete=" + degreProprete + "]  Animaux : ";
	}//toString2()

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

	public ArrayList<Animal> getListAnimaux() {
		return listAnimaux;
	}//getListAnimaux()

	public void setListAnimaux(ArrayList<Animal> listAnimaux) {
		this.listAnimaux = listAnimaux;
	}//setListAnimaux()
	
}//Enclos
