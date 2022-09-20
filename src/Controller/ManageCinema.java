package Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import Product.Beverage;
import Product.IProduct;
import Product.Snack;
import Sala.ISala;
import Sala.Sala2D;
import Sala.Sala3D;

public class ManageCinema implements Manager {
	/*
	 * implementazione metodi interfaccia (Manager)
	 * 
	 * 
	 * 
	 */
	
	private final Set<ISala> sale;
	private final Set<IProduct> products;
	
	public ManageCinema(Set<ISala> sale, Set<IProduct> products){
		this.sale = sale;
		this.products = products;
	}
	
	public Set<ISala> getSale() {
		return sale;
	}
	
	public Set<IProduct> getProducts() {
		return products;
	}

	/**
	 * Creates a list of sale.
	 * 
	 * @return a list of sale
	 */
	public Set<ISala> createSale() {
		Set<ISala> sale = new HashSet<>();
		
		//creo una lista di sale
		List<ISala> SaleCinema = Arrays.asList(new Sala2D("sala 1",1,30,true),
											   new Sala3D("sala 2",2,20,false),
											   new Sala2D("sala 3",3,40,true));
		
		//aggiungo tutte le sale create all'insieme delle sale
		sale.addAll(SaleCinema);
		
		//restituisco le sale create
		return sale;
	}		
	
	/**
	 * Creates a list of product.
	 * 
	 * @return a list of product
	 */
	public Set<IProduct> createProduct() {
		Set<IProduct> products = new HashSet<>();
		
		//creo una lista di sale
		List<IProduct> AllProducts = Arrays.asList(new Snack(),
												   new Beverage());
		
		//aggiungo tutte le sale create all'insieme delle sale
		products.addAll(AllProducts);
		
		//restituisco le sale create
		return products;
	}		
}//end ManageCinema
