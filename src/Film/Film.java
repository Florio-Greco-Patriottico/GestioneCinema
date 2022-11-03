package Film;

public class Film extends AbstractFilm{

	/**
	 * Costruttore
	 * @param name
	 * @param gender
	 * @param plot
	 * @param movieType
	 * @param entranceType
	 */
	public Film(String name, String gender, String plot, boolean movieType, boolean entranceType) {
		//inizializzo il costruttore della classe padre
		super(name, gender, plot, movieType, entranceType);
	}//end costruttore
}//end classe
