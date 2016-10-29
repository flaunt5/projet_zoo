package zoo_system;

public class LoupFemelle extends Loup implements MammifereFemelle{
	
	public LoupFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//LoupFemelle()

	public void mettreBas() {
		if(!(this.getEnclosResidence().isFull())){
			double randomLoup = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (0.5 - 0.3), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.2 - 0.1), 1);
			if(randomLoup <= 0.5){
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getLoupMale(randomPoids, randomTaille));
			}else{
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getLoupFemelle(randomPoids, randomTaille));
			}
		}
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return LoupFemelle.SEXE;
	}//getSexe()

}//LoupFemelle
