package zoo_vues;

import zoo_models.Voliere;

public class VueVoliere extends VueEnclos<Voliere>{
	/**
	 * Creer un objet de type VueVoliere
	 * @param objet 
	 * 				un objet de type Voliere
	 */
	public VueVoliere(Voliere objet){
		this.model = objet;
	}//VueVoliere()
}