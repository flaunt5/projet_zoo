package zoo_animaux.concret;

import zoo_animaux.Male;
import zoo_animaux.Requin;

public class RequinMale extends Requin implements Male<RequinFemelle>{

	private static int numPseudo = 0;
	
	/**
	 * Creer un objet de type RequinMale
	 *
	 * @param poids
	 * 				Futur poids du requin
	 * @param taille
	 * 				Futur taille du requin
	 * @param age
	 * 				Futur age du requin
	 * @param pseudo
	 * 				Futur pseudo du requin
	 * @return un objet de type RequinMale
	 */
	public RequinMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//RequinMale()

	/**
	 * Accouple un requin  male et un requin femelle
	 * @param femelle
	 * 				Requin femelle qui va se faire fecondé
	 * @return Pseudo, nom et sexe du requin femelle fecondé
	 */
	public String saccoupler(RequinFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler
	
	/**
	 * Genere un pseudo pour les requins males
	 * @return Futur nom pour les requins males
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Bruce", "Enclume", "Chumi", "Thrambor", "Glunus", "Sharky", "Kremar"};
		int indice = RequinMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			RequinMale.setNumPseudo(0);
			indice = RequinMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		RequinMale.setNumPseudo(RequinMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe RequinMale
	 * @return Sexe de requin male
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe RequinMale
	 * @return Sexe de requin male
	 */
	public char getSexe(){
		return RequinMale.SEXE;
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
		RequinMale.numPseudo = numPseudo;
	}//setNumPseudo()

}//RequinMale
