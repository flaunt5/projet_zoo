package zoo_vues;

import zoo_animaux.concret.PoissonRougeMale;

/**
 * VuePoissonRougeMale est la classe qui va permettre de réaliser les différents affichage de la classe PoissonRougeMale
 * @author Alexandre
 *
 */
public class VuePoissonRougeMale extends VueAnimal<PoissonRougeMale>{
	/**
	 * Creer un objet de type VuePoissonRougeMale
	 * @param objet 
	 * 				un objet de type PoissonRougeMale
	 */
	public VuePoissonRougeMale(PoissonRougeMale objet){
		this.model = objet;
	}//VuePoissonRougeMale()
	
}//VuePoissonRougeMale

