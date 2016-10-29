package zoo_system;

public class LoupMale extends Loup implements Male{
	
	public LoupMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//LoupMale()

	public void sacoupler(Animal femelle) {

	}//sacoupler()

	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return LoupMale.SEXE;
	}//getSexe()

}//LoupMale
