package Test;

import static org.junit.Assert.assertEquals;

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
		//inizializzazione degli attributi funzionali
		this.rnd = new Random();
		this.biglietto_1 = new BigliettoOrdinario(0, 0, 0, 0);
		this.biglietto_2 = new BigliettoPromozionale(0, 0, 0, 0);
	}//end createData()
	
	@org.junit.Test
	public void testBigliettoOrdinario() {
		assertEquals(biglietto_1.equals(biglietto_2),false);
		assertEquals(biglietto_1.getIDfilm() == 0,true);
		assertEquals(biglietto_1.getManPrice() == 20.00,true);
		assertEquals(biglietto_1.getChildPrice() == 8.00,true);
		assertEquals(biglietto_1.getWomanPrice() == 18.00,true);
	}//end testBiglietto Ordinario
	
	@org.junit.Test
	public void testBigliettoPromozionale() {
		assertEquals(biglietto_2.equals(biglietto_1),false);
		assertEquals(biglietto_2.getIDfilm() == 0,true);
		assertEquals(biglietto_2.getManPrice() == 10.00,true);
		assertEquals(biglietto_2.getChildPrice() == 4.00,true);
		assertEquals(biglietto_2.getWomanPrice() == 9.00,true);
	}//end testBiglietto Promozionale
	
}//end testBiglietto
