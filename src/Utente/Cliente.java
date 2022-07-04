package Utente;

import java.util.Objects;

//classe cliente, si occuper� di simulare le iterazione all'interno del cinema

public class Cliente implements IUtente{
	
	//dichiarazione degli attributi funzionali
	private int age;								//variabile utilizzata per l'eta
	private String name;							//variabile utilzzata per il nome
	private String surname;							//variabile utilzzata per il cognome
	private boolean gender;							//variabile utilizzata per il genere,
													//TRUE = Cliente
	
	//costruttore 
	public Cliente(int age,String name,String surname) {
		super();
		//inizializzo gli attributi funzionali
		this.age 		= age;
		this.name 		= name;
		this.surname 	= surname;
		this.gender 	= true;
	}//end cliente
	
	//INERFACCIA PUBBLICA DELLA CLASSE
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
		//return Objects.hash(age, gender, name, surname);
	}//end hashCode

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name)
				&& Objects.equals(surname, other.surname);
	}//end equals
	
	//Metodi dell'interfaccia
	@Override
	public int getAge() {
		return this.age;
	}//end getAge

	@Override
	public String getName() {
		return this.name;
	}//end getName

	@Override
	public String getSurname() {
		return this.surname;
	}//end getSurname

	@Override
	public boolean getGender() {
		return this.gender;
	}//end getGender
	
	@Override
	public String toString() {
		return "Cliente : [age=" + age + ", name=" + name + ", surname=" + surname + ", gender=" + gender + "]";
	}//end toString

}//end classe Cliente
