package Test;

import java.util.Random;

import Biglietto.AbstractBiglietto;
import Biglietto.BigliettoOrdinario;
import Biglietto.BigliettoPromozionale;

public class TestBiglietto {

	//dichairazione degli attributi funzionali
	private Random rnd;
	private AbstractBiglietto biglietto_1;
	private AbstractBiglietto biglietto_2;
	
	
	
	public void createData() {
		this.rnd = new Random();
		this.biglietto_1 = new BigliettoOrdinario(0, 0, 0);
		this.biglietto_2 = new BigliettoPromozionale(0, 0, 0);
	}//end createData()
	
	@org.junit.Test
	public void testBigliettoOrdinario() {
		
	}//end testBiglietto Ordinario
	
	@org.junit.Test
	public void testBigliettoPromozionale() {
		
	}//end testBiglietto Promozionale
	
}//end testBiglietto
