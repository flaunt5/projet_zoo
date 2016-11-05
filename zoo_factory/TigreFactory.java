package zoo_factory;

import zoo_animaux.concret.TigreFemelle;
import zoo_animaux.concret.TigreMale;

/**
 *	TigreFactory est la classe qui va permettre de créer des bébés tigres males et femelles
 * @author Alexandre
 *
 */
public class TigreFactory {
	/**
	 * Creer un objet de type TigreMale
	 *
	 * @param poids
	 * 				Futur poids du tigre
	 * @param taille
	 * 				Futur taille du tigre
	 * @param age
	 * 				Futur age du tigre
	 * @param pseudo
	 * 				Futur pseudo du tigre
	 * @return un objet de type TigreMale
	 */
	public static TigreMale creerTigreMale(double poids, double taille, String pseudo) {
		return new TigreMale(poids, taille, 1, pseudo);
	}//creerTigreMale()

	/**
	 * Creer un objet de type TigreFemelle
	 *
	 * @param poids
	 * 				Futur poids du tigre
	 * @param taille
	 * 				Futur taille du tigre
	 * @param age
	 * 				Futur age du tigre
	 * @param pseudo
	 * 				Futur pseudo du tigre
	 * @return un objet de type TigreFemelle
	 */
	public static TigreFemelle creerTigreFemelle(double poids, double taille, String pseudo) {
		return new TigreFemelle(poids, taille, 1, pseudo);
	}//creerTigreFemelle()

}//TigreFactory
