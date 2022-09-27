package Film;

//interfaccia della classe Film
//prevede i seguenti metodi:
//1. get nome
//2. get genere
//3. get trama
//4. get tipo 3D/2D
//5. get entrata libero/18+
//6. set trama
//7. set 3D/2D

public interface IFilm {

	// INTERFACCIA PUBBLICA DELLA CLASSE

	// metodo per restituire l'ID
	public int getID();
	
	// metodo per restituire il nome
	public String getName();

	// metodo per restituire il genere
	public String getGender();

	// metodo per restituire la trama
	public String getPlot();

	// metodo per restituire tipo del film
	// in questo caso TRUE = 3D, FALSE = 2D
	public boolean getMovieType();

	// metodo per restituire tipo entrata
	// in questo caso TRUE = libero, FALSE = 18+
	public boolean getEntranceType();

	// metodo per modificare la trama di un film
	public void setPlot(String getPlot);

	// metodo per modificare il tipo di un film
	public void setMovieType(boolean getMovieType);

}// end IFilm
