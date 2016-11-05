package zoo_vues;

import zoo_animaux.concret.PingouinMale;

public class VuePingouinMale extends VueAnimal<PingouinMale>{
	/**
	 * Creer un objet de type VuePingouinMale
	 * @param objet 
	 * 				un objet de type PingouinMale
	 */
	public VuePingouinMale(PingouinMale objet){
		this.model = objet;
	}//VuePingouinMale()
	
}//VuePingouinMale