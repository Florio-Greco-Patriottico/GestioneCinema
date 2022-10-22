package Film;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractFilm implements IFilm {

	private int ID;
	private String name;
	private String gender;
	private int plot;
	private boolean movieType;
	private boolean entranceType;

	public AbstractFilm(String name, String gender, int plot, boolean movieType, boolean entranceType) {
		this.ID = this.ID++;
		this.name = name;
		this.gender = gender;
		this.plot = plot;
		this.movieType = movieType;
		this.entranceType = entranceType;
	}

	public int getID() {
		return this.ID;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getGender() {
		return this.gender;
	}

	@Override
	public int getPlot() {
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
	public void setPlot(int plot) {
		this.plot = plot;
	}

	@Override
	public void setMovieType(boolean movieType) {
		this.movieType = movieType;
	}

}
