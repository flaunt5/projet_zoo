package zoo_system;

public class Employe {
	private  static Employe instance = null;
	private String nom;
	private char sexe;
	private int age;

	public static void main(String args[]){
		Enclos en = new Enclos("enclosLoup", 3, 3);
		Enclos en2 = new Enclos("enclosLoup2", 3, 2);
		Animal loup1 = new LoupMale(30.0, 1.3, 15);
		Animal loup2 = new LoupMale(40.0, 1.9, 55);
		Animal loup3 = new LoupMale(45.0, 3.0, 55);
		Animal loup4 = new LoupMale(50.0, 3.0, 55);
		en.ajouterAnimal(loup1);
		en.ajouterAnimal(loup2);
		en.ajouterAnimal(loup3);
		en.ajouterAnimal(loup4);
		Employe emp = Employe.getInstance("mauricette", 99 , 'F');
		System.out.println(emp.examinerEnclos(en));
		System.out.println(emp.examinerEnclos(en2));
		System.out.println(emp.transfererAnimal(loup1, en2));
		System.out.println(emp.examinerEnclos(en));
		System.out.println(emp.examinerEnclos(en2));
		System.out.println(emp.transfererAnimal(loup2, en2));
		System.out.println(emp.examinerEnclos(en));
		System.out.println(emp.examinerEnclos(en2));
	}//main pour test
	
	private Employe(String nom, int age, char sexe){
		this.nom = nom;
		this.age = age;
		this.sexe = sexe;
	}//Employe()
	
	public String nettoyerEnclos(Enclos enclos){
		if(!(enclos.getListAnimaux().isEmpty())){
			return "Vous devez vider l'enclos pour pouvoir le nettoyer";
		}else{
			enclos.entretenir();
			return "Enclos " +  enclos.getNom() + " a ete nettoyer"; 
		}
	}//nettoyerEnclos()
	
	public String nourirAnimaux(Enclos enclos){
		return enclos.nourir();
	}//nourirAnimaux()
	
	public String examinerEnclos(Enclos enclos){
		String donneesEnclos = enclos.toString2();
		String listAnimaux = "";
		int count = 1; //compteur pour savoir quand on sera au dernier element
		//pour chaque animaux on va recuperer leurs nom et les concatener dans une String
		for(Animal animal : enclos.getListAnimaux()){
			if(count == enclos.getListAnimaux().size()){//si on est au denier element on ne rajoute pas de ","
				listAnimaux += animal.getNom();
			}else{
				listAnimaux += animal.getNom() + ", ";				
			}
			++count;
		}
		return donneesEnclos + listAnimaux;// retourne les infos de l'enclos + le nom des animaux qu'il possède
	}//examinerEnclos()
	
	public String transfererAnimal(Animal animal, Enclos enclosDesti){
		String transferValid = "Le/la " + animal.getNom() + " a ete transferer dans l'enclos " + enclosDesti.getNom();
		String trasnferNonValid = "transfer annuler";
		//verifie qu'on ne transfer pas un animal dans son enclos de residence actuel
		if(!(animal.getEnclosResidence().getNom().equals(enclosDesti.getNom()))){
			//verifie si le transfer (enlever + ajouter) est possible
			if(animal.getEnclosResidence().verifPourEnlever(animal)&& 
					enclosDesti.verifPourAjout(animal)){
				animal.getEnclosResidence().enleverAnimal(animal);
				enclosDesti.ajouterAnimal(animal);
				return transferValid;
			}else{
				return trasnferNonValid;				
			}			
		}else{
			return trasnferNonValid;				
		}
	}//transfererAnimal()
	
	public static Employe getInstance(String nom, int age, char sexe){
		if(instance == null){
			instance =  new Employe(nom, age, sexe);
		}
		return instance;
	}//getInstance()

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
