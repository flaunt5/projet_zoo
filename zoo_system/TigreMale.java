package zoo_system;

public class TigreMale extends Tigre implements Male{
	
	public TigreMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//TigreMale()
	
	public void sacoupler(Animal femelle) {
		//code
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return TigreMale.SEXE;
	}//getSexe()
}//TigreMale
