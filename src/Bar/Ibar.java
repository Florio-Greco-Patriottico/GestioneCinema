package Bar;

import java.util.List;

import Product.AbstractProduct;
import Utente.AbstractUtente;

public interface Ibar {
	
	//metodo per ritoranare il nome
	public String getName();
	//metodo per ritornare i prodotti
	public void getProduct();
	//metodo per ritornare i commessi
	public void  getShopAssistant();
	//metodo per aggiungere un prodotto
	public void addProduct(AbstractProduct p);
	//metodo per aggiungere un commesso
	public boolean addShopAssistant(AbstractUtente u);

}//end Ibar
