package zoo_system;

public abstract class Ours extends Terrestre{
	
	protected static final int maturiteSexuelle = 4;
	
	public Ours(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "ours";
	}//Ours()
	
	public String emmetreSon() {
		return "Grrrrrrrrrrrrrrrrrrrr";
	}//emmetreSon()
	
	public int getMaturiteSexuelle(){
		return maturiteSexuelle;
	}//getMaturiteSexuelle()
}//Ours
