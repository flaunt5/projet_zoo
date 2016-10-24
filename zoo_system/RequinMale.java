package zoo_system;

public class RequinMale extends Requin implements Male{
	
	public RequinMale(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
	}//RequinMale()

	public void sacoupler(Femelle femelle) {
		//code		
	}//sacoupler
	
	public String toString(){
		return super.toString() + ", sexe : " + Male.sexe;
	}//toString()

}//RequinMale
