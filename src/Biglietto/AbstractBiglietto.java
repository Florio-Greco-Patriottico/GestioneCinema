package Biglietto;

public class AbstractBiglietto implements IBiglietto{
	
	private int Matricola = 0;
	private double prezzoUomo;
	private double prezzoDonna;
	private double prezzoBambino;
	
	public AbstractBiglietto(double prezzoUomo, double prezzoDonna, double prezzoBambino) {
		this.Matricola++;
		this.prezzoUomo = prezzoUomo;
		this.prezzoDonna = prezzoDonna;
		this.prezzoBambino = prezzoBambino;
	}

	@Override
	public int getMatricola() {
		return this.Matricola;
	}

	@Override
	public double getPrezzoUomo() {
		return this.prezzoUomo;
	}

	@Override
	public double getPrezzoDonna() {
		return this.prezzoDonna;
	}

	@Override
	public double getPrezzoBambino() {
		return this.prezzoBambino;
	}

	@Override
	public void setPrezzoUomo(double prezzoUomo) {
		this.prezzoUomo = prezzoUomo;
	}

	@Override
	public void setPrezzoDonna(double prezzoDonna) {
		this.prezzoDonna = prezzoDonna;
	}

	@Override
	public void setPrezzoBambino(double prezzoBambino) {
		this.prezzoBambino = prezzoBambino;
	}

}
