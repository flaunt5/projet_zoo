package zoo_system;

public class AigleFemelle extends Aigle implements AutreFemelle{
	
	public AigleFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//AigleFemelle()

	public void pondre(String espece, Enclos enclosMere) {
		//code
	}//pondre()
	
	public String toString(){
		return super.toString() + ", sexe : " + Femelle.sexe;
	}//toString()

}//AigleFemelle
