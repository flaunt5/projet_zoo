package zoo_animaux;

/**
 * Interface decrivant comment pondent les animaux femelle qui on la capcit� de le faire
 * @author Alexandre
 *
 */
public interface AutreFemelle extends Femelle {
	/**
	 * Methode qui va creer des b�b�s d'animaux pour les animaux qui pondent des oeufs
	 * @return Liste des b�b�s  n�es et b�b�s  morts
	 */
	public String pondre();	
}//AutreFemelle
