package zoo_system;

public class BaleineFemelle extends Baleine implements MammifereFemelle{
	
	public BaleineFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//BaleineFemelle()

	public void mettreBas() {
		if(!(this.getEnclosResidence().isFull())){
			double randomBaleine = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (3000 - 2500), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (7 - 5), 1);
			if(randomBaleine <= 0.5){
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getBaleineMale(randomPoids, randomTaille));
			}else{
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getBaleineFemelle(randomPoids, randomTaille));
			}
		}
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return BaleineFemelle.SEXE;
	}//getSexe()

}//BaleineFemelle
