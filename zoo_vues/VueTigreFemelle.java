package zoo_vues;

import zoo_animaux.concret.TigreFemelle;

/**
 * VueTigreFemelle est la classe qui va permettre de r�aliser les diff�rents affichage de la classe TigreFemelle
 * @author Alexandre
 *
 */
public class VueTigreFemelle extends VueAnimal<TigreFemelle>{
	/**
	 * Creer un objet de type VueTigreFemelle
	 * @param objet 
	 * 				un objet de type TigreFemelle
	 */
	public VueTigreFemelle(TigreFemelle objet){
		this.model = objet;
	}//VueTigreFemelle()
	
}//VueTigreFemelle