package zoo_system;

public class VueEmploye extends Vue<Employe>{
	
	public VueEmploye(Employe object){
		this.model= object;
	}//VueEmploye()
	
	public void transfererAnimal(Animal animal, Enclos enclosDesti){
		System.out.println(this.getModel().transfererAnimal(animal, enclosDesti));
	}//transfererAnimal()
	
	public void examinerEnclos(Enclos<? extends Animal> enclos){
		System.out.println(this.getModel().examinerEnclos(enclos));
	}//examinerEnclos()
	
	public <T extends Animal> void nourirAnimaux(Enclos enclos, Animal animal, Nourriture nourriture, double ratio){
		System.out.println(this.getModel().nourirAnimaux(enclos, animal, nourriture, ratio));
	}//nourirAnimaux()
	
	public void nettoyerEnclos(Enclos<? extends Animal> enclos){
		System.out.println(this.getModel().nettoyerEnclos(enclos));
	}//nettoyerEnclos()
	
	public void soignerAnimal(Animal animal){
		System.out.println(this.getModel().soignerAnimal(animal));		
	}//soignerAnimal()
	
	public void acheterArticle(Boutique boutique, Zoo zoo, int saisieUtilisateur){
		System.out.println(this.getModel().acheterArticle(boutique, zoo, saisieUtilisateur));	
	}//acheterArticle()

	public void afficherListTri() {
		System.out.println(this.getModel().getListTri());		
	}//afficherListTri()
	
}//VueEmploye
