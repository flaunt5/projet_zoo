package zoo_animaux.concret;

import zoo_animaux.Male;
import zoo_animaux.Tigre;

public class TigreMale extends Tigre implements Male<TigreFemelle>{
	
	private static int numPseudo = 0;
	
	/**
	 * Creer un objet de type TigreMale
	 * @param poids
	 * 				Futur poids du tigre
	 * @param taille
	 * 				Futur taille du tigre
	 * @param age
	 * 				Futur age du tigre
	 * @param pseudo
	 * 				Futur pseudo du tigre
	 */
	public TigreMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//TigreMale()
	
	/**
	 * Accoupler le tigre male avec un tigre femelle
	 * @param femelle
	 * 				Tigre femelle qui va se faire fecondé
	 * @return Pseudo, nom et sexe du tigre femelle fecondé
	 */
	public String saccoupler(TigreFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") a été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()
	

	/**
	 * Genere un pseudo pour les tigres males
	 * @return Futur nom pour les tigres males
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Tigrou", "Shere Khan", "Rajah", "Oliver", "Garfield", "Tiger", "Simba"};
		int indice = TigreMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			TigreMale.setNumPseudo(0);
			indice = TigreMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		TigreMale.setNumPseudo(TigreMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristiques du tigre male
	 * @return Caracteristiques du tigre male
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe TigreMale
	 * @return Sexe du tigre male
	 */
	public char getSexe(){
		return TigreMale.SEXE;
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
		TigreMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//TigreMale
