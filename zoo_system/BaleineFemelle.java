package zoo_system;

public class BaleineFemelle extends Baleine implements MammifereFemelle{
	
	public BaleineFemelle(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
		//code enclos residence
	}//BaleineFemelle()

	public void mettreBas(String espece, Enclos enclosMere) {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + ", sexe : " + Femelle.sexe;
	}//toString()

}//BaleineFemelle
