package zoo_divers.equipements;

import zoo_models.Model;

public abstract class Nourriture extends Model{
	protected int gainNiveauFaim;

	/**
	 * Retourne la valeur de l'attribut gainNiveauFaim
	 * @return Valeur de l'attribut gainNiveauFaim
	 */
	public int getGainNiveauFaim() {
		return this.gainNiveauFaim;
	}//getGainNiveauFaim()
}//Nourriture()