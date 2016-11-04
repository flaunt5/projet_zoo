package zoo_system;

import java.util.Map;
import java.util.Set;

public class Employe {
	private  static Employe instance = null;
	private String nom;
	private char sexe;
	private int age;

	
	/**
	 * Construit un objet de type Employe
	 * @param nom
	 * 			Nom de l'employe
	 * @param age
	 * 			Age de l'employe
	 * @param sexe
	 * 			Sexe de l'employe
	 */
	private Employe(String nom, int age, char sexe){
		this.nom = nom;
		this.age = age;
		this.sexe = sexe;
	}//Employe()
	
	/**
	 * Nettoie un enclos si celui-ci est vide
	 * @param enclos
	 * 				Enclos qui va etre nettoyer
	 * @return Message de confirmation de l'action
	 */
	public <T extends Animal> String nettoyerEnclos(Enclos<T> enclos){//a evoluer pour le type aqua et voliere
		if(!(enclos.getListAnimaux().isEmpty())){
			return "Vous devez vider l'enclos pour pouvoir l'entretenir";
		}else{
			String retour = "";
			if(enclos.getClass().getSimpleName().equals("Voliere")){
				retour = ((Voliere) enclos).entretenirVoliere();
			}else if(enclos.getClass().getSimpleName().equals("Aquarium")){
				retour = ((Aquarium) enclos).entretenirBassin();
			}else{
				retour = enclos.entretenir();
			}
			return enclos.getClass().getSimpleName() + " " + retour; 
		}
	}//nettoyerEnclos()
	
	/**
	 * Nourri un animal d'un enclos avec de la nourriture
	 * @param enclos
	 * 				Enclos qui va etre nettoyer
	 * @param animal
	 * 				Enclos qui va etre nettoyer
	 * @param nourriture
	 * 				Enclos qui va etre nettoyer
	 * @param ratio
	 * 				Enclos qui va etre nettoyer
	 * @return La valeur de retour de la fonction Enclos.nourir()
	 */
	public <T extends Animal> String nourirAnimaux(Enclos<T> enclos, T animal, Nourriture nourriture, double ratio){
		return enclos.nourir(animal, nourriture, ratio);
	}//nourirAnimaux()
	
	/**
	 * Recupere les donn�es de l'enclos ainsi que le nom(espece) des animaux
	 * @param enclos
	 * @return donn�es de l'enclos + nom des animaux de l'enclos
	 */
	public <T extends Animal> String examinerEnclos(Enclos<T> enclos){
		String donneesEnclos = "";
		String listAnimaux = "";
		int count = 1; //compteur pour savoir quand on sera au dernier element
		//pour chaque animaux on va recuperer leurs nom et les concatener dans une String
		donneesEnclos = enclos.toString2();
		for(Animal animal : enclos.getListAnimaux()){
			if(count == enclos.getListAnimaux().size()){//si on est au denier element on ne rajoute pas de ","
				listAnimaux += animal.getPseudo() + "(" + animal.getNom() + ", " + animal.getSexe() 
				+ ")";
			}else{
				listAnimaux += animal.getPseudo() + "(" + animal.getNom() + ", " + animal.getSexe() 
				+ "), ";				
			}
			++count;
		}
		return donneesEnclos + listAnimaux + "\n";// retourne les infos de l'enclos + le nom des animaux qu'il poss�de
	}//examinerEnclos()
	
	/**
	 * Transfere un animale dans l'enclos de destination en param�tre
	 * @param animal
	 * @param enclosDesti
	 * @return Message de confirmation ou d'annulation de l'action
	 */
	public <T extends Animal> String transfererAnimal(T animal, Enclos<T> enclosDesti){
		String transferValid = "Le/la " + animal.getNom() + " a ete transferer dans l'enclos " + enclosDesti.getNom();
		String trasnferNonValid = "transfer annuler : ";
		//verifie qu'on ne transfer pas un animal dans son enclos de residence actuel
		if(!(animal.getEnclosResidence().equals(enclosDesti))){
			/*
			 * on verifie que l'on puisse ajouter l'animal dans le nouvel enclos
			 * et le supprimer de celui o� il se trouve
			 */			
			if(animal.getEnclosResidence().verifPourEnlever(animal)&& 
                       enclosDesti.verifPourAjout(animal)){
				animal.getEnclosResidence().enleverAnimal(animal);
	            enclosDesti.ajouterAnimal(animal);
	            return transferValid;
            }else{
	            return trasnferNonValid + "l'enclos de destination doit etre plein ou, vous essayez de mettre deux espece dans un meme enclos";                
	        }     
		}else{
			return trasnferNonValid + "impossible de transferer l'animal dans l'enclos o� il se trouve d�j�";				
		}
	}//transfererAnimal()
	
	/**
	 * Soigne l'animal placer en param�tre
	 * @param animal
	 * @return Message de confirmation de l'action
	 */
	public String soignerAnimal(Animal animal){
		animal.etreSoigner();
		return animal.getNom() + " � �t� soign�";
	}
	
	/**
	 * Recupere la cl�s et le prix de l'article selectionner par l'utilisateur
	 * @param boutique
	 * @param zoo
	 * @param saisieUtilisateur
	 * @return Message de confirmation de l'achat
	 */
	public String acheterArticle(Boutique boutique, Zoo zoo, int saisieUtilisateur){
		String retour = "";
		//recupere les cl�s de la Map
		Set<Map.Entry<String, Integer>> set = boutique.getStockAVendre().entrySet();
		//Pour parcourrir le Set qui contient les cl�s
		String clesArticle = "";
		String value;
		int count = 0;
		int prix = 0;
		for(Map.Entry<String, Integer> article : set){
			if(count == saisieUtilisateur){
				clesArticle = article.getKey();
				prix = article.getValue().intValue();
			}
			++count;
		}
		retour = this.ajouterArticleDansStock(boutique, zoo, clesArticle, prix);
		return retour;
	}
	
	/**
	 * Retourne la liste des tri disponible
	 * @return Message contenant la liste des tri
	 */
	public String getListTri() {
		return "Choisissez quel tri vous voulez �ffectu�s : \n"
						+ "1 - Tri par age\n2 - Tri par ordre alphabetique\n";
	}
	
	/**
	 * Ajoute l'element sleectionn� par l'utilisateur dans le stock du Zoo
	 * Enl�ve la somme de l'article du budget du Zoo
	 * @param boutique
	 * @param zoo
	 * @param clesMap
	 * @param prix
	 * @return Message de confirmation de l'achat
	 */
	public String ajouterArticleDansStock(Boutique boutique, Zoo zoo, String clesMap, int prix){
		String retour = "Vous avez achet�s ";
		String refus = "Vous n'avez pas assez d'argent pour acheter \"" + clesMap + "\"\nCette objet coute " 
						+ prix + " et il vous reste " + zoo.getBudget() + "\n";
		switch(clesMap){
			case "Viande de boeuf x1" :
				if(verifBudget(zoo, prix)){
					zoo.getStockNourriture().get(0).ajouterNourriture(new Boeuf());
					zoo.setBudget(zoo.getBudget() - prix);
					retour += "1 viande de boeuf";					
				}else{
					retour = refus;
				}
				break;
			case "Viande de boeuf x10" :
				if(verifBudget(zoo, prix)){
					for(int i = 0; i < 10; ++i){
						zoo.getStockNourriture().get(0).ajouterNourriture(new Boeuf());			
					}
					zoo.setBudget(zoo.getBudget() - prix);
					retour += "10 viandes de boeuf";
				}else{
					retour = refus;
				}					
				break;
			case "Poisson x1" :
				if(verifBudget(zoo, prix)){
					zoo.getStockNourriture().get(1).ajouterNourriture(new Poisson());
					zoo.setBudget(zoo.getBudget() - prix);
					retour += "1 poisson";
				}else{
					retour = refus;
				}				
				break;
			case "Poisson x10" :
				if(verifBudget(zoo, prix)){
					for(int i = 0; i < 10; ++i){
						zoo.getStockNourriture().get(1).ajouterNourriture(new Poisson());		
					}
					zoo.setBudget(zoo.getBudget() - prix);
					retour += "10 poisson";	
				}else{
					retour = refus;
				}						
				break;
			case "Nourriture pour poisson x1" :
				if(verifBudget(zoo, prix)){
					zoo.getStockNourriture().get(2).ajouterNourriture(new NourriturePoisson());
					zoo.setBudget(zoo.getBudget() - prix);
					retour += "1 nourriture pour poisson";
				}else{
					retour = refus;
				}						
				break;
			case "Nourriture pour poisson x10" :
				if(verifBudget(zoo, prix)){
					for(int i = 0; i < 10; ++i){
						zoo.getStockNourriture().get(2).ajouterNourriture(new NourriturePoisson());						
					}
					zoo.setBudget(zoo.getBudget() - prix);
					retour += "10 nourriture pour poisson";
				}else{
					retour = refus;
				}					
				break;
			default :
				break;
		}
		return retour;
	}
	
	/**
	 * Verifie si le zoo � le budget pour acheter un article d'un certain prix
	 * @param zoo
	 * @param prix
	 * @return true ou false
	 */
	private boolean verifBudget(Zoo zoo, int prix){
		if(zoo.getBudget() >= prix){
			return true;
		}else{
			return false;
		}
	}//verifBudget()
	
	/**
	 * Initialise l'objet instance s'il est null
	 * Et retourne l'objet instance
	 * @param nom
	 * @param age
	 * @param sexe
	 * @return instance
	 */
	public static Employe getInstance(String nom, int age, char sexe){
		if(instance == null){
			instance =  new Employe(nom, age, sexe);
		}
		return instance;
	}//getInstance()
	
	/**
	 * Retourne la valeur de l'atrtribut instance, sans avoir � mettre des param�tres
	 * @return instance
	 */
	public static Employe getInstance(){
		return instance;
	}
	
	/**
	 * Retourne la valeur de l'atrtribut nom
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
	 * Retourne la valeur de l'atrtribut sexe
	 * @return sexe
	 */
	public char getSexe() {
		return sexe;
	}//getSexe()

	/**
	 * Modifie la valeur de l'attribut sexe
	 * @param sexe
	 */
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}//setSexe()

	/**
	 * Retourne la valeur de l'atrtribut age
	 * @return age
	 */
	public int getAge() {
		return age;
	}//getAge()

	/**
	 * Modifie la valeur de l'attribut age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}//setAge()	


}//Employe
