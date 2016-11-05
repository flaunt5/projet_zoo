package zoo_vues;

import zoo_animaux.Animal;

/**
 * VueAnimal est la classe qui va permettre de réaliser les différents affichage de la classe Animal
 * @author Alexandre
 *
 */
public abstract class VueAnimal<T extends Animal> extends Vue<T>{
	/**
	 * Affiche le cri de l'animal
	 */
	public void crier() {
		System.out.println(this.getModel().emmetreSon());
	}//crier()
}//VueAnimal
