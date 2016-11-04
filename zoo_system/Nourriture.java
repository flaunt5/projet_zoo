package zoo_system;

public abstract class Nourriture extends Model{
	protected int gainNiveauFaim;

	/**
	 * Retourne la valeur de l'attribut gainNiveauFaim
	 * @return valeur de l'attribut gainNiveauFaim
	 */
	public int getGainNiveauFaim() {
		return this.gainNiveauFaim;
	}//getGainNiveauFaim()
}//Nourriture()
