package zoo_system;

public class BaleineFemelle extends Baleine implements MammifereFemelle{
	
	public BaleineFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//BaleineFemelle()

	public void mettreBas(String espece, Enclos enclosMere) {
		//code
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.sexe + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

}//BaleineFemelle
