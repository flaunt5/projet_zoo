package zoo_system;

public class AigleMale extends Aigle implements Male<AigleFemelle>{

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
	 * 				aigle femelle qui va se faire fecond�
	 */
	public String saccoupler(AigleFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") � �t� fecond� par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()
	
	/**
	 * Genere un pseudo pour les aigle male
	 * @return futur nom pour les aigle male
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
	 * Recupere les caracteristique de l'aigle male
	 * @return Caracteristique de l'aigle male
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

	/**
	 * Recupere la valeur de l'attribut SEXE de la classe AigleMale
	 * @return sexe de l'aigle male
	 */
	public char getSexe(){
		return AigleMale.SEXE;
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
		AigleMale.numPseudo = numPseudo;
	}//setNumPseudo()
	
}//AigleMale
