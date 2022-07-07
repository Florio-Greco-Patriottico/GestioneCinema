package Utente;

import java.util.HashMap;

import Biglietto.AbstractBiglietto;
import Film.AbstractFilm;

//classe cliente, si occuperà di simulare le iterazione all'interno del cinema

public class Cliente extends AbstractUtente{

	//biglietto del cliente
	private HashMap<AbstractFilm,AbstractBiglietto> tickets;
	
	//costruttore
	public Cliente(int age, String name, String surname, boolean gender) {
		super(age, name, surname, gender);
		//inizializzo gli attributi funzionali
		this.tickets = new HashMap<>();
	}//end costruttore
	
	//INTERFACCIA PUBBLICA DEL CLIENTE
	//metodo per aggiungere un biglietto
	public void addTicket(AbstractFilm film, AbstractBiglietto biglietto) {
		try{
			this.tickets.put(film, biglietto);
		}catch(Exception e) {
			System.out.println("Error found: " + e);
		} 
	}//end addTicket
	
	//metodo per visualizzare i propri biglietti
	public void getTickets() {
		try {
			this.tickets.entrySet().forEach( entry -> {
			    System.out.println( entry.getKey() + " => " + entry.getValue() );
			});
		}catch(Exception e) {
			System.out.println("Error found: " + e);
		}
	}//end getTickets
	
	//metodo per disdire un biglietto
	public boolean removeTicket(AbstractFilm film, AbstractBiglietto biglietto) {
		try {
			//controllo se esiste il biglietto
			if(this.tickets.containsKey(film)) {
				this.tickets.remove(film, biglietto);
				return true;
			}else {
				System.out.println("Ticket not found.");
				return false;
			}
		}catch(Exception e) {
			System.out.println("Error found: " + e);
			return false;
		}
	}
}//end classe Cliente
