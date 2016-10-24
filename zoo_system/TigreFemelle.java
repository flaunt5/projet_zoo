package zoo_system;

public class TigreFemelle extends Tigre implements MammifereFemelle{
	
	public TigreFemelle(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
	}//TigreFemelle()

	public void mettreBas(String espece, Enclos enclosMere) {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + ", sexe : " + Femelle.sexe;
	}//toString()
}//TigreFemelle
