package zoo_system;

public class AigleMale extends Aigle implements Male{
	
	public AigleMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//AigleMale()
	
	public void sacoupler(Femelle femelle) {
		//code		
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

}//AigleMale
