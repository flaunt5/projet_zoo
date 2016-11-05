package zoo_vues;

import zoo_animaux.concret.BaleineMale;

/**
 * VueBaleineMale est la classe qui va permettre de réaliser les différents affichage de la classe BaleineMale
 * @author Alexandre
 *
 */
public class VueBaleineMale extends VueAnimal<BaleineMale>{
	/**
	 * Creer un objet de type VueBaleineMale
	 * @param objet 
	 * 				un objet de type BaleineMale
	 */
	public VueBaleineMale(BaleineMale objet){
		this.model = objet;
	}//VueBaleineMale()
	
}//VueBaleineMale
