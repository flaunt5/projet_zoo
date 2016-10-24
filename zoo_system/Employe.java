package zoo_system;

public class Employe {
	private  static Employe instance = null;
	private String nom;
	private char sexe;
	private int age;

	public static void main(String args[]){
		Enclos en = new Enclos("enclosLoup", 3, 3);
		Enclos en2 = new Enclos("enclosLoup2", 3, 1);
		Animal loup1 = new LoupMale(30.0, 1.3, 15, en);
		System.out.println(en.ajouterAnimal(loup1));
		Animal loup2 = new LoupMale(35.0, 1.9, 55, en);
		System.out.println(en.ajouterAnimal(loup2));
		Animal loup3 = new LoupMale(35.0, 3.0, 55, en);
		System.out.println(en.ajouterAnimal(loup3));
		Employe emp = Employe.getInstance("mauricette", 99 , 'F');
		System.out.println(emp.examinerEnclos(en));
		System.out.println(emp.examinerEnclos(en2));
		System.out.println(emp.transfererAnimal(loup1, en2));
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
		return enclos.entretenir();
	}//nettoyerEnclos()
	
	public String nourirAnimaux(Enclos enclos){
		return enclos.nourir();
	}//nourirAnimaux()
	
	public String examinerEnclos(Enclos enclos){
		String donneesEnclos = enclos.toString2();
		String listAnimaux = "";
		int count = 1;
		for(Animal animal : enclos.getListAnimaux()){
			if(count == enclos.getListAnimaux().size()){
				listAnimaux += animal.getNom();
			}else{
				listAnimaux += animal.getNom() + ", ";				
			}
			++count;
		}
		return donneesEnclos + listAnimaux;
	}//examinerEnclos()
	
	public String transfererAnimal(Animal animal, Enclos enclosDesti){
		/*String etape1, etape2;
		etape2 = enclosDesti.ajouterAnimal(animal);
		etape1 = animal.getEnclosResidence().enleverAnimal(animal);
		return etape1 + " " + etape2;/*"Le/la " + animal.getNom() + " a ete transferer de l'enclos " + animal.getEnclosResidence().getNom() +
				" a l'enclos " + enclosDesti.getNom();*/return null;
		
	}
	
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
