package zoo_system;

public class LoupFemelle extends Loup implements MammifereFemelle{

	private static int numPseudo = 0;
	private boolean enceinte;
	private static final int periodeEnfantement = 3;
	private int tempEnceinte;
	
	/**
	 * Construit un objet de type LoupFemelle
	 * @param poids
	 * 				Futur poids de la louve
	 * @param taille
	 * 				Futur taille de la louve
	 * @param age
	 * 				Futur age de la louve
	 * @param pseudo
	 * 				Futur pseudo de la louve
	 */
	public LoupFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//LoupFemelle()

	/**
	 * Creer des bébés loups
	 * @return Liste des bébés loups nées et bébés loups morts
	 */
	public String mettreBas() {
		double randomNbBebe = 4 + Math.random() * (8-4);
		double nbBebe = this.arrondiDecimals(randomNbBebe, 0);
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour =  this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + 
							") de la cage : " + this.getEnclosResidence().getNom() + " à accouché : \n";
		String pseudo = "";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					LoupMale loup = AnimalFactory.getLoupMale(randomPoids, randomTaille, LoupMale.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(loup);
				}else{
					LoupFemelle loup = AnimalFactory.getLoupFemelle(randomPoids, randomTaille, LoupFemelle.getPseudoAnimal());
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
			retour += "\t" + nbBebeNee + " bébé(s) est/sont née dans la cage : " + this.getEnclosResidence().getNom() + "\n";
		}
		if(nbBebeMort >= 1){
			retour += "\t" + nbBebeMort + " bébé(s) est/sont morts, ils ne pouvaient pas grandir dans une cage pleine\n";
		}
		return retour;
	}//mettreBas()
	
	/**
	 * Genere un pseudo pour les loups femelles
	 * @return futur nom pour les loups femelles
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Lady", "Nimeria", "Amaterasu", "Moro", "Yuma", "Azur", "Neige"};
		int indice = LoupFemelle.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			LoupFemelle.setNumPseudo(0);
			indice = LoupFemelle.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		LoupFemelle.setNumPseudo(LoupFemelle.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristiques du loup femelle
	 * @return Caracteristiques du loup femelle
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Période de gestation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturité sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe LoupFemelle
	 * @return Sexe de loup femelle
	 */
	public char getSexe(){
		return LoupFemelle.SEXE;
	}//getSexe()

	/**
	 * Recupere la valeur de l'attribut enceinte
	 * @return Booleen indicant si le loup femelle est enceinte ou pas
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
		LoupFemelle.numPseudo = numPseudo;
	}//setNumPseudo()

}//LoupFemelle
