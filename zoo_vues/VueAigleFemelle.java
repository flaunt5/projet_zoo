package zoo_vues;

import zoo_animaux.concret.AigleFemelle;

/**
 * VueAigleFemelle est la classe qui va permettre de réaliser les différents affichage de la classe AigleFemelle
 * @author Alexandre
 *
 */
public class VueAigleFemelle extends VueAnimal<AigleFemelle>{
	/**
	 * Creer un objet de type VueAigleFemelle
	 * @param objet 
	 * 				un objet de type AigleFemelle
	 */
	public VueAigleFemelle(AigleFemelle objet){
		this.model = objet;
	}//VueAigleFemelle()
	
}//VueAigleFemelle