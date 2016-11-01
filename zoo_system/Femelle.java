package zoo_system;

public interface Femelle {
	final char SEXE = 'F';
	
	public boolean isEnceinte();

	public void setEnceinte(boolean enceinte);
	
	public int getPeriodeEnfantement();

	public int getTempEnceinte() ;

	public void setTempEnceinte(int tempEnceinte);
}//Femelle
