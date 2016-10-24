package zoo_system;

public class LoupMale extends Loup implements Male{
	
	public LoupMale(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
		//code enclos residence
	}//LoupMale()

	public void sacoupler(Femelle femelle) {
		//code
	}//sacoupler()

	public String toString(){
		return super.toString() + ", sexe : " + Male.sexe;
	}//toString()
}//LoupMale
