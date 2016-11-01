package zoo_system;

public class LoupFemelle extends Loup implements MammifereFemelle{
	
	private boolean enceinte;
	private static final int periodeEnfantement = 3;
	private int tempEnceinte;
	
	public LoupFemelle(double poids, double taille, int age){
		super(poids, taille, age);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//LoupFemelle()

	public String mettreBas() {
		double randomNbBebe = 4 + Math.random() * (8-4);
		double nbBebe = this.arrondiDecimals(randomNbBebe, 0);
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour =  this.getNom() + " de la cage : " + this.getEnclosResidence().getNom() + " � accouch� : \n";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					LoupMale loup = AnimalFactory.getLoupMale(randomPoids, randomTaille);
					this.getEnclosResidence().ajouterAnimal(loup);
				}else{
					LoupFemelle loup = AnimalFactory.getLoupFemelle(randomPoids, randomTaille);
					this.getEnclosResidence().ajouterAnimal(loup);
				}
				++nbBebeNee;
			}else{
				++nbBebeMort;
			}
			--nbBebe;
		}
		this.setEnceinte(false);
		if(nbBebeNee >= 1){
			retour += "\t" + nbBebeNee + " b�b�(s) est/sont n�e dans la cage : " + this.getEnclosResidence().getNom() + "\n";
		}
		if(nbBebeMort >= 1){
			retour += "\t" + nbBebeMort + " b�b�(s) est/sont morts, ils ne pouvaient pas grandir dans une cage pleine\n";
		}
		return retour;
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "P�riode de gestation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturit� sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	public char getSexe(){
		return LoupFemelle.SEXE;
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

}//LoupFemelle
