package zoo_system;

public class LoupFemelle extends Loup implements MammifereFemelle{
	
	public LoupFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//LoupFemelle()

	public void mettreBas() {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

}//LoupFemelle
