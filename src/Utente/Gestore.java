package Utente;

import java.util.ArrayList;
import java.util.HashMap;

import Film.AbstractFilm;
import Sala.AbstractSala;

//classe gestore, si occupera' di gestire il cinema

public class Gestore extends AbstractUtente {

	// dichiarazione degli attributi funzionali
	private HashMap<AbstractSala, AbstractUtente> reservation;
	private ArrayList<AbstractSala> sale;

	// costruttore
	public Gestore(int age, String name, String surname, boolean gender) {
		super(age, name, surname, gender);
		// TODO Auto-generated constructor stub
	}// end costruttore

	// INTERFACCIA PUBBLICA DEL GESTORE
	public void getReservations(AbstractFilm film) {
		try {
			this.reservation.forEach((e, a) -> {
				if (e.equals(film)) {
					System.out.println("sala : " + e.getNumSala());
					reservation.forEach((k, v) -> System.out.println("Cliente : " + v.getName() + ", " + v.getSurname()
							+ ", eta' : " + v.getAge() + ", genere : " + v.getGender()));
				}
			});
		} catch (Exception e) {
			System.out.println("Error found: " + e);
		}
	}

	// idea da implementare
	public boolean changeFilm(AbstractFilm oldFilm, AbstractFilm newFilm, AbstractSala film) {
		return true;
	}

	public void addSalaToCinema(AbstractSala s) {
		this.sale.add(s);
	}

	public String[] getSale() {
		String[] s = new String[sale.size()];
		try {
			for (int i = 0; i < sale.size(); i++) {
				String name = sale.get(i).getName();
				s[i] = name;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return s;
	}
	
	public AbstractSala getSala(String name) {
		AbstractSala current = null;
		try {
			for(int i = 0; i < sale.size(); i++) {
				AbstractSala c = sale.get(i);
				if(c.getName().equals(name)) {
					current = c;
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}

		return current;
	}

}// end classe Gestore
