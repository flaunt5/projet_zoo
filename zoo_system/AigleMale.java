package zoo_system;

public class AigleMale extends Aigle implements Male{
	
	public AigleMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//AigleMale()
	
	public void sacoupler(Femelle femelle) {
		//code		
	}//sacoupler()
	
	public String toString(){
		return super.toString() + ", sexe : " + Male.sexe;
	}//toString()

}//AigleMale
