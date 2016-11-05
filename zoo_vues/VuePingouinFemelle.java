package zoo_vues;

import zoo_animaux.concret.PingouinFemelle;

/**
 * VuePingouinFemelle est la classe qui va permettre de r�aliser les diff�rents affichage de la classe PingouinFemelle
 * @author Alexandre
 *
 */
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
