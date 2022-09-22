package Sala;


import java.util.ArrayList;

import Film.AbstractFilm;

//interfaccia sala utilizzata dalle classi Sala2D e Sala3D
public interface ISala {
	
	
	//metodi dell'interfaccia
	public String getName();
	// metodo per ritornare il numero univoco della sala
	public int getNumSala();
	//metodo per ritornare i posti liberi
	public int getNpostiLiberi();
	//metodo per ritornare i posti occupati
	public int getNpostiOccupati();
	//metodo per ritornare se la sala è al completo o meno
	public boolean isFull();
	//metodo per aggiungere un posto
	public void addPosto();
	//metodo per aggiungere un film
	void addFilm(AbstractFilm film);
	//metodo per ritornare un film
	AbstractFilm  getFilm(Film.Film f);
	//metodo per ritornare il tipo della sala
	boolean getType();
	//metodo che ritorna una lista la quali contiene le programmazioni per la sala
	public ArrayList<AbstractFilm> getFilm();
	

}//end ISala 
