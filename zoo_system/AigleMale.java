package zoo_system;

public class AigleMale extends Aigle implements Male<AigleFemelle>{
	
	public AigleMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//AigleMale()
	
	public void saccoupler(AigleFemelle femelle) {
		femelle.pondre();		
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

	public char getSexe(){
		return AigleMale.SEXE;
	}//getSexe()
	
}//AigleMale
