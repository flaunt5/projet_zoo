package zoo_system;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;

public class Zoo {
	private Employe employe;
	private String nom;
	private int nbEnclos;
	private static Zoo instance = null;
	private ArrayList<Enclos<? extends Animal>> listEnclos;
	private ArrayList<StockNourriture<? extends Nourriture>> stockNourriture;
	private int budget;
	
	/**
	 * Construit un objet de type Zoo
	 * @param nomZoo 
	 * 				Le nom du Zoo
	 * @param nbEnclos
	 * 				le nombre d'enclos
	 * @param nomEmploye
	 * 				Le nom de l'employe
	 * @param ageEmploye
	 * 				L'age de l'employe
	 * @param sexeEmploye
	 * 				Le sexe de l'employe
	 * @param qtBoeuf
	 * 				La quantité de viande de boeuf present de base dans le stock
	 * @param qtPoisson
	 * 				La quantité de poisson present de base dans le stock
	 * @param qtNourriturePoisson
	 * 				La quantité de nourriture pour poisson present de base dans le stock
	 */
	private Zoo (String nomZoo, int nbEnclos, String nomEmploye, int ageEmploye, char sexeEmploye, 
					int qtBoeuf, int qtPoisson, int qtNourriturePoisson){
		
		this.nom = nomZoo;
		this.nbEnclos = nbEnclos;
		this.listEnclos = new ArrayList<Enclos<? extends Animal>>();
		this.employe = Employe.getInstance(nomEmploye, ageEmploye, sexeEmploye);
		this.setBudget(1000);
		this.stockNourriture = new ArrayList<StockNourriture<? extends Nourriture>>();
		this.stockNourriture.add(new StockBoeuf("stock viande de boeuf"));
		this.stockNourriture.add(new StockPoisson("stock de poisson"));
		this.stockNourriture.add(new StockNourriturePoisson("stock de nourriture pour poisson"));
		int[] tab = {qtBoeuf, qtPoisson, qtNourriturePoisson};
		Nourriture nourriture =  null;
		for(int i = 0; i < tab.length; ++i){
			for(int y = 0; y < tab[i]; ++y){
				if(i == 0){
					nourriture = new Boeuf();
				}else if(i == 1){
					nourriture = new Poisson();
				}else if(i == 2){
					nourriture = new NourriturePoisson();
				}
				this.stockNourriture.get(i).ajouterNourriture(nourriture);;
			}
		}
	}//Zoo()

	/**
	 * Ajoute un enclos dans le zoo
	 * @param enclos
	 * 				Enclos qui va etre ajouter
	 * @return  Message de confirmation d'ajout
	 */
	public <T extends Animal> String ajouterEnclos(Enclos<T> enclos){
		this.getListEnclos().add(enclos);
		this.setNbEnclos(this.getNbEnclos() + 1);
		return enclos.getClass().getSimpleName() + " " + enclos.getNom() + " à été ajouté.";
	}
	
	/**
	 * Recupere la nombre d'animaux present dans le zoo
	 * @return Retourne le nombre d'animaux
	 */
	public String getNbAnimaux(){
		int compteurAnimaux = 0;
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			//pour chaque enclos on recupere la taille de sa liste d'animaux
			compteurAnimaux += enclos.getListAnimaux().size();
		}
		return "Il y a " + String.valueOf(compteurAnimaux) + " animaux dans le zoo";
	}//afficheNbAnimaux()
	
	/**
	 * Recupere les informations ou le pseudo,nom et sexe de tous les animaux du zoo
	 * @param details
	 * 				Va permettre de savoir si on recupere tout les details des animaux ou seulement leurs pseudo, nom et sexe
	 * @return  Liste des animaux
	 */
	public String getAnimaux(Boolean details){
		String listAnimaux = "";
		int count = 1;
		//pour chaque enclos on commence par recuperer le nom de ces derniers
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			if(details){
				listAnimaux += enclos.toString();
			}else{
				listAnimaux += enclos.getNom()+ " : ";
				//puis pour chaque animal dans l'enclos on recupere le nom de ces derniers
				for(Animal animal : enclos.getListAnimaux()){
					if(count == enclos.getListAnimaux().size()){//si on est au denier element on ne rajoute pas de ","
						listAnimaux += animal.getPseudo() + "(" + animal.getNom() + ", " + animal.getSexe() + ") ";
					}else{
						listAnimaux += animal.getPseudo() + "(" + animal.getNom() + ", " + animal.getSexe() + ") ";		
					}
					++count;
				}
				listAnimaux += "\n";
				count = 1;
			}			
		}		
		return listAnimaux;
	}//afficheAnimaux()

	/**
	 * Modifie aléatoirement les différents valeur des attribut des enclos
	 * @return Liste des modifications sur les enclos
	 */
	public String modifierEtatEnclos(){
		String[] etatFutur = {"correct", "mauvais"};
		String retour = "";
		int randomEtat;
		double randomEnclos, ranndomProfondeur;
		
		//chaque enclos à 50% de chance de voir son etat de propreter modifier		
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			if(!(enclos.getListAnimaux().isEmpty())){
				randomEnclos = Math.random();
				
				/*pour chaque enclos ayant eu le precedent test reussi, on generer un nombre aléatoire, 
				 * qui va correspondre à un etat de proprete qui va lui etre atrubuer*/
				if(randomEnclos > 0.75){
					if(enclos.getClass().getSimpleName().equals("Voliere")){
						
						//changement etat du toit
						randomEtat = (int)Math.round(Math.random());
						((Voliere)enclos).setEtatToit(etatFutur[randomEtat]);
						retour += "La voliere \"" + enclos.getNom() + "\", état du toit : " + etatFutur[randomEtat] + "\n";
						
						//changement degré propreté
						randomEtat = (int)Math.round(Math.random());
						enclos.setDegreProprete(etatFutur[randomEtat]);
						retour += "La voliere \"" + enclos.getNom() + "\", degré propreté : " + etatFutur[randomEtat] + "\n";
						
					}else if(enclos.getClass().getSimpleName().equals("Aquarium")){
						
						//changement salinité
						randomEtat = (int)Math.round(Math.random());
						((Aquarium)enclos).setSalinite(etatFutur[randomEtat]);
						retour += "L'Aquarium \"" + enclos.getNom() + "\", salinité : " + etatFutur[randomEtat] + "\n";
						
						//changement profondeur
						ranndomProfondeur = Math.round(Math.random()* (((Aquarium) enclos).getProfondeur() - 0) * 10) /10;
						((Aquarium) enclos).setProfondeur(ranndomProfondeur);
						retour += "L'Aquarium \"" + enclos.getNom() + "\", profondeur : " + ranndomProfondeur + "\n";
						
					}else{
						randomEtat = (int)Math.round(Math.random());
						enclos.setDegreProprete(etatFutur[randomEtat]);
						retour += "La Cage \"" + enclos.getNom() + "\", degré propreté : " + etatFutur[randomEtat] + "\n";
					}
				}	
			}
		}	
		if(retour.equals("")){//Si aucun animal n'a été modifier
			retour = "Aucun changement du coté des enclos";
		}
		return retour;
	}//modifierEtatEnclos()
	
	/**
	 * Modifie aléatoirement un des état(sommeil, faim, santé) des animaux du zoo
	 * @return Liste des modifications  sur les animaux
	 */
	public String modifierEtatAnimaux(){
		String[] etatFutur = {"epuise", "malade", "affame"};
		String retour = "";
		int randomEtat;
		double randomAnimal, randomFaim;		
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			for(Animal animal : enclos.getListAnimaux()){
				//chaque animal à 50% de chance de voir l'un de ses etats etre modifier	
				randomAnimal = Math.random();	
				
				if(randomAnimal > 0.75){
					/*pour chaque animal ayant eu le precedent test reussi, on generer un nombre aléatoire, 
					 * qui va correspondre à un etat qui sera modifier*/
					randomEtat = (int)Math.round(Math.random()*(2-0));
					switch(randomEtat){
						case 0:
							animal.setIndicSommeil(etatFutur[randomEtat]);
							animal.setEndormi(true);
							retour += animal.getPseudo() + "(" + animal.getNom() + ", " + animal.getSexe() + ") de "+ 
									enclos.getClass().getSimpleName() + " : " +	enclos.getNom() + ", est épuisé il s'est endormi \n";
							break;
						case 1:
							animal.setIndicSante(etatFutur[randomEtat]);
							retour += animal.getPseudo() + "(" + animal.getNom() + ", " + animal.getSexe() + ") de "+ 
									enclos.getClass().getSimpleName() + " : " + enclos.getNom() + ", est tombé malade \n";
							break;
						case 2:
							randomFaim = Math.round(Math.random()* (animal.getNiveauFaim()) - 0);
							animal.setNiveauFaim((int) randomFaim);
							animal.redefiniIndicFaim();
							retour += animal.getPseudo() + "(" + animal.getNom() + ", " + animal.getSexe() + ") de "+ 
									enclos.getClass().getSimpleName() + " : " +	enclos.getNom() + ", est " + animal.getIndicFaim() 
									+ "\n";
							break;
					}//switch
				}//if	
			}//for animal
		}//	for enclos
		if(retour.equals("")){//Si aucun animal n'a été modifier
			retour = "Aucun changement du coté des animaux";
		}
		return retour;
	}//modifierEtatAnimaux()
	
	/**
	 * Retourne la liste de enclos du zoo
	 * @param pourTransfer
	 * 					Va permetre de savoir si on rajoute une String dans la chaine qui va etre retourner par la fonction
	 * @return Menu de selection des enclos
	 */
	public String listerEnclos(Boolean pourTransfer){
		String retour = "Choisissez un enclos ";
		if(pourTransfer){
			retour += "de destination pour l'animal";
		}
		retour += " :\n";
		int count = 1;
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			retour += count + " - " + enclos.getNom() + "\n";
			++count;
		}
		return retour;
	}//listerEnclos()
	
	/**
	 * Retourne la liste des animaux d'un enclos, ainsi que les potentiel niveau de faim/santé, 
	 * et sa consomation en nourriture
	 * @param enclos
	 * 				Enclos dont les enimaux vont etre lister
	 * @param pourSoin
	 * 				Boolean pour savoir si cette methode est appelé pour soigner un animal
	 * @param pourNourir
	 * 				Boolean pour savoir si cette methode est appelé pour nourrir un animal
	 * @return Menu de selection des animaux
	 */
	public <T extends Animal> String listerAnimauxEnclos(Enclos<T> enclos, boolean pourSoin, boolean pourNourir){
		String retour = "Choisissez un animal :\n";
		int count = 1;
		if(pourNourir){
			retour += "0 - Arréter de nourir les animaux\n";
		}
		for(T animal : enclos.getListAnimaux()){
			retour += count + " - " + animal.getPseudo() + "(" + animal.getNom() + ", " + animal.getSexe() + ") ";
			if(pourSoin){
				retour += "Sante : " + animal.getIndicSante() + "\n";
			}else if(pourNourir){
				retour += "Niveau de faim : " + animal.getNiveauFaim() + "/100 ; Consomme : " + animal.getConsoNourriture() + " unités\n";
			}else{
				retour += "\n";
			}
			++count;
		}
		return retour;
	}//listerAnimauxEnclos()
	
	/**
	 * Accouple un animal mâle à un animal femelle de la même espece et du même enclos
	 * @return Liste des accouplement effectué
	 */
	public <T extends Male<U>,U extends Animal> String reproductionAnimal(){
		String retour = "";		
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			for(Animal animal : enclos.getListAnimaux()){
				
				//si l'animal est un male
				if(verfierMale(animal)){
					Animal animalFemelle = enclos.getFemelle();	
					//si on a reussi a recuperer un femelle dans le même enclos
					if(animalFemelle != null){
						double chanceAccouplement = Math.random();
						
						//1 chance /2 d'ajouter les animaux à la liste de ceux qui vont se reproduire
						if(chanceAccouplement > 0.5){
							retour += ((T) animal).saccoupler((U) animalFemelle);							
						}
					}
				}
			}
		}
		return retour;
	}//reproductionAnimal
	
	/**
	 * Fait accoucher les femelle prètent à le faire, sinon augmente la valeur des attribut lié à l'accouchement
	 * @return Liste des femelle qui auront accouchés, ainsi que de leur bébés
	 */
	public <T extends MammifereFemelle, U extends AutreFemelle> String verifierFemelleEnceinte(){
		ArrayList<T> listMammifereFemelle = new ArrayList<T>();
		ArrayList<U> listAutreFemelle = new ArrayList<U>();
		String retour = "";
		//recuperation des femelles pouvant accoucher/pondre
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			for(Animal animal : enclos.getListAnimaux()){
				if(animal instanceof MammifereFemelle){
					listMammifereFemelle.add((T) animal);
				}else if(animal instanceof AutreFemelle){
					listAutreFemelle.add((U) animal);
				}
			}
		}		
		/*
		 * pour chaque femelle, si la periode de 
		 * gestation/incubation est terminer, elle accouche/pond
		 * Sinon on ajoute 1 à tempEnceinte
		 */
		for(MammifereFemelle animal : listMammifereFemelle){
			if(animal.isEnceinte()){
				if(animal.getTempEnceinte() == animal.getPeriodeEnfantement()){
					retour += animal.mettreBas();
				}else{
					animal.setTempEnceinte(animal.getTempEnceinte() + 1);
				}
			}

		}
		for(AutreFemelle animal : listAutreFemelle){
			if(animal.isEnceinte()){
				if(animal.getTempEnceinte() == animal.getPeriodeEnfantement()){
					retour += animal.pondre();
				}else{
					animal.setTempEnceinte(animal.getTempEnceinte() + 1);
				}
			}
		}
		return retour;		
	}//verifierFemelleEnceinte()
	
	/**
	 * Vérifie si un animal mâle peut se reproduire
	 * @param animal
	 * 				Animal qu'on va vérifier
	 * @return Booleen montrant la reussite ou l'echec du test
	 */
	public boolean verfierMale(Animal animal){
		if(animal.getSexe() == 'M' && animal.getAge() >= animal.getMaturiteSexuelle()
				&& !(animal.isEndormi())){
			return true;
		}else{
			return false;
		}
	}//verfierMale()
	
	/**
	 * Modifie aléatoirement l'état d'un animal endormie, afin qu'il se reveille
	 * @return Liste des animaux qui se seront reveillés
	 */
	public String reveillerAnimaux(){
		String retour = "";
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			for(Animal animal : enclos.getListAnimaux()){
				//si l'animal est endormi
				if(animal.isEndormi()){
					double randomReveil = Math.random();
					// 1 chance sur 2 qu'il se reveille
					if(randomReveil > 0.5){
						animal.setEndormi(false);
						animal.setIndicSommeil("");
						retour += animal.emmetreSon() + "\n" + animal.getPseudo() + "(" + animal.getNom() + ", " + animal.getSexe() 
											+ ") s'est réveillé\n";						
					}
				}
			}
		}
		return retour;
	}
	
	/**
	 * Rajoute 1 ans à chaque animal
	 * @return Message de confirmation
	 */
	public String faireGrandirAnimaux(){
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			for(Animal animal : enclos.getListAnimaux()){
				animal.setAge(animal.getAge() + 1);
			}
		}
		return "Les animaux ont grandi";
	}//faireGrandirAnimaux()
	
	/**
	 * Tue un animal en fonction de l'ecart q'il a avec son especerance de vie
	 * Plus l'ecart est grand plus il aura de chance de mourir
	 * @return Liste des animaux mort, ou message comme quoi rien ne s'est passer
	 */
	public String tuerAnimaux(){
		String retour = "";
		ArrayList<Animal> tabMort = new ArrayList<Animal>();
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			for(Animal animal : enclos.getListAnimaux()){
				if(animal.getAge() >= animal.getEsperanceVie()){
					//l'écart va representé le % de chance qu'il meurt, il est de base à 0.1
					double chanceMort = ((animal.getAge() - animal.getEsperanceVie()) / 10) + 0.1;
					double chanceSurvie = Math.random();
					if(chanceMort > chanceSurvie){
						//recuperation des animaux
						tabMort.add(animal);
					}
				}
			}
		}
		/*
		 * on tue les animaux hors de la boucle car la liste des animaux 
		 * des enclos ne peuvent pas etre accessible en lecture et ecriture simultanement
		 */
		for(Animal animal : tabMort){
			retour += animal.mourir("De vieillesse");
		}
		if(retour.equals("")){
			retour = "Les animaux se porte bien, aucuns morts à déplaurer";
		}
		return retour;
	}//tuerAnimal()
	
	/**
	 * Retourne l'affchage de la liste des différent stock ainsi que son contenu
	 * @param choix
	 * 			Boolean qui va permettre de savoir si la fonction est appelé pour permettre à l'utilisateur de choisir
	 * 			un equiepement, ou si la fonction est appelé pour afficher la liste des équipement
	 * @return Liste du contenu du stock
	 */
	public String getContenuStock(boolean choix){
		String retour = "";
		int count = 1;
		if(choix){
			retour = "Choisissez quel equiepement vous voulez utilisé\n";
		}
		retour += "Stock d'équipement : \n";
		for(StockNourriture<? extends Nourriture> stock : this.getStockNourriture()){
			retour += "\t";
			if(choix){
				retour += count + " - ";
				++count;
			}
			retour += stock.getNom() + " : " + stock.getNombreElementsDansStock() + "\n";
		}
		return retour;
	}
	
	/**
	 * Retourne l'affichage du budget du zoo
	 * @return Affichage du budget du zoo
	 */
	public String getBudgetDuZoo(){
		return "Budget du zoo : " + this.getBudget() + " euros\n";
	}
	
	/**
	 * Creer un instance de Zoo si aucune autre n'existe, sinon retourne l'instance de Zoo
	 * @param nomZoo 
	 * 				Le nom du Zoo
	 * @param nbEnclos
	 * 				Le nombre d'enclos
	 * @param nomEmploye
	 * 				Le nom de l'employe
	 * @param ageEmploye
	 * 				L'age de l'employe
	 * @param sexeEmploye
	 * 				Le sexe de l'employe
	 * @param qtBoeuf
	 * 				La quantité de viande de boeuf present de base dans le stock
	 * @param qtPoisson
	 * 				La quantité de poisson present de base dans le stock
	 * @param qtNourriturePoisson
	 * 				La quantité de nourriture pour poisson present de base dans le stock
	 * @return Instance de type Zoo qui sera le seul bojet du type Zoo de l'application
	 */
	public static Zoo getInstance(String nomZoo, int nbEnclos, String nomEmploye, int ageEmploye, char sexeEmploye,
					int qtBoeuf, int qtPoisson, int qtNourriturePoisson){
		if(instance == null){
			instance = new Zoo(nomZoo, nbEnclos, nomEmploye, ageEmploye, sexeEmploye, qtBoeuf, qtPoisson, qtNourriturePoisson);
		}
		return instance;
	}//getInstance()

	/**
	 * Retourne la valeur de l'atrtribut employe
	 * @return Valeur de l'atrtribut employe
	 */
	public Employe getEmploye() {
		return employe;
	}//getEmploye()

	/**
	 * Modifie la valeur de l'attribut employe
	 * @param employe
	 * 				Nouvel employe
	 */
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}//setEmploye()

	/**
	 * Retourne la valeur de l'atrtribut nom
	 * @return Valeur de l'atrtribut nom
	 */
	public String getNom() {
		return nom;
	}//getNom()

	/**
	 * Modifie la valeur de l'attribut nom
	 * @param nom
	 * 			Nouveau nom du zoo
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}//setNom()

	/**
	 * Retourne la valeur de l'atrtribut nbEnclos
	 * @return  Valeur de l'atrtribut nbEnclos
	 */
	public int getNbEnclos() {
		return nbEnclos;
	}//getNbEnclos()

	/**
	 * Modifie la valeur de l'attribut nbEnclos
	 * @param nbEnclos
	 * 				Nouveau nombre d'enclos
	 */
	public void setNbEnclos(int nbEnclos) {
		this.nbEnclos = nbEnclos;
	}//setNbEnclos()

	/**
	 * Retourne la valeur de l'atrtribut listEnclos
	 * @return  Valeur de l'atrtribut listEnclos
	 */
	public ArrayList<Enclos<? extends Animal>> getListEnclos() {
		return listEnclos;
	}//getListEnclos()	
	
	/**
	 * Retourne la valeur de l'atrtribut stockNourriture
	 * @return  Valeur de l'atrtribut stockNourriture
	 */
	public ArrayList<StockNourriture<? extends Nourriture>> getStockNourriture() {
		return stockNourriture;
	}//getStockNourriture()
	
	/**
	 * Retourne la valeur de l'atrtribut budget
	 * @return  Valeur de l'atrtribut budget
	 */
	public int getBudget() {
		return budget;
	}//getBudget()
	
	/**
	 * Modifie la valeur de l'attribut budget
	 * @param budget
	 * 			Nouveau budget du parc
	 */
	public void setBudget(int budget) {
		this.budget = budget;
	}//setBudget()
	
}//Zoo
