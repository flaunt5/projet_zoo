package zoo_system;

public class AigleFactory {

	public static AigleFemelle creerAigleFemelle(double poids, double taille) {
		return new AigleFemelle(poids, taille, 1);
	}//creerAigleFemelle()

	public static AigleMale creerAigleMale(double poids, double taille) {
		return new AigleMale(poids, taille, 1);
	}//creerAigleMale()
}//AigleFactory
