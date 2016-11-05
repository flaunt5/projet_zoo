package zoo_animaux.concret;

import zoo_animaux.Aigle;
import zoo_animaux.Male;

/**
 *	AigleMale est la classe qui represente un aigle de sexe  masculin
 * @author Alexandre
 *
 */
public class AigleMale extends Aigle implements Male<AigleFemelle>{
	
	/**
	 * Numero du pseudo de l'aigle
	 */
	private static int numPseudo = 0;
	
	/**
	 * Construit un objet de type AigleMale
	 * @param poids
	 * 				Futur poids de l'aigle
	 * @param taille
	 * 				Futur taille de l'aigle
	 * @param age
	 * 				Futur age de l'aigle
	 * @param pseudo
	 * 				Futur pseudo de l'aigle
	 */
	public AigleMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//AigleMale()
	
	/**
	 * Accouple un aigle male et un aigle femelle
	 * @param femelle
	 * 				Aigle femelle qui va se faire feconder
	 * @return Pseudo, nom et sexe de l'aigle femelle fecondé
	 */
	public String saccoupler(AigleFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()
	
	/**
	 * Genere un pseudo pour les aigles males
	 * @return Futur nom pour les aigles males
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Amadahy", "Anoki", "Kaepora", "Aranck", "Bidziil", "Chilam", "Noarfang"};
		int indice = AigleMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			AigleMale.setNumPseudo(0);
			indice = AigleMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		AigleMale.setNumPseudo(AigleMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristiques de l'aigle male
	 * @return Caracteristiques de l'aigle male
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

	/**
	 * Recupere la valeur de l'attribut SEXE de la classe AigleMale
	 * @return Sexe de l'aigle male
	 */
	public char getSexe(){
		return AigleMale.SEXE;
	}//getSexe()

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
		AigleMale.numPseudo = numPseudo;
	}//setNumPseudo()
	
}//AigleMale
