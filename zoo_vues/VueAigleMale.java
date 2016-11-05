package zoo_vues;

import zoo_animaux.concret.AigleMale;

/**
 * VueAigleMale est la classe qui va permettre de réaliser les différents affichage de la classe AigleMale
 * @author Alexandre
 *
 */
public class VueAigleMale extends VueAnimal<AigleMale>{
	/**
	 * Creer un objet de type VueAigleMale
	 * @param objet 
	 * 				un objet de type AigleMale
	 */
	public VueAigleMale(AigleMale objet){
		this.model = objet;
	}//VueAigleMale()
	
}//VueAigleMale