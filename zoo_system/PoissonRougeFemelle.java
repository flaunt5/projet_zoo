package zoo_system;

public class PoissonRougeFemelle extends PoissonRouge implements AutreFemelle{
	
	public PoissonRougeFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//PoissonRougeFemelle()

	public void pondre(String espece, Enclos enclosMere) {
		//code		
	}//pondre()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.sexe + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

}//PoissonRougeFemelle
