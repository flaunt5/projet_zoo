package zoo_system;

public class BaleineMale extends Baleine implements Male<BaleineFemelle>{
	
	public BaleineMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//BaleineMale()

	public String saccoupler(BaleineFemelle femelle) {
		femelle.setEnceinte(true);
		return femelle.getNom() + "(" + femelle.getSexe() + ") à été fecondé par "  +	this.getNom() + "(" + this.getSexe() + ")\n";
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return BaleineMale.SEXE;
	}//getSexe()

}//BaleineMale