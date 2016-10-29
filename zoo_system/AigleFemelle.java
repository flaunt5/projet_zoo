package zoo_system;

public class AigleFemelle extends Aigle implements AutreFemelle{
	
	public AigleFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//AigleFemelle()

	public void pondre() {
		if(!(this.getEnclosResidence().isFull())){
			double randomAigle = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (0.4 - 0.2), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.15 - 0.1), 2);
			if(randomAigle <= 0.5){
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getAigleMale(randomPoids, randomTaille));
			}else{
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getAigleFemelle(randomPoids, randomTaille));
			}
		}
	}//pondre()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return AigleFemelle.SEXE;
	}//getSexe()

}//AigleFemelle
