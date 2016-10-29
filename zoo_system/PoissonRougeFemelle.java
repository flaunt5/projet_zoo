package zoo_system;

public class PoissonRougeFemelle extends PoissonRouge implements AutreFemelle{
	
	public PoissonRougeFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//PoissonRougeFemelle()

	public void pondre() {
		if(!(this.getEnclosResidence().isFull())){
			double randomPoissonRouge = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (0.005 - 0.001), 3);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.05 - 0.02), 2);
			if(randomPoissonRouge <= 0.5){
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getPoissonRougeMale(randomPoids, randomTaille));
			}else{
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getPoissonRougeFemelle(randomPoids, randomTaille));
			}
		}	
	}//pondre()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

	public char getSexe(){
		return PoissonRougeFemelle.SEXE;
	}//getSexe()
}//PoissonRougeFemelle
