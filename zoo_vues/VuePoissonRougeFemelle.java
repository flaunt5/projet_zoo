package zoo_vues;

import zoo_animaux.concret.PoissonRougeFemelle;

public class VuePoissonRougeFemelle  extends VueAnimal<PoissonRougeFemelle>{
	/**
	 * Creer un objet de type VuePoissonRougeFemelle
	 * @param objet 
	 * 				un objet de type PoissonRougeFemelle
	 */
	public VuePoissonRougeFemelle(PoissonRougeFemelle objet){
		this.model = objet;
	}//VuePoissonRougeFemelle()
	
}//VuePoissonRougeFemelle

