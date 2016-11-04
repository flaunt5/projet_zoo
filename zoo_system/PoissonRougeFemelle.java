package zoo_system;

public class PoissonRougeFemelle extends PoissonRouge implements AutreFemelle{
	
	private boolean enceinte;
	private static final int periodeEnfantement = 2;
	private int tempEnceinte;
	private static int numPseudo = 0;
	
	/**
	 * Creer un objet de type PoissonRougeFemelle
	 *
	 * @param poids
	 * 				Futur poids du poisson
	 * @param taille
	 * 				Futur taille du poisson
	 * @param age
	 * 				Futur age du poisson
	 * @param pseudo
	 * 				Futur pseudo du poisson
	 * @return un objet de type PoissonRougeFemelle
	 */
	public PoissonRougeFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//PoissonRougeFemelle()

	/**
	 * Creer des bébés poissons rouges
	 * @return Liste des bébés poissons rouges nées et bébés poissons rouges morts
	 */
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
	
	/**
	 * Genere un pseudo pour les poissons rouges femelles
	 * @return Futur nom pour les poissons rouges femelles
	 */
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
	
	/**
	 * Recupere les caracteristiques du poisson rouge femelle
	 * @return Caracteristiques de du poisson rouge femelle
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Période d'incubation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturité sexuelle : " + maturiteSexuelle +"ans";
	}//toString()

	/**
	 * Recupere la valeur de l'attribut SEXE de la classe PoissonRougeFemelle
	 * @return Sexe de poisson rouge femelle
	 */
	public char getSexe(){
		return PoissonRougeFemelle.SEXE;
	}//getSexe()

	/**
	 * Recupere la valeur de l'attribut enceinte
	 * @return Booleen indicant si le poisson rouge femelle est enceinte ou pas
	 */
	public boolean isEnceinte() {
		return this.enceinte;
	}//isEnceinte()

	/**
	 * Modifie la valeur de l'attribut enceinte
	 * @param enceinte
	 * 				Nouvelle etat de grossese
	 */
	public void setEnceinte(boolean enceinte) {
		this.enceinte = enceinte;
	}//setEnceinte()
	
	/**
	 * Retourne la valeur de l'attribut periodeEnfantement
	 * @return Valeur de l'attribut periodeEnfantement
	 */
	public int getPeriodeEnfantement() {
		return periodeEnfantement;
	}//getPeriodegestatiction()

	/**
	 * Retourne la valeur de l'attribut tempEnceinte
	 * @return Valeur de l'attribut tempEnceinte
	 */
	public int getTempEnceinte() {
		return tempEnceinte;
	}//getTempEnceinte()

	/**
	 * Modifie la valeur de l'attribut tempsEnceinte
	 * @param tempsEnceinte
	 * 					Nouveau temps enceinte
	 */
	public void setTempEnceinte(int tempEnceinte) {
		this.tempEnceinte = tempEnceinte;
	}//setTempEnceinte()

	/**
	 * Retourne la valeur de l'attribut numPseudo
	 * @return Numero du pseudo
	 */
	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()

	/**
	 * Modifie la valeur de l'attribut numPseudo
	 * @param numPseudo
	 * 					Nouveau numero du pseudo
	 */
	public static void setNumPseudo(int numPseudo) {
		PoissonRougeFemelle.numPseudo = numPseudo;
	}//setNumPseudo()
}//PoissonRougeFemelle
