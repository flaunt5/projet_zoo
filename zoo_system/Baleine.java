package zoo_system;

public abstract class Baleine extends Aquatique implements MarinAction{
	
	protected static final int maturiteSexuelle = 5;
	
	public Baleine(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "baleine";
	}//Baleine()
	
	public String emmetreSon() {
		return "Baleiiiiiiiiiiiiiine";
	}//emmetreSon()

	public String nager() {
		return "Nage comme une baleine";
	}//nager()
	
	public int getMaturiteSexuelle(){
		return maturiteSexuelle;
	}//getMaturiteSexuelle()

}//Baleine
