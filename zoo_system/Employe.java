package zoo_system;

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
	
	private Employe(String nom, int age, char sexe){
		this.nom = nom;
		this.age = age;
		this.sexe = sexe;
	}//Employe()
	
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
	
	public <T extends Animal> String nourirAnimaux(Enclos<T> enclos, T animal, Nourriture nourriture){
		return enclos.nourir(animal, nourriture);
	}//nourirAnimaux()
	
	public <T extends Animal> String examinerEnclos(Enclos<T> enclos){
		String donneesEnclos = "";
		String listAnimaux = "";
		int count = 1; //compteur pour savoir quand on sera au dernier element
		//pour chaque animaux on va recuperer leurs nom et les concatener dans une String
		donneesEnclos = enclos.toString2();
		for(Animal animal : enclos.getListAnimaux()){
			if(count == enclos.getListAnimaux().size()){//si on est au denier element on ne rajoute pas de ","
				listAnimaux += animal.getNom();
			}else{
				listAnimaux += animal.getNom() + ", ";				
			}
			++count;
		}
		return donneesEnclos + listAnimaux + "\n";// retourne les infos de l'enclos + le nom des animaux qu'il possède
	}//examinerEnclos()
	
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
	
	public String soignerAnimal(Animal animal){
		animal.etreSoigner();
		return animal.getNom() + " à été soigné";
	}
	
	public static Employe getInstance(String nom, int age, char sexe){
		if(instance == null){
			instance =  new Employe(nom, age, sexe);
		}
		return instance;
	}//getInstance()
	
	public static Employe getInstance(){
		return instance;
	}

	public String getNom() {
		return nom;
	}//getNom()

	public void setNom(String nom) {
		this.nom = nom;
	}//setNom()

	public char getSexe() {
		return sexe;
	}//getSexe()

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}//setSexe()

	public int getAge() {
		return age;
	}//getAge()

	public void setAge(int age) {
		this.age = age;
	}//setAge()	
}//Employe
