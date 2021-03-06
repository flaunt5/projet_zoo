package zoo_animaux.concret;

import zoo_animaux.Baleine;
import zoo_animaux.Male;

/**
 *	BaleineMale est la classe qui represente une baleine de sexe  masculin
 * @author Alexandre
 *
 */
public class BaleineMale extends Baleine implements Male<BaleineFemelle>{
	
	/**
	 * Numero du pseudo de la baleine
	 */
	private static int numPseudo = 0;
	
	/**
	 * Creer un objet de type BaleineMale
	 *
	 * @param poids
	 * 				Futur poids de la baleine
	 * @param taille
	 * 				Futur taille de la baleine
	 * @param age
	 * 				Futur age de la baleine
	 * @param pseudo
	 * 				Futur pseudo de la baleine
	 */
	public BaleineMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//BaleineMale()

	/**
	 * Accouple une baleine male et une baleine femelle
	 * @param femelle
	 * 				Baleine femelle qui va se faire fecond�
	 * @return Pseudo, nom et sexe de la baleine femelle fecond�
	 */
	public String saccoupler(BaleineFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") � �t� fecond� par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()
	
	/**
	 * Genere un pseudo pour les baleine male
	 * @return Futur nom pour baleine male
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Barbe Blanche", "Moby Dick", "Atlas", "Fliper", "Willy", "C�sar", "Wailord"};
		int indice = BaleineMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			BaleineMale.setNumPseudo(0);
			indice = BaleineMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		BaleineMale.setNumPseudo(BaleineMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristique de la baleine male
	 * @return Caracteristique de la baleine male
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe BaleineMale
	 * @return Sexe de l'aigle male
	 */
	public char getSexe(){
		return BaleineMale.SEXE;
	}//getSexe()

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
		BaleineMale.numPseudo = numPseudo;
	}//setNumPseudo()

}//BaleineMale