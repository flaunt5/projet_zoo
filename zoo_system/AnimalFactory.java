package zoo_system;

public class AnimalFactory {
	
	/**
	 * Retourne un objet de type LoupMale
	 *
	 * @param poids
	 * 				Futur poids du loup
	 * @param taille
	 * 				Futur taille du loup
	 * @param age
	 * 				Futur age du loup
	 * @param pseudo
	 * 				Futur pseudo du loup
	 * @return un objet de type LoupMale
	 */
	public static LoupMale getLoupMale(double poids, double taille, String pseudo){
		return LoupFactory.creerLoupMale(poids, taille, pseudo);		
	}//getLoupMale()
	
	/**
	 * Retourne un objet de type LoupFemelle
	 *
	 * @param poids
	 * 				Futur poids du loup
	 * @param taille
	 * 				Futur taille du loup
	 * @param age
	 * 				Futur age du loup
	 * @param pseudo
	 * 				Futur pseudo du loup
	 * @return un objet de type LoupFemelle
	 */
	public static LoupFemelle getLoupFemelle(double poids, double taille, String pseudo){
		return LoupFactory.creerLoupFemelle(poids, taille, pseudo);	
	}//getLoupFemelle()
	
	/**
	 * Retourne un objet de type OursMale
	 *
	 * @param poids
	 * 				Futur poids de l'ours
	 * @param taille
	 * 				Futur taille de l'ours
	 * @param age
	 * 				Futur age de l'ours
	 * @param pseudo
	 * 				Futur pseudo de l'ours
	 * @return un objet de type OursMale
	 */
	public static OursMale getOursMale(double poids, double taille, String pseudo){
		return OursFactory.creerOursMale(poids, taille, pseudo);	
	}//getOursMale()
	
	/**
	 * Retourne un objet de type OursFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'ours
	 * @param taille
	 * 				Futur taille de l'ours
	 * @param age
	 * 				Futur age de l'ours
	 * @param pseudo
	 * 				Futur pseudo de l'ours
	 * @return un objet de type OursFemelle
	 */
	public static OursFemelle getOursFemelle(double poids, double taille, String pseudo){
		return OursFactory.creerOursFemelle(poids, taille, pseudo);	
	}//getOursFemelle()
	
	/**
	 * Retourne un objet de type TigreMale
	 *
	 * @param poids
	 * 				Futur poids du tigre
	 * @param taille
	 * 				Futur taille du tigre
	 * @param age
	 * 				Futur age du tigre
	 * @param pseudo
	 * 				Futur pseudo du tigre
	 * @return un objet de type TigreMale
	 */
	public static TigreMale getTigreMale(double poids, double taille, String pseudo){
		return TigreFactory.creerTigreMale(poids, taille, pseudo);	
	}//getTigreMale()
	
	/**
	 * Retourne un objet de type TigreFemelle
	 *
	 * @param poids
	 * 				Futur poids du tigre
	 * @param taille
	 * 				Futur taille du tigre
	 * @param age
	 * 				Futur age du tigre
	 * @param pseudo
	 * 				Futur pseudo du tigre
	 * @return un objet de type TigreFemelle
	 */
	public static TigreFemelle getTigreFemelle(double poids, double taille, String pseudo){
		return TigreFactory.creerTigreFemelle(poids, taille, pseudo);	
	}//getTigreFemelle()
	
	/**
	 * Retourne un objet de type BaleineMale
	 *
	 * @param poids
	 * 				Futur poids de la baleine
	 * @param taille
	 * 				Futur taille de la baleine
	 * @param age
	 * 				Futur age de la baleine
	 * @param pseudo
	 * 				Futur pseudo de la baleine
	 * @return un objet de type BaleineMale
	 */
	public static BaleineMale getBaleineMale(double poids, double taille, String pseudo){
		return BaleineFactory.creerBaleineMale(poids, taille, pseudo);	
	}//getBaleineMale()
	
	/**
	 * Retourne un objet de type BaleineFemelle
	 *
	 * @param poids
	 * 				Futur poids de la baleine
	 * @param taille
	 * 				Futur taille de la baleine
	 * @param age
	 * 				Futur age de la baleine
	 * @param pseudo
	 * 				Futur pseudo de la baleine
	 * @return un objet de type BaleineFemelle
	 */
	public static BaleineFemelle getBaleineFemelle(double poids, double taille, String pseudo){
		return BaleineFactory.creerBaleineFemelle(poids, taille, pseudo);	
	}//getBaleineFemelle()
	
	/**
	 * Retourne un objet de type RequinMale
	 *
	 * @param poids
	 * 				Futur poids du requin
	 * @param taille
	 * 				Futur taille du requin
	 * @param age
	 * 				Futur age du requin
	 * @param pseudo
	 * 				Futur pseudo du requin
	 * @return un objet de type RequinMale
	 */
	public static RequinMale getRequinMale(double poids, double taille, String pseudo){
		return RequinFactory.creerRequinMale(poids, taille, pseudo);	
	}//getRequinMale()
	
	/**
	 * Retourne un objet de type RequinFemelle
	 *
	 * @param poids
	 * 				Futur poids du requin
	 * @param taille
	 * 				Futur taille du requin
	 * @param age
	 * 				Futur age du requin
	 * @param pseudo
	 * 				Futur pseudo du requin
	 * @return un objet de type RequinFemelle
	 */
	public static RequinFemelle getRequinFemelle(double poids, double taille, String pseudo){
		return RequinFactory.creerRequinFemelle(poids, taille, pseudo);	
	}//getRequinFemelle()
	
	/**
	 * Retourne un objet de type PoissonRougeMale
	 *
	 * @param poids
	 * 				Futur poids du poisson
	 * @param taille
	 * 				Futur taille du poisson
	 * @param age
	 * 				Futur age du poisson
	 * @param pseudo
	 * 				Futur pseudo du poisson
	 * @return un objet de type PoissonRougeMale
	 */
	public static PoissonRougeMale getPoissonRougeMale(double poids, double taille, String pseudo){
		return PoissonRougeFactory.creerPoissonRougeMale(poids, taille, pseudo);	
	}//getPoissonRougeMale()
	
	/**
	 * Retourne un objet de type PoissonRougeFemelle
	 *
	 * @param poids
	 * 				Futur poids du poisson
	 * @param taille
	 * 				Futur taille du poisson
	 * @param age
	 * 				Futur age du poisson
	 * @param pseudo
	 * 				Futur pseudo du poisson
	 * @return un objet de type PoissonRougeFemelle
	 */
	public static PoissonRougeFemelle getPoissonRougeFemelle(double poids, double taille, String pseudo){
		return PoissonRougeFactory.creerPoissonRougeFemelle(poids, taille, pseudo);	
	}//getPoissonRougeFemelle()
	
	/**
	 * Retourne un objet de type PinguoinMale
	 *
	 * @param poids
	 * 				Futur poids du pinguoin
	 * @param taille
	 * 				Futur taille du pinguoin
	 * @param age
	 * 				Futur age du pinguoin
	 * @param pseudo
	 * 				Futur pseudo du pinguoin
	 * @return un objet de type PinguoinMale
	 */
	public static PingouinMale getPingouinMale(double poids, double taille, String pseudo){
		return PingouinFactory.creerPinguoinMale(poids, taille, pseudo);	
	}//getPinguoinMale()
	
	/**
	 * Retourne un objet de type PinguoinFemelle
	 *
	 * @param poids
	 * 				Futur poids du pinguoin
	 * @param taille
	 * 				Futur taille du pinguoin
	 * @param age
	 * 				Futur age du pinguoin
	 * @param pseudo
	 * 				Futur pseudo du pinguoin
	 * @return un objet de type PinguoinFemelle
	 */
	public static PingouinFemelle getPingouinFemelle(double poids, double taille, String pseudo){
		return PingouinFactory.creerPinguoinFemelle(poids, taille, pseudo);	
	}//getPinguoinFemelle()
	
	/**
	 * Retourne un objet de type AigleMale
	 *
	 * @param poids
	 * 				Futur poids de l'aigle
	 * @param taille
	 * 				Futur taille de l'aigle
	 * @param age
	 * 				Futur age de l'aigle
	 * @param pseudo
	 * 				Futur pseudo de l'aigle
	 * @return un objet de type AigleMale
	 */
	public static AigleMale getAigleMale(double poids, double taille, String pseudo){
		return AigleFactory.creerAigleMale(poids, taille, pseudo);	
	}//getAigleMale()
	
	/**
	 * Retourne un objet de type AigleFemelle
	 *
	 * @param poids
	 * 				Futur poids de l'aigle
	 * @param taille
	 * 				Futur taille de l'aigle
	 * @param age
	 * 				Futur age de l'aigle
	 * @param pseudo
	 * 				Futur pseudo de l'aigle
	 * @return un objet de type AigleFemelle
	 */
	public static AigleFemelle getAigleFemelle(double poids, double taille, String pseudo){
		return AigleFactory.creerAigleFemelle(poids, taille, pseudo);	
	}//getAigleFemelle()
}
