package zoo_system;

public class RequinFactory {

	public static RequinFemelle creerRequinFemelle(double poids, double taille) {
		return new RequinFemelle(poids, taille, 1);
	}//creerRequinFemelle()

	public static RequinMale creerRequinMale(double poids, double taille) {
		return new RequinMale(poids, taille, 1);
	}//creerRequinMale()
}//RequinFactory
