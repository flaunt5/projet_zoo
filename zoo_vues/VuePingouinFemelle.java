package zoo_vues;

import zoo_animaux.concret.PingouinFemelle;

public class VuePingouinFemelle extends VueAnimal<PingouinFemelle>{
	/**
	 * Creer un objet de type VuePingouinFemelle
	 * @param objet 
	 * 				un objet de type PingouinFemelle
	 */
	public VuePingouinFemelle(PingouinFemelle objet){
		this.model = objet;
	}//VuePingouinFemelle()
	
}//VuePingouinFemelle
