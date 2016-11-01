package zoo_system;

public abstract class Pingouin extends Aquatique implements MarinAction, VolantAction{
	
	protected static final int maturiteSexuelle = 4;
	
	public Pingouin(double poids, double taille, int age){
		super(poids, taille, age);
		this.nom = "pingouin";
	}//Pinguoin()
	
	public String emmetreSon() {
		return "NUTNUT";
	}//emmetreSon()

	public String voler() {
		return "Vole comme un pinguoin";
	}//voler()

	public String nager() {
		return "Nage comme un pinguoin";
	}//nager()
	
	public int getMaturiteSexuelle(){
		return maturiteSexuelle;
	}//getMaturiteSexuelle()
}//Pinguoin
