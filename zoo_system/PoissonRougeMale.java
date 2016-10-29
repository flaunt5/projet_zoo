package zoo_system;

public class PoissonRougeMale extends PoissonRouge implements AutreMale{
	
	public PoissonRougeMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//PoissonRougeMale()

	public void saccoupler(AutreFemelle femelle) {
		femelle.pondre();	
	}//sacoupler
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return PoissonRougeMale.SEXE;
	}//getSexe()
}//PoissonRougeMale
