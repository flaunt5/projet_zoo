package zoo_system;

public abstract class Vue<T> {
	protected T model;
	
	/**
	 * Afficher caracteristiques du model
	 */
	public void details(){
		System.out.println(this.model.toString());
	}//details()

	/**
	 * Recupere la valeur de l'attributs model
	 * @return Valeur de l'attributs model
	 */
	protected T getModel() {
		return model;
	}//getModel()
	
}//Vue
