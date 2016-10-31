package zoo_system;

public class TigreFemelle extends Tigre implements MammifereFemelle{
	
	public TigreFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//TigreFemelle()

	public String mettreBas() {
		String retour = "Le bébé est mort, il n'y avait pas assez de place dans l'enclos";
		if(!(this.getEnclosResidence().isFull())){
			double randomTigre = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (1.6 - 0.7), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (0.5 - 0.3), 1);
			if(randomTigre <= 0.5){
				TigreMale tigre = AnimalFactory.getTigreMale(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(tigre);
				retour = tigre.getNom() + "(F) est né dans la cage : " + this.getEnclosResidence().getNom() +"\n";
			}else{
				TigreFemelle tigre = AnimalFactory.getTigreFemelle(randomPoids, randomTaille);
				this.getEnclosResidence().ajouterAnimal(tigre);
				retour = tigre.getNom() + "(F) est né dans la cage : " + this.getEnclosResidence().getNom() +"\n";
			}
		}
		return retour;
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return TigreFemelle.SEXE;
	}//getSexe()
}//TigreFemelle
