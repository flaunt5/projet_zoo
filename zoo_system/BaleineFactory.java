package zoo_system;

public class BaleineFactory {

	public static BaleineMale creerBaleineMale(double poids, double taille, String pseudo) {
		return new BaleineMale(poids, taille, 1, pseudo);
	}//creerBaleineMale()

	public static BaleineFemelle creerBaleineFemelle(double poids, double taille, String pseudo) {
		return new BaleineFemelle(poids, taille, 1, pseudo);
	}//creerBaleineFemelle()
}//BaleineFactory
