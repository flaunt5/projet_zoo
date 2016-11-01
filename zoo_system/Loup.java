package zoo_system;

public abstract class Loup extends Terrestre implements PredateurAction{
	
	protected static final int maturiteSexuelle = 2;
	
	public Loup(double poids, double taille, int age){
		super(poids, taille, age);
		this.nom = "loup";
	}//Loup()
	
	public String emmetreSon() {
		return "Louuuuuuuuuuuuuuuuuuup";		
	}//emmetreSon()

	public String vagabonder() {
		return "Vagabonde comme un loup";
	}//vagabonder()
	
	public int getMaturiteSexuelle(){
		return maturiteSexuelle;
	}//getMaturiteSexuelle()

}//Loup
