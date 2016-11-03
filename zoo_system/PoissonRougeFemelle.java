package zoo_system;

public class PoissonRougeFemelle extends PoissonRouge implements AutreFemelle{
	
	private boolean enceinte;
	private static final int periodeEnfantement = 2;
	private int tempEnceinte;
	private static int numPseudo = 0;
	
	public PoissonRougeFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//PoissonRougeFemelle()

	public String pondre() {
		double randomNbBebe = 4 + Math.random() * (10 - 5);
		double nbBebe = this.arrondiDecimals(randomNbBebe, 0);
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour = "Les oeufs de " + this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + 
							") de l'aquarium : " + this.getEnclosResidence().getNom() + " ont éclos : \n";
		String pseudo = "";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					PoissonRougeMale poisson = AnimalFactory.getPoissonRougeMale(randomPoids, randomTaille, PoissonRougeMale.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(poisson);
				}else{
					PoissonRougeFemelle poisson = AnimalFactory.getPoissonRougeFemelle(randomPoids, randomTaille, PoissonRougeFemelle.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(poisson);
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
	}//pondre()
	
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Dorry", "Corail", "Debbie", "Flo", "Astrid", "Perle", "Angie"};
		int indice = PoissonRougeFemelle.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			PoissonRougeFemelle.setNumPseudo(0);
			indice = PoissonRougeFemelle.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		PoissonRougeFemelle.setNumPseudo(PoissonRougeFemelle.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Période d'incubation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturité sexuelle : " + maturiteSexuelle +"ans";
	}//toString()

	public char getSexe(){
		return PoissonRougeFemelle.SEXE;
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
		PoissonRougeFemelle.numPseudo = numPseudo;
	}//setNumPseudo()
}//PoissonRougeFemelle
