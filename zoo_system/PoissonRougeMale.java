package zoo_system;

public class PoissonRougeMale extends PoissonRouge implements Male<PoissonRougeFemelle>{
	
	public PoissonRougeMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//PoissonRougeMale()

	public String saccoupler(PoissonRougeFemelle femelle) {
		femelle.setEnceinte(true);
		return femelle.getNom() + "(" + femelle.getSexe() + ") � �t� fecond� par "  +	this.getNom() + "(" + this.getSexe() + ")\n";
	}//sacoupler
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return PoissonRougeMale.SEXE;
	}//getSexe()
}//PoissonRougeMale
