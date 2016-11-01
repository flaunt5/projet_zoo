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
				enclos = getEnclos(vueZoo.getModel());
				vueEmp.nourirAnimaux(enclos);
				break;
			case 2 : 
				vueZoo.afficherListEnclos(false);
				enclos = getEnclos(vueZoo.getModel());
				vueZoo.afficherListAnimauxEnclos(enclos, false);
				animal = getAnimal(enclos);
				vueZoo.afficherListEnclos(true);
				enclos = getEnclos(vueZoo.getModel());
				vueEmp.transfererAnimal(animal, enclos);
				break;
			case 3 :
				vueZoo.afficherListEnclos(false);
				enclos = getEnclos(vueZoo.getModel());
				vueEmp.nettoyerEnclos(enclos);;
				break;
			case 4 : 
				vueZoo.afficherListEnclos(false);
				enclos = getEnclos(vueZoo.getModel());
				vueZoo.afficherListAnimauxEnclos(enclos, true);
				animal = getAnimal(enclos);
				vueEmp.soignerAnimal(animal);
				break;
			case 5 :
				vueZoo.afficherListEnclos(false);
				enclos = getEnclos(vueZoo.getModel());
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
	
	private Boolean convertIntEnBool(int futurBool){
		if(futurBool % 2 == 0){
			return false;
		}else{
			return true;
		}
	}//convertIntEnBool
	
	public Enclos<? extends Animal> getEnclos(Zoo zoo){
		int numEnclos = getSaisieUtilisateur(0, zoo.getListEnclos().size()) - 1;
		Enclos<? extends Animal> enclos = zoo.getListEnclos().get(numEnclos);
		return enclos;
	}
	
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
