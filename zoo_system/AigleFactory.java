package zoo_system;

public class AigleFactory {

	/**
	 * Creer un objet de type AigleFemmelle
	 *
	 * @param poids
	 * 				Futur poids de l'aigle
	 * @param taille
	 * 				Futur taille de l'aigle
	 * @param age
	 * 				Futur age de l'aigle
	 * @param pseudo
	 * 				Futur pseudo de l'aigle
	 * @return un objet de type AigleFemelle
	 */
	public static AigleFemelle creerAigleFemelle(double poids, double taille, String pseudo) {
		return new AigleFemelle(poids, taille, 1, pseudo);
	}//creerAigleFemelle()

	/**
	 * Creer un objet de type AigleMale
	 *
	 * @param poids
	 * 				Futur poids de l'aigle
	 * @param taille
	 * 				Futur taille de l'aigle
	 * @param age
	 * 				Futur age de l'aigle
	 * @param pseudo
	 * 				Futur pseudo de l'aigle
	 * @return un objet de type AigleMale
	 */
	public static AigleMale creerAigleMale(double poids, double taille, String pseudo) {
		return new AigleMale(poids, taille, 1, pseudo);
	}//creerAigleMale()
}//AigleFactory
