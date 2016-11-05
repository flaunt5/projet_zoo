package zoo_vues;

import zoo_animaux.concret.OursMale;

/**
 * VueOursMale est la classe qui va permettre de réaliser les différents affichage de la classe OursMale
 * @author Alexandre
 *
 */
public class VueOursMale extends VueAnimal<OursMale>{
	/**
	 * Creer un objet de type VueOursMale
	 * @param objet 
	 * 				un objet de type OursMale
	 */
	public VueOursMale(OursMale objet){
		this.model = objet;
	}//VueOursMale()
	
}//VueOursMale()
