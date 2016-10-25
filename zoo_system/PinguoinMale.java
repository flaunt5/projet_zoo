package zoo_system;

public class PinguoinMale extends Pinguoin implements Male{
	
	public PinguoinMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//PinguoinMale()

	public void sacoupler(Femelle femelle) {
		//code		
	}//sacoupler()

	public String toString(){
		return super.toString() + ", sexe : " + Male.sexe;
	}//toString()
}//PinguoinMale
