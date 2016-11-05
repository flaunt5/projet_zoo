package zoo_vues;

import zoo_animaux.concret.AigleMale;

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