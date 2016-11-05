package zoo_vues;

import zoo_animaux.Animal;
import zoo_models.Enclos;

/**
 * VueEnclos est la classe qui va permettre de réaliser les différents affichage de la classe Enclos
 * @author Alexandre
 *
 */
public abstract class VueEnclos<T extends Enclos<? extends Animal>> extends Vue<T>{
	/**
	 * Effectue un tri sur la liste des animaux de l'enclos
	 */
	public void effectuerTri(){
		System.out.println(this.getModel().effectuerTri());
	}
}//VueEnclos

