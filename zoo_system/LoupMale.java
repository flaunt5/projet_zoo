package zoo_system;

public class LoupMale extends Loup implements Male{
	
	public LoupMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//LoupMale()

	public void sacoupler(Femelle femelle) {
		//code
	}//sacoupler()

	public String toString(){
		return super.toString() + ", sexe : " + Male.sexe;
	}//toString()
}//LoupMale
