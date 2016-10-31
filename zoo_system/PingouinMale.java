package zoo_system;

public class PingouinMale extends Pingouin implements Male<PingouinFemelle>{
	
	public PingouinMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//PinguoinMale()

	public String saccoupler(PingouinFemelle femelle) {
		return femelle.pondre();
	}//sacoupler()

	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return PingouinMale.SEXE;
	}//getSexe()
}//PinguoinMale
