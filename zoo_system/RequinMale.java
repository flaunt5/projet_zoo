package zoo_system;

public class RequinMale extends Requin implements Male<RequinFemelle>{
	
	public RequinMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//RequinMale()

	public String saccoupler(RequinFemelle femelle) {
		 return femelle.pondre();		
	}//sacoupler
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return RequinMale.SEXE;
	}//getSexe()

}//RequinMale
