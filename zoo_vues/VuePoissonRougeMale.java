package zoo_vues;

import zoo_animaux.concret.PoissonRougeMale;

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

