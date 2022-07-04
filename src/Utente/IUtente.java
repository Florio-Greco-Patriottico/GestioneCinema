package Utente;

//intefaccia della classe Cliente e Gestore:
//prevede i seguenti metodi:
// 1. get eta
// 2. get nome
// 3. get cognome
// 4. get genere

public interface IUtente {
	
	//INTERFACCIA PUBBLICA DELLA CLASSE
	
	//metodo per ritornare l'eta
	public int getAge();
	
	//metodo per ritornare il nome
	public String getName();
	
	//metodo per ritornare il cognome
	public String getSurname();
	
	//metodo per ritornare il genere
	//in questo caso TRUE = Cliente, FALSE = Gestore
	public boolean getGender();
	
}//end IUtente
