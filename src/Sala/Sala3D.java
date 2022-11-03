package Sala;

import java.util.ArrayList;
import java.util.Objects;

import Film.Film;

public class Sala3D extends AbstractSala {

	/**
	 * Costruttore
	 * @param name
	 * @param id
	 * @param posti
	 * @param type
	 */
	public Sala3D(String name, int id, int posti, boolean type) {
		//inizializzo il costruttore della classe padre
		super(name, id, posti, type);
	}//end costruttore

}// end classe Sala3D
