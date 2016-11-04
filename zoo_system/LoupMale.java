package zoo_system;

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
	 * 				loup femelle qui va se faire fecondé
	 */
	public String saccoupler(LoupFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()

	/**
	 * Genere un pseudo pour les loup male
	 * @return futur nom pour les loup male
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
	 * Recupere les caracteristique du loup male
	 * @return Caracteristique du loup male
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe LoupMale
	 * @return sexe du loup male
	 */
	public char getSexe(){
		return LoupMale.SEXE;
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
		LoupMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//LoupMale
