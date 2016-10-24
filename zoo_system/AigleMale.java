package zoo_system;

public class AigleMale extends Aigle implements Male{
	
	public AigleMale(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
	}//AigleMale()
	
	public void sacoupler(Femelle femelle) {
		//code		
	}//sacoupler()
	
	public String toString(){
		return super.toString() + ", sexe : " + Male.sexe;
	}//toString()

}//AigleMale
