package zoo_models;

import java.util.ArrayList;

/**
 * Tri est la classe qui repr�sente un tri sur une liste
 * @author Alexandre
 *
 */
public interface Tri<T> {
	/**
	 * Trier la liste des animaux selon le tri choisi
	 * @param listAnimaux
	 * 				Liste des animaux � trier
	 */
	public void trier(ArrayList<T> listAnimaux);
}//Tri
