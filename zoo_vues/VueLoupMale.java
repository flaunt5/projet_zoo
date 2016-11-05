package zoo_vues;

import zoo_animaux.concret.LoupMale;

public class VueLoupMale extends VueAnimal<LoupMale>{
	/**
	 * Creer un objet de type VueLoupMale
	 * @param objet 
	 * 				un objet de type LoupMale
	 */
	public VueLoupMale(LoupMale objet){
		this.model = objet;
	}//VueLoupMale()
}//VueLoupMale
