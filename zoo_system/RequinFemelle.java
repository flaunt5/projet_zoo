package zoo_system;

public class RequinFemelle extends Requin implements AutreFemelle{
	
	public RequinFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//RequinFemelle()

	public void pondre(String espece, Enclos enclosMere) {
		//code		
	}//pondre()
	
	public String toString(){
		return super.toString() + ", sexe : " + Femelle.sexe;
	}//toString()

}//RequinFemelle
