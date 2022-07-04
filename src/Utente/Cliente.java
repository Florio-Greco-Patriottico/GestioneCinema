package Utente;

//classe cliente, si occuperà di simulare le iterazione all'interno del cinema

public class Cliente implements IUtente{
	
	//dichiarazione degli attributi funzionali
	private int age;
	private String name;
	private String surname;
	private boolean gender;
	
	//costruttore 
	public Cliente(final int age, final String name, final String surname, final boolean gender) {
		//inizializzo gli attributi funzionali
		this.age 		= age;
		this.name 		= name;
		this.surname 	= surname;
		this.gender 	= gender;
	}//end cliente
	
	
	//Metodi dell'interfaccia
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getGender() {
		// TODO Auto-generated method stub
		return false;
	}

}
