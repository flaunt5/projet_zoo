package zoo_system;

public abstract class VueEnclos<T extends Enclos<? extends Animal>> extends Vue<T>{
	/**
	 * Effectue un tri sur la liste des animaux de l'enclos
	 */
	public void effectuerTri(){
		System.out.println(this.getModel().effectuerTri());
	}
}//VueEnclos

