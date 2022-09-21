package Controller;

import java.util.ArrayList;
import java.util.Set;

import Product.AbstractProduct;
import Product.IProduct;
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

	public void createSale();
	public void CreateProduct();
	public void CreateShopAssistants();
	public String[] getSale();
	public int getPosti(ISala s);
	void AddElementToBar(ArrayList<AbstractUtente> u, ArrayList<AbstractProduct> p);
	
}//end Manager
