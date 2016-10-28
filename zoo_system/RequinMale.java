package zoo_system;

public class RequinMale extends Requin implements Male{
	
	public RequinMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//RequinMale()

	public void sacoupler(Femelle femelle) {
		//code		
	}//sacoupler
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

}//RequinMale
