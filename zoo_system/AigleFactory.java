package zoo_system;

public class AigleFactory {

	/**
	 * Creer un objet de type AigleFemmelle
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type AigleFemelle
	 */
	public static AigleFemelle creerAigleFemelle(double poids, double taille, String pseudo) {
		return new AigleFemelle(poids, taille, 1, pseudo);
	}//creerAigleFemelle()

	/**
	 * Creer un objet de type AigleMale
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type AigleMale
	 */
	public static AigleMale creerAigleMale(double poids, double taille, String pseudo) {
		return new AigleMale(poids, taille, 1, pseudo);
	}//creerAigleMale()
}//AigleFactory
