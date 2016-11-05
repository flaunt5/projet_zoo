package zoo_factory;

import zoo_animaux.concret.OursFemelle;
import zoo_animaux.concret.OursMale;

/**
 *	OursFactory est la classe qui va permettre de créer des bébés ours males et femelles
 * @author Alexandre
 *
 */
public class OursFactory {

	/**
	 * Creer un objet de type OursMale
	 *
	 * @param poids
	 * 				Futur poids de l'ours
	 * @param taille
	 * 				Futur taille de l'ours
	 * @param age
	 * 				Futur age de l'ours
	 * @param pseudo
	 * 				Futur pseudo de l'ours
	 * @return un objet de type OursMale
	 */
	public static OursMale creerOursMale(double poids, double taille, String pseudo) {
		return new OursMale(poids, taille, 1, pseudo);
	}//creerOursMale()

	/**
	 * Creer un objet de type OursFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'ours
	 * @param taille
	 * 				Futur taille de l'ours
	 * @param age
	 * 				Futur age de l'ours
	 * @param pseudo
	 * 				Futur pseudo de l'ours
	 * @return un objet de type OursFemelle
	 */
	public static OursFemelle creerOursFemelle(double poids, double taille, String pseudo) {
		return new OursFemelle(poids, taille, 1, pseudo);
	}//creerOursFemelle()
}//OursFactory
