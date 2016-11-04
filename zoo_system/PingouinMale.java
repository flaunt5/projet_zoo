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
	 * 				pingouin femelle qui va se faire fecond�
	 */
	public String saccoupler(PingouinFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") � �t� fecond� par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()

	/**
	 * Genere un pseudo pour les pingouins males
	 * @return futur nom pour les pingouins males
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
	 * Recupere les caracteristique de pingouins male
	 * @return Caracteristique de pingouins male
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe PingouinMale
	 * @return sexe de pingouins male
	 */
	public char getSexe(){
		return PingouinMale.SEXE;
	}//getSexe()

	/**
	 * retourne la valeur de l'attribut numPseudo
	 * @return numero du pseudo
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
