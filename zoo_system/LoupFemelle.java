package zoo_system;

public class LoupFemelle extends Loup implements MammifereFemelle{
	
	public LoupFemelle(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
	}//LoupFemelle()

	public void mettreBas(String espece, Enclos enclosMere) {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + ", sexe : " + Femelle.sexe;
	}//toString()

}//LoupFemelle
