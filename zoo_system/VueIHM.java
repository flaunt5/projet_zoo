package zoo_system;

public class VueIHM extends Vue<IHM>{
	
	public VueIHM(IHM object){
		this.model= object;
	}//VueIHM()
	
	public void afficherMenuAction(){
		System.out.println(this.getModel().getMenuAction());
	}
}//VueIHM
