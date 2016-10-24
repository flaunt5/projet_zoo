package zoo_system;

public class PoissonRougeMale extends PoissonRouge implements Male{
	
	public PoissonRougeMale(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
	}//PoissonRougeMale()

	public void sacoupler(Femelle femelle) {
		//code		
	}//sacoupler
	
	public String toString(){
		return super.toString() + ", sexe : " + Male.sexe;
	}//toString()
}//PoissonRougeMale
