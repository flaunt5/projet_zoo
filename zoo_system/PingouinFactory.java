package zoo_system;

public class PingouinFactory {

	public static PingouinFemelle creerPinguoinFemelle(double poids, double taille, String pseudo) {
		return new PingouinFemelle(poids, taille, 1, pseudo);
	}//creerPinguoinFemelle()

	public static PingouinMale creerPinguoinMale(double poids, double taille, String pseudo) {
		return new PingouinMale(poids, taille, 1, pseudo);
	}//creerPinguoinMale()
}//PinguoinFactory
