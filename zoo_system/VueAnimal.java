package zoo_system;

public abstract class VueAnimal<T extends Animal> extends Vue<T>{
	
	public void crier() {
		System.out.println(this.getModel().emmetreSon());
	}//crier()
}//VueAnimal
