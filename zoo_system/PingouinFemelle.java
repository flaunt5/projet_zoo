package zoo_system;

public class PingouinFemelle extends Pingouin implements AutreFemelle{

	private static int numPseudo = 0;
	private boolean enceinte;
	private static final int periodeEnfantement = 4;
	private int tempEnceinte;
	
	public PingouinFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//PingouinFemelle()

	public String pondre() {
		double nbBebe = 1;
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour = "Les oeufs de " + this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + 
							") de l'aquarium : " + this.getEnclosResidence().getNom() + " ont �clos : \n";
		String pseudo = "";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					PingouinMale pingouin = AnimalFactory.getPingouinMale(randomPoids, randomTaille, PingouinMale.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(pingouin);
				}else{
					PingouinFemelle pingouin = AnimalFactory.getPingouinFemelle(randomPoids, randomTaille, PingouinFemelle.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(pingouin);
				}
				++nbBebeNee;
			}else{
				++nbBebeMort;
			}
			--nbBebe;
		}
		this.setEnceinte(false);
		if(nbBebeNee >= 1){
			retour += "\t" + nbBebeNee + " b�b�(s) est/sont n�e dans l'aquarium : " + this.getEnclosResidence().getNom() + "\n";
		}
		if(nbBebeMort >= 1){
			retour += "\t" + nbBebeMort + " b�b�(s) est/sont morts, ils ne pouvaient pas grandir dans un aquarium plein\n";
		}
		return retour;
	}//pondre()

	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Hatyna", "Baituna", "Sakai", "Oblisesk", "Tukki", "Jalen", "Blaryny"};
		int indice = PingouinFemelle.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			PingouinFemelle.setNumPseudo(0);
			indice = PingouinFemelle.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		PingouinFemelle.setNumPseudo(PingouinFemelle.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "P�riode d'incubation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturit� sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	public char getSexe(){
		return PingouinFemelle.SEXE;
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
		PingouinFemelle.numPseudo = numPseudo;
	}//setNumPseudo()
}//PingouinFemelle
