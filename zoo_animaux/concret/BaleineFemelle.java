package zoo_animaux.concret;

import zoo_animaux.Baleine;
import zoo_animaux.Femelle;
import zoo_animaux.MammifereFemelle;
import zoo_factory.AnimalFactory;

/**
 * BaleineFemelle est la classe qui represente une baleine de sexe  féminin
 * @author Alexandre
 *
 */
public class BaleineFemelle extends Baleine implements MammifereFemelle{
	
	/**
	 * Indication pour savoir si la baleine est enceinte 
	 */
	private boolean enceinte;
	
	/**
	 * Periode pendant laquel la baleine attends avant d'accoucher
	 */
	private static final int periodeEnfantement = 4;
	
	/**
	 * Temps ecroulé depuis le moment où la baleine à été fécondé
	 */
	private int tempEnceinte;

	/**
	 * Numero du pseudo de la baleine
	 */
	private static int numPseudo = 0;
	
	/**
	 * Construit un objet de type BaleineFemelle
	 * @param poids
	 * 				Futur poids de la baleine
	 * @param taille
	 * 				Futur taille de la baleine
	 * @param age
	 * 				Futur age de la baleine
	 * @param pseudo
	 * 				Futur pseudo de la baleine
	 */
	public BaleineFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//BaleineFemelle()

	/**
	 * Creer des bébés baleines
	 * @return Liste des bébés baleines nées et bébés baleines morts
	 */
	public String mettreBas() {
		double nbBebe = 1;
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour =  this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + 
							") de l'aquarium : " + this.getEnclosResidence().getNom() + " à accouché : \n";
		String pseudo = "";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					BaleineMale baleine = AnimalFactory.getBaleineMale(randomPoids, randomTaille, BaleineMale.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(baleine);
				}else{
					BaleineFemelle baleine = AnimalFactory.getBaleineFemelle(randomPoids, randomTaille, BaleineFemelle.getPseudoAnimal());
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
	
	/**
	 * Genere un pseudo pour les baleines femelles
	 * @return Futur nom pour les baleines femelles
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Monsto", "Aurore", "Coquillage", "Floride", "Précieux", "Robin", "Soushi"};
		int indice = BaleineFemelle.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			BaleineFemelle.setNumPseudo(0);
			indice = BaleineFemelle.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		BaleineFemelle.setNumPseudo(BaleineFemelle.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristique de la baleine femelle
	 * @return Caracteristique de la baleine femelle
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Période de gestation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturité sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe BaleineFemelle
	 * @return Sexe de la baleine femelle
	 */
	public char getSexe(){
		return BaleineFemelle.SEXE;
	}//getSexe()

	/**
	 * Recupere la valeur de l'attribut enceinte
	 * @return Booleen indicant si la baleine femelle est enceinte ou pas
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
	public void setTempEnceinte(int tempsEnceinte) {
		this.tempEnceinte = tempEnceinte;
	}//setTempEnceinte()

	/**
	 * retourne la valeur de l'attribut numPseudo
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
		BaleineFemelle.numPseudo = numPseudo;
	}//setNumPseudo()

}//BaleineFemelle
