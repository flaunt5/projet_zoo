package zoo_system;

public class Employe {
	private  static Employe instance = null;
	private String nom;
	private char sexe;
	private int age;

	public static void main(String args[]){
		Enclos en = new Enclos("enclosLoup", 3, 3);
		Aquarium aq = new Aquarium("bassinRequin", 3, 2);
		Voliere vo = new Voliere("voliereAigle", 3, 2, 5.0);
		Voliere vo2 = new Voliere("voliereAigle2", 3, 1, 5.0);
		Animal loup1 = new LoupMale(30.0, 1.3, 15);
		Animal loup2 = new LoupMale(30.0, 1.3, 15);
		Aerien aigle1 = new AigleMale(30.0, 1.3, 15);
		Aerien aigle2 = new AigleFemelle(30.0, 1.3, 15);
		Aquatique requin1 = new RequinMale(30.0, 1.3, 15);
		Aquatique requin2 = new RequinFemelle(30.0, 1.3, 15);
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
	
	public String nettoyerEnclos(Enclos enclos){
		if(!(enclos.getListAnimaux().isEmpty())){
			return "Vous devez vider l'enclos pour pouvoir l'entretenir";
		}else{
			if(enclos.getClass().getSimpleName().equals("Enclos")){
				enclos.entretenir();
			}else if(enclos.getClass().getSimpleName().equals("Aquarium")){
				((Aquarium) enclos).entretenirBassin();
			}else if(enclos.getClass().getSimpleName().equals("Voliere")){
				((Voliere) enclos).entretenirVoliere();
			}
			return enclos.getClass().getSimpleName() + " " + enclos.getNom() + " a ete entretenu"; 
		}
	}//nettoyerEnclos()
	
	public String nourirAnimaux(Enclos enclos){
		return enclos.nourir();
	}//nourirAnimaux()

	
	public String examinerEnclos(Enclos enclos){
		String donneesEnclos = "";
		String listAnimaux = "";
		int count = 1; //compteur pour savoir quand on sera au dernier element
		//pour chaque animaux on va recuperer leurs nom et les concatener dans une String
		if(enclos.getClass().getSimpleName().equals("Enclos")){
			donneesEnclos = enclos.toString2();
			for(Animal animal : enclos.getListAnimaux()){
				if(count == enclos.getListAnimaux().size()){//si on est au denier element on ne rajoute pas de ","
					listAnimaux += animal.getNom();
				}else{
					listAnimaux += animal.getNom() + ", ";				
				}
				++count;
			}
		}else if(enclos.getClass().getSimpleName().equals("Voliere")){
			donneesEnclos = ((Voliere) enclos).toString2();
			for(Aerien animal : ((Voliere) enclos).getListOiseaux()){
				if(count == ((Voliere) enclos).getListOiseaux().size()){
					listAnimaux += animal.getNom();
				}else{
					listAnimaux += animal.getNom() + ", ";				
				}
				++count;
			}
		}else if(enclos.getClass().getSimpleName().equals("Aquarium")){
			donneesEnclos = ((Aquarium) enclos).toString2();
			for(Aquatique animal : ((Aquarium) enclos).getListAquatiques()){
				if(count == ((Aquarium) enclos).getListAquatiques().size()){
					listAnimaux += animal.getNom();
				}else{
					listAnimaux += animal.getNom() + ", ";				
				}
				++count;
			}
		}
		return donneesEnclos + listAnimaux + "\n";// retourne les infos de l'enclos + le nom des animaux qu'il possède
	}//examinerEnclos()
	
	public String transfererAnimal(Animal animal, Enclos enclosDesti){
		String transferValid = "Le/la " + animal.getNom() + " a ete transferer dans l'enclos " + enclosDesti.getNom();
		String trasnferNonValid = "transfer annuler";
		//verifie qu'on ne transfer pas un animal dans son enclos de residence actuel
		if(!(animal.getEnclosResidence().equals(enclosDesti))){
			if(enclosDesti.getClass().getSimpleName().equals("Voliere")){
					if(((Voliere) animal.getEnclosResidence()).verifPourEnlever((Aerien) animal)&& 
	                       ((Voliere) enclosDesti).verifPourAjout((Aerien) animal)){
	                	((Voliere) animal.getEnclosResidence()).enleverAnimal((Aerien) animal);
	                	((Voliere) enclosDesti).ajouterAnimal((Aerien) animal);
	                    return transferValid;
	               }else{
	                    return trasnferNonValid;                
	               }   
           }else if(enclosDesti.getClass().getSimpleName().equals("Aquarium")){
        	   if(((Aquarium) animal.getEnclosResidence()).verifPourEnlever((Aquatique) animal)&& 
                       ((Aquarium) enclosDesti).verifPourAjout((Aquatique) animal)){
        		   ((Aquarium) animal.getEnclosResidence()).enleverAnimal((Aquatique) animal);
        		   ((Aquarium) enclosDesti).ajouterAnimal((Aquatique) animal);
        		   return transferValid;
        	   }else{
        		   return trasnferNonValid;                
        	   } 
           }else{
               if(animal.getEnclosResidence().verifPourEnlever(animal)&& 
                       enclosDesti.verifPourAjout(animal)){
	                animal.getEnclosResidence().enleverAnimal(animal);
	                enclosDesti.ajouterAnimal(animal);
	                return transferValid;
               }else{
	                return trasnferNonValid;                
	           } 
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
