package zoo_system;

public class LoupFemelle extends Loup implements MammifereFemelle{
	
	public LoupFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//LoupFemelle()

	public String mettreBas() {
		String retour = "Le bébé est mort, il n'y avait pas assez de place dans l'enclos";
		if(!(this.getEnclosResidence().isFull())){
			double randomLoup = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (0.5 - 0.3), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.2 - 0.1), 1);
			if(randomLoup <= 0.5){
				LoupMale loup = AnimalFactory.getLoupMale(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(loup);
				retour = loup.getNom() + "(M) est né dans la cage : " + this.getEnclosResidence().getNom() +"\n";
			}else{
				LoupFemelle loup = AnimalFactory.getLoupFemelle(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(loup);
				retour = loup.getNom() + "(M) est né dans la cage : " + this.getEnclosResidence().getNom() +"\n";
			}
		}
		return retour;
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return LoupFemelle.SEXE;
	}//getSexe()

}//LoupFemelle
