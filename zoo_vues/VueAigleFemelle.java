package zoo_vues;

import zoo_animaux.concret.AigleFemelle;

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