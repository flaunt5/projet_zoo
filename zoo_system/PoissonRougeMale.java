package zoo_system;

public class PoissonRougeMale extends PoissonRouge implements Male<PoissonRougeFemelle>{

	private static int numPseudo = 0;
	
	/**
	 * Creer un objet de type PoissonRougeMale
	 *
	 * @param poids
	 * 				Futur poids du poisson
	 * @param taille
	 * 				Futur taille du poisson
	 * @param age
	 * 				Futur age du poisson
	 * @param pseudo
	 * 				Futur pseudo du poisson
	 */
	public PoissonRougeMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//PoissonRougeMale()

	/**
	 * Accouple un poisson rouge male et un poisson rouge femelle
	 * @param femelle
	 * 				Poisson rouge femelle qui va se faire fecondé
	 * @return Pseudo, nom et sexe du poisson rouge femelle fecondé
	 */
	public String saccoupler(PoissonRougeFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler
	
	/**
	 * Genere un pseudo pour les poissons rouges males
	 * @return Futur nom pour les poissons rouges males
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
	 * Recupere les caracteristiques du poisson rouge male
	 * @return Caracteristiques du poisson rouge male
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe PoissonRougeMale
	 * @return Sexe du poisson rouge male
	 */
	public char getSexe(){
		return PoissonRougeMale.SEXE;
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
		PoissonRougeMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//PoissonRougeMale
