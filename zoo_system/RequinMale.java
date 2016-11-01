package zoo_system;

public class RequinMale extends Requin implements Male<RequinFemelle>{
	
	public RequinMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//RequinMale()

	public String saccoupler(RequinFemelle femelle) {
		femelle.setEnceinte(true);
		return femelle.getNom() + "(" + femelle.getSexe() + ") � �t� fecond� par "  +	this.getNom() + "(" + this.getSexe() + ")\n";
	}//sacoupler
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return RequinMale.SEXE;
	}//getSexe()

}//RequinMale
