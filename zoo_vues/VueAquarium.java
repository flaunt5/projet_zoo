package zoo_vues;

import zoo_models.Aquarium;

/**
 * VueAquarium est la classe qui va permettre de réaliser les différents affichage de la classe Aquarium
 * @author Alexandre
 *
 */
public class VueAquarium extends VueEnclos<Aquarium>{
	/**
	 * Creer un objet de type VueAquarium
	 * @param objet 
	 * 				un objet de type Aquarium
	 */
	public VueAquarium(Aquarium objet){
		this.model = objet;
	}//VueAquarium()

}//VueAquarium
