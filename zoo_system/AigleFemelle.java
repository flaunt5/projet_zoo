package zoo_system;

public class AigleFemelle extends Aigle implements AutreFemelle{
	
	public AigleFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//AigleFemelle()

	public String pondre() {
		String retour = "Le bébé est mort, il n'y avait pas assez de place dans l'enclos";
		if(!(this.getEnclosResidence().isFull())){
			double randomAigle = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (0.4 - 0.2), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.15 - 0.1), 2);
			if(randomAigle <= 0.5){
				AigleMale aigle = AnimalFactory.getAigleMale(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(aigle);
				retour = aigle.getNom() + "(M) est né dans la voliere : " + this.getEnclosResidence().getNom() +"\n";
			}else{
				AigleFemelle aigle = AnimalFactory.getAigleFemelle(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(aigle);
				retour = aigle.getNom() + "(F) est né dans la voliere : " + this.getEnclosResidence().getNom() +"\n";
			}
		}

		return retour;
	}//pondre()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return AigleFemelle.SEXE;
	}//getSexe()

}//AigleFemelle
