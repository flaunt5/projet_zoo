package zoo_system;

public abstract class Aigle extends Aerien implements VolantAction{
	
	protected static final int maturiteSexuelle = 4;

	public Aigle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "aigle";
	}//Aigle()
	
	public String emmetreSon() {
		return "Aiiiiiiigle";
	}//emmetreSon()

	public String voler() {
		return "Vole comme un aigle";
	}//voler()
	
	public int getMaturiteSexuelle(){
		return maturiteSexuelle;
	}//getMaturiteSexuelle()

}//Aigle
