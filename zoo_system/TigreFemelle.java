package zoo_system;

public class TigreFemelle extends Tigre implements MammifereFemelle{
	
	private boolean enceinte;
	private static final int periodeEnfantement = 3;
	private int tempEnceinte;
	private static int numPseudo = 0;
	
	/**
	 * creer un nouvel objet de type TigreFemelle
	 * @param poids
	 * @param taille
	 * @param age
	 * @param pseudo
	 */
	public TigreFemelle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.enceinte = false;
		this.tempEnceinte = 0;
	}//TigreFemelle()
	
	/**
	 * creer un nouveau tigre, vérifier si l'enclos n'est pas rempli, si non le rajouter, si oui le detruire
	 * @return string content un message avec le nom de la tigresse ayant mis bas
	 */
	public String mettreBas() {
		double randomNbBebe = 2 + Math.random() * (5 - 2);
		double nbBebe = this.arrondiDecimals(randomNbBebe, 0);
		int nbBebeNee = 0;
		int nbBebeMort = 0;
		String retour = this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + 
				")  de la cage : " + this.getEnclosResidence().getNom() + " � accouch� : \n";
		String pseudo = "";
		while(nbBebe != 0){
			if(!(this.getEnclosResidence().isFull())){
				double randomRequin = Math.random();
				double randomPoids = this.arrondiDecimals(Math.random() * (18 - 15), 1);
				double randomTaille = this.arrondiDecimals(Math.random() * (1.5 - 1.3), 1);
				if(randomRequin <= 0.5){
					TigreMale tigre = AnimalFactory.getTigreMale(randomPoids, randomTaille, TigreMale.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(tigre);
				}else{
					TigreFemelle tigre = AnimalFactory.getTigreFemelle(randomPoids, randomTaille, TigreFemelle.getPseudoAnimal());
					this.getEnclosResidence().ajouterAnimal(tigre);
				}
				++nbBebeNee;
			}else{
				++nbBebeMort;
			}
			--nbBebe;
		}
		this.setEnceinte(false);
		if(nbBebeNee >= 1){
			retour += "\t" + nbBebeNee + " b�b�(s) est/sont n�e dans la cage : " + this.getEnclosResidence().getNom() + "\n";
		}
		if(nbBebeMort >= 1){
			retour += "\t" + nbBebeMort + " b�b�(s) est/sont morts, il(s) ne pouvaient pas grandir dans une cage pleine\n";
		}
		return retour;
	}//mettreBas()
	
	/**
	 * recuperer le nom de la tigresse
	 * @return string contenant le nom de la tigresse
	 */
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Tigresse", "Blanche", "Pandore", "Ruby", "Fedora", "Duchesse", "Grisemine"};
		int indice = TigreFemelle.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			TigreFemelle.setNumPseudo(0);
			indice = TigreFemelle.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		TigreFemelle.setNumPseudo(TigreFemelle.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	/**
	 * Transforme les attributs de la tigresse en string
	 * @return String contentant les détails de la tigresse
	 */
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Femelle.SEXE + " ; Enclos residence : " + enclosResidence.getNom() 
				+ " ; Enceinte : " + this.convertBolleanToString(enceinte) + "\n" + "\t" + "P�riode d'incubation : " + periodeEnfantement
				+ " Temps de accouplement : " + tempEnceinte + " ; Maturit� sexuelle : " + maturiteSexuelle +"ans";
	}//toString()
	
	/**
	 * Recuperer le sexe de la tigresse
	 * @return attribut sexe de l'objet tigredfemelle
	 */
	public char getSexe(){
		return TigreFemelle.SEXE;
	}//getSexe()
	
	/**
	 * verifier si la tigresse est enceinte
	 * @return boolean qui retourne vrai si la tigresse est enceinte
	 */
	public boolean isEnceinte() {
		return this.enceinte;
	}//isEnceinte()

	/**
	 * modifie l'etait de grossesse de la tigresse
	 * @param enceinte
	 */
	public void setEnceinte(boolean enceinte) {
		this.enceinte = enceinte;
	}//setEnceinte()
	
	/**
	 * recuperer la periode d'enfantement
	 * @return int contenant la duree du periode
	 */
	public int getPeriodeEnfantement() {
		return periodeEnfantement;
	}//getPeriodegestatiction()

	/**
	 * verifier le temps de grossesse ecoulé
	 * @return int content le temps ecoulé
	 */
	public int getTempEnceinte() {
		return tempEnceinte;
	}//getTempEnceinte()
	
	/**
	 * Modifier le temps ecoulé de grossesse
	 * @param tempEnceinte
	 */
	public void setTempEnceinte(int tempEnceinte) {
		this.tempEnceinte = tempEnceinte;
	}//setTempEnceinte()

	/**
	 * recuperer le numero permettant d'attribuer un pseudo à la tigresse
	 * @return int le numéro
	 */
	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()
	
	/**
	 * modifier le numéro de pseudo
	 * @param numPseudo
	 */
	public static void setNumPseudo(int numPseudo) {
		TigreFemelle.numPseudo = numPseudo;
	}//setNumPseudo()
}//TigreFemelle
