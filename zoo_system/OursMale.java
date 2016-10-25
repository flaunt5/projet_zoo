package zoo_system;

public class OursMale extends Ours implements Male{
	
	public OursMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//OursMale()

	public void sacoupler(Femelle femelle) {
		//code		
	}//sacoupler()
	
	public String toString(){
		return super.toString() + ", sexe : " + Male.sexe;
	}//toString()
}//OursMale
