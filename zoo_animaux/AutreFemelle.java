package zoo_animaux;

/**
 * Interface decrivant comment pondent les animaux femelle qui on la capcité de le faire
 * @author Alexandre
 *
 */
public interface AutreFemelle extends Femelle {
	/**
	 * Methode qui va creer des bébés d'animaux pour les animaux qui pondent des oeufs
	 * @return Liste des bébés  nées et bébés  morts
	 */
	public String pondre();	
}//AutreFemelle
