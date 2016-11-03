package zoo_system;

public class AigleFemelle extends Aigle implements AutreFemelle{
	
	private boolean enceinte;
	private static final int periodeEnfantement = 2;
	private int tempEnceinte;
	private static int numPseudo = 0;
	
	public AigleFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//AigleFemelle()

	public String pondre() {
		double randomNbBebe = 1 + Math.random() * (2-1);
		double nbBebe = this.arrondiDecimals(randomNbBebe, 0);
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour =  "Les oeufs de " + this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + 
							") de la volière : " + this.getEnclosResidence().getNom() + " ont éclos : \n";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					AigleMale aigle = AnimalFactory.getAigleMale(randomPoids, randomTaille, AigleMale.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(aigle);
				}else{
					AigleFemelle aigle = AnimalFactory.getAigleFemelle(randomPoids, randomTaille, AigleFemelle.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(aigle);
				}
				++nbBebeNee;
			}else{
				++nbBebeMort;
			}
			--nbBebe;
		}
		this.setEnceinte(false);
		if(nbBebeNee >= 1){
			retour += "\t" + nbBebeNee + " bébé(s) est/sont née dans la volière : " + this.getEnclosResidence().getNom() + "\n";
		}
		if(nbBebeMort >= 1){
			retour += "\t" + nbBebeMort + " bébé(s) est/sont morts, ils ne pouvaient pas grandir dans une volière pleine\n";
		}
		return retour;
	}//pondre()
	
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Ayasha", "Chilali", "Etu", "Dyami", "Halona", "Istu", "Muraco"};
		int indice = AigleFemelle.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			AigleFemelle.setNumPseudo(0);
			indice = AigleFemelle.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		AigleFemelle.setNumPseudo(AigleFemelle.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Période d'incubation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturité sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	public char getSexe(){
		return AigleFemelle.SEXE;
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
		AigleFemelle.numPseudo = numPseudo;
	}//setNumPseudo()

}//AigleFemelle
