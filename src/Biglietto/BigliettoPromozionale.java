package Biglietto;

public class BigliettoPromozionale extends AbstractBiglietto{
	
	private final double prezzoUomo;
	private final double prezzoDonna;
	private final double prezzoBambino;
	
	public BigliettoPromozionale(double prezzoUomo, double prezzoDonna, double prezzoBambino) {
		super(prezzoUomo,prezzoDonna,prezzoBambino);
	}
}
