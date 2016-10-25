package zoo_system;

public abstract class Loup extends Terrestre implements PredateurAction{
	
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

}//Loup
