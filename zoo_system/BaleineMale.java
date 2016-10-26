package zoo_system;

public class BaleineMale extends Baleine implements Male{
	
	public BaleineMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//BaleineMale()

	public void sacoupler(Femelle femelle) {
		//code		
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.sexe + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

}//BaleineMale