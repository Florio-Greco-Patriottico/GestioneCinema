package Controller;

import java.util.ArrayList;
import java.util.Random;

import Bar.*;
import Biglietto.*;
import Film.*;
import Product.*;
import Pulizie.*;
import Sala.*;
import Utente.*;

public class ManageCinema implements Manager {
	
	/**
	 * 
	 * Dichiarazione degli attributi funzionali della classe
	 */
	private Gestore gestore;
	private ArrayList<AbstractSala> sales;
	private ArrayList<AbstractUtente> shopassistants;
	private ArrayList<AbstractProduct> products;
	private ArrayList<AbstractFilm>	   films;
	private ArrayList<Cliente>  users;
	private ArrayList<AbstractBiglietto>  tickets;
	private ArrayList<AbstractPulizie>  cleaning;

	private String sala;
	private Bar bar;
	private String[] rets;
	private String film;
	private boolean AllClean = false;
	
	/**
	 * Costruttore della classe
	 */
	public ManageCinema() {
		//inizializzazione degli attributi funzionali
		this.gestore = new Gestore(30, "Mario", "Mario", true);
		this.products = new ArrayList<AbstractProduct>();
		this.sales = new ArrayList<>();
		this.films = new ArrayList<AbstractFilm>();
		this.shopassistants = new ArrayList<>();
		this.bar = new Bar("bar");
		
		//creo tutti gli oggetti di cui avrò. bisogno
		try {
			this.createSale();
			this.CreateProduct();
			this.CreateShopAssistants();
			this.CreateFilm();
			this.CreateTicket(films);
			this.AddElementToBar(shopassistants, products);
			this.Pulizie();
		}catch(Exception e) {
			System.out.println(e);
		}
	}//end costruttore

	/**
	 * Metodo per creare le sale
	 */
	@Override
	public void createSale() {
		//dichiaro le mie sale
		ArrayList<Sala2D> sala_2D = new ArrayList<>();
		ArrayList<Sala3D> sala_3D = new ArrayList<>();
				
		//inizializzo le mie sale
		sala_2D.forEach(x -> {
			Random rnd = new Random();
			int i = 0;
			x = new Sala2D("Sala2D_"+i, i, rnd.nextInt(10), rnd.nextBoolean());
			this.sales.add(x);
			gestore.addSalaToCinema(x);
		});

		sala_3D.forEach(x -> {
			Random rnd = new Random();
			int i = 0;
			x = new Sala3D("Sala3D_"+i, i, rnd.nextInt(10), rnd.nextBoolean());
			this.sales.add(x);
			gestore.addSalaToCinema(x);
		});
		
	}//end createSale();

	/**
	 * Metodo per creare i Biglietti per ogni film
	 * convenzionalmente sono stati scelti a livello standard
	 * 10 biglietti per ogni film
	 */
	public void CreateTicket(ArrayList<AbstractFilm> f) {

		//aggiungo biglietti al film
		for(int i = 0; i < f.size(); i++) {
			AbstractBiglietto[] biglietti = new AbstractBiglietto[10];
			
			for(int j = 0; j < biglietti.length; j++) {
				biglietti[j] = new BigliettoOrdinario(f.get(i).getID());
				this.tickets.add(biglietti[j]);
			}
		}//end for
	}//end metodo Create Ticket
	
	/**
	 * Metodo per aggiungere Biglietti ai film
	 * @param idFilm
	 * @param nTickets
	 */
	public void addTicketToFilm(int idFilm, int nTickets) throws Exception{
		AbstractBiglietto[] biglietti = new AbstractBiglietto[nTickets];
		for(int i = 0; i < biglietti.length; i++) {
			biglietti[i] = new BigliettoOrdinario(idFilm);
		}//end for
	}//end metodo addTicketToFilm
	
	
	/**
	 * metodo per estrarre un biglietto vincente
	 * @return winner (biglietto vincente)
	 * @throws Exception
	 */
	public AbstractBiglietto getWinners()throws Exception{
		Random rnd = new Random();
		AbstractBiglietto winner = null;
		int i = rnd.nextInt(this.tickets.size());
		winner = this.tickets.get(i);
		return winner;
	}//end metodo getWinners
	
	/**
	 * Metodo per creare i prodotti
	 */
	@Override
	public void CreateProduct() {
		//definisco i prodotti
		ArrayList<AbstractProduct> snacks = new ArrayList<>();
		ArrayList<AbstractProduct> beverages = new ArrayList<>();
			
		//inizializzo i prodotti
		snacks.forEach(x -> {
			Random rnd = new Random();
			int i = 0;
			x = new Snack(rnd.nextDouble(10), "Snack_"+i, "description_"+i, rnd.nextInt(10));
			products.add(x);
		});

		beverages.forEach(x -> {
			Random rnd = new Random();
			int i = 0;
			x = new Beverage(rnd.nextDouble(10), "Snack_"+i, "description_"+i, rnd.nextInt(10));
			products.add(x);
		});
		
	}//end createProduct

	/**
	 * Metodo per creare i commessi che saranno
	 * associati al bar
	 */
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
	
	/**
	 * Metodo per generare e valorizzare
	 * la classe Pulizie
	 */
	public void Pulizie() {
		//dichiaro le ditte di pulizia
		AbstractPulizie ditta_1;
		AbstractPulizie ditta_2;
		AbstractPulizie ditta_3;
		
		//inizializzo le ditte di pulizia
		ditta_1 = new Pulizie("Super Pulito", 5);
		ditta_2 = new Pulizie("Pulizia Istantanea", 3);
		ditta_3 = new Pulizie("Tutto Pulito", 7);
		
		//aggiungo i commessi alla struttura
		this.cleaning.add(ditta_1);
		this.cleaning.add(ditta_2);
		this.cleaning.add(ditta_3);	
	}

	/**
	 * Metodo per aggiungere 
	 * Personale e Prodotti al bar
	 */
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

	/**
	 * Metodo che restituisce l'insieme delle sale
	 */
	@Override
	public String[] getSale() {
		//definisco una dimensione a ret, che sara' il mio valore 
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

	/**
	 * Metodo che restituisce i posti liberi d'una determinata sala
	 */
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
	
	/**
	 * Metodo per restituire il gestore
	 * @return gestore
	 */
	public Gestore getGestore() {
		return this.gestore;
	}
	
	/**
	 * Metodo che restituisce l'inseme contenente tutti i film presenti nel cinema
	 * @return ArrayList<Film> film
	 */
	public ArrayList<AbstractFilm> getFilms() {
		return this.films;
	}
	
	/**
	 * Metodo che crea un film
	 */
	public void CreateFilm() {
		//dichiaro e inizializzo i relavtivi film
		AbstractFilm film_1   = new Film("Terminator", "avventura", "", true, true);
		AbstractFilm film_2   = new Film("Spider-Man", "azione", "", false, false);
		AbstractFilm film_3   = new Film("GhostBusters", "avventura", "", true, true);
		AbstractFilm film_4   = new Film("Il grinch", "azione", "", false, false);
		AbstractFilm film_5   = new Film("ALD", "avventura", "", true, true);
		AbstractFilm film_6   = new Film("White cicks", "azione", "", false, false);
		
		//aggiungo i film alla mia struttura
		films.add(film_1);
		films.add(film_2);
		films.add(film_3);
		films.add(film_4);
		films.add(film_5);
		films.add(film_6);
	}//end metodo CreateFilm()
	
	/**
	 * Metodo per aggiungere un film
	 * @param f film
	 * @param n nome sala
	 */
	public void addFilm(Film f, String n) {
		try {
			films.add(f);
			//associo il film alla sala
			AbstractSala s = sales.stream().filter((e) -> e.getName().equals(n)).findAny().get();
			s.addFilm(f);
		}catch(Exception e) {
			System.out.println(e);
		}
	}//end addFilm()
	
	/**
	 * Metodo che si occupa di salvare
	 * l'ultima sala
	 * @param n nome sala
	 * @param f nome film
	 */
	public void SaveLastSala(String n, String f) {
		this.sala = n;
		this.film = f;
	}//end SaveLastSala()
	
	/**
	 * Metodo per aggiungere un utente
	 * @param u User
	 */
	public void addUsers(Cliente u) {
		try {
			u.setSala(this.sala);
			u.setFilm(this.film);
			users.add(u);
		}catch(Exception e) {
			System.out.println(e);
		}
	}//end metodo addUsers()
	
	/**
	 * Metodo che restituisce gli utenti presenti
	 * @return ArrayList<Cliente> users
	 */
	public ArrayList<Cliente> getUsers() {
		return this.users;
	}//end getUsers()
	
	/**
	 * Metodo utilizzato dalla classe "Pulizie" che 
	 * simula la "Pulizia" delle relative sale
	 * @param p 
	 * @param sales
	 * @return
	 */
	public boolean PulisciTutteLeSale(Pulizie p, ArrayList<AbstractSala> sales) {
		
		//vengono pulite tutte le sale
		sales.forEach((e) -> {
			AllClean = p.Clean(e);
		});
		
		//ritorno vero se tutte le sale sono state pulite
		return AllClean;
	}//end PulisciTutteLeSale()
		
}//end ManageCinema
