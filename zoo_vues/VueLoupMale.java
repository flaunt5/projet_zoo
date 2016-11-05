package zoo_vues;

import zoo_animaux.concret.LoupMale;

/**
 * VueLoupMale est la classe qui va permettre de réaliser les différents affichage de la classe LoupMale
 * @author Alexandre
 *
 */
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
