package zoo_system;

public class AnimalFactory {
	public static LoupMale getLoupMale(double poids, double taille){
		return LoupFactory.creerLoupMale(poids, taille);		
	}//getLoupMale()
	
	public static LoupFemelle getLoupFemelle(double poids, double taille){
		return LoupFactory.creerLoupFemelle(poids, taille);	
	}//getLoupFemelle()

	public static OursMale getOursMale(double poids, double taille){
		return OursFactory.creerOursMale(poids, taille);	
	}//getOursMale()
	
	public static OursFemelle getOursFemelle(double poids, double taille){
		return OursFactory.creerOursFemelle(poids, taille);	
	}//getOursFemelle()
	
	public static TigreMale getTigreMale(double poids, double taille){
		return TigreFactory.creerTigreMale(poids, taille);	
	}//getTigreMale()
	
	public static TigreFemelle getTigreFemelle(double poids, double taille){
		return TigreFactory.creerTigreFemelle(poids, taille);	
	}//getTigreFemelle()
	
	public static BaleineMale getBaleineMale(double poids, double taille){
		return BaleineFactory.creerBaleineMale(poids, taille);	
	}//getBaleineMale()
	
	public static BaleineFemelle getBaleineFemelle(double poids, double taille){
		return BaleineFactory.creerBaleineFemelle(poids, taille);	
	}//getBaleineFemelle()
	
	public static RequinMale getRequinMale(double poids, double taille){
		return RequinFactory.creerRequinMale(poids, taille);	
	}//getRequinMale()
	
	public static RequinFemelle getRequinFemelle(double poids, double taille){
		return RequinFactory.creerRequinFemelle(poids, taille);	
	}//getRequinFemelle()
	
	public static PoissonRougeMale getPoissonRougeMale(double poids, double taille){
		return PoissonRougeFactory.creerPoissonRougeMale(poids, taille);	
	}//getPoissonRougeMale()
	
	public static PoissonRougeFemelle getPoissonRougeFemelle(double poids, double taille){
		return PoissonRougeFactory.creerPoissonRougeFemelle(poids, taille);	
	}//getPoissonRougeFemelle()
	
	public static PingouinMale getPingouinMale(double poids, double taille){
		return PingouinFactory.creerPinguoinMale(poids, taille);	
	}//getPinguoinMale()
	
	public static PingouinFemelle getPingouinFemelle(double poids, double taille){
		return PingouinFactory.creerPinguoinFemelle(poids, taille);	
	}//getPinguoinFemelle()
	
	public static AigleMale getAigleMale(double poids, double taille){
		return AigleFactory.creerAigleMale(poids, taille);	
	}//getAigleMale()
	
	public static AigleFemelle getAigleFemelle(double poids, double taille){
		return AigleFactory.creerAigleFemelle(poids, taille);	
	}//getAigleFemelle()
}
