package zoo_system;

public class PinguoinFemelle extends Pinguoin implements AutreFemelle{
	
	public PinguoinFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//PinguoinFemelle()

	public void pondre() {
		if(!(this.getEnclosResidence().isFull())){
			double randomPinguoin = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (0.3 - 0.2), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.2 - 0.1), 1);
			if(randomPinguoin <= 0.5){
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getPinguoinMale(randomPoids, randomTaille));
			}else{
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getPinguoinFemelle(randomPoids, randomTaille));
			}
		}
	}//pondre()

	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return PinguoinFemelle.SEXE;
	}//getSexe()
}//PinguoinFemelle
