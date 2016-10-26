package zoo_system;

public class TigreMale extends Tigre implements Male{
	
	public TigreMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//TigreMale()
	
	public void sacoupler(Femelle femelle) {
		//code
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.sexe + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
}//TigreMale
