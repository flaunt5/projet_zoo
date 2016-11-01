package zoo_system;

public class TigreMale extends Tigre implements Male<TigreFemelle>{
	
	public TigreMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//TigreMale()
	
	public String saccoupler(TigreFemelle femelle) {
		femelle.setEnceinte(true);
		return femelle.getNom() + "(" + femelle.getSexe() + ") à été fecondé par "  +	this.getNom() + "(" + this.getSexe() + ")\n";
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return TigreMale.SEXE;
	}//getSexe()
}//TigreMale
