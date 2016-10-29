package zoo_system;

public class RequinMale extends Requin implements MammifereMale{
	
	public RequinMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//RequinMale()

	public void saccoupler(MammifereFemelle femelle) {
		femelle.mettreBas();		
	}//sacoupler
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return RequinMale.SEXE;
	}//getSexe()

}//RequinMale
