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
	
	public static void main(String args[]){/*
		Zoo zoo = Zoo.getInstance("zoo", 0, "test", 21, 'M');
		VueZoo Vz = new VueZoo(zoo);
		VueEmploye vemp = new VueEmploye(zoo.getEmploye());
		
		Cage en1 = new Cage("enclos loup", 2, 4);
		VueCage Vc1 = new VueCage(en1);
		Cage en2 = new Cage("enclos tigre", 5, 4);
		VueCage Vc2 = new VueCage(en2);
		Cage en3 = new Cage("enclos ours", 6, 4);
		VueCage Vc3 = new VueCage(en3);
		Aquarium aq = new Aquarium("Bassin requins", 6, 4);
		VueAquarium Va1 = new VueAquarium(aq);
		Voliere vo = new Voliere("voliere aigle", 6, 4, 20);
		VueVoliere Vvo1 = new VueVoliere(vo);
		
		Vz.ajouterEnclos(en1);
		Vz.ajouterEnclos(en2);
		Vz.ajouterEnclos(en3);
		Vz.ajouterEnclos(aq);
		Vz.ajouterEnclos(vo);
		
		LoupMale loup1 = new LoupMale(30.0, 1.3, 15);
		VueLoupMale vlm1 = new VueLoupMale(loup1);
		LoupMale loup2 = new LoupMale(35.0, 1.9, 50);
		VueLoupMale vlm2 = new VueLoupMale(loup2);
		LoupMale loup3 = new LoupMale(35.0, 1.9, 45);
		VueLoupMale vlm3 = new VueLoupMale(loup3);
		LoupMale loup4 = new LoupMale(35.0, 1.9, 35);
		VueLoupMale vlm4 = new VueLoupMale(loup4);
		
		TigreMale tigre1 = new TigreMale(85.0, 2.0, 110);
		VueTigreMale vtm1 = new VueTigreMale(tigre1);
		TigreMale tigre2 = new TigreMale(100.0, 2.0, 120);
		VueTigreMale vtm2 = new VueTigreMale(tigre2);
		TigreMale tigre3 = new TigreMale(100.0, 2.0, 130);
		VueTigreMale vtm3 = new VueTigreMale(tigre3);
		TigreMale tigre4 = new TigreMale(100.0, 2.0, 150);
		VueTigreMale vtm4 = new VueTigreMale(tigre2);
		
		OursMale ours1 = new OursMale(85.0, 2.0, 110);
		VueOursMale vom1 = new VueOursMale(ours1);
		OursMale ours2 = new OursMale(100.0, 2.0, 120);
		VueOursMale vom2 = new VueOursMale(ours2);
		OursMale ours3 = new OursMale(100.0, 2.0, 130);
		VueOursMale vom3 = new VueOursMale(ours3);
		OursMale ours4 = new OursMale(100.0, 2.0, 150);
		VueOursMale vom4 = new VueOursMale(ours4);
		
		RequinMale req1 = new RequinMale(85.0, 2.0, 110);
		VueRequinMale vreq1 = new VueRequinMale(req1);
		RequinMale req2 = new RequinMale(100.0, 2.0, 120);
		VueRequinMale vreq2 = new VueRequinMale(req2);
		RequinMale req3 = new RequinMale(100.0, 2.0, 130);
		VueRequinMale vreq3 = new VueRequinMale(req3);
		RequinMale req4 = new RequinMale(100.0, 2.0, 150);
		VueRequinMale vreq4 = new VueRequinMale(req4);
		
		AigleMale aig1 = new AigleMale(85.0, 2.0, 110);
		VueAigleMale vaig1 = new VueAigleMale(aig1);
		AigleMale aig2 = new AigleMale(100.0, 2.0, 120);
		VueAigleMale vaig2 = new VueAigleMale(aig2);
		AigleMale aig3 = new AigleMale(100.0, 2.0, 130);
		VueAigleMale vaig3 = new VueAigleMale(aig3);
		AigleMale aig4 = new AigleMale(100.0, 2.0, 150);
		VueAigleMale vaig4 = new VueAigleMale(aig4);
		
		en1.ajouterAnimal(loup1);
		en1.ajouterAnimal(loup2);
		en1.ajouterAnimal(loup3);
		en1.ajouterAnimal(loup4);
		en2.ajouterAnimal(tigre2);
		en2.ajouterAnimal(tigre1);
		en2.ajouterAnimal(tigre3);
		en2.ajouterAnimal(tigre4);
		en3.ajouterAnimal(ours1);
		en3.ajouterAnimal(ours2);
		en3.ajouterAnimal(ours3);
		en3.ajouterAnimal(ours4);
		aq.ajouterAnimal(req1);
		aq.ajouterAnimal(req2);
		aq.ajouterAnimal(req3);
		aq.ajouterAnimal(req4);
		vo.ajouterAnimal(aig1);
		vo.ajouterAnimal(aig2);
		vo.ajouterAnimal(aig3);
		vo.ajouterAnimal(aig4);
		
		Vz.afficheAnimaux(false);
		Vz.afficheNbAnimaux();
		Vz.modifierEtatAnimaux();
		Vz.modifierEtatEnclos();
		Vz.modifierEtatEnclos();
		Vz.modifierEtatEnclos();
		Vz.modifierEtatEnclos();
		Vc1.details();
		Vc2.details();
		Vc3.details();		
		Zoo zoo = Zoo.getInstance("zoo", 0, "test", 21, 'M');
		Cage en1 = new Cage("enclos loup", 2, 4);
		VueCage Vc1 = new VueCage(en1);
		LoupMale loup1 = new LoupMale(30.0, 1.3, 15);
		LoupFemelle loup2 = new LoupFemelle(35.0, 1.9, 50);
		en1.ajouterAnimal(loup1);
		en1.ajouterAnimal(loup2);
		zoo.ajouterEnclos(en1);
		//zoo.accouplement(loup1, loup2);
		Vc1.details();*/
		
		
	}//main pour test
	
	private Zoo (String nomZoo, int nbEnclos, String nomEmploye, int ageEmploye, char sexeEmploye){
		this.nom = nomZoo;
		this.nbEnclos = nbEnclos;
		this.listEnclos = new ArrayList<Enclos<? extends Animal>>();
		this.employe = Employe.getInstance(nomEmploye, ageEmploye, sexeEmploye);
	}//Zoo()
	
	public <T extends Animal> String ajouterEnclos(Enclos<T> enclos){
		this.getListEnclos().add(enclos);
		this.setNbEnclos(this.getNbEnclos() + 1);
		return enclos.getClass().getSimpleName() + " " + enclos.getNom() + " à été ajouté.";
	}
	
	public String getNbAnimaux(){
		int compteurAnimaux = 0;
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			//pour chaque enclos on recupere la taille de sa liste d'animaux
			compteurAnimaux += enclos.getListAnimaux().size();
		}
		return "Il y a " + String.valueOf(compteurAnimaux) + " animaux dans le zoo";
	}//afficheNbAnimaux()
	
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
						listAnimaux += animal.getNom() + "(" + animal.getSexe() + ")";
					}else{
						listAnimaux += animal.getNom() + "(" + animal.getSexe() + "), ";				
					}
					++count;
				}
				listAnimaux += "\n";
				count = 1;
			}			
		}		
		return listAnimaux;
	}//afficheAnimaux()

	public String modifierEtatEnclos(){
		String[] etatFutur = {"correct", "mauvais"};
		String retour = "";
		int randomEtat;
		double randomEnclos, ranndomProfondeur;
		
		//chaque enclos à 50% de chance de voir son etat de propreter modifier		
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			randomEnclos = Math.random();
			
			/*pour chaque enclos ayant eu le precedent test reussi, on generer un nombre aléatoire, 
			 * qui va correspondre à un etat de proprete qui va lui etre atrubuer*/
			if(randomEnclos > 0.5){
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
		if(retour.equals("")){//Si aucun animal n'a été modifier
			retour = "Aucun changement du coté des enclos";
		}
		return retour;
	}//modifierEtatEnclos()
	
	public String modifierEtatAnimaux(){
		String[] etatFutur = {"epuise", "malade", "affame"};
		String retour = "";
		int randomEtat;
		double randomAnimal;		
		for(Enclos<? extends Animal> enclos : this.getListEnclos()){
			for(Animal animal : enclos.getListAnimaux()){
				//chaque animal à 50% de chance de voir l'un de ses etats etre modifier	
				randomAnimal = Math.random();	
				
				if(randomAnimal > 0.5){
					/*pour chaque animal ayant eu le precedent test reussi, on generer un nombre aléatoire, 
					 * qui va correspondre à un etat qui sera modifier*/
					randomEtat = (int)Math.round(Math.random()*(2-0));
					switch(randomEtat){
						case 0:
							animal.setIndicSommeil(etatFutur[randomEtat]);
							animal.setEndormi(true);
							retour += animal.getNom() + "(" + animal.getSexe() + ") de "+ enclos.getClass().getSimpleName() + " : " +
										enclos.getNom() + ", est épuisé il s'est endormi \n";
							break;
						case 1:
							animal.setIndicSante(etatFutur[randomEtat]);
							retour += animal.getNom() + "(" + animal.getSexe() + ") de "+ enclos.getClass().getSimpleName() + " : " + 
										enclos.getNom() + ", est tombé malade \n";
							break;
						case 2:
							animal.setIndicFaim(etatFutur[randomEtat]);
							retour += animal.getNom() + "(" + animal.getSexe() + ") de "+ enclos.getClass().getSimpleName() + " : " +
										enclos.getNom() + ", est affamé, il faut qu'il mange \n";
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
	
	public <T extends Animal> String listerAnimauxEnclos(Enclos<T> enclos, boolean pourSoin){
		String retour = "Choisissez un animal :\n";
		int count = 1;
		for(T animaux : enclos.getListAnimaux()){
			retour += count + " - " + animaux.getNom() + "(" + animaux.getSexe() + ") ";
			if(pourSoin){
				retour += "Sante : " + animaux.getIndicSante() + "\n";
			}else{
				retour += "\n";
			}
			++count;
		}
		return retour;
	}//listerAnimauxEnclos()
	
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
	
	public boolean verfierMale(Animal animal){
		if(animal.getSexe() == 'M' && animal.getAge() >= animal.getMaturiteSexuelle()){
			return true;
		}else{
			return false;
		}
	}//verfierMale()
	
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
