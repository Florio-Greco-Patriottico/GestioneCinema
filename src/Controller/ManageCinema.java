package Controller;

import java.util.ArrayList;

import Bar.Bar;
import Film.AbstractFilm;
import Film.Film;
import Product.*;
import Sala.AbstractSala;
import Sala.ISala;
import Sala.Sala2D;
import Sala.Sala3D;
import Utente.AbstractUtente;
import Utente.Cliente;
import Utente.Commesso;
import Utente.Gestore;

public class ManageCinema implements Manager {
	/*
	 * implementazione metodi interfaccia (Manager)
	 */
	Gestore gestore;
	ArrayList<AbstractSala> sales;
	ArrayList<AbstractUtente> shopassistants;
	ArrayList<AbstractProduct> products;
	ArrayList<AbstractFilm>	   films;
	ArrayList<Cliente>  users;
	String sala;
	private Bar bar;
	private String[] rets;
	private String f;
	
	//costruttore
	public ManageCinema() {
		this.gestore = new Gestore(30, "Mario", "Mario", true);
		this.products = new ArrayList<AbstractProduct>();
		this.sales = new ArrayList<>();
		this.shopassistants = new ArrayList<>();
		this.bar = new Bar("bar");
		//creo tutti gli oggetti di cui avr� bisogno
		try {
			this.createSale();
			this.CreateProduct();
			this.CreateShopAssistants();
			this.AddElementToBar(shopassistants, products);
		}catch(Exception e) {
			System.out.println(e);
		}
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
		Sala2D_2 = new Sala2D("Sala2D_2",1, 5, true);
		Sala2D_3 = new Sala2D("Sala2D_3",1, 3, true);
		Sala2D_4 = new Sala2D("Sala2D_4",1, 20, true);
		Sala3D_1 = new Sala3D("Sala3D_1",1, 50, false);
		Sala3D_2 = new Sala3D("Sala3D_2",1, 2, false);
		Sala3D_3 = new Sala3D("Sala3D_3",1, 1, false);
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
		
		gestore.addSalaToCinema(Sala2D_1);
		gestore.addSalaToCinema(Sala2D_2);
		gestore.addSalaToCinema(Sala2D_3);
		gestore.addSalaToCinema(Sala2D_4);
		gestore.addSalaToCinema(Sala3D_1);
		gestore.addSalaToCinema(Sala3D_2);
		gestore.addSalaToCinema(Sala3D_3);
		gestore.addSalaToCinema(Sala3D_4);

		
	}//end createSale();

	@Override
	public void CreateProduct() {
		//definisco i prodotti
		AbstractProduct snack_1;	
		AbstractProduct snack_2;
		AbstractProduct snack_3;
		AbstractProduct snack_4;
		AbstractProduct beverage_1;
		AbstractProduct beverage_2;
		AbstractProduct beverage_3;
		AbstractProduct beverage_4;
		
		//inizializzo i prodotti
		snack_1 = new Snack(2.5,"pringles","gusto paprika", 20);
		snack_2 = new Snack(1.5,"pop corn","gusto classico", 50);
		snack_3 = new Snack(4.0,"panino","cotto e insalata", 5);
		snack_4 = new Snack(4.0,"piada","salame piccante e formaggio", 8);
		beverage_1 = new Beverage(1.5,"coca cola","servita con ghiaccio", 50);
		beverage_2 = new Beverage(0.5,"acqua","naturale minerale", 100);
		beverage_3 = new Beverage(3.5,"birra","nastro azzurro", 20);
		beverage_4 = new Beverage(1.5,"thè","limone", 30);
		
		//agiungo i prodotti alla mia collezione
		this.products.add(snack_1);
		this.products.add(snack_2);
		this.products.add(snack_3);
		this.products.add(snack_4);
		this.products.add(beverage_1);
		this.products.add(beverage_2);
		this.products.add(beverage_3);
		this.products.add(beverage_4);
		
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
	public void AddElementToBar(ArrayList<AbstractUtente> u, ArrayList<AbstractProduct> p ) {
		try {
			//aggiungo i commessi al bar
			for(int i = 0; i < u.size(); i++) {
				this.bar.addShopAssistant(u.get(i));
			}//end for
			//aggiung i prodotti al bar
			for(int i = 0; i < p.size(); i++) {
				this.bar.addProduct(p.get(i));
			}//end for
		}catch(Exception e) {
			System.out.println("Error : "+ e);
		}
	}//end AddElemtnToBar

	@Override
	public String[] getSale() {
		//definisco una dimensione a ret, che sar� il mio valore 
		//di return
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
	}//end getSale

	@Override
	public int getPosti(AbstractSala s) {
		int ret = 0;
		try {
			if(s.getNpostiLiberi() == 0) {
				System.out.println("Non vi sono posti liberi.");
			}else if(s.getNpostiLiberi() > 0) {
				System.out.println("Ci sono posti liberi...");
				ret = s.getNpostiLiberi();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return ret;
	}//end getPosti
	
	public Gestore getGestore() {
		return this.gestore;
	}
	
	public ArrayList<AbstractFilm> getFilms() {
		return this.films;
	}
	
	public void CreateFilm() {
		Film film_1   = new Film("Terminator", "avventura", null, true, true);
		Film film_2   = new Film("Spider-Man", "azione", null, false, false);
		Film film_3   = new Film("GhostBusters", "avventura", null, true, true);
		Film film_4   = new Film("Il grinch", "azione", null, false, false);
		Film film_5   = new Film("ALD", "avventura", null, true, true);
		Film film_6   = new Film("White cicks", "azione", null, false, false);
		
		films.add(film_1);
		films.add(film_2);
		films.add(film_3);
		films.add(film_4);
		films.add(film_5);
		films.add(film_6);
		
	}
	
	public void addFilm(Film f, String n) {
		try {
			films.add(f);
			//associo il film alla sala
			AbstractSala s = sales.stream().filter((e) -> e.getName().equals(n)).findAny().get();
			s.addFilm(f);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void SaveLastSala(String n, String f) {
		this.sala = n;
		this.f	  = f;
	}
	
	
	
	public void addUsers(Cliente u) {
		try {
			u.setSala(this.sala);
			u.setFilm(this.f);
			users.add(u);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<Cliente> getUsers() {
		return this.users;
	}
		
}//end ManageCinema
