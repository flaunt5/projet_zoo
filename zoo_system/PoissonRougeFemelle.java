package zoo_system;

public class PoissonRougeFemelle extends PoissonRouge implements AutreFemelle{
	
	public PoissonRougeFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//PoissonRougeFemelle()

	public String pondre() {
		String retour = "Le bébé est mort, il n'y avait pas assez de place dans l'enclos";
		if(!(this.getEnclosResidence().isFull())){
			double randomPoissonRouge = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (0.005 - 0.001), 3);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.05 - 0.02), 2);
			if(randomPoissonRouge <= 0.5){
				PoissonRougeMale poisson = AnimalFactory.getPoissonRougeMale(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(poisson);
				retour = poisson.getNom() + "(M) est né dans l'aquarium : " + this.getEnclosResidence().getNom() +"\n";
			}else{
				PoissonRougeFemelle poisson = AnimalFactory.getPoissonRougeFemelle(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(poisson);
				retour = poisson.getNom() + "(M) est né dans l'aquarium : " + this.getEnclosResidence().getNom() +"\n";
			}
		}	
		return retour;
	}//pondre()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

	public char getSexe(){
		return PoissonRougeFemelle.SEXE;
	}//getSexe()
}//PoissonRougeFemelle
