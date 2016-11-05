package zoo_divers.equipements;

import zoo_models.Model;

/**
 * Nourriture represente la nourriture que va utilisé l'employe pour nourir les animaux
 * @author Alexandre
 *
 */
public abstract class Nourriture extends Model{
	/**
	 * Le nombre de points de niveau de faim que va gagner l'animal en mangeant la nourriture
	 */
	protected int gainNiveauFaim;

	/**
	 * Retourne la valeur de l'attribut gainNiveauFaim
	 * @return Valeur de l'attribut gainNiveauFaim
	 */
	public int getGainNiveauFaim() {
		return this.gainNiveauFaim;
	}//getGainNiveauFaim()
}//Nourriture()
