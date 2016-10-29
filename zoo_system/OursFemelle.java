package zoo_system;

public class OursFemelle extends Ours implements MammifereFemelle{
	
	public OursFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//OursFemelle()

	public void mettreBas() {
		if(!(this.getEnclosResidence().isFull())){
			double randomOurs = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (0.7 - 0.4), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.2 - 0.1), 1);
			if(randomOurs <= 0.5){
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getOursMale(randomPoids, randomTaille));
			}else{
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getOursFemelle(randomPoids, randomTaille));
			}
		}
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return OursFemelle.SEXE;
	}//getSexe()
}//OursFemelle
