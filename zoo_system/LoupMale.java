package zoo_system;

public class LoupMale extends Loup implements MammifereMale{
	
	public LoupMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//LoupMale()

	public void saccoupler(MammifereFemelle femelle) {
		femelle.mettreBas();		
	}//sacoupler()

	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return LoupMale.SEXE;
	}//getSexe()
	
	public static void main(String args[]){
		LoupMale LM= new LoupMale(10, 10, 10);
		LoupFemelle LF = new LoupFemelle(10, 10, 10);
		Cage cageLoup = new Cage("Cage à  loup", 10, 3);
		cageLoup.ajouterAnimal(LM);
		cageLoup.ajouterAnimal(LF);
		System.out.println(cageLoup.toString());
		LM.saccoupler(LF);
		System.out.println(cageLoup.toString());
	}
	
}//LoupMale
