package zoo_system;

public class OursFemelle extends Ours implements MammifereFemelle{
	
	public OursFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//OursFemelle()

	public void mettreBas(String espece, Enclos enclosMere) {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + ", sexe : " + Femelle.sexe;
	}//toString()
}//OursFemelle
