package zoo_system;

public class TigreFemelle extends Tigre implements MammifereFemelle{
	
	public TigreFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//TigreFemelle()

	public void mettreBas(String espece, Enclos enclosMere) {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.sexe + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
}//TigreFemelle
