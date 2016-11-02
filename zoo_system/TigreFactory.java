package zoo_system;

public class TigreFactory {

	public static TigreMale creerTigreMale(double poids, double taille, String pseudo) {
		return new TigreMale(poids, taille, 1, pseudo);
	}//creerTigreMale()

	public static TigreFemelle creerTigreFemelle(double poids, double taille, String pseudo) {
		return new TigreFemelle(poids, taille, 1, pseudo);
	}//creerTigreFemelle()

}//TigreFactory
