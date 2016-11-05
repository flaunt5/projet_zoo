package zoo_animaux.concret;

import zoo_animaux.Loup;
import zoo_animaux.Male;

public class LoupMale extends Loup implements Male<LoupFemelle>{

	private static int numPseudo = 0;
	
	/**
	 * Construit un objet de type LoupMale
	 * @param poids
	 * 				Futur poids du loup
	 * @param taille
	 * 				Futur taille du loup
	 * @param age
	 * 				Futur age du loup
	 * @param pseudo
	 * 				Futur pseudo du loup
	 */
	public LoupMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//LoupMale()
	
	/**
	 * Accouple un loup male et un loup femelle
	 * @param femelle
	 * 				Loup femelle qui va se faire fecondé
	 * @return Pseudo, nom et sexe du loup femelle fecondé
	 */
	public String saccoupler(LoupFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()

	/**
	 * Genere un pseudo pour les loups males
	 * @return Futur nom pour les loups males
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Vent Gris", "Wolf Link", "Eté", "Fantôme", "Broussaille", "Akela", "Wolf O'Donnell"};
		int indice = LoupMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			LoupMale.setNumPseudo(0);
			indice = LoupMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		LoupMale.setNumPseudo(LoupMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristiques du loup male
	 * @return Caracteristiques du loup male
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe LoupMale
	 * @return Sexe du loup male
	 */
	public char getSexe(){
		return LoupMale.SEXE;
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
		LoupMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//LoupMale
