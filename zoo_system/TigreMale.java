package zoo_system;

public class TigreMale extends Tigre implements Male<TigreFemelle>{
	
	private static int numPseudo = 0;
	
	/**
	 * Creer un objet de type TigreMale
	 * @param poids
	 * @param taille
	 * @param age
	 * @param pseudo
	 */
	public TigreMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//TigreMale()
	
	/**
	 * Accoupler le tigre avec une tigresse
	 * @param femelle
	 * @return String content le nom du tigresse fecondé
	 */
	public String saccoupler(TigreFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") � �t� fecond� par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()
	
	/**
	 * recupèrer le nom de l'animal
	 * @return String le nom
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
	 * retoruner les details du tigre
	 * @return string contenant les details
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	/**
	 * retourner le sexe du tigre
	 * @return attribut sexe du tigre
	 */
	public char getSexe(){
		return TigreMale.SEXE;
	}//getSexe()

	/**
	 * recuperer le numéro permettant de determiner le nom du tigre
	 * @return retourne un int content le numero
	 */
	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()
	
	/**
	 * Modifier le numéro de pseudo
	 * @param numPseudo
	 */
	public static void setNumPseudo(int numPseudo) {
		TigreMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//TigreMale
