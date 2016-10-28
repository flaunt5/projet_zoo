package zoo_system;

public class AigleFemelle extends Aigle implements AutreFemelle{
	
	public AigleFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//AigleFemelle()

	public void pondre() {
		//code
	}//pondre()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

}//AigleFemelle
