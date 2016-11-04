package zoo_system;

public abstract class VueEnclos<T extends Enclos<? extends Animal>> extends Vue<T>{

	public void effectuerTri(){
		System.out.println(this.getModel().effectuerTri());
	}
}//VueEnclos

