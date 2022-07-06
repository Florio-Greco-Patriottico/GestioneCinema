package Biglietto;

public class BigliettoOrdinario extends AbstractBiglietto{

	private final double prezzoUomo;
	private final double prezzoDonna;
	private final double prezzoBambino;
	
	public BigliettoOrdinario(double prezzoUomo, double prezzoDonna, double prezzoBambino) {
		super(prezzoUomo, prezzoDonna, prezzoBambino);
	}
}
