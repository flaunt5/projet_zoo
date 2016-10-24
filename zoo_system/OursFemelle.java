package zoo_system;

public class OursFemelle extends Ours implements MammifereFemelle{
	
	public OursFemelle(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
		//code enclos residence
	}//OursFemelle()

	public void mettreBas(String espece, Enclos enclosMere) {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + ", sexe : " + Femelle.sexe;
	}//toString()
}//OursFemelle
