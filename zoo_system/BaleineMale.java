package zoo_system;

public class BaleineMale extends Baleine implements Male{
	
	public BaleineMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//BaleineMale()

	public void sacoupler(Animal femelle) {
		//code		
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return BaleineMale.SEXE;
	}//getSexe()

}//BaleineMale