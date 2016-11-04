package zoo_system;

public class PingouinFemelle extends Pingouin implements AutreFemelle{

	private static int numPseudo = 0;
	private boolean enceinte;
	private static final int periodeEnfantement = 4;
	private int tempEnceinte;
	
	/**
	 * Creer un objet de type PinguoinFemelle
	 *
	 * @param poids
	 * 				Futur poids du pinguoin
	 * @param taille
	 * 				Futur taille du pinguoin
	 * @param age
	 * 				Futur age du pinguoin
	 * @param pseudo
	 * 				Futur pseudo du pinguoin
	 */
	public PingouinFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//PingouinFemelle()

	/**
	 * Creer des bébés pingouins
	 * @return Liste des bébés pingouins nées et bébés pingouin morts
	 */
	public String pondre() {
		double nbBebe = 1;
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
			retour += "\t" + nbBebeNee + " bébé(s) est/sont née dans l'aquarium : " + this.getEnclosResidence().getNom() + "\n";
		}
		if(nbBebeMort >= 1){
			retour += "\t" + nbBebeMort + " bébé(s) est/sont morts, ils ne pouvaient pas grandir dans un aquarium plein\n";
		}
		return retour;
	}//pondre()

	/**
	 * Genere un pseudo pour les pingouins femelles
	 * @return Futur nom pour les pingouins femelles
	 */
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
	
	/**
	 * Recupere les caracteristiques du pingouin femelle
	 * @return Caracteristiques du pingouin femelle
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Période d'incubation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturité sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe PingouinFemelle
	 * @return sexe du pingouin
	 */
	public char getSexe(){
		return PingouinFemelle.SEXE;
	}//getSexe()

	/**
	 * Recupere la valeur de l'attribut enceinte
	 * @return Booleen indicant si le pingouin femelle est enceinte ou pas
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
		PingouinFemelle.numPseudo = numPseudo;
	}//setNumPseudo()
}//PingouinFemelle
