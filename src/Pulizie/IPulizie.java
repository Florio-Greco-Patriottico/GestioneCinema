package Pulizie;

public interface IPulizie {

	//metodi dell'interfaccia
	
	//metodo per tornare l'id univoco 
	public int getID();

	//metodo per ritornare il nome della ditta di pulizie
	public String getName();
	
	//metodo per ritornare il tempo di pulizia della sala in minuti
	public int getCleaningTime();
	
	//metodo per modificare il nome della ditta di pulizie
	public void setName(String Name);
	
	//metodo per modificare il tempo di pulizia della sala in minuti
	public void setCleaningTime(int minute);
	
	//metodo per fal pulire una sala
	public boolean Clean(int idSala);
}
