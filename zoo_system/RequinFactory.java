package zoo_system;

public class RequinFactory {

	public static RequinFemelle creerRequinFemelle(double poids, double taille, String pseudo) {
		return new RequinFemelle(poids, taille, 1, pseudo);
	}//creerRequinFemelle()

	public static RequinMale creerRequinMale(double poids, double taille, String pseudo) {
		return new RequinMale(poids, taille, 1, pseudo);
	}//creerRequinMale()
}//RequinFactory
