package zoo_system;

public abstract class Pinguoin extends Aquatique implements MarinAction, VolantAction{
	
	public Pinguoin(double poids, double taille, int age){
		super(poids, taille, age);
		this.nom = "pinguoin";
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
}//Pinguoin
