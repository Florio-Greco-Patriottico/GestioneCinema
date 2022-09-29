package Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import Pulizie.AbstractPulizie;
import Pulizie.Pulizie;
import Sala.Sala2D;

public class TestPulizie {

	//dichairazione degli attributi funzionali
	private Random rnd;
	private AbstractPulizie ditta_1;
	private AbstractPulizie ditta_2;
	private AbstractPulizie ditta_3;
	private Sala2D sala = new Sala2D("1",1,30,true);
			
	public void createData() {
		rnd = new Random(); //generatore di valori pseudo-casuali
		//creo una serie di ditte di pulizia
		ditta_1 = new Pulizie("Puliamo Tutto",this.rnd.nextInt(5));
		ditta_2 = new Pulizie("Vedo Bianco",this.rnd.nextInt(5));
		ditta_3 = new Pulizie("Lo Strofinaccio",this.rnd.nextInt(4));
	}//end createData
	
	@org.junit.Test
	public void testPulizie() {
		assertEquals(ditta_1.equals(ditta_2),false);
		assertEquals(ditta_2.getName(),"Vedo Bianco");
		assertEquals(ditta_3.getName(),"Lo Strofinaccio");
		assertEquals(ditta_2.equals(ditta_3),false);
		ditta_1 = ditta_2;
		assertEquals(ditta_1.equals(ditta_2),true);
		
		//prova metodo Clean per pulire una sala
		assertEquals(ditta_1.Clean(sala),false);
		
		//toString
		ditta_1.toString();
		ditta_2.toString();
		
	}//end testPulizie
	
	
	
}
