package Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import Film.AbstractFilm;
import Film.Film;
import Sala.AbstractSala;
import Sala.Sala2D;
import Sala.Sala3D;

public class TestSala {

	//dichairazione degli attributi funzionali
	private Random rnd;
	private AbstractSala Sala2D_1;
	private AbstractSala Sala2D_2;
	private AbstractSala Sala3D_1;
	private AbstractSala Sala3D_2;
	private AbstractFilm film_1;
	private AbstractFilm film_2;
	

	
	public void createData() {
		rnd = new Random(); //generatore di valori pseudo-casuali
		//inizializzo gli attributi funzionali
		//inizializzo le sale
		Sala2D_1 = new Sala2D("Sala2D_1",1, 10, true);
		Sala2D_2 = new Sala2D("Sala2D_2",1, 10, true);
		Sala3D_1 = new Sala3D("Sala3D_1",1, 10, false);
		Sala3D_2 = new Sala3D("Sala3D_2",1, 10, false);
		//inizializzo i film
		film_1   = new Film("Terminator", "avventura", null, true, true);
		film_2   = new Film("Spider-Man", "azione", null, false, false);
		//aggingo i film alle sale
		Sala2D_1.addFilm(film_1);
		Sala2D_2.addFilm(film_1);
		Sala3D_1.addFilm(film_2);
		Sala3D_2.addFilm(film_2);
		
	}//end createData()
	
	@org.junit.Test
	public void testSala2D() {
		assertEquals(Sala2D_1.equals(Sala2D_2),false);
		assertEquals(Sala2D_2.equals(Sala2D_1),false);
		assertEquals(Sala2D_1.getName(),"Sala2D_1");
		assertEquals(Sala2D_2.getName(),"Sala2D_2");
		assertEquals(Sala2D_1.getFilm().equals(Sala2D_2.getFilm()),true);
		assertEquals(Sala2D_2.getFilm().equals(Sala2D_1.getFilm()),true);
		assertEquals(Sala2D_1.getType(),true);
		assertEquals(Sala2D_2.getType(),true);
	}//end testSala2D
	
	@org.junit.Test
	public void testSala3D() {
		assertEquals(Sala3D_1.equals(Sala2D_2),false);
		assertEquals(Sala3D_2.equals(Sala2D_1),false);
		assertEquals(Sala3D_1.getName(),"Sala3D_1");
		assertEquals(Sala3D_2.getName(),"Sala3D_2");
		assertEquals(Sala3D_1.getFilm().equals(Sala3D_2.getFilm()),true);
		assertEquals(Sala3D_2.getFilm().equals(Sala3D_1.getFilm()),true);
		assertEquals(Sala3D_1.getType(),false);
		assertEquals(Sala3D_2.getType(),false);
	}//end testSala3D
}//end testSala
