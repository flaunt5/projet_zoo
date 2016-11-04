package zoo_system;

public class OursMale extends Ours implements Male<OursFemelle>{
	
	private static int numPseudo = 0;
	
	/**
	 * Construit un objet de type LoupMale
	 * @param poids
	 * 				Futur poids de l'ours
	 * @param taille
	 * 				Futur taille de l'ours
	 * @param age
	 * 				Futur age de l'ours
	 * @param pseudo
	 * 				Futur pseudo de l'ours
	 */
	public OursMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//OursMale()

	/**
	 * Accouple un ours male et un ours femelle
	 * @param femelle
	 * 				ours femelle qui va se faire fecondé
	 */
	public String saccoupler(OursFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()
	
	/**
	 * Genere un pseudo pour les ours male
	 * @return futur nom pour les ours male
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Winnie", "Nounours", "Baloo", "Ted", "Petit Jean", "Kenaï", "Pedobear"};
		int indice = OursMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			OursMale.setNumPseudo(0);
			indice = OursMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		OursMale.setNumPseudo(OursMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Recupere les caracteristique de l'ours male
	 * @return Caracteristique de l'ours male
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	/**
	 * Recupere la valeur de l'attribut SEXE de la classe OursMale
	 * @return sexe de l'ours male
	 */
	public char getSexe(){
		return OursMale.SEXE;
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
		OursMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//OursMale
