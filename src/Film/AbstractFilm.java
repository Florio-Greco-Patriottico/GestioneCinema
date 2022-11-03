package Film;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractFilm implements IFilm {

	//Dichiarazione degli attributi funzionali
	private int ID;
	private String name;
	private String gender;
	private int plot;
	private boolean movieType;
	private boolean entranceType;

	/**
	 * Costruttore
	 * @param name
	 * @param gender
	 * @param plot
	 * @param movieType
	 * @param entranceType
	 */
	public AbstractFilm(String name, String gender, int plot, boolean movieType, boolean entranceType) {
		//inizializzo gli attributi funzionali
		this.ID = this.ID++;
		this.name = name;
		this.gender = gender;
		this.plot = plot;
		this.movieType = movieType;
		this.entranceType = entranceType;
	}//end costruttore
	
	/**
	 * Meotodo per ritornare l'id
	 * @return id
	 */
	public int getID() {
		return this.ID;
	}//end getId()

	/**
	 * Metoto per ritornare il nome
	 * @return name
	 */
	@Override
	public String getName() {
		return this.name;
	}//end getName()

	/**
	 * Metodo per ritornare il sesso
	 * @return gender
	 */
	@Override
	public String getGender() {
		return this.gender;
	}//end getGender()

	/**
	 * Metodo per ritornare il posto
	 * @return plot
	 */
	@Override
	public int getPlot() {
		return this.plot;
	}//end getPlot()

	/**
	 * Metodo per ritornare il tipo del film
	 * @return movieType
	 */
	@Override
	public boolean getMovieType() {
		return this.movieType;
	}//end getMovieType

	/**
	 * Metoto per ritornare il tipo di entrata
	 * @return entranceType
	 */
	@Override
	public boolean getEntranceType() {
		return this.entranceType;
	}//end getEntranceType()

	/**
	 * Metodo per impostare il posto
	 */
	@Override
	public void setPlot(int plot) {
		this.plot = plot;
	}//end setPlot()

	/**
	 * Metodo per impostare il tipo del film
	 */
	@Override
	public void setMovieType(boolean movieType) {
		this.movieType = movieType;
	}//end setMovieType()
}//end classe
