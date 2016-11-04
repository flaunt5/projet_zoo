package zoo_system;

public class TigreFactory {
	/**
	 * Creer un nouveau objet de type TigreMale
	 * @param poids
	 * @param taille
	 * @param pseudo
	 */
	public static TigreMale creerTigreMale(double poids, double taille, String pseudo) {
		return new TigreMale(poids, taille, 1, pseudo);
	}//creerTigreMale()

	/**
	 * Creer un nouveau objet de type TigreFemelle
	 * @param poids
	 * @param taille
	 * @param pseudo
	 */
	public static TigreFemelle creerTigreFemelle(double poids, double taille, String pseudo) {
		return new TigreFemelle(poids, taille, 1, pseudo);
	}//creerTigreFemelle()

}//TigreFactory
