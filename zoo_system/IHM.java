package zoo_system;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IHM extends Model{
	
	private int numTour;
	private int nbAction;
	private Scanner scanAction;
	
	/**
	 * construct un objet IHM
	 * @param nbAction
	 */
	public IHM(int nbAction){
		this.numTour = 1;
		this.nbAction = nbAction;
		this.scanAction = new Scanner(System.in);
	}//IHM()

	/**
	 * Retourne le menu qui liste des actions réalisables par l'utilisateur
	 * @return Menu d'action
	 */
	public String getMenuAction(){
		return "Tour n°"+ numTour + "\n"
				+ "Il vous reste " + nbAction + " action(s) sur ce tour\nQue voulez-vous faire(saisissez le numero de l'action) : \n"
				+ "1 - Nourir les animaux d'un enclos\n2 - Transférer un animal vers un autre enclos\n"
				+ "3 - Nettoyer un enclos\n4 - Soigner un animal\n5 - Afficher les caractériste d'un enclos\n"
				+ "6 - Afficher le nombre d'animaux dans le zoo\n7 - Afficher la liste des animaux du zoo\n"
				+ "8 - Trier un enclos\n";
	}//getMenuAction()
	
	/**
	 * Retourne le menu de demande pour l'accés à la boutique
	 * @return Menu pour l'accés boutique
	 */
	public String getMenuCourse(){
		return "Voulez-vous allez au magasin achater du matériel ?\n \t1 - Oui\n \t2 - Non";
	}//getMenuCourse()
	
	
	/**
	 * Recupère et verifie un saisie utilisateur
	 * Verification que le chiffre saisie est compris dans [main; max]
	 * @param min
	 * 			chiffre minimal autorisé à la saisie
	 * @param max
	 * 			chiffre maximal autorisé à la saisie
	 * @return saisie
	 */
	public int getSaisieUtilisateur(int min, int max){
		int saisie = 0;
		boolean valid = false;
		while(!valid){
			try{
				saisie = this.scanAction.nextInt();
				if(this.verifSaisie(saisie, min, max)){
					valid = true;
				}
			}catch(InputMismatchException e){
				System.out.println("Saisissez un nombre entier, entre "+ min + " et " + max);
				this.scanAction.next();
			}catch(NoSuchElementException e){
				System.out.println(e);
			}catch(IllegalStateException e){
				System.out.println(e);
			}
		}
		return saisie;
			
	}//getSaisieUtilisateur()
	
	/**
	 * Demande à l'utilisateur s'il veut acceder  à la boutique
	 * si oui, affiche la liste des article et appel la fonction d'achat
	 * @param vueBout
	 * 				La vue de la boutique
	 * @param vueEmp
	 * 				la vue de l'employe
	 * @param zoo
	 * 			La zoo de l'application
	 */
	public void allerFaireDesAchat(VueBoutique vueBout, VueEmploye vueEmp, VueZoo vueZoo){
		int saisie = getSaisieUtilisateur(1, 2);
		if(saisie == 1){
			/*
			 * si l'utilisateur choisi 0 (quiter boutique) on arrete lks achats
			 */
			while(saisie != 0){
				vueZoo.afficherBudgetDuZoo();
				vueBout.afficherListArticles();
				saisie = getSaisieUtilisateur(0, vueBout.getModel().getStockAVendre().size());
				if(saisie != 0){
					vueEmp.acheterArticle(vueBout.getModel(), vueZoo.getModel(), saisie - 1);
				}
			}

		}
	}
	
	/**
	 * Verifie que le paramètre "saisie" soit compris entre min et max
	 * @param saisie
	 * 			Saisie réalisé par l'utilisateur
	 * @param min
	 * 			chiffre minimal autorisé à la saisie
	 * @param max
	 * 			chiffre maximal autorisé à la saisie
	 * @return booleen montrant la reussite ou l'echec du test
	 */
	public boolean verifSaisie(int saisie, int min, int max){
		if(saisie < min || saisie > max){
			return false;
		}else{
			return true;
		}
	}//verifSaisie()
	
	/**
	 * Execute l'action de l'utilisateur, en fonction de se qu'il aura choisi comme action
	 * @param saisie
	 * 			Saisie réalisé par l'utilisateur
	 * @param vueZoo
	 * 			Vue du zoo de l'application
	 * @param vueEmp
	 * 			Vue de l'employe
	 */
	public void executeChoixActionZoo(int saisie, VueZoo vueZoo, VueEmploye vueEmp, ArrayList<VueEnclos> listVueEnclos){
		Enclos<? extends Animal> enclos;
		Animal animal;
		//Affiche liste des enclos et recupere l'enclos selectionné
		switch(saisie){
			case 1 :
				vueZoo.afficherListEnclos(false);
				enclos = this.getEnclos(vueZoo.getModel());
				this.nourirPlusieurAnimaux(enclos, vueZoo, vueEmp);
				break;
			case 2 : 
				vueZoo.afficherListEnclos(false);
				enclos = this.getEnclos(vueZoo.getModel());
				vueZoo.afficherListAnimauxEnclos(enclos, false, false);
				animal = getAnimal(enclos);
				vueZoo.afficherListEnclos(true);
				enclos = this.getEnclos(vueZoo.getModel());
				vueEmp.transfererAnimal(animal, enclos);
				break;
			case 3 :
				vueZoo.afficherListEnclos(false);
				enclos = this.getEnclos(vueZoo.getModel());
				vueEmp.nettoyerEnclos(enclos);;
				break;
			case 4 : 
				vueZoo.afficherListEnclos(false);
				enclos = this.getEnclos(vueZoo.getModel());
				vueZoo.afficherListAnimauxEnclos(enclos, true, false);
				animal = getAnimal(enclos);
				vueEmp.soignerAnimal(animal);
				break;
			case 5 :
				vueZoo.afficherListEnclos(false);
				enclos = this.getEnclos(vueZoo.getModel());
				vueEmp.examinerEnclos(enclos);
				break;
			case 6 :
				vueZoo.afficheNbAnimaux();
				break;
			case 7 :
				vueZoo.demandeDetail();
				Boolean details = convertIntEnBool(getSaisieUtilisateur(1,2));
				vueZoo.afficheAnimaux(details);
				break;
			case 8 :
				vueZoo.afficherListEnclos(false);
				enclos = this.getEnclos(vueZoo.getModel());
				vueEmp.afficherListTri();
				Tri tri = this.getTri(enclos);
				enclos.setTri(tri);
				VueEnclos vue = this.getVueEnclos(listVueEnclos, enclos);
				vue.effectuerTri();
				break;
			default :
				break;
		}
	}//executeChoix()

	/**
	 * Nourri un animal avec l'equipement : nourriture ;
	 * Permet de nourir autant d'animaux qu'on le souhaite, dans
	 * @param enclos
	 * 			Enclos des animaux à nourir
	 * @param vueZoo
	 * 			Vue du zoo de l'application
	 * @param vueEmp
	 * 			Vue de l'employe
	 */
	public void nourirPlusieurAnimaux(Enclos<? extends Animal> enclos, VueZoo vueZoo, VueEmploye vueEmp){
		int saisie = 1000;
		int saisieEquip;
		double ratio = 1.0;
		Animal animal;
		//tant que l'utilisateur ne selectionne pas l'action pour arreter de nourir
		while(saisie != 0){
			vueZoo.afficherListAnimauxEnclos(enclos, false, true);
			saisie = getSaisieUtilisateur(0, enclos.getListAnimaux().size());
			//si l'utilisateur veux donner à manger  à un animal
			if(saisie != 0){
				animal = (Animal) enclos.getListAnimaux().get(saisie - 1);
				vueZoo.afficherContenuStock(true);
				saisieEquip = getSaisieUtilisateur(0, vueZoo.getModel().getStockNourriture().size());
				StockNourriture<? extends Nourriture> stockNourriture = vueZoo.getModel().getStockNourriture().get(saisieEquip - 1);
				//si le stock selectionner n'est pas vide
				if((!stockNourriture.getStock().isEmpty())){
					int consoNourriture = animal.getConsoNourriture();
					int nbNourritureStocker = stockNourriture.getNombreElementsDansStock();
					//va permetre de savoir combien de nourriture on retire du stock
					int nbIteration = consoNourriture;
					/*
					 * l'utilisateur n'a pas assez de nourriture, on va modifié 
					 * le gain en niveau de faim en fonction de la quantité dont il dispose
					 */
					if(nbNourritureStocker < consoNourriture){
						double dNbNourritureStocker = nbNourritureStocker;
						double dConsoNourriture = consoNourriture;
						ratio = dNbNourritureStocker / dConsoNourriture;
						nbIteration = nbNourritureStocker;
						
					}
					Nourriture nourriture = stockNourriture.getStock().get(0);
					vueEmp.nourirAnimaux(enclos, animal, nourriture, ratio);
					//suppression de la nourriture
					for(int i = 0 ; i < nbIteration; ++i){
						stockNourriture.getStock().remove(0);
						System.out.println(stockNourriture.getStock().size());
					}
				}								
			}
		}
	}//nourirPlusieurAnimaux()
	/**
	 * Recupere la vue de l'enclos assosié à parametre enclos
	 * @param listVueEnclos
	 * 			liste contenu toutes les vues de tout les enclos de l'application
	 * @param enclos
	 * 			Enclos lié à la vue rechercher
	 * @return
	 */
	public VueEnclos getVueEnclos(ArrayList<VueEnclos> listVueEnclos, Enclos<? extends Animal> enclos){
		VueEnclos vueRechercher = null;
		for(VueEnclos vue : listVueEnclos){
			if(vue.getModel().equals(enclos)){
				vueRechercher = vue;
			}
		}
		return vueRechercher;
	}//getVueEnclos()
	
	/**
	 * Convertie un int en boolean 
	 * @param futurBool
	 * 				nombre qui va etre convertie en booleen
	 * @return booleen resultant de la convertion
	 */
	private Boolean convertIntEnBool(int futurBool){
		if(futurBool % 2 == 0){
			return false;
		}else{
			return true;
		}
	}//convertIntEnBool
	
	/**
	 * Recupere la saisie d'un utilisateur, et renvois l'enclos correspondant à cette saisie
	 * @param zoo
	 * 			zoo de l'application
	 * @return enclos que l'utilisateur a choisi
	 */
	public Enclos<? extends Animal> getEnclos(Zoo zoo){
		int numEnclos = getSaisieUtilisateur(1, zoo.getListEnclos().size()) - 1;
		Enclos<? extends Animal> enclos = zoo.getListEnclos().get(numEnclos);
		return enclos;
	}
	
	/**
	 * Recupere la saisie d'un utilisateur, et renvois l'animal correspondant à cette saisie
	 * @param enclos
	 * 			Enclos de lequel se trouve l'animal qu'on cherche
	 * @return animal que l'utilisateur a choisi
	 */
	public Animal getAnimal(Enclos<? extends Animal> enclos){
		int numAnimal = getSaisieUtilisateur(1, enclos.getListAnimaux().size()) - 1;
		Animal animal = (Animal) enclos.getListAnimaux().get(numAnimal);
		return animal;		
	}
	
	/**
	 * Recupere le tri choisi par l'utilisateur
	 * @param enclos
	 * 			Enclos sur lequel le tri sera effectuer
	 * @return tri choisi par l'utilisateur
	 */
	public Tri<? extends Animal> getTri(Enclos<? extends Animal> enclos){
		int numTri =  getSaisieUtilisateur(1, 2);
		Tri<? extends Animal> tri = enclos.getTypeTri(numTri);
		return tri;
	}
	
	/**
	 * Retourne le valeur de l'attribut numTour
	 * @return valeur de l'attribut numTour
	 */
	public int getNumTour() {
		return numTour;
	}//getNumTour()

	/**
	 * Modifit le valeur de l'attribut numTour
	 * @param numTour
	 * 			Futur numero de tour
	 */
	public void setNumTour(int numTour) {
		this.numTour = numTour;
	}//setNumTour()

	/**
	 * Retourne le valeur de l'attribut nbAction
	 * @return valeur de l'attribut nbAction
	 */
	public int getNbAction() {
		return nbAction;
	}//getNbAction()

	/**
	 * Modifit le valeur de l'attribut nbAction
	 * @param nbAction
	 * 				Futur nombre d'action
	 */
	public void setNbAction(int nbAction) {
		this.nbAction = nbAction;
	}//setNbAction()
}//IHM
