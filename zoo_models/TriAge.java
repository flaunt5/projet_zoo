package zoo_models;

import java.util.ArrayList;

import zoo_animaux.Animal;

public class TriAge<T extends Animal> implements Tri<T>{

	/**
	 * Tri la liste des animaux en fonction de l'age des animaux
	 * @param listAnimaux
	 * 					Liste des animaux a trier
	 */
	public void trier(ArrayList<T> listAnimaux) {
		boolean permutation = true;
		int passage = 0;
		while(permutation == true){
			permutation = false;
			++passage;
			for(int i = 0; i < listAnimaux.size() - passage; ++i){
				if(listAnimaux.get(i).getAge() > listAnimaux.get(i + 1).getAge()){
					permutation = true;
					T temp =  listAnimaux.get(i);
					listAnimaux.set(i, listAnimaux.get(i + 1));
					listAnimaux.set(i + 1, temp);
				}
			}
		}
	}//trier()
}//TriAge
