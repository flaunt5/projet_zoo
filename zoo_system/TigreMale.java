package zoo_system;

public class TigreMale extends Tigre implements Male{
	
	public TigreMale(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
		//code enclos residence
	}//TigreMale()
	
	public void sacoupler(Femelle femelle) {
		//code
	}//sacoupler()
	
	public String toString(){
		return super.toString() + ", sexe : " + Male.sexe;
	}//toString()
}//TigreMale
