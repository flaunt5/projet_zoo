package zoo_system;

public class PinguoinFemelle extends Pinguoin implements AutreFemelle{
	
	public PinguoinFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//PinguoinFemelle()

	public void pondre(String espece, Enclos enclosMere) {
		//code
	}//pondre()

	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.sexe + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
}//PinguoinFemelle
