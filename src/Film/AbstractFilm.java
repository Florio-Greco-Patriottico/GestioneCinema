package Film;

import java.util.Arrays;
import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(gender);
		result = prime * result + Arrays.hashCode(name);
		result = prime * result + Arrays.hashCode(plot);
		result = prime * result + Objects.hash(entranceType, movieType);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractFilm other = (AbstractFilm) obj;
		return entranceType == other.entranceType && Arrays.equals(gender, other.gender) && movieType == other.movieType
				&& Arrays.equals(name, other.name) && Arrays.equals(plot, other.plot);
	}

	@Override
	public String toString() {
		return "AbstractFilm [name=" + Arrays.toString(name) + ", gender=" + Arrays.toString(gender) + ", plot="
				+ Arrays.toString(plot) + ", movieType=" + movieType + ", entranceType=" + entranceType + "]";
	}
}
