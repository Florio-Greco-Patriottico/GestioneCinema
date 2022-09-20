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
import Sala.AbstractSala;
import Sala.ISala;
import Sala.Sala2D;
import Sala.Sala3D;
import Utente.IUtente;

public class ManageCinema implements Manager {
	/*
	 * implementazione metodi interfaccia (Manager)
	 */
	
	ArrayList<ISala> sales;
	ArrayList<IUtente> shopassistants;
	private String[] rets;
	
	//costruttore
	public ManageCinema() {
		this.sales = new ArrayList<>();
		this.shopassistants = new ArrayList<>();
		//creo tutti gli oggetti di cui avrò bisogno
		this.createSale();
		this.CreateProduct();
		this.CreateShopAssistants();
		this.AddProductToBar();
		this.associatesBar();
	}//end costruttore

	@Override
	public void createSale() {
		//dichiaro le mie sale
		AbstractSala Sala2D_1;
		AbstractSala Sala2D_2;
		AbstractSala Sala2D_3;
		AbstractSala Sala2D_4;
		AbstractSala Sala3D_1;
		AbstractSala Sala3D_2;
		AbstractSala Sala3D_3;
		AbstractSala Sala3D_4;
		
		//inizializzo le mie sale
		Sala2D_1 = new Sala2D("Sala2D_1",1, 10, true);
		Sala2D_2 = new Sala2D("Sala2D_2",1, 10, true);
		Sala2D_3 = new Sala2D("Sala2D_3",1, 10, true);
		Sala2D_4 = new Sala2D("Sala2D_4",1, 10, true);
		Sala3D_1 = new Sala3D("Sala3D_1",1, 10, false);
		Sala3D_2 = new Sala3D("Sala3D_2",1, 10, false);
		Sala3D_3 = new Sala3D("Sala3D_3",1, 10, false);
		Sala3D_4 = new Sala3D("Sala3D_4",1, 10, false);
		
		//aggingo le mie sale alla struttura
		this.sales.add(Sala2D_1);
		this.sales.add(Sala2D_2);
		this.sales.add(Sala2D_3);
		this.sales.add(Sala2D_4);
		this.sales.add(Sala3D_1);
		this.sales.add(Sala3D_2);
		this.sales.add(Sala3D_3);
		this.sales.add(Sala3D_4);
		
	}//end createSale();

	@Override
	public void CreateProduct() {
		// TODO Auto-generated method stub
		
	}//end createProduct

	@Override
	public void CreateShopAssistants() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddProductToBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getSale() {
		String[] rets = new String[this.sales.size()];
		try {
			for(int i = 0; i < this.sales.size(); i++) {
				String name = this.sales.get(i).getName();
				rets[i] = name;
			}	
		}catch(Exception e) {
			System.out.println(e);
		}
		return rets;
	}

	@Override
	public int getPosti(ISala s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void CreateBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void associatesBar() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	private final Set<ISala> sales; 
	private final Set<IProduct> products;
	
	public ManageCinema(){
		this.sales = new HashSet<>();
		this.products = new HashSet<>();
	}
	
	public 
	
	public ArrayList<String> getSale() {
		ArrayList<String> ret = null;
		Iterator<String> setIterator = new Iterator();
		return ret;
	}
	
	public Set<IProduct> getProducts() {
		return products;
	}

	public void createSale() {
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
	
	*/

		
}//end ManageCinema
