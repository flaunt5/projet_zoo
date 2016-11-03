package zoo_system;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IHM extends Model{
	
	private int numTour;
	private int nbAction;
	private Scanner scanAction;
	
	public IHM(int nbAction){
		this.numTour = 1;
		this.nbAction = nbAction;
		this.scanAction = new Scanner(System.in);
	}//IHM()

	public String getMenuAction(){
		return "Tour n°"+ numTour + "\n"
				+ "Il vous reste " + nbAction + " action(s) sur ce tour\nQue voulez-vous faire(saisissez le numero de l'action) : \n"
				+ "1 - Nourir les animaux d'un enclos\n2 - Transférer un animal vers un autre enclos\n"
				+ "3 - Nettoyer un enclos\n4 - Soigner un animal\n5 - Afficher les caractériste d'un enclos\n"
				+ "6 - Afficher le nombre d'animaux dans le zoo\n7 - Afficher la liste des animaux du zoo\n";
	}//getMenuAction()
	
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
	
	public boolean verifSaisie(int saisie, int min, int max){
		if(saisie < min || saisie > max){
			return false;
		}else{
			return true;
		}
	}//verifSaisie()
	
	public void executeChoix(int saisie, VueZoo vueZoo, VueEmploye vueEmp){
		Enclos<? extends Animal> enclos;
		Animal animal;
		//Affiche liste des enclos et recupere l'enclos selectionné
		switch(saisie){
			case 1 :
				vueZoo.afficherListEnclos(false);
				enclos = this.getEnclos(vueZoo.getModel());
				//vueEmp.nourirAnimaux(enclos);
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
			default :
				break;
		}
	}//executeChoix()
	
	public void nourirPlusieurAnimaux(Enclos<? extends Animal> enclos, VueZoo vueZoo, VueEmploye vueEmp){
		int saisie = 1000;
		int saisieEquip;
		Animal animal;
		//tant que l'utilisateur ne selectionne pas l'action pour arreter de nourir
		while(saisie != 0){
			vueZoo.afficherListAnimauxEnclos(enclos, false, true);
			saisie = getSaisieUtilisateur(0, enclos.getListAnimaux().size());
			if(saisie != 0){
				animal = (Animal) enclos.getListAnimaux().get(saisie - 1);
				vueZoo.afficherContenuStock(true);
				saisieEquip = getSaisieUtilisateur(0, vueZoo.getModel().getStockNourriture().size());
				StockNourriture<? extends Nourriture> stockNourriture = vueZoo.getModel().getStockNourriture().get(saisieEquip);
				int consonourriture = animal.getConsoNourriture();
				//Boeuf nourriture = new Boeuf();
				//vueEmp.nourirAnimaux(enclos, animal, nourriture);				
			}
		}
	}//nourirPlusieurAnimaux()
	
	/**
	 * Convertie un int en boolean 
	 * @param futurBool
	 * @return true ou false
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
	 * @return enclos
	 */
	public Enclos<? extends Animal> getEnclos(Zoo zoo){
		int numEnclos = getSaisieUtilisateur(0, zoo.getListEnclos().size()) - 1;
		Enclos<? extends Animal> enclos = zoo.getListEnclos().get(numEnclos);
		return enclos;
	}
	
	/**
	 * Recupere la saisie d'un utilisateur, et renvois l'animal correspondant à cette saisie
	 * @param enclos
	 * @return Animal
	 */
	public Animal getAnimal(Enclos<? extends Animal> enclos){
		int numAnimal = getSaisieUtilisateur(0, enclos.getListAnimaux().size()) - 1;
		Animal animal = (Animal) enclos.getListAnimaux().get(numAnimal);
		return animal;		
	}
	
	public int getNumTour() {
		return numTour;
	}//getNumTour()

	public void setNumTour(int numTour) {
		this.numTour = numTour;
	}//setNumTour()

	public int getNbAction() {
		return nbAction;
	}//getNbAction()

	public void setNbAction(int nbAction) {
		this.nbAction = nbAction;
	}//setNbAction()
}//IHM
