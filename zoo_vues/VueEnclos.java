package zoo_vues;

import zoo_animaux.Animal;
import zoo_models.Enclos;

public abstract class VueEnclos<T extends Enclos<? extends Animal>> extends Vue<T>{
	/**
	 * Effectue un tri sur la liste des animaux de l'enclos
	 */
	public void effectuerTri(){
		System.out.println(this.getModel().effectuerTri());
	}
}//VueEnclos

