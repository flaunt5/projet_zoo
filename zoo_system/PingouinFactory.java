package zoo_system;

public class PingouinFactory {

	public static PingouinFemelle creerPinguoinFemelle(double poids, double taille) {
		return new PingouinFemelle(poids, taille, 1);
	}//creerPinguoinFemelle()

	public static PingouinMale creerPinguoinMale(double poids, double taille) {
		return new PingouinMale(poids, taille, 1);
	}//creerPinguoinMale()
}//PinguoinFactory
