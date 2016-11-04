package zoo_system;

public class PoissonRougeMale extends PoissonRouge implements Male<PoissonRougeFemelle>{

	private static int numPseudo = 0;
	
	/**
	 * Creer un objet de type PoissonRougeFemelle
	 *
	 * @param poids
	 * 				Futur poids du poisson
	 * @param taille
	 * 				Futur taille du poisson
	 * @param age
	 * 				Futur age du poisson
	 * @param pseudo
	 * 				Futur pseudo du poisson
	 * @return un objet de type PoissonRougeMale
	 */
	public PoissonRougeMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//PoissonRougeMale()

	/**
	 * Accouple un poisson rouge male et un poisson rouge femelle
	 * @param femelle
	 * 				poisson rouge femelle qui va se faire fecondé
	 */
	public String saccoupler(PoissonRougeFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler
	
	/**
	 * Genere un pseudo pour les poisson rouge males
	 * @return futur nom pour les poisson rouge males
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Nemo", "Marin", "Bubbles", "Boule", "Gargouille", "Blenny", "Gill"};
		int indice = PoissonRougeMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			PoissonRougeMale.setNumPseudo(0);
			indice = PoissonRougeMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		PoissonRougeMale.setNumPseudo(PoissonRougeMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristique du poisson rouge male
	 * @return Caracteristique du poisson rouge male
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe PoissonRougeMale
	 * @return sexe du poisson rouge male
	 */
	public char getSexe(){
		return PoissonRougeMale.SEXE;
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
		PoissonRougeMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//PoissonRougeMale
