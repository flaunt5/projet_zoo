package zoo_system;

public class RequinFemelle extends Requin implements AutreFemelle{
	
	private boolean enceinte;
	private static final int periodeEnfantement = 5;
	private int tempEnceinte;
	
	public RequinFemelle(double poids, double taille, int age){
		super(poids, taille, age);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//RequinFemelle()

	public String pondre() {
		double randomNbBebe = 4 + Math.random() * (8-4);
		double nbBebe = this.arrondiDecimals(randomNbBebe, 0);
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour = "Les oeufs de " + this.getNom() + " de l'aquarium : " + this.getEnclosResidence().getNom() + " ont éclos : \n";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					RequinMale requin = AnimalFactory.getRequinMale(randomPoids, randomTaille);
					this.getEnclosResidence().ajouterAnimal(requin);
				}else{
					RequinFemelle requin = AnimalFactory.getRequinFemelle(randomPoids, randomTaille);
					this.getEnclosResidence().ajouterAnimal(requin);
				}
				++nbBebeNee;
			}else{
				++nbBebeMort;
			}
			--nbBebe;
		}
		this.setEnceinte(false);
		if(nbBebeNee >= 1){
			retour += "\t" + nbBebeNee + " bébé(s) est/sont née dans l'aquarium : " + this.getEnclosResidence().getNom() + "\n";
		}
		if(nbBebeMort >= 1){
			retour += "\t" + nbBebeMort + " bébé(s) est/sont morts, il(s) ne pouvaient pas grandir dans un aquarium plein\n";
		}
		return retour;
	}//pondre()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Période d'incubation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturité sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	public char getSexe(){
		return RequinFemelle.SEXE;
	}//getSexe()

	public boolean isEnceinte() {
		return this.enceinte;
	}//isEnceinte()

	public void setEnceinte(boolean enceinte) {
		this.enceinte = enceinte;
	}//setEnceinte()
	
	public int getPeriodeEnfantement() {
		return periodeEnfantement;
	}//getPeriodegestatiction()

	public int getTempEnceinte() {
		return tempEnceinte;
	}//getTempEnceinte()

	public void setTempEnceinte(int tempEnceinte) {
		this.tempEnceinte = tempEnceinte;
	}//setTempEnceinte()
}//RequinFemelle
