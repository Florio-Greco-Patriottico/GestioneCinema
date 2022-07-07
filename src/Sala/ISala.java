package Sala;


import java.util.ArrayList;

//interfaccia sala utilizzata dalle classi Sala2D e Sala3D
public interface ISala {
	
	
	//metodi dell'interfaccia
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
	void addFilm(Film.Film f);
	//metodo per ritornare un film
	Film.Film  getFilm(Film.Film f);
	//metodo per ritornare il tipo della sala
	boolean getType();
	//metodo che ritorna una lista la quali contiene le programmazioni per la sala
	public ArrayList<Film.Film> getFilm();

}//end ISala 
