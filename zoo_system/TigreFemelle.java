package zoo_system;

public class TigreFemelle extends Tigre implements MammifereFemelle{
	
	public TigreFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//TigreFemelle()

	public void mettreBas() {
		if(!(this.getEnclosResidence().isFull())){
			double randomTigre = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (1.6 - 0.7), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.5 - 0.3), 1);
			if(randomTigre <= 0.5){
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getTigreMale(randomPoids, randomTaille));
			}else{
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getTigreFemelle(randomPoids, randomTaille));
			}
		}
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return TigreFemelle.SEXE;
	}//getSexe()
}//TigreFemelle
