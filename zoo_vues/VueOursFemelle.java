package zoo_vues;

import zoo_animaux.concret.OursFemelle;

/**
 * VueOursFemelle est la classe qui va permettre de réaliser les différents affichage de la classe OursFemelle
 * @author Alexandre
 *
 */
public class VueOursFemelle extends VueAnimal<OursFemelle>{
	/**
	 * Creer un objet de type VueOursFemelle
	 * @param objet 
	 * 				un objet de type OursFemelle
	 */
	public VueOursFemelle(OursFemelle objet){
		this.model = objet;
	}//VueOursFemelle()
	
}//VueOursFemelle
