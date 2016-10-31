package zoo_system;

public class BaleineFemelle extends Baleine implements MammifereFemelle{
	
	public BaleineFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//BaleineFemelle()

	public String mettreBas() {
		String retour = "Le bébé est mort, il n'y avait pas assez de place dans l'enclos";
		if(!(this.getEnclosResidence().isFull())){
			double randomBaleine = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (3000 - 2500), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (7 - 5), 1);
			if(randomBaleine <= 0.5){
				BaleineMale baleine = AnimalFactory.getBaleineMale(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(baleine);
				retour = baleine.getNom() + "(M) est né dans l'aquarium : " + this.getEnclosResidence().getNom() +"\n";
			}else{
				BaleineFemelle baleine = AnimalFactory.getBaleineFemelle(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(baleine);
				retour = baleine.getNom() + "(F) est né dans l'aquarium : " + this.getEnclosResidence().getNom() +"\n";
			}
		}
		return retour;
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return BaleineFemelle.SEXE;
	}//getSexe()

}//BaleineFemelle
