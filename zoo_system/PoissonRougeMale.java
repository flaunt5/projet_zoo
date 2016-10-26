package zoo_system;

public class PoissonRougeMale extends PoissonRouge implements Male{
	
	public PoissonRougeMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//PoissonRougeMale()

	public void sacoupler(Femelle femelle) {
		//code		
	}//sacoupler
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.sexe + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
}//PoissonRougeMale
