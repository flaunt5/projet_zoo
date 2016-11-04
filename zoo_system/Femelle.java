package zoo_system;

public interface Femelle {
	final char SEXE = 'F';
	
	/**
	 * Recupere la valeur de l'attribut enceinte
	 * @return booleen indicant si la femelle est enceinte ou pas
	 */
	public boolean isEnceinte();

	/**
	 * Modifie la valeur de l'attribut enceinte
	 * @param enceinte
	 * 				Nouvelle etat de grossese
	 */
	public void setEnceinte(boolean enceinte);
	
	/**
	 * Retourne la valeur de l'attribut periodeEnfantement
	 * @return valeur de l'attribut periodeEnfantement
	 */
	public int getPeriodeEnfantement();

	/**
	 * Retourne la valeur de l'attribut tempEnceinte
	 * @return valeur de l'attribut tempEnceinte
	 */
	public int getTempEnceinte() ;

	/**
	 * Modifie la valeur de l'attribut tempsEnceinte
	 * @param tempsEnceinte
	 * 					Nouveau temps enceinte
	 */
	public void setTempEnceinte(int tempEnceinte);
}//Femelle
