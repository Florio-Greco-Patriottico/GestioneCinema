package Film;

public class AbstractFilm implements IFilm{
	
	private String[] name;
	private String[] gender;
	private String[] plot;
	private boolean movieType;
	private boolean entranceType;
	
	public AbstractFilm(String[] name, String[] gender,String[] plot, boolean movieType, boolean entranceType) {
		this.name = name;
		this.gender = gender;
		this.plot = plot;
		this.movieType = movieType;
		this.entranceType = entranceType;
	}
	
	@Override
	public String[] getName() {
		return this.name;
	}

	@Override
	public String[] getGender() {
		return this.gender;
	}
	
	@Override
	public String[] getPlot() {
		return this.plot;
	}
	
	@Override
	public boolean getMovieType() {
		return this.movieType;
	}
	
	@Override
	public boolean getEntranceType() {
		return this.entranceType;
	}
	
	@Override
	public void setPlot (String[] plot) {
		this.plot = plot;
	}
	
	@Override
	public void setMovieType(boolean movieType){
		this.movieType = movieType;
	}
}
