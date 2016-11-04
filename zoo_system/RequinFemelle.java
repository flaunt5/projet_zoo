package zoo_system;

public class RequinFemelle extends Requin implements AutreFemelle{
	
	private boolean enceinte;
	private static final int periodeEnfantement = 5;
	private int tempEnceinte;
	private static int numPseudo = 0;
	
	/**
	 * Creer un objet de type RequinFemelle
	 *
	 * @param poids
	 * 				Futur poids du requin
	 * @param taille
	 * 				Futur taille du requin
	 * @param age
	 * 				Futur age du requin
	 * @param pseudo
	 * 				Futur pseudo du requin
	 * @return un objet de type RequinFemelle
	 */
	public RequinFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//RequinFemelle()

	/**
	 * Creer des bébés requin
	 * @return Liste des bébé requin née et bébés requin morts
	 */
	public String pondre() {
		double randomNbBebe = 4 + Math.random() * (8-4);
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
					RequinMale requin = AnimalFactory.getRequinMale(randomPoids, randomTaille, RequinMale.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(requin);
				}else{
					RequinFemelle requin = AnimalFactory.getRequinFemelle(randomPoids, randomTaille, RequinFemelle.getPseudoAnimal());
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

	/**
	 * Genere un pseudo pour les requins femelle
	 * @return Futur nom pour les requins femelle
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Anadrieniel", "Rykela", "Sairalinde", "Zindai", "Valja", "Dakali", "Dronel"};
		int indice = RequinFemelle.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			RequinFemelle.setNumPseudo(0);
			indice = RequinFemelle.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		RequinFemelle.setNumPseudo(RequinFemelle.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristiques du requin femelle
	 * @return Caracteristiques de du requin femelle
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Période d'incubation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturité sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe RequinFemelle
	 * @return Sexe du requin femelle
	 */
	public char getSexe(){
		return RequinFemelle.SEXE;
	}//getSexe()

	/**
	 * Recupere la valeur de l'attribut enceinte
	 * @return Booleen indicant si le requin femelle est enceinte ou pas
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
		RequinFemelle.numPseudo = numPseudo;
	}//setNumPseudo()
}//RequinFemelle
