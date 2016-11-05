package zoo_vues;

import zoo_animaux.Animal;
import zoo_divers.Boutique;
import zoo_divers.equipements.MaterielSoin;
import zoo_divers.equipements.Nourriture;
import zoo_models.Employe;
import zoo_models.Enclos;
import zoo_models.Zoo;

/**
 * VueEmploye est la classe qui va permettre de réaliser les différents affichage de la classe Employe
 * @author Alexandre
 *
 */
public class VueEmploye extends Vue<Employe>{
	/**
	 * Creer un objet de type VueEmploye
	 * @param objet
	 * 				objet de type Employe
	 */
	public VueEmploye(Employe objet){
		this.model= objet;
	}//VueEmploye()
	
	/**
	 * Transfere un animal dans un autre enclos
	 * @param animal
	 * 				Animal qui va etre transferer
	 * @param enclosDesti
	 * 				Enclos qui ou va etre transferer l'animal
	 */
	public void transfererAnimal(Animal animal, Enclos enclosDesti){
		System.out.println(this.getModel().transfererAnimal(animal, enclosDesti));
	}//transfererAnimal()
	
	/**
	 * Afficher les donnees de l'enclos ainsi que le pseudo,nom(espece)et sexe des animaux
	 * @param enclos
	 * 				Enclos qui va etre examiner
	 */
	public void examinerEnclos(Enclos<? extends Animal> enclos){
		System.out.println(this.getModel().examinerEnclos(enclos));
	}//examinerEnclos()
	
	/**
	 * Affiche le resultat de l'action "nourir un animal"
	 * @param enclos
	 * 				Enclos qui va etre nettoyer
	 * @param animal
	 * 				Enclos qui va etre nettoyer
	 * @param nourriture
	 * 				Enclos qui va etre nettoyer
	 * @param ratio
	 * 				Enclos qui va etre nettoyer
	 */
	public <T extends Animal> void nourirAnimaux(Enclos enclos, Animal animal, Nourriture nourriture, double ratio){
		System.out.println(this.getModel().nourirAnimaux(enclos, animal, nourriture, ratio));
	}//nourirAnimaux()
	
	/**
	 * Nettoyer un enclos et afficher le resultat
	 * @param enclos
	 * 				Enclos qui va etre nettoyer
	 */
	public void nettoyerEnclos(Enclos<? extends Animal> enclos){
		System.out.println(this.getModel().nettoyerEnclos(enclos));
	}//nettoyerEnclos()
	
	/**
	 * Soigner un animal et afficher le resultat
	 * @param animal
	 * 				Animal qui va etre soigner
	 * @param materielSoin
	 * 					Materiel de soin pour soigner l'animal
	 */
	public void soignerAnimal(Animal animal, MaterielSoin materielSoin){
		System.out.println(this.getModel().soignerAnimal(animal, materielSoin));		
	}//soignerAnimal()
	
	/**
	 * Acheter un article, et l'affiche
	 * @param boutique
	 * 				Boutique où on va acheter les articles
	 * @param zoo
	 * 				Zoo sur lequel on va modifier les stock
	 * @param saisieUtilisateur
	 * 				Saisie de l'utilisateur pour savoir quel article il achete
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
