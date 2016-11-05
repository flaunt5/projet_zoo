package zoo_animaux.concret;

import zoo_animaux.Aigle;
import zoo_animaux.AutreFemelle;
import zoo_animaux.Femelle;
import zoo_factory.AnimalFactory;

public class AigleFemelle extends Aigle implements AutreFemelle{
	
	private boolean enceinte;
	private static final int periodeEnfantement = 2;
	private int tempEnceinte;
	private static int numPseudo = 0;
	
	/**
	 * Construit un objet de type AigleFemelle
	 * @param poids
	 * 				Futur poids de l'aigle
	 * @param taille
	 * 				Futur taille de l'aigle
	 * @param age
	 * 				Futur age de l'aigle
	 * @param pseudo
	 * 				Futur pseudo de l'aigle
	 */
	public AigleFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//AigleFemelle()

	/**
	 * Creer des b�b�s aigles
	 * @return Liste des b�b�s aigles n�es et b�b�s aigles morts
	 */
	public String pondre() {
		double randomNbBebe = 1 + Math.random() * (2-1);
		double nbBebe = this.arrondiDecimals(randomNbBebe, 0);
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour =  "Les oeufs de " + this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + 
							") de la voli�re : " + this.getEnclosResidence().getNom() + " ont �clos : \n";
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
			retour += "\t" + nbBebeNee + " b�b�(s) est/sont n�e dans la voli�re : " + this.getEnclosResidence().getNom() + "\n";
		}
		if(nbBebeMort >= 1){
			retour += "\t" + nbBebeMort + " b�b�(s) est/sont morts, ils ne pouvaient pas grandir dans une voli�re pleine\n";
		}
		return retour;
	}//pondre()
	
	/**
	 * Genere un pseudo pour les aigles femelles
	 * @return Futur nom pour les aigles femelles
	 */
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
	
	/**
	 * Recupere les caracteristiques de l'aigle femelle
	 * @return Caracteristiques de l'aigle femelle
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "P�riode d'incubation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturit� sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe AigleFemelle
	 * @return Sexe de l'aigle femelle
	 */
	public char getSexe(){
		return AigleFemelle.SEXE;
	}//getSexe()

	/**
	 * Recupere la valeur de l'attribut enceinte
	 * @return Booleen indicant si l'aigle femelle est enceinte ou pas
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
		AigleFemelle.numPseudo = numPseudo;
	}//setNumPseudo()

}//AigleFemelle
