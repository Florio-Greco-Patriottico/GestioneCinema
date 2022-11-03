package Sala;

import java.util.ArrayList;
import java.util.Objects;

import Film.AbstractFilm;
import Film.Film;

public abstract class AbstractSala implements ISala {
	// Dichiarazione degli attributi funzionali
	private String name;   
	private int numSala;   // variabile per tenere conto del numero della sala
	private int numPostiL; // variabile per tenere conto dei posti liberi
	private int numPostiO; // varibile per tenere conto dei posti occupati
	private boolean isFull; // variabile per controllare se la sala e' piena
	private boolean type;
	private ArrayList<AbstractFilm> programmazioni; // variabile per la lista delle programmazioni

	/**
	 * Costruttore
	 * @param name
	 * @param id
	 * @param posti
	 * @param type
	 */
	public AbstractSala(final String name, final int id, int posti, boolean type) {
		super();
		// inizializzazione degli attributi funzionali
		this.name = name;
		this.numSala = id;
		this.numPostiL = posti;
		this.numPostiO = 0;
		this.isFull = false;
		this.type = type;
		this.programmazioni = new ArrayList<AbstractFilm>();
	}// end costruttore

	// INTERFACCIA PUBBLICA DELLA CLASSE
	/**
	 * Metodo per ritornare il nome
	 * @return name
	 */
	@Override
	public String getName() {
		return this.name;
	}//end getName()

	/**
	 * Metodo per ritornare il numero della sala
	 * @return numSala
	 */
	@Override
	public int getNumSala() {
		return this.numSala;
	}// end getNumSala

	/**
	 * Metodo per rirotnare il numero dei posti liberi
	 * @return numPostiL
	 */
	@Override
	public int getNpostiLiberi() {
		return this.numPostiL;
	}// end getNpostiLiberi

	/**
	 * Metodo per ritornare il numero di posti occupati
	 * @return numPostio
	 */
	@Override
	public int getNpostiOccupati() {
		return this.numPostiO;
	}// end getNpostiOccupati

	/**
	 * Metodo per controllare se la sala è piena
	 * @return isFull
	 */
	@Override
	public boolean isFull() {
		return this.isFull;
	}// end isFull

	/**
	 * Metodo per aggiungere un posto alla sala
	 */
	@Override
	public void addPosto() {
		if (this.numPostiO == this.numPostiL) {
			System.out.println("Non vi sono posti liberi da assegnare.");
			// imposto la sala come piena
			this.isFull = true;
		} else {
			this.numPostiL--;
			this.numPostiO++;
			System.out.println("E' stato assegnato un posto");
		}
	}// end addPosto

	/**
	 * Metodo per ritornare i film
	 * @return programamzioni
	 */
	@Override
	public ArrayList<AbstractFilm> getFilm() {
		return this.programmazioni;
	}// end getFilm

	/**
	 * Metodo per aggiungere un film
	 * @parms film
	 */
	@Override
	public void addFilm(AbstractFilm film) {
		this.programmazioni.add(film);
	}// end addFilm

	@Override
	public int hashCode() {
		return Objects.hash(isFull, numPostiL, numPostiO, numSala, programmazioni);
	}// end hashCode

	@Override
	public boolean getType() {
		return this.type;
	}// end getType
	
	/**
	 * Metodo per ritornare un film
	 */
	public AbstractFilm getFilm(Film f) {
		return this.programmazioni.stream().filter(e -> e.equals(f)).findFirst().get();
	}// end getFilm
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractSala other = (AbstractSala) obj;
		return isFull == other.isFull && numPostiL == other.numPostiL && numPostiO == other.numPostiO
				&& numSala == other.numSala && Objects.equals(programmazioni, other.programmazioni);
	}// end Equals

	@Override
	public String toString() {
		return "Sala2D [numSala=" + numSala + ", numPostiL=" + numPostiL + ", numPostiO=" + numPostiO + ", isFull="
				+ isFull + ", programmazioni=" + programmazioni + "]";
	}// end toString

}
