package zoo_vues;

import zoo_models.Aquarium;

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
