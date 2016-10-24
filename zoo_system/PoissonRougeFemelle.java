package zoo_system;

public class PoissonRougeFemelle extends PoissonRouge implements AutreFemelle{
	
	public PoissonRougeFemelle(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
	}//PoissonRougeFemelle()

	public void pondre(String espece, Enclos enclosMere) {
		//code		
	}//pondre()
	
	public String toString(){
		return super.toString() + ", sexe : " + Femelle.sexe;
	}//toString()

}//PoissonRougeFemelle
