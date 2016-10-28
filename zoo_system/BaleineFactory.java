package zoo_system;

public class BaleineFactory {

	public static BaleineMale creerBaleineMale(double poids, double taille) {
		return new BaleineMale(poids, taille, 1);
	}//creerBaleineMale()

	public static BaleineFemelle creerBaleineFemelle(double poids, double taille) {
		return new BaleineFemelle(poids, taille, 1);
	}//creerBaleineFemelle()
}//BaleineFactory
