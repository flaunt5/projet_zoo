package zoo_system;

public class RequinFactory {

	/**
	 * Creer un objet de type RequinFemelle
	 *
	 * @param poids
	 * 				Futur poids du requin
	 * @param taille
	 * 				Futur taille du requin
	 * @param age
	 * 				Futur age du requin
	 * @param pseudo
	 * 				Futur pseudo du requin
	 * @return un objet de type RequinFemelle
	 */
	public static RequinFemelle creerRequinFemelle(double poids, double taille, String pseudo) {
		return new RequinFemelle(poids, taille, 1, pseudo);
	}//creerRequinFemelle()
	
	/**
	 * Creer un objet de type RequinMale
	 *
	 * @param poids
	 * 				Futur poids du requin
	 * @param taille
	 * 				Futur taille du requin
	 * @param age
	 * 				Futur age du requin
	 * @param pseudo
	 * 				Futur pseudo du requin
	 * @return un objet de type RequinMale
	 */
	public static RequinMale creerRequinMale(double poids, double taille, String pseudo) {
		return new RequinMale(poids, taille, 1, pseudo);
	}//creerRequinMale()
}//RequinFactory
