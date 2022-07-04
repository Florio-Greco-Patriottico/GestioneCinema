package Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import Utente.Cliente;
import Utente.Gestore;

public class TestUtente {
		//dichairazione degli attributi funzionali
		private Random rnd;
		private Gestore gestore;
		private Cliente clienti[];
		
		public void createData() {
			rnd = new Random(); //generatore di valori pseudo-casuali
			//creo una serie di clienti
			clienti = new Cliente[10];
			for(int i = 0; i < clienti.length; i++) {
				clienti[i] = new Cliente(rnd.nextInt(99),"Nome_"+i,"Cognome_"+i);
			}//end for
			//creo un gestore
			gestore = new Gestore(rnd.nextInt(99),"Fabrizio","Moro");
		}//end createData
		
		@org.junit.Test
		public void testCliente() {
			//assertEquals();

		}//end testCliente
		
		@org.junit.Test
		public void testGestore() {

			
		}//end testGestore

		/*
		//TEST
		gestore.toString();
		for(int i = 0; i < clienti.length; i++) {
			clienti[i].toString();
		}//end for
		*/
		
}//end TestUtente
