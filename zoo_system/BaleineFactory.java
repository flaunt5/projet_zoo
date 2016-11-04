package zoo_system;

public class BaleineFactory {
	
	/**
	 * Creer un objet de type BaleineFemmelle
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type BaleineFemelle
	 */
	public static BaleineMale creerBaleineMale(double poids, double taille, String pseudo) {
		return new BaleineMale(poids, taille, 1, pseudo);
	}//creerBaleineMale()
	
	/**
	 * Creer un objet de type BaleineFemmelle
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type BaleineFemelle
	 */
	public static BaleineFemelle creerBaleineFemelle(double poids, double taille, String pseudo) {
		return new BaleineFemelle(poids, taille, 1, pseudo);
	}//creerBaleineFemelle()
}//BaleineFactory
