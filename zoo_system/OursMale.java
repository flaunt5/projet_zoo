package zoo_system;

public class OursMale extends Ours implements Male<OursFemelle>{
	
	public OursMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//OursMale()

	public String saccoupler(OursFemelle femelle) {
		return femelle.mettreBas();		
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return OursMale.SEXE;
	}//getSexe()
}//OursMale
