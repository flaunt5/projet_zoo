package zoo_vues;

import zoo_models.Voliere;

/**
 * VueVoliere est la classe qui va permettre de réaliser les différents affichage de la classe Voliere
 * @author Alexandre
 *
 */
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
