package zoo_factory;

import zoo_animaux.concret.PingouinFemelle;
import zoo_animaux.concret.PingouinMale;

/**
 *	PingouinFactory est la classe qui va permettre de créer des bébés pingouins males et femelles
 * @author Alexandre
 *
 */
public class PingouinFactory {
	
	/**
	 * Creer un objet de type PinguoinFemelle
	 *
	 * @param poids
	 * 				Futur poids du pinguoin
	 * @param taille
	 * 				Futur taille du pinguoin
	 * @param pseudo
	 * 				Futur pseudo du pinguoin
	 * @return un objet de type PinguoinFemelle
	 */
	public static PingouinFemelle creerPinguoinFemelle(double poids, double taille, String pseudo) {
		return new PingouinFemelle(poids, taille, 1, pseudo);
	}//creerPinguoinFemelle()
	
	/**
	 * Creer un objet de type PinguoinMale
	 *
	 * @param poids
	 * 				Futur poids du pinguoin
	 * @param taille
	 * 				Futur taille du pinguoin
	 * @param pseudo
	 * 				Futur pseudo du pinguoin
	 * @return un objet de type PinguoinMale
	 */
	public static PingouinMale creerPinguoinMale(double poids, double taille, String pseudo) {
		return new PingouinMale(poids, taille, 1, pseudo);
	}//creerPinguoinMale()
}//PinguoinFactory
