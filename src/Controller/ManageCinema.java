package Controller;

import java.lang.reflect.Array;
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
	private int i = 0; 
	
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

		Sala2D a = null;
		Sala2D b = null;
		Sala2D c = null;
		Sala3D d = null;
		Sala3D e = null;
		Sala3D f = null;
		sala_2D.add(a);
		sala_2D.add(b);
		sala_2D.add(c);
		sala_3D.add(d);
		sala_3D.add(e);
		sala_3D.add(f);

				
		//inizializzo le mie sale
		sala_2D.forEach(x -> {
			Random rnd = new Random();
			x = new Sala2D("Sala2D_"+i, i, rnd.nextInt(10), rnd.nextBoolean());
			this.sales.add(x);
			gestore.addSalaToCinema(x);
			i++;

		});

		sala_3D.forEach(x -> {
			Random rnd = new Random();
			x = new Sala3D("Sala3D_"+i, i, rnd.nextInt(10), rnd.nextBoolean());
			this.sales.add(x);
			gestore.addSalaToCinema(x);
			i++;
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

		AbstractProduct a = null;
		AbstractProduct b = null;
		AbstractProduct c = null;
		AbstractProduct d = null;
		
		snacks.add(a);
		snacks.add(b);
		beverages.add(b);
		beverages.add(c);
			
		//inizializzo i prodotti
		snacks.forEach(x -> {
			Random rnd = new Random();
			x = new Snack(rnd.nextDouble(10), "Snack_"+i, "description_"+i, rnd.nextInt(10));
			products.add(x);
			i++;
		});

		beverages.forEach(x -> {
			Random rnd = new Random();
			x = new Beverage(rnd.nextDouble(10), "Snack_"+i, "description_"+i, rnd.nextInt(10));
			products.add(x);
			i++;
		});
		
	}//end createProduct

	/**
	 * Metodo per creare i commessi che saranno
	 * associati al bar
	 */
	@Override
	public void CreateShopAssistants() {
		//dichiaro i commessi
		ArrayList<Commesso> shopAssistants = new ArrayList<>();

		Commesso a = null;
		Commesso b = null;
		Commesso c = null;
		
		shopAssistants.add(a);
		shopAssistants.add(b);
		shopAssistants.add(c);
	
		//inizializzo i commessi
		shopAssistants.forEach(x -> {
			Random rnd = new Random();
			x = new Commesso(rnd.nextInt(30), "Commesso_"+i, "Surname_"+i, rnd.nextBoolean());
			shopassistants.add(x);
			i++;
		});
	}
	
	/**
	 * Metodo per generare e valorizzare
	 * la classe Pulizie
	 */
	public void Pulizie() {
		//dichiaro le ditte di pulizia
		ArrayList<Pulizie> companies = new ArrayList<>();
		Pulizie a = null;
		Pulizie b = null;
		Pulizie c = null;
		companies.add(a);
		companies.add(b);
		companies.add(c);
	
		//inizializzo le ditte di pulizia
		companies.forEach(x -> {
			Random rnd = new Random();
			x = new Pulizie("Ditta_"+i, rnd.nextInt(10));
			cleaning.add(x);
			i++;
		});
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
		ArrayList<Film> Films = new ArrayList<>();
		Film a = null;
		Film b = null;
		Film c = null;
		Film d = null;
		Films.add(a);
		Films.add(b);
		Films.add(c);
		Films.add(d);

		Films.forEach(x -> {
			Random rnd = new Random();
			x = new Film("Film_"+i, "Genere_"+i, "", rnd.nextBoolean(), rnd.nextBoolean());
			this.films.add(x);
			i++;
		});
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
