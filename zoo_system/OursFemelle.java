package zoo_system;

public class OursFemelle extends Ours implements MammifereFemelle{
	
	public OursFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//OursFemelle()

	public String mettreBas() {
		String retour = "Le bébé est mort, il n'y avait pas assez de place dans l'enclos";
		if(!(this.getEnclosResidence().isFull())){
			double randomOurs = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (0.7 - 0.4), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.2 - 0.1), 1);
			if(randomOurs <= 0.5){
				OursMale ours = AnimalFactory.getOursMale(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(ours);
				retour = ours.getNom() + "(M) est né dans la cage : " + this.getEnclosResidence().getNom() +"\n";
			}else{
				OursFemelle ours = AnimalFactory.getOursFemelle(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(ours);
				retour = ours.getNom() + "(M) est né dans la cage : " + this.getEnclosResidence().getNom() +"\n";
			}
		}
		return retour;
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return OursFemelle.SEXE;
	}//getSexe()
}//OursFemelle
