package zoo_vues;

import zoo_animaux.concret.RequinMale;

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

