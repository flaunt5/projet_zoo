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
		
	public static void main(String args[]){
		Cage cageLoup = new Cage("Cage des loups", 35, 5);
		Cage cageLoup2 = new Cage("Cage des loups2", 35, 5);
		Aquarium bassinBaleine = new Aquarium("Bassin des baleines", 100, 3);
		LoupMale loupMale1 = new LoupMale(60, 83, 5,LoupMale.getPseudoAnimal());
		cageLoup.ajouterAnimal(loupMale1);
		cageLoup.ajouterAnimal(loupMale1);
		Zoo zoo = Zoo.getInstance("Zoo marseille", 8, "Jean-luc", 45, 'M');
		zoo.ajouterEnclos(bassinBaleine);
		zoo.ajouterEnclos(cageLoup);
		zoo.ajouterEnclos(cageLoup2);
		System.out.println(zoo.getEmploye().transfererAnimal((Animal)loupMale1, (Enclos)bassinBaleine));
		System.out.println(zoo.getEmploye().transfererAnimal((Animal)loupMale1, (Enclos)cageLoup2));
		System.out.println(cageLoup.toString());
		System.out.println(cageLoup2.toString());
		System.out.println(bassinBaleine.toString());
	}
	
	private Zoo (String nomZoo, int nbEnclos, String nomEmploye, int ageEmploye, char sexeEmploye){
		this.nom = nomZoo;
		this.nbEnclos = nbEnclos;
		this.listEnclos = new ArrayList<Enclos<? extends Animal>>();
		this.employe = Employe.getInstance(nomEmploye, ageEmploye, sexeEmploye);
	}//Zoo()
	
	/*
	 * Ajoute un enclos dans le zoo
	 */
	public <T extends Animal> String ajouterEnclos(Enclos<T> enclos){
		this.getListEnclos().add(enclos);
		this.setNbEnclos(this.getNbEnclos() + 1);
		return enclos.getClass().getSimpleName() + " " + enclos.getNom() + " à été ajouté.";
	}
	
	/*
	 * Recupere la nombre d'animaux present dans le zoo
	 */
	public String getNbAnimaux(){
		int compteurAnimaux = 0;
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			//pour chaque enclos on recupere la taille de sa liste d'animaux
			compteurAnimaux += enclos.getListAnimaux().size();
		}
		return "Il y a " + String.valueOf(compteurAnimaux) + " animaux dans le zoo";
	}//afficheNbAnimaux()
	
	/*
	 * Recupere les informations ou le pseudo,nom et sexe de tous les animaux du zoo
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

	/*
	 * Modifie aléatoirement les différents valeur des attribut des enclos
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
	
	/*
	 * Modifie aléatoirement un des état(sommeil, faim, santé) des animaux du zoo
	 */
	public String modifierEtatAnimaux(){
		String[] etatFutur = {"epuise", "malade", "affame"};
		String retour = "";
		int randomEtat;
		double randomAnimal;		
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
							animal.setIndicFaim(etatFutur[randomEtat]);
							retour += animal.getPseudo() + "(" + animal.getNom() + ", " + animal.getSexe() + ") de "+ 
									enclos.getClass().getSimpleName() + " : " +	enclos.getNom() + ", est affamé, il faut qu'il mange \n";
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
	
	/*
	 * Retourne la liste de enclos du zoo
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
	
	/*
	 * Retourne la liste des animaux d'un enclos
	 */
	public <T extends Animal> String listerAnimauxEnclos(Enclos<T> enclos, boolean pourSoin){
		String retour = "Choisissez un animal :\n";
		int count = 1;
		for(T animal : enclos.getListAnimaux()){
			retour += count + " - " + animal.getPseudo() + "(" + animal.getNom() + ", " + animal.getSexe() + ") ";
			if(pourSoin){
				retour += "Sante : " + animal.getIndicSante() + "\n";
			}else{
				retour += "\n";
			}
			++count;
		}
		return retour;
	}//listerAnimauxEnclos()
	
	/*
	 * Accouple un animal mâle à un animal femelle de la même espece et du même enclos
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
	
	/*
	 * Faut accoucher les femelle pretent à le faire, sinon augmente la valeur des attribut lié à l'accouchement
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
	
	/*
	 * Vérifie si un animal mâle peut se reproduire
	 */
	public boolean verfierMale(Animal animal){
		if(animal.getSexe() == 'M' && animal.getAge() >= animal.getMaturiteSexuelle()
				&& !(animal.isEndormi())){
			return true;
		}else{
			return false;
		}
	}//verfierMale()
	
	/*
	 * Modifie aléatoirement l'état d'un animal endormie, afin qu'il se reveille
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
						retour += animal.emmetreSon() + "\n" + animal.getNom() + " s'est réveillé\n";						
					}
				}
			}
		}
		return retour;
	}
	
	/*
	 * Rajoute 1 ans à chaque animal
	 */
	public String faireGrandirAnimaux(){
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			for(Animal animal : enclos.getListAnimaux()){
				animal.setAge(animal.getAge() + 1);
			}
		}
		return "Les animaux ont grandi";
	}//faireGrandirAnimaux()
	
	/*
	 * Tue un animal en fonction de l'ecart q'il a avec son especerance de vie
	 * Plus l'ecart est grand plus il aura de chance de mourir
	 */
	public String tuerAnimaux(){
		String retour = "";
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			for(Animal animal : enclos.getListAnimaux()){
				if(animal.getAge() >= animal.getEsperanceVie()){
					//l'écart va representé le % de chance qu'il meurt, il est de base à 0.1
					double chanceMort = ((animal.getAge() - animal.getEsperanceVie()) / 10) + 0.1;
					double chanceSurvie = Math.random();
					if(chanceMort > chanceSurvie){
						retour += animal.mourir("De vieillesse");
					}
				}
			}
		}
		if(retour.equals("")){
			retour = "Les animaux se porte bien, aucuns morts à déplaurer";
		}
		return retour;
	}//tuerAnimal()
	
	public static Zoo getInstance(String nomZoo, int nbEnclos, String nomEmploye, int ageEmploye, char sexeEmploye){
		if(instance == null){
			instance = new Zoo(nomZoo, nbEnclos, nomEmploye, ageEmploye, sexeEmploye);
		}
		return instance;
	}//getInstance()

	public Employe getEmploye() {
		return employe;
	}//getEmploye()

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}//setEmploye()

	public String getNom() {
		return nom;
	}//getNom()

	public void setNom(String nom) {
		this.nom = nom;
	}//setNom()

	public int getNbEnclos() {
		return nbEnclos;
	}//getNbEnclos()

	public void setNbEnclos(int nbEnclos) {
		this.nbEnclos = nbEnclos;
	}//setNbEnclos()

	public ArrayList<Enclos<? extends Animal>> getListEnclos() {
		return listEnclos;
	}//getListEnclos()
	
}//Zoo
