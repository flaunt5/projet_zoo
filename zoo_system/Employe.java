package zoo_system;

public class Employe {
	private  static Employe instance = null;
	private String nom;
	private char sexe;
	private int age;

	public static void main(String args[]){
		Cage en = new Cage("enclosLoup", 3, 3);
		Aquarium aq = new Aquarium("bassinRequin", 3, 2);
		Voliere vo = new Voliere("voliereAigle", 3, 2, 5.0);
		Voliere vo2 = new Voliere("voliereAigle2", 3, 1, 5.0);
		Loup loup1 = new LoupMale(30.0, 1.3, 15);
		Loup loup2 = new LoupMale(50.0, 1.5, 15);
		Aigle aigle1 = new AigleMale(30.0, 1.3, 15);
		Aigle aigle2 = new AigleFemelle(40.0, 1.3, 18);
		Requin requin1 = new RequinMale(30.0, 1.3, 15);
		Requin requin2 = new RequinFemelle(90.0, 1.3, 25);
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
		System.out.println(en.toString());
		System.out.println(aq.toString());
		System.out.println(vo.toString());
		Employe emp = Employe.getInstance("mauricette", 99, 'F');
		System.out.println(emp.nettoyerEnclos(en));
		System.out.println(emp.nettoyerEnclos(aq));
		System.out.println(emp.nettoyerEnclos(vo));
		System.out.println(emp.examinerEnclos(vo));
		System.out.println(emp.examinerEnclos(en));
		System.out.println(emp.examinerEnclos(aq));
		System.out.println(emp.transfererAnimal(aigle1, vo2));
		System.out.println(emp.transfererAnimal(aigle2, vo2));
		System.out.println(emp.examinerEnclos(vo));
		System.out.println(emp.examinerEnclos(vo2));
	}//main pour test
	
	private Employe(String nom, int age, char sexe){
		this.nom = nom;
		this.age = age;
		this.sexe = sexe;
	}//Employe()
	
	public String nettoyerEnclos(Enclos<?> enclos){//a evoluer pour le type aqua et voliere
		if(!(enclos.getListAnimaux().isEmpty())){
			return "Vous devez vider l'enclos pour pouvoir l'entretenir";
		}else{
			if(enclos.getClass().getSimpleName().equals("Voliere")){
				((Voliere) enclos).entretenirVoliere();
			}else if(enclos.getClass().getSimpleName().equals("Aquarium")){
				((Aquarium) enclos).entretenirBassin();
			}else{
				enclos.entretenir();
			}
			return enclos.getClass().getSimpleName() + " " + enclos.getNom() + " a ete entretenu"; 
		}
	}//nettoyerEnclos()
	
	public String nourirAnimaux(Enclos<?> enclos){
		return enclos.nourir();
	}//nourirAnimaux()

	
	public String examinerEnclos(Enclos<?> enclos){
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
	
	public String transfererAnimal(Animal animal, Enclos enclosDesti){
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
