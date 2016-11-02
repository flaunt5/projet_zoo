package zoo_system;

public class AnimalFactory {
	public static LoupMale getLoupMale(double poids, double taille, String pseudo){
		return LoupFactory.creerLoupMale(poids, taille, pseudo);		
	}//getLoupMale()
	
	public static LoupFemelle getLoupFemelle(double poids, double taille, String pseudo){
		return LoupFactory.creerLoupFemelle(poids, taille, pseudo);	
	}//getLoupFemelle()

	public static OursMale getOursMale(double poids, double taille, String pseudo){
		return OursFactory.creerOursMale(poids, taille, pseudo);	
	}//getOursMale()
	
	public static OursFemelle getOursFemelle(double poids, double taille, String pseudo){
		return OursFactory.creerOursFemelle(poids, taille, pseudo);	
	}//getOursFemelle()
	
	public static TigreMale getTigreMale(double poids, double taille, String pseudo){
		return TigreFactory.creerTigreMale(poids, taille, pseudo);	
	}//getTigreMale()
	
	public static TigreFemelle getTigreFemelle(double poids, double taille, String pseudo){
		return TigreFactory.creerTigreFemelle(poids, taille, pseudo);	
	}//getTigreFemelle()
	
	public static BaleineMale getBaleineMale(double poids, double taille, String pseudo){
		return BaleineFactory.creerBaleineMale(poids, taille, pseudo);	
	}//getBaleineMale()
	
	public static BaleineFemelle getBaleineFemelle(double poids, double taille, String pseudo){
		return BaleineFactory.creerBaleineFemelle(poids, taille, pseudo);	
	}//getBaleineFemelle()
	
	public static RequinMale getRequinMale(double poids, double taille, String pseudo){
		return RequinFactory.creerRequinMale(poids, taille, pseudo);	
	}//getRequinMale()
	
	public static RequinFemelle getRequinFemelle(double poids, double taille, String pseudo){
		return RequinFactory.creerRequinFemelle(poids, taille, pseudo);	
	}//getRequinFemelle()
	
	public static PoissonRougeMale getPoissonRougeMale(double poids, double taille, String pseudo){
		return PoissonRougeFactory.creerPoissonRougeMale(poids, taille, pseudo);	
	}//getPoissonRougeMale()
	
	public static PoissonRougeFemelle getPoissonRougeFemelle(double poids, double taille, String pseudo){
		return PoissonRougeFactory.creerPoissonRougeFemelle(poids, taille, pseudo);	
	}//getPoissonRougeFemelle()
	
	public static PingouinMale getPingouinMale(double poids, double taille, String pseudo){
		return PingouinFactory.creerPinguoinMale(poids, taille, pseudo);	
	}//getPinguoinMale()
	
	public static PingouinFemelle getPingouinFemelle(double poids, double taille, String pseudo){
		return PingouinFactory.creerPinguoinFemelle(poids, taille, pseudo);	
	}//getPinguoinFemelle()
	
	public static AigleMale getAigleMale(double poids, double taille, String pseudo){
		return AigleFactory.creerAigleMale(poids, taille, pseudo);	
	}//getAigleMale()
	
	public static AigleFemelle getAigleFemelle(double poids, double taille, String pseudo){
		return AigleFactory.creerAigleFemelle(poids, taille, pseudo);	
	}//getAigleFemelle()
}
