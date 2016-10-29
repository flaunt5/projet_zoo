package zoo_system;

public class PinguoinMale extends Pinguoin implements AutreMale{
	
	public PinguoinMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//PinguoinMale()

	public void saccoupler(AutreFemelle femelle) {
		femelle.pondre();
	}//sacoupler()

	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return PinguoinMale.SEXE;
	}//getSexe()
}//PinguoinMale
