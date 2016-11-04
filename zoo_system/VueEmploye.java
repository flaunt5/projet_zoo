package zoo_system;

public class VueEmploye extends Vue<Employe>{
	/**
	 * Creer un objet de type VueEmploye
	 * @param object
	 */
	public VueEmploye(Employe object){
		this.model= object;
	}//VueEmploye()
	
	/**
	 * Transfere un animal d'un enclos à l'autre
	 * @param animal
	 * @param enclosDesti
	 */
	public void transfererAnimal(Animal animal, Enclos enclosDesti){
		System.out.println(this.getModel().transfererAnimal(animal, enclosDesti));
	}//transfererAnimal()
	
	/**
	 * Afficher les données de l'enclos ainsi que les types d'animaux
	 * @param enclos
	 */
	public void examinerEnclos(Enclos<? extends Animal> enclos){
		System.out.println(this.getModel().examinerEnclos(enclos));
	}//examinerEnclos()
	
	/**
	 * Nourir un annimal et afficher le resultat
	 * @param enclos
	 * @param animal
	 * @param nourriture
	 * @param ratio
	 */
	public <T extends Animal> void nourirAnimaux(Enclos enclos, Animal animal, Nourriture nourriture, double ratio){
		System.out.println(this.getModel().nourirAnimaux(enclos, animal, nourriture, ratio));
	}//nourirAnimaux()
	
	/**
	 * Nettoyer un enclos et afficher le resultat
	 * @param enclos
	 */
	public void nettoyerEnclos(Enclos<? extends Animal> enclos){
		System.out.println(this.getModel().nettoyerEnclos(enclos));
	}//nettoyerEnclos()
	
	/**
	 * Soigner un animal et afficher le resultat
	 * @param animal
	 */
	public void soignerAnimal(Animal animal){
		System.out.println(this.getModel().soignerAnimal(animal));		
	}//soignerAnimal()
	
	/**
	 * Acheter et afficher un article
	 * @param boutique
	 * @param zoo
	 * @param saisieUtilisateur
	 */
	public void acheterArticle(Boutique boutique, Zoo zoo, int saisieUtilisateur){
		System.out.println(this.getModel().acheterArticle(boutique, zoo, saisieUtilisateur));	
	}//acheterArticle()

	/**
	 * Afficher la liste des tri disponibles
	 */
	public void afficherListTri() {
		System.out.println(this.getModel().getListTri());		
	}//afficherListTri()
	
}//VueEmploye
