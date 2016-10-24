package zoo_system;

public abstract class Aigle extends Aerien implements VolantAction{

	public Aigle(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
		this.nom = "aigle";
	}
	
	public String emmetreSon() {
		return "Aiiiiiiigle";
	}//emmetreSon()

	public String voler() {
		return "Vole comme un aigle";
	}//voler()

}//Aigle
