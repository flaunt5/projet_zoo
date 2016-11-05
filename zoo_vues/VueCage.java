package zoo_vues;

import zoo_models.Cage;

public class VueCage extends VueEnclos<Cage>{
	/**
	 * Creer un objet de type VueCage
	 * @param objet 
	 * 				un objet de type Cage
	 */
	public VueCage(Cage objet){
		this.model= objet;
	}//VueCage

}//VueCage
