package zoo_system;

public class RequinFemelle extends Requin implements AutreFemelle{
	
	public RequinFemelle(double poids, double taille, int age){
		super(poids, taille, age);
	}//RequinFemelle()

	public void pondre() {
		if(!(this.getEnclosResidence().isFull())){
			double randomRequin = Math.random();
			double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
			double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
			if(randomRequin <= 0.5){
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getRequinMale(randomPoids, randomTaille));
			}else{
				this.getEnclosResidence().ajouterAnimal(AnimalFactory.getRequinFemelle(randomPoids, randomTaille));
			}
		}	
	}//pondre()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return RequinFemelle.SEXE;
	}//getSexe()

}//RequinFemelle
