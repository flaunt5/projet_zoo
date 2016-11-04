package zoo_system;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Employe {
	private  static Employe instance = null;
	private String nom;
	private char sexe;
	private int age;

	public static void main(String args[]){
		Cage en = new Cage("enclosLoup", 3, 3);
		VueCage Vc1 = new VueCage(en);
		Aquarium aq = new Aquarium("bassinRequin", 3, 2);
		VueAquarium Va1 = new VueAquarium(aq);
		Voliere vo = new Voliere("voliereAigle", 3, 2, 5.0);
		VueVoliere Vvo1 = new VueVoliere(vo);
		Voliere vo2 = new Voliere("voliereAigle2", 3, 1, 5.0);
		VueVoliere Vvo2 = new VueVoliere(vo2);
		
		Loup loup1 = new LoupMale(30.0, 1.3, 15, "loup1");
		Loup loup2 = new LoupMale(50.0, 1.5, 15, "loup2");
		Aigle aigle1 = new AigleMale(30.0, 1.3, 15, "aigle2");
		Aigle aigle2 = new AigleFemelle(40.0, 1.3, 18, "aigle2");
		Requin requin1 = new RequinMale(30.0, 1.3, 15, "req1");
		Requin requin2 = new RequinFemelle(90.0, 1.3, 25, "req2");
		
		en.ajouterAnimal(loup2);
		en.ajouterAnimal(loup1);
		aq.ajouterAnimal(requin1);
		aq.ajouterAnimal(requin2);
		vo.ajouterAnimal(aigle1);
		vo.ajouterAnimal(aigle2);
		en.setDegreProprete("mauvais");
		aq.setSalinite("mauvais");
		aq.setProfondeur(2.0);
		vo.setDegreProprete("mauvais");
		vo.setEtatToit("mauvais");
		Vc1.details();
		Va1.details();
		Vvo1.details();
		Vvo2.details();
		Employe emp = Employe.getInstance("test", 21, 'M');
		VueEmploye vemp = new VueEmploye(Employe.getInstance());
		
		vemp.nettoyerEnclos(en);
		vemp.nettoyerEnclos(aq);
		vemp.nettoyerEnclos(vo);
		
		vemp.examinerEnclos(vo);
		vemp.examinerEnclos(en);
		vemp.examinerEnclos(aq);
		
		vemp.transfererAnimal(aigle1, vo2);
		vemp.transfererAnimal(aigle2, vo2);
		
		vemp.examinerEnclos(vo);
		vemp.examinerEnclos(vo2);
	}//main pour test
	
	/**
	 * Construit un objet de type Employe
	 * @param nom
	 * @param age
	 * @param sexe
	 */
	private Employe(String nom, int age, char sexe){
		this.nom = nom;
		this.age = age;
		this.sexe = sexe;
	}//Employe()
	
	/**
	 * Nettoie un enclos si celui-ci est vide
	 * @param enclos
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
	 * @param animal
	 * @param nourriture
	 * @param ratio
	 * @return La valeur de retour de la fonction Enclos.nourir()
	 */
	public <T extends Animal> String nourirAnimaux(Enclos<T> enclos, T animal, Nourriture nourriture, double ratio){
		return enclos.nourir(animal, nourriture, ratio);
	}//nourirAnimaux()
	
	/**
	 * Recupere les données données de l'enclos ainsi que le nom(espece) des animaux
	 * @param enclos
	 * @return données de l'enclos + nom des animaux de l'enclos
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
		return donneesEnclos + listAnimaux + "\n";// retourne les infos de l'enclos + le nom des animaux qu'il possède
	}//examinerEnclos()
	
	/**
	 * Transfere un animale dans l'enclos de destination en paramètre
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
			 * et le supprimer de celui où il se trouve
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
			return trasnferNonValid + "impossible de transferer l'animal dans l'enclos où il se trouve déjà";				
		}
	}//transfererAnimal()
	
	/**
	 * Soigne l'animal placer en paramètre
	 * @param animal
	 * @return Message de confirmation de l'action
	 */
	public String soignerAnimal(Animal animal){
		animal.etreSoigner();
		return animal.getNom() + " à été soigné";
	}
	
	/**
	 * Recupere la clés et le prix de l'article selectionner par l'utilisateur
	 * @param boutique
	 * @param zoo
	 * @param saisieUtilisateur
	 * @return Message de confirmation de l'achat
	 */
	public String acheterArticle(Boutique boutique, Zoo zoo, int saisieUtilisateur){
		String retour = "";
		//recupere les clés de la Map
		Set<Map.Entry<String, Integer>> set = boutique.getStockAVendre().entrySet();
		//Pour parcourrir le Set qui contient les clés
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
		return "Choisissez quel tri vous voulez éffectués : \n"
						+ "1 - Tri par age\n2 - Tri par ordre alphabetique\n";
	}
	
	/**
	 * Ajoute l'element sleectionné par l'utilisateur dans le stock du Zoo
	 * Enlève la somme de l'article du budget du Zoo
	 * @param boutique
	 * @param zoo
	 * @param clesMap
	 * @param prix
	 * @return Message de confirmation de l'achat
	 */
	public String ajouterArticleDansStock(Boutique boutique, Zoo zoo, String clesMap, int prix){
		String retour = "Vous avez achetés ";
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
	 * Verifie si le zoo à le budget pour acheter un article d'un certain prix
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
	 * Retourne la valeur de l'atrtribut instance, sans avoir à mettre des paramètres
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
