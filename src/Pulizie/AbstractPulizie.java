 package Pulizie;

import java.util.Objects;

import Sala.ISala;

public abstract class AbstractPulizie implements IPulizie{
	
	private int ID;
	private String Name;
	private int CleaningTime;
	
	//COSTRUTTORE
	public AbstractPulizie(String Name, int CleaningTime) {
		this.ID = this.ID++;
		this.Name = Name;
		this.CleaningTime = CleaningTime;
	}
	
	//secondo costruttore nel caso in cui non si conosca il tempo impiegato a pulire la sala
	public AbstractPulizie(String Name) {
		this.ID = this.ID++;
		this.Name = Name;
		this.CleaningTime = 0;
	}
	
	/**
	 * @return ID
	 */
	public int getID() {
		return ID;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.Name = name;
	}

	/**
	 * @return the cleaningTime
	 */
	public int getCleaningTime() {
		return CleaningTime;
	}

	/**
	 * @param cleaningTime the cleaningTime to set
	 */
	public void setCleaningTime(int cleaningTime) {
		this.CleaningTime = cleaningTime;
	}
	
	//metodo per pulire la sala, restituisce true se la sala è stata pulita
	public boolean Clean(ISala sala) {
		int TimeInSeconds = this.CleaningTime * 60;
		
		for(int i = 0; TimeInSeconds == 0; i++) {
			decrease(TimeInSeconds);
		}
		
		//se il tempo è terminato la sala è stata pulita
		if(TimeInSeconds == 0) {
			System.out.println("la sala "+ sala.getName() +" è stata pulita");
			return true;
		}else
			return false;
	}
	
	//metodo per decrementare un valore intero
	private void decrease(int seconds) {
		if(seconds == 0) {
			throw new IllegalStateException();
		}else
			seconds = seconds - 1;		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPulizie other = (AbstractPulizie) obj;
		return CleaningTime == other.CleaningTime && ID == other.ID && Objects.equals(Name, other.Name);
	}

	@Override
	public String toString() {
		return "ditta Pulizie [ID=" + this.ID + ", Name=" + this.Name + ", CleaningTime=" + this.CleaningTime + "]";
	}
	
}
