package zoo_system;

public class PinguoinFemelle extends Pinguoin implements AutreFemelle{
	
	public PinguoinFemelle(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
	}//PinguoinFemelle()

	public void pondre(String espece, Enclos enclosMere) {
		//code
	}//pondre()

	public String toString(){
		return super.toString() + ", sexe : " + Femelle.sexe;
	}//toString()
}//PinguoinFemelle
