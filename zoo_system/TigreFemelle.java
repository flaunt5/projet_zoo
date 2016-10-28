package zoo_system;

public class TigreFemelle extends Tigre implements MammifereFemelle{
	
	public TigreFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//TigreFemelle()

	public void mettreBas() {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
}//TigreFemelle
