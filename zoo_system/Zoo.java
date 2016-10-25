package zoo_system;

import java.util.ArrayList;

public class Zoo {
	private Employe employe;
	private String nom;
	private int nbEnclos;
	private static Zoo instance = null;
	private ArrayList<Enclos> listEnclos;
	
	public static void main(String args[]){
		Zoo fistiLand = Zoo.getInstance("FistiLand", 0, "mauricette", 99, 'F');
		Enclos en1 = new Enclos("enclos loup", 2, 4);
		Enclos en2 = new Enclos("enclos tigre", 5, 4);
		Enclos en3 = new Enclos("enclos ours", 6, 4);
		fistiLand.ajouterEnclos(en1);
		fistiLand.ajouterEnclos(en2);
		fistiLand.ajouterEnclos(en3);
		Animal loup1 = new LoupMale(30.0, 1.3, 15);
		Animal loup2 = new LoupMale(35.0, 1.9, 55);
		Animal loup3 = new LoupMale(35.0, 1.9, 55);
		Animal loup4 = new LoupMale(35.0, 1.9, 55);
		Animal tigre1 = new TigreMale(85.0, 2.0, 100);
		Animal tigre2 = new TigreMale(100.0, 2.0, 150);
		Animal tigre3 = new TigreMale(100.0, 2.0, 150);
		Animal tigre4 = new TigreMale(100.0, 2.0, 150);
		Animal ours1 = new OursMale(85.0, 2.0, 100);
		Animal ours2 = new OursMale(100.0, 2.0, 150);
		Animal ours3 = new OursMale(100.0, 2.0, 150);
		Animal ours4 = new OursMale(100.0, 2.0, 150);
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
		System.out.println(fistiLand.afficheAnimaux());
		System.out.println(fistiLand.afficheNbAnimaux());
		fistiLand.modifierEtatAnimaux();
		System.out.println(en1.toString());
		System.out.println(en2.toString());
		System.out.println(en3.toString());
		
		
		
	}//main pour test
	
	private Zoo (String nomZoo, int nbEnclos, String nomEmploye, int ageEmploye, char sexeEmploye){
		this.nom = nomZoo;
		this.nbEnclos = nbEnclos;
		this.listEnclos = new ArrayList<Enclos>();
		this.employe = Employe.getInstance(nomEmploye, ageEmploye, sexeEmploye);
	}//Zoo()
	
	public void ajouterEnclos(Enclos enclos){
		this.getListEnclos().add(enclos);
	}
	
	public String afficheNbAnimaux(){
		int compteurAnimaux = 0;
		for(Enclos enclos : this.getListEnclos()){
			//pour chaque enclos on recupere la taille de sa liste d'animaux
			compteurAnimaux += enclos.getListAnimaux().size();
		}
		return String.valueOf(compteurAnimaux);
	}//afficheNbAnimaux()
	
	public String afficheAnimaux(){
		String listAnimaux = "";
		int count = 1;
		//pour chaque enclos on commence par recuperer le nom de ces derniers
		for(Enclos enclos : this.getListEnclos()){
			listAnimaux += enclos.getNom()+ " : ";
			//puis pour chaque animal dans l'enclos on recupere le nom de ces derniers
			for(Animal animal : enclos.getListAnimaux()){
				if(count == enclos.getListAnimaux().size()){//si on est au denier element on ne rajoute pas de ","
					listAnimaux += animal.getNom();
				}else{
					listAnimaux += animal.getNom() + ", ";				
				}
				++count;
			}
			listAnimaux += "\n";
			count = 1;
		}		
		return listAnimaux;
	}//afficheAnimaux()

	public void modifierEtatEnclos(){
		String[] etatFutur = {"correct", "mauvais"};
		int randomEtat;
		double randomEnclos;
		
		//chaque enclos à 50% de chance de voir son etat de propreter modifier		
		for(Enclos enclos : this.getListEnclos()){
			randomEnclos = Math.random();
			
			/*pour chaque enclos ayant eu le precedent test reussi, on generer un nombre aléatoire, 
			 * qui va correspondre à un etat de proprete qui va lui etre atrubuer*/
			if(randomEnclos > 0.5){
				randomEtat = (int)Math.round(Math.random());
				enclos.setDegreProprete(etatFutur[randomEtat]);
			}	
		}	
	}//modifierEtatEnclos()
	
	public void modifierEtatAnimaux(){
		String[] etatFutur = {"epuise", "malade", "affame"};
		int randomEtat;
		double randomAnimal;		
		for(Enclos enclos : this.getListEnclos()){
			for(Animal animal : enclos.getListAnimaux()){
				//chaque animal à 50% de chance de voir l'un de ses etats etre modifier	
				randomAnimal = Math.random();	
				
				if(randomAnimal > 0.5){
					/*pour chaque animal ayant eu le precedent test reussi, on generer un nombre aléatoire, 
					 * qui va correspondre à un etat qui sera modifier*/
					randomEtat = (int)Math.round(Math.random());
					
					switch(randomEtat){
						case 0:
							animal.setIndicSommeil(etatFutur[randomEtat]);
							animal.setEndormi(true);
							break;
						case 1:
							animal.setIndicSante(etatFutur[randomEtat]);
							break;
						case 2:
							animal.setIndicFaim(etatFutur[randomEtat]);
							break;
					}//switch
				}//if	
			}//for animal
		}//	for enclos
	}//modifierEtatAnimaux()
	
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

	public ArrayList<Enclos> getListEnclos() {
		return listEnclos;
	}//getListEnclos()

	public void setListEnclos(ArrayList<Enclos> listEnclos) {
		this.listEnclos = listEnclos;
	}//setListEnclos()
	
}//Zoo
