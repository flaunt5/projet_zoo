package zoo_system;

public abstract class Vue<T> {
	protected T model;
	
	public void details(){
		System.out.println(this.model.toString());
	}//details()

	protected T getModel() {
		return model;
	}//getModel()
	
}//Vue
