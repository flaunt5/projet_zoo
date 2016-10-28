package zoo_system;

public class PinguoinFactory {

	public static PinguoinFemelle creerPinguoinFemelle(double poids, double taille) {
		return new PinguoinFemelle(poids, taille, 1);
	}//creerPinguoinFemelle()

	public static PinguoinMale creerPinguoinMale(double poids, double taille) {
		return new PinguoinMale(poids, taille, 1);
	}//creerPinguoinMale()
}//PinguoinFactory
