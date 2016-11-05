package zoo_vues;

import zoo_animaux.concret.RequinMale;

/**
 * VueRequinMale est la classe qui va permettre de r�aliser les diff�rents affichage de la classe RequinMale
 * @author Alexandre
 *
 */
public class VueRequinMale extends VueAnimal<RequinMale>{
	/**
	 * Creer un objet de type VueRequinMale
	 * @param objet 
	 * 				un objet de type RequinMale
	 */
	public VueRequinMale(RequinMale objet){
		this.model = objet;
	}//VueRequinMale()
	
}//VueRequinMale

