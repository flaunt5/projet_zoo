package zoo_system;

public class PingouinFemelle extends Pingouin implements AutreFemelle{
	
	public PingouinFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//PinguoinFemelle()

	public String pondre() {
		String retour = "Le bébé est mort, il n'y avait pas assez de place dans l'enclos";
		if(!(this.getEnclosResidence().isFull())){
			double randomPinguoin = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (0.3 - 0.2), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.2 - 0.1), 1);
			if(randomPinguoin <= 0.5){
				PingouinMale pingouin = AnimalFactory.getPingouinMale(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(pingouin);
				retour = pingouin.getNom() + "(M) est né dans l'aquarium : " + this.getEnclosResidence().getNom() +"\n";
			}else{
				PingouinFemelle pingouin = AnimalFactory.getPingouinFemelle(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(pingouin);
				retour = pingouin.getNom() + "(F) est né dans l'aquarium : " + this.getEnclosResidence().getNom() +"\n";
			}
		}
		return retour;
	}//pondre()

	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return PingouinFemelle.SEXE;
	}//getSexe()
}//PinguoinFemelle
