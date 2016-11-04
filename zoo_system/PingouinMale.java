package zoo_system;

public class PingouinMale extends Pingouin implements Male<PingouinFemelle>{

	private static int numPseudo = 0;
	
	/**
	 * Creer un objet de type PinguoinMale
	 *
	 * @param poids
	 * 				Futur poids du pinguoin
	 * @param taille
	 * 				Futur taille du pinguoin
	 * @param age
	 * 				Futur age du pinguoin
	 * @param pseudo
	 * 				Futur pseudo du pinguoin
	 * @return un objet de type PinguoinMale
	 */
	public PingouinMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//PinguoinMale()

	/**
	 * Accouple un pingouin male et un pingouin femelle
	 * @param femelle
	 * 				Pingouin femelle qui va se faire fecondé
	 * @return Pseudo, nom et sexe du pingouin femelle fecondé
	 */
	public String saccoupler(PingouinFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()

	/**
	 * Genere un pseudo pour les pingouins males
	 * @return Futur nom pour les pingouins males
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Skipper", "Kowalski", "Soldat", "Rico", "Cobblepot", "Pingou", "Tiplouf"};
		int indice = PingouinMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			PingouinMale.setNumPseudo(0);
			indice = PingouinMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		PingouinMale.setNumPseudo(PingouinMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristiques de pingouins males
	 * @return Caracteristiques de pingouins males
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe PingouinMale
	 * @return Sexe de pingouins male
	 */
	public char getSexe(){
		return PingouinMale.SEXE;
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
		PingouinMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//PingouinMale
