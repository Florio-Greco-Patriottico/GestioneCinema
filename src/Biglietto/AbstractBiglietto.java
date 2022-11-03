package Biglietto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractBiglietto implements IBiglietto{
	
	//Dichiarazione degli attributi funzionali della classe
	private int IDfilm;
	private int Number = 0;
	private double ManPrice;
	private double WomanPrice;
	private double ChildPrice;
	
	//Costruttore
	public AbstractBiglietto(int IDfilm, double ManPrice, double WomanPrice, double ChildPrice) {
		//inizializzo il costruttore della classe padre
		super();
		//inizializzo gli attributi funzionali della classe
		this.Number++;
		this.IDfilm = IDfilm;
		this.ManPrice = ManPrice;
		this.WomanPrice = WomanPrice;
		this.ChildPrice = ChildPrice;
	}//end costruttore
	
	//costuttore 2
	public AbstractBiglietto(double ManPrice, double WomanPrice, double ChildPrice) {
		//inizializzo il costruttore della classe padre
		super();
		//inizializzo gli attributi funzionali
		this.Number++;
		this.ManPrice = ManPrice;
		this.WomanPrice = WomanPrice;
		this.ChildPrice = ChildPrice;
	}//end costruttore 2

	/**
	 * metodo per ritornare l'id del film
	 */
	@Override
	public int getIDfilm() {
		return IDfilm;
	}//end getIdFilm()

	/**
	 * metodo per ritornare il numero
	 */
	@Override
	public int getNumber() {
		return this.Number;
	}//end getNumber()

	/**
	 * metodo per ritornare il prezzo del biglietto relativo agli uomoni
	 */
	@Override
	public double getManPrice() {
		return this.ManPrice;
	}//end getManPrice()

	/**
	 * metodo per ritornare il prezzo del biglietto relativo alle donne
	 */
	@Override
	public double getWomanPrice() {
		return this.WomanPrice;
	}//end gertWomanPrice()

	/**
	 * metodo per ritornare il prezzo del biglietto relativo ai bambini
	 */
	@Override
	public double getChildPrice() {
		return this.ChildPrice;
	}//end getChildPrice()

	/**
	 * Metodo per impostare l'id del film
	 */
	@Override
	public void setIDfilm(int iD) {
		IDfilm = iD;
	}//end metodo setIDfilm()
	
	/**
	 * Metodo per impostare il prezzo del biglietto per gli uomini
	 */
	@Override
	public void setManPrice(double ManPrice) {
		this.ManPrice = ManPrice;
	}//end setManprice()

	/**
	 * Metodo per impostare il prezzo del biglietto per le donne
	 */
	@Override
	public void setWomanPrice(double WomanPrice) {
		this.WomanPrice = WomanPrice;
	}//end setWomanPrice()

	/**
	 * Metodo per impostare il prezzo del biglietto per i bambini
	 */
	@Override
	public void setChildPrice(double ChildPrice) {
		this.ChildPrice = ChildPrice;
	}//end SetChildPrice()

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractBiglietto other = (AbstractBiglietto) obj;
		return this.Number == other.Number;
	}

	@Override
	public String toString() {
		return "Biglietto [Film: " +this.IDfilm +", Matricola:" + this.Number + ", prezzoUomo:" + this.ManPrice + ", prezzoDonna:"
				+ this.WomanPrice + ", prezzoBambino:" + this.ChildPrice + "]";
	}
}//end classe
