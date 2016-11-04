package zoo_system;

public abstract class Vue<T> {
	protected T model;
	
	/**
	 * Afficher caracteristiques du modele
	 */
	public void details(){
		System.out.println(this.model.toString());
	}//details()

	/**
	 * Recupere les attributs d'un modele
	 * @return retourne les attributs du modele
	 */
	protected T getModel() {
		return model;
	}//getModel()
	
}//Vue
