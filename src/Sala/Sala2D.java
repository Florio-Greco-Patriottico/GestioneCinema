package Sala;

import java.util.ArrayList;
import java.util.Objects;

import Film.Film;

public class Sala2D extends AbstractSala {

	/**
	 * Costruttore
	 * @param name
	 * @param id
	 * @param posti
	 * @param type
	 */
	public Sala2D(String name, int id, int posti, boolean type) {
		//inizializzo il costruttore della classe padre
		super(name, id, posti, type);
	}//end costruttore

}// end classe Sala2D
