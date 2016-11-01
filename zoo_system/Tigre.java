package zoo_system;

public abstract class Tigre extends Terrestre implements PredateurAction{
	
	protected static final int maturiteSexuelle = 3;
	
	public Tigre(double poids, double taille, int age){
		super(poids, taille, age);
		this.nom = "tigre";
	}//Tigre()
	
	public String emmetreSon() {
		return "Tiiiiiiiiiiiiiigre";
	}//emmetreSon()

	public String vagabonder() {
		return "Vagabonde comme un tigre";
	}//vagabonder()
	
	public int getMaturiteSexuelle(){
		return maturiteSexuelle;
	}//getMaturiteSexuelle()

}//Tigre
