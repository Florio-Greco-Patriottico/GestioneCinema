package Controller;

import java.util.Set;

import Product.IProduct;
import Sala.ISala;

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
	public void CreateBar();
	public void associatesBar();
	public void AddProductToBar();
	public String[] getSale();
	public int getPosti(ISala s);
	
}//end Manager
