package zoo_system;

public class RequinFemelle extends Requin implements AutreFemelle{
	
	public RequinFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//RequinFemelle()

	public void pondre() {
		//code	
	}//pondre()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

}//RequinFemelle
