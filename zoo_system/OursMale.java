package zoo_system;

public class OursMale extends Ours implements MammifereMale{
	
	public OursMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//OursMale()

	public void saccoupler(MammifereFemelle femelle) {
		femelle.mettreBas();		
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return OursMale.SEXE;
	}//getSexe()
}//OursMale
