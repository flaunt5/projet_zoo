package zoo_vues;

import zoo_models.Cage;

/**
 * VueCage est la classe qui va permettre de réaliser les différents affichage de la classe Cage
 * @author Alexandre
 *
 */
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
