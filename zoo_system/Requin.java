package zoo_system;

public abstract class Requin extends Aquatique implements MarinAction{
	
	protected static final int maturiteSexuelle = 4;
	
	public Requin(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "requin";
	}//Requin()
	
	public String emmetreSon() {
		return "Reeeeeeeeeeeeeeeequin";
	}//emmetreSon()

	public String nager() {
		return "Nage comme un requin";
	}//nager()
	
	public int getMaturiteSexuelle(){
		return maturiteSexuelle;
	}//getMaturiteSexuelle()

}//Requin
