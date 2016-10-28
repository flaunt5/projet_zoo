package zoo_system;

public class OursFemelle extends Ours implements MammifereFemelle{
	
	public OursFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//OursFemelle()

	public void mettreBas() {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
}//OursFemelle
