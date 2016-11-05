package zoo_vues;

/**
 * Vue est la classe qui va permettre de réaliser les différents affichage des différentes classe
 * @author Alexandre
 *
 */
public abstract class Vue<T> {
	/**
	 * Model serra la classe que laquel va se baser la vue
	 */
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
	public T getModel() {
		return model;
	}//getModel()
	
}//Vue
