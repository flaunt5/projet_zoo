package zoo_system;

public abstract class VueEnclos<T extends Enclos<? extends Animal>> extends Vue<T>{
	/**
	 * Tri les animaux dans un enclos selon le paramètre choisi
	 */
	public void effectuerTri(){
		System.out.println(this.getModel().effectuerTri());
	}
}//VueEnclos

