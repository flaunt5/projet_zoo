package zoo_system;

public class TigreFemelle extends Tigre implements MammifereFemelle{
	
	private boolean enceinte;
	private static final int periodeEnfantement = 3;
	private int tempEnceinte;
	
	public TigreFemelle(double poids, double taille, int age){
		super(poids, taille, age);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//TigreFemelle()

	public String mettreBas() {
		double randomNbBebe = 2 + Math.random() * (5 - 2);
		double nbBebe = this.arrondiDecimals(randomNbBebe, 0);
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour = this.getNom() + " de la cage : " + this.getEnclosResidence().getNom() + " à accouché : \n";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					TigreMale tigre = AnimalFactory.getTigreMale(randomPoids, randomTaille);
					this.getEnclosResidence().ajouterAnimal(tigre);
				}else{
					TigreFemelle tigre = AnimalFactory.getTigreFemelle(randomPoids, randomTaille);
					this.getEnclosResidence().ajouterAnimal(tigre);
				}
				++nbBebeNee;
			}else{
				++nbBebeMort;
			}
			--nbBebe;
		}
		this.setEnceinte(false);
		if(nbBebeNee >= 1){
			retour += "\t" + nbBebeNee + " bébé(s) est/sont née dans la cage : " + this.getEnclosResidence().getNom() + "\n";
		}
		if(nbBebeMort >= 1){
			retour += "\t" + nbBebeMort + " bébé(s) est/sont morts, il(s) ne pouvaient pas grandir dans une cage pleine\n";
		}
		return retour;
	}//mettreBas()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Période d'incubation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturité sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	public char getSexe(){
		return TigreFemelle.SEXE;
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
}//TigreFemelle
