package zoo_system;

public class TigreMale extends Tigre implements MammifereMale{
	
	public TigreMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//TigreMale()
	
	public void saccoupler(MammifereFemelle femelle) {
		femelle.mettreBas();
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return TigreMale.SEXE;
	}//getSexe()
}//TigreMale
