package zoo_vues;

import zoo_animaux.concret.OursMale;

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
