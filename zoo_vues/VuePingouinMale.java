package zoo_vues;

import zoo_animaux.concret.PingouinMale;

/**
 * VuePingouinMale est la classe qui va permettre de réaliser les différents affichage de la classe PingouinMale
 * @author Alexandre
 *
 */
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