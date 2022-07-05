package Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import Utente.Cliente;
import Utente.Gestore;

public class TestUtente {
		//dichairazione degli attributi funzionali
		private Random rnd;
		private Gestore gestore;
		private Cliente cliente1;
		private Cliente cliente2;
		private Cliente cliente3;
		
		public void createData() {
			rnd = new Random(); //generatore di valori pseudo-casuali
			//creo una serie di clienti
			cliente1 = new Cliente(this.rnd.nextInt(99),"Mario","Rossi",this.rnd.nextBoolean());
			cliente2 = new Cliente(this.rnd.nextInt(99),"Mattia","Bianchi",this.rnd.nextBoolean());
			cliente3 = new Cliente(this.rnd.nextInt(99),"Christian","Greco",this.rnd.nextBoolean());
			//creo un gestore
			gestore =  new Gestore("Fabrizio","Moro");
			
		}//end createData
		
		@org.junit.Test
		public void testCliente() {
			assertEquals(cliente1.equals(cliente2),false);
			assertEquals(cliente1.getName(),"Mario");
			assertEquals(cliente2.getName(),"Mattia");
			assertEquals(cliente2.equals(cliente3),false);
			cliente1 = cliente2;
			assertEquals(cliente1.equals(cliente2),true);
			//toString
			cliente1.toString();
			cliente2.toString();
		}//end testCliente
		
		@org.junit.Test
		public void testGestore() {
			assertEquals(gestore.getAge(),0);
			assertEquals(gestore.getGender(),false);
			assertEquals(gestore.getName(),"Fabrizio");
			assertEquals(gestore.getSurname(),"Moro");
			//toString
			gestore.toString();
		}//end testGestore
		
}//end TestUtente
