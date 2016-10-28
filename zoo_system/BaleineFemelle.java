package zoo_system;

public class BaleineFemelle extends Baleine implements MammifereFemelle{
	
	public BaleineFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//BaleineFemelle()

	public void mettreBas() {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

}//BaleineFemelle
