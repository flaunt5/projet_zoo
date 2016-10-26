package zoo_system;

public class LoupFemelle extends Loup implements MammifereFemelle{
	
	public LoupFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//LoupFemelle()

	public void mettreBas(String espece, Enclos enclosMere) {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.sexe + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

}//LoupFemelle
