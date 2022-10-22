package Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import Film.AbstractFilm;
import Film.Film;

public class TestFilm {
	
	//dichairazione degli attributi funzionali
	private Random rnd;
	private AbstractFilm film_1;
	private AbstractFilm film_2;

	
	public void createData() {
		this.rnd = new Random();
		film_1   = new Film("Terminator", "avventura", 20, true, true);
		film_2   = new Film("Spider-Man", "azione", 20, false, false);
	}//end createData()
	
	@org.junit.Test
	public void testFilm() {
		createData();
		assertEquals(film_1.equals(film_2),false);
		assertEquals(film_2.equals(film_1),false);
		assertEquals(film_1.getName().equals("Terminator"),true);
		assertEquals(film_2.getName().equals("Terminator"),false);
		assertEquals(film_2.getName().equals("Spider-Man"),true);
		assertEquals(film_1.getMovieType(),true);
		assertEquals(film_2.getMovieType(),false);			

	}//end testFilm
	
}//end TestFilm
