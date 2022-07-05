package Sala;

import java.util.ArrayList;
import java.util.Objects;

import Film.Film;

public class Sala3D implements ISala {
	
	//Dichiarazione degli attributi funzionali
	private int numSala;						//variabile per tenere conto del numero della sala
	private int numPostiL;						//variabile per tenere conto dei posti liberi
	private int numPostiO;					    //varibile per tenere conto dei posti occupati
	private boolean isFull;					    //variabile per controllare se la sala � piena
	private ArrayList<Film> programmazioni;		//variabile per la lista delle programmazioni
	
	//costuttore
	public Sala3D(final int id,int posti) {
		super();
		//inizializzazione degli attributi funzionali
		this.numSala 		= id;
		this.numPostiL 		= posti;
		this.numPostiO  	= 0;
		this.isFull     	= false;
		this.programmazioni = new ArrayList<Film>();
	}//end costruttore
	
	//INTERFACCIA PUBBLICA DELLA CLASSE
	@Override
	public int getNumSala() {
		return this.numSala;
	}//end getNumSala

	@Override
	public int getNpostiLiberi() {
		return this.numPostiL;
	}//end getNpostiLiberi

	@Override
	public int getNpostiOccupati() {
		return this.numPostiO;
	}//end getNpostiOccupati

	@Override
	public boolean isFull() {
		return this.isFull;
	}//end isFull

	//metodo per prenotare un posto
	@Override
	public void addPosto() {
		if(this.numPostiO == this.numPostiL) {
			System.out.println("Non vi sono posti liberi da assegnare.");
			//imposto la sala come piena
			this.isFull = true;
		}else {
			this.numPostiL--;
			this.numPostiO++;
			System.out.println("E' stato assegnato un posto");
		}
	}//end addPosto
	
	@Override
	public ArrayList<Film> getFilm() {
		return this.programmazioni;
	}//end getFilm

	@Override
	public void addFilm(Film f) {
		this.programmazioni.add(f);
	}//end addFilm
	
	@Override
	public int hashCode() {
		return Objects.hash(isFull, numPostiL, numPostiO, numSala, programmazioni);
	}//end hashCode

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala3D other = (Sala3D) obj;
		return isFull == other.isFull && numPostiL == other.numPostiL && numPostiO == other.numPostiO
				&& numSala == other.numSala && Objects.equals(programmazioni, other.programmazioni);
	}//end Equals


	@Override
	public String toString() {
		return "Sala3D [numSala=" + numSala + ", numPostiL=" + numPostiL + ", numPostiO=" + numPostiO + ", isFull="
				+ isFull + ", programmazioni=" + programmazioni + "]";
	}//end toString

}//end classe Sala3D
