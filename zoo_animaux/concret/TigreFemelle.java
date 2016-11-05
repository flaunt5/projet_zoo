package zoo_animaux.concret;

import zoo_animaux.Femelle;
import zoo_animaux.MammifereFemelle;
import zoo_animaux.Tigre;
import zoo_factory.AnimalFactory;

/**
 *	TigreFemelle est la classe qui represente un tigre de sexe  féminin
 * @author Alexandre
 *
 */
public class TigreFemelle extends Tigre implements MammifereFemelle{
	
	/**
	 * Indication pour savoir si le tigre est enceinte 
	 */
	private boolean enceinte;
	
	/**
	 * Periode pendant laquel le tigre attends avant d'accoucher
	 */
	private static final int periodeEnfantement = 3;
	
	/**
	 * Temps ecroulé depuis le moment où le tigre à été fécondé
	 */
	private int tempEnceinte;

	/**
	 * Numero du pseudo du tigre
	 */
	private static int numPseudo = 0;
	
	/**
	 * creer un nouvel objet de type TigreFemelle
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
	public TigreFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//TigreFemelle()
	
	/**
	 * Creer des bébés tigres
	 * @return Liste des bébés tigres nées et bébés tigres morts
	 */
	public String mettreBas() {
		double randomNbBebe = 2 + Math.random() * (5 - 2);
		double nbBebe = this.arrondiDecimals(randomNbBebe, 0);
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour = this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + 
				")  de la cage : " + this.getEnclosResidence().getNom() + " à accouché : \n";
		String pseudo = "";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					TigreMale tigre = AnimalFactory.getTigreMale(randomPoids, randomTaille, TigreMale.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(tigre);
				}else{
					TigreFemelle tigre = AnimalFactory.getTigreFemelle(randomPoids, randomTaille, TigreFemelle.getPseudoAnimal());
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
			retour += "\t" + nbBebeMort + " bébés) est/sont morts, il(s) ne pouvaient pas grandir dans une cage pleine\n";
		}
		return retour;
	}//mettreBas()
	
	/**
	 * Genere un pseudo pour les tigres femelles
	 * @return Futur nom pour les tigres femelles
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Tigresse", "Blanche", "Pandore", "Ruby", "Fedora", "Duchesse", "Grisemine"};
		int indice = TigreFemelle.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			TigreFemelle.setNumPseudo(0);
			indice = TigreFemelle.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		TigreFemelle.setNumPseudo(TigreFemelle.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristiques du tigre femelle
	 * @return Caracteristiques du tigre femelle
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Pï¿½riode d'incubation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturitï¿½ sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe TigreFemelle
	 * @return Sexe du tigre femelle
	 */
	public char getSexe(){
		return TigreFemelle.SEXE;
	}//getSexe()
	
	/**
	 * Recupere la valeur de l'attribut enceinte
	 * @return Booleen indicant si le tigre femelle est enceinte ou pas
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
		TigreFemelle.numPseudo = numPseudo;
	}//setNumPseudo()
}//TigreFemelle
