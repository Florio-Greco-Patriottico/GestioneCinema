package Utente;

import java.util.HashMap;
import java.util.Objects;

import Biglietto.AbstractBiglietto;
import Film.AbstractFilm;
import Sala.AbstractSala;

//classe gestore, si occuperà di gestire il cinema

public class Gestore extends AbstractUtente {
	
	//dichiarazione degli attributi funzionali
	private HashMap<AbstractSala,AbstractUtente> reservation;
	
	
	//costruttore
	public Gestore(int age, String name, String surname, boolean gender) {
		super(age, name, surname, gender);
		// TODO Auto-generated constructor stub
	}//end costruttore
	
	//INTERFACCIA PUBBLICA DEL GESTORE
	public void getReservations(AbstractFilm film) {
		try {
			this.reservation.forEach((e,a) ->  {
				if(e.equals(film)) {
					System.out.println("sala : " + e.getNumSala());
					reservation.forEach((k, v) -> System.out.println("Cliente : " + v.getName() + ", " + v.getSurname() + ", età : " + v.getAge() + ", genere : " + v.getGender()));
				}
			});
		}catch(Exception e) {
			System.out.println("Error found: " + e);
		}
	}

	
}//end classe Gestore
