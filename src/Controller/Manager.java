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
	
	/**
	 * @return a Set of all the products
	 */
	Set<IProduct> getProducts();
	
	/**
	 * @return a Set of all the Sale
	 */
	Set<ISala> getSale();
	
	/**
	 * create all the Sale
	 */
	Set<ISala> createSale();
	
}//end Manager
