package zoo_system;

public class BaleineFemelle extends Baleine implements MammifereFemelle{
	
	private boolean enceinte;
	private static final int periodeEnfantement = 4;
	private int tempEnceinte;
	private static int numPseudo = 0;
	
	public BaleineFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//BaleineFemelle()

	public String mettreBas() {
		double nbBebe = 1;
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour =  this.getNom() + " de l'aquarium : " + this.getEnclosResidence().getNom() + " à accouché : \n";
		String pseudo = "";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					BaleineMale baleine = AnimalFactory.getBaleineMale(randomPoids, randomTaille, pseudo);
					this.getEnclosResidence().ajouterAnimal(baleine);
				}else{
					BaleineFemelle baleine = AnimalFactory.getBaleineFemelle(randomPoids, randomTaille, pseudo);
					this.getEnclosResidence().ajouterAnimal(baleine);
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
			retour += "\t" + nbBebeMort + " bébé(s) est/sont morts, ils ne pouvaient pas grandir dans un aquarium plein\n";
		}
		return retour;
	}//mettreBas()
	
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Monsto", "Aurore", "Coquillage", "Floride", "Précieux", "Robin", "Soushi"};
		int indice = BaleineFemelle.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			BaleineFemelle.setNumPseudo(1);
			indice = BaleineFemelle.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		BaleineFemelle.setNumPseudo(BaleineFemelle.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Période de gestation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturité sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	public char getSexe(){
		return BaleineFemelle.SEXE;
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

	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()

	public static void setNumPseudo(int numPseudo) {
		BaleineFemelle.numPseudo = numPseudo;
	}//setNumPseudo()

}//BaleineFemelle
