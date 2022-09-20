package Controller;

import java.util.ArrayList;

import Product.*;
import Sala.AbstractSala;
import Sala.ISala;
import Sala.Sala2D;
import Sala.Sala3D;
import Utente.AbstractUtente;
import Utente.Commesso;
import Utente.IUtente;

public class ManageCinema implements Manager {
	/*
	 * implementazione metodi interfaccia (Manager)
	 */
	
	ArrayList<ISala> sales;
	ArrayList<IUtente> shopassistants;
	ArrayList<IProduct> products;
	private String[] rets;
	
	//costruttore
	public ManageCinema() {
		this.sales = new ArrayList<>();
		this.shopassistants = new ArrayList<>();
		//creo tutti gli oggetti di cui avr� bisogno
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
		
		//aggiungo le mie sale alla struttura
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
		//dichiaro i commessi
		AbstractUtente ShopAssistants_1;
		AbstractUtente ShopAssistants_2;
		AbstractUtente ShopAssistants_3;
		AbstractUtente ShopAssistants_4;
		
		//inizializzo i commessi
		ShopAssistants_1 = new Commesso(21, "Alessandro", "Patriottico", true);
		ShopAssistants_2 = new Commesso(21, "Christian", "Greco", true);
		ShopAssistants_3 = new Commesso(30, "Giorgia", "Pedio", false);
		ShopAssistants_4 = new Commesso(25, "Rossella", "Rossi", false);
		
		//aggiungo i commessi alla struttura
		this.shopassistants.add(ShopAssistants_1);
		this.shopassistants.add(ShopAssistants_2);
		this.shopassistants.add(ShopAssistants_3);
		this.shopassistants.add(ShopAssistants_4);		
	}

	@Override
	public void AddProductToBar() {
		AbstractProduct snack_1;	
		AbstractProduct snack_2;
		AbstractProduct snack_3;
		AbstractProduct snack_4;
		AbstractProduct beverage_1;
		AbstractProduct beverage_2;
		AbstractProduct beverage_3;
		AbstractProduct beverage_4;
		
		snack_1 = new Snack(2.5,"pringles","gusto paprika", 20);
		snack_2 = new Snack(1.5,"pop corn","gusto classico", 50);
		snack_3 = new Snack(4.0,"panino","cotto e insalata", 5);
		snack_4 = new Snack(4.0,"piada","salame piccante e formaggio", 8);
		beverage_1 = new Beverage(1.5,"coca cola","servita con ghiaccio", 50);
		beverage_2 = new Beverage(0.5,"acqua","naturale minerale", 100);
		beverage_3 = new Beverage(3.5,"birra","nastro azzurro", 20);
		beverage_4 = new Beverage(1.5,"thè","limone", 30);
		
		products.add(snack_1);
		products.add(snack_2);
		products.add(snack_3);
		products.add(snack_4);
		products.add(beverage_1);
		products.add(beverage_2);
		products.add(beverage_3);
		products.add(beverage_4);
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
