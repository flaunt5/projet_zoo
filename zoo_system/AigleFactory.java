package zoo_system;

public class AigleFactory {

	public static AigleFemelle creerAigleFemelle(double poids, double taille, String pseudo) {
		return new AigleFemelle(poids, taille, 1, pseudo);
	}//creerAigleFemelle()

	public static AigleMale creerAigleMale(double poids, double taille, String pseudo) {
		return new AigleMale(poids, taille, 1, pseudo);
	}//creerAigleMale()
}//AigleFactory
