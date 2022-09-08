package Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import Bar.AbstractBar;
import Bar.Bar;
import Product.AbstractProduct;
import Product.Beverage;
import Product.Snack;
import Utente.AbstractUtente;
import Utente.Commesso;

public class TestBar {
	
	//dichairazione degli attributi funzionali
	private Random rnd;
	private AbstractBar bar;
	private AbstractUtente commesso;
	private AbstractProduct snack;
	private AbstractProduct bibita;
	
	
	public void createData() {
		//ionizializzo gli attributi funzioanli
		this.rnd = new Random();
		this.bar = new Bar("Bar");
		this.commesso = new Commesso(18, "Mario", "Florio", false);
		this.snack = new Snack();
		this.bibita = new Beverage();
		
		snack.setName("Patatine");
		bibita.setName("coca-cola");
		snack.setPrice(1);
		bibita.setPrice(2);
		
		bar.addProduct(bibita);
		bar.addProduct(snack);
		bar.addShopAssistant(commesso);
		
	}//end createData()
	
	@org.junit.Test
	public void testBar() {
		assertEquals();
	}//end testBar
	
}//end testBar
