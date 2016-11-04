package zoo_system;

public class AnimalFactory {
	
	/**
	 * Creer un objet de type LoupMale
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type LoupMale
	 */
	public static LoupMale getLoupMale(double poids, double taille, String pseudo){
		return LoupFactory.creerLoupMale(poids, taille, pseudo);		
	}//getLoupMale()
	
	/**
	 * Creer un objet de type LoupFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type LoupFemelle
	 */
	public static LoupFemelle getLoupFemelle(double poids, double taille, String pseudo){
		return LoupFactory.creerLoupFemelle(poids, taille, pseudo);	
	}//getLoupFemelle()
	
	/**
	 * Creer un objet de type OursMale
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type OursMale
	 */
	public static OursMale getOursMale(double poids, double taille, String pseudo){
		return OursFactory.creerOursMale(poids, taille, pseudo);	
	}//getOursMale()
	
	/**
	 * Creer un objet de type OursFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type OursFemelle
	 */
	public static OursFemelle getOursFemelle(double poids, double taille, String pseudo){
		return OursFactory.creerOursFemelle(poids, taille, pseudo);	
	}//getOursFemelle()
	
	/**
	 * Creer un objet de type TigreMale
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type TigreMale
	 */
	public static TigreMale getTigreMale(double poids, double taille, String pseudo){
		return TigreFactory.creerTigreMale(poids, taille, pseudo);	
	}//getTigreMale()
	
	/**
	 * Creer un objet de type TigreFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type TigreFemelle
	 */
	public static TigreFemelle getTigreFemelle(double poids, double taille, String pseudo){
		return TigreFactory.creerTigreFemelle(poids, taille, pseudo);	
	}//getTigreFemelle()
	
	/**
	 * Creer un objet de type BaleineMale
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type BaleineMale
	 */
	public static BaleineMale getBaleineMale(double poids, double taille, String pseudo){
		return BaleineFactory.creerBaleineMale(poids, taille, pseudo);	
	}//getBaleineMale()
	
	/**
	 * Creer un objet de type BaleineFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type BaleineFemelle
	 */
	public static BaleineFemelle getBaleineFemelle(double poids, double taille, String pseudo){
		return BaleineFactory.creerBaleineFemelle(poids, taille, pseudo);	
	}//getBaleineFemelle()
	
	/**
	 * Creer un objet de type RequinMale
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type RequinMale
	 */
	public static RequinMale getRequinMale(double poids, double taille, String pseudo){
		return RequinFactory.creerRequinMale(poids, taille, pseudo);	
	}//getRequinMale()
	
	/**
	 * Creer un objet de type RequinFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type RequinFemelle
	 */
	public static RequinFemelle getRequinFemelle(double poids, double taille, String pseudo){
		return RequinFactory.creerRequinFemelle(poids, taille, pseudo);	
	}//getRequinFemelle()
	
	/**
	 * Creer un objet de type PoissonRougeMale
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type PoissonRougeMale
	 */
	public static PoissonRougeMale getPoissonRougeMale(double poids, double taille, String pseudo){
		return PoissonRougeFactory.creerPoissonRougeMale(poids, taille, pseudo);	
	}//getPoissonRougeMale()
	
	/**
	 * Creer un objet de type PoissonRougeFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type PoissonRougeFemelle
	 */
	public static PoissonRougeFemelle getPoissonRougeFemelle(double poids, double taille, String pseudo){
		return PoissonRougeFactory.creerPoissonRougeFemelle(poids, taille, pseudo);	
	}//getPoissonRougeFemelle()
	
	/**
	 * Creer un objet de type PinguoinMale
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type PinguoinMale
	 */
	public static PingouinMale getPingouinMale(double poids, double taille, String pseudo){
		return PingouinFactory.creerPinguoinMale(poids, taille, pseudo);	
	}//getPinguoinMale()
	
	/**
	 * Creer un objet de type PinguoinFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type PinguoinFemelle
	 */
	public static PingouinFemelle getPingouinFemelle(double poids, double taille, String pseudo){
		return PingouinFactory.creerPinguoinFemelle(poids, taille, pseudo);	
	}//getPinguoinFemelle()
	
	/**
	 * Creer un objet de type AigleMale
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type AigleMale
	 */
	public static AigleMale getAigleMale(double poids, double taille, String pseudo){
		return AigleFactory.creerAigleMale(poids, taille, pseudo);	
	}//getAigleMale()
	
	/**
	 * Creer un objet de type AigleFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 * @return un objet de type AigleFemelle
	 */
	public static AigleFemelle getAigleFemelle(double poids, double taille, String pseudo){
		return AigleFactory.creerAigleFemelle(poids, taille, pseudo);	
	}//getAigleFemelle()
}
