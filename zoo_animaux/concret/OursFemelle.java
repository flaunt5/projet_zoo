package zoo_animaux.concret;

import zoo_animaux.Femelle;
import zoo_animaux.MammifereFemelle;
import zoo_animaux.Ours;
import zoo_factory.AnimalFactory;

/**
 * OursFemelle est la classe qui represente un ours de sexe  féminin
 * @author Alexandre
 *
 */
public class OursFemelle extends Ours implements MammifereFemelle{
	
	/**
	 * Indication pour savoir si l'ours est enceinte 
	 */
	private boolean enceinte;
	
	/**
	 * Periode pendant laquel l'ours attends avant d'accoucher
	 */
	private static final int periodeEnfantement = 3;
	
	/**
	 * Temps ecroulé depuis le moment où l'ours à été fécondé
	 */
	private int tempEnceinte;

	/**
	 * Numero du pseudo de l'ours
	 */
	private static int numPseudo = 0;
	
	/**
	 * Creer un objet de type OursFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'ours
	 * @param taille
	 * 				Futur taille de l'ours
	 * @param age
	 * 				Futur age de l'ours
	 * @param pseudo
	 * 				Futur pseudo de l'ours
	 */
	public OursFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//OursFemelle()

	/**
	 * Creer des bébés ours
	 * @return Liste des bébés ours née et bébés ours morts
	 */
	public String mettreBas() {
		double randomNbBebe = 1 + Math.random() * (4-1);
		double nbBebe = this.arrondiDecimals(randomNbBebe, 0);
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour = this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + 
							") de la cage : " + this.getEnclosResidence().getNom() + " à accouché : \n";
		String pseudo = "";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					OursMale ours = AnimalFactory.getOursMale(randomPoids, randomTaille, OursMale.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(ours);
				}else{
					OursFemelle ours = AnimalFactory.getOursFemelle(randomPoids, randomTaille, OursFemelle.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(ours);
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
	 * Genere un pseudo pour les ours femelles
	 * @return Futur nom pour les ours femelles
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Chocolat", "Pyros", "Bambou", "Gaïa", "Bisounours", "Alyssa", "Angel"};
		int indice = OursFemelle.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			OursFemelle.setNumPseudo(0);
			indice = OursFemelle.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		OursFemelle.setNumPseudo(OursFemelle.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristiques de l'ours femelle
	 * @return Caracteristiques de l'ours femelle
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "Période de gestation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturité sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe OursFemelle
	 * @return Sexe de l'ours femelle
	 */
	public char getSexe(){
		return OursFemelle.SEXE;
	}//getSexe()

	/**
	 * Recupere la valeur de l'attribut enceinte
	 * @return Booleen indicant si l'ours femelle est enceinte ou pas
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
		OursFemelle.numPseudo = numPseudo;
	}//setNumPseudo()
}//OursFemelle
