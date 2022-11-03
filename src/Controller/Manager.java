package Controller;

import java.util.ArrayList;
import java.util.Set;

import Biglietto.AbstractBiglietto;
import Film.AbstractFilm;
import Product.AbstractProduct;
import Product.IProduct;
import Sala.AbstractSala;
import Sala.ISala;
import Utente.AbstractUtente;
import Utente.IUtente;

public interface Manager {
	/*
	 * 1. public Set<ISala> CreateSale();
	 * 2. public void CreateProduct()
	 * 3. public void CreateShopAssitants();
	 * 4. public void AddProductToBar();
	 */
	
	/**
	 * Meotodo per creare le sale
	 */
	public void createSale();
	/**
	 * Metodo per creare i prodotti
	 */
	public void CreateProduct();
	/**
	 * Metoto per creare i commessi
	 */
	public void CreateShopAssistants();
	/**
	 * Metodo per creare i biglietti
	 * @param f
	 */
	public void CreateTicket(ArrayList<AbstractFilm> f);
	/**
	 * Metodo per creare la ditta di pulizie
	 */
	public void Pulizie();
	/**
	 * Metodo per ritornare le sale
	 * @return
	 */
	public String[] getSale();
	/**
	 * Metodo per ritornare i posti
	 * @param s
	 * @return
	 */
	public int getPosti(AbstractSala s);
	/**
	 * Metodo per aggiungere elementi al bar
	 * @param u
	 * @param p
	 */
	void AddElementToBar(ArrayList<AbstractUtente> u, ArrayList<AbstractProduct> p);
	
}//end Manager
