package Biglietto;

import java.util.Objects;

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractBiglietto other = (AbstractBiglietto) obj;
		return this.Matricola == other.Matricola;
	}

	@Override
	public String toString() {
		return "Biglietto [Matricola:" + Matricola + ", prezzoUomo:" + prezzoUomo + ", prezzoDonna:"
				+ prezzoDonna + ", prezzoBambino:" + prezzoBambino + "]";
	}
}
