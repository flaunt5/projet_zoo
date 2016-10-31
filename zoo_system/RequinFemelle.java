package zoo_system;

public class RequinFemelle extends Requin implements AutreFemelle{
	
	public RequinFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//RequinFemelle()

	public String pondre() {
		String retour = "Le bébé est mort, il n'y avait pas assez de place dans l'enclos";
		if(!(this.getEnclosResidence().isFull())){
			double randomRequin = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
			if(randomRequin <= 0.5){
				RequinMale requin = AnimalFactory.getRequinMale(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(requin);
				retour = requin.getNom() + "(M) est né dans l'aquarium : " + this.getEnclosResidence().getNom() +"\n";
			}else{
				RequinFemelle requin = AnimalFactory.getRequinFemelle(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(requin);
				retour = requin.getNom() + "(M) est né dans l'aquarium : " + this.getEnclosResidence().getNom() +"\n";
			}
		}	
		return retour;
	}//pondre()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return RequinFemelle.SEXE;
	}//getSexe()

}//RequinFemelle
