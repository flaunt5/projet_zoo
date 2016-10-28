package zoo_system;

public class TigreFactory {

	public static TigreMale creerTigreMale(double poids, double taille) {
		return new TigreMale(poids, taille, 1);
	}//creerTigreMale()

	public static TigreFemelle creerTigreFemelle(double poids, double taille) {
		return new TigreFemelle(poids, taille, 1);
	}//creerTigreFemelle()

}//TigreFactory
