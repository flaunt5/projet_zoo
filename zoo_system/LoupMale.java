package zoo_system;

public class LoupMale extends Loup implements Male<LoupFemelle>{
	
	public LoupMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//LoupMale()

	public String saccoupler(LoupFemelle femelle) {
		femelle.setEnceinte(true);
		return femelle.getNom() + "(" + femelle.getSexe() + ") à été fecondé par "  +	this.getNom() + "(" + this.getSexe() + ")\n";
	}//sacoupler()

	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return LoupMale.SEXE;
	}//getSexe()
}//LoupMale
