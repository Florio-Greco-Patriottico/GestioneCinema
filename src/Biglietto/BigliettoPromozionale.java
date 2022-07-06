package Biglietto;

public class BigliettoPromozionale extends AbstractBiglietto{
	
	private final double prezzoUomo;
	private final double prezzoDonna;
	private final double prezzoBambino;
	private final int percentualeSconto;
	
	public BigliettoPromozionale(double prezzoUomo, double prezzoDonna, double prezzoBambino, int percentualeSconto) {
		this.percentualeSconto = percentualeSconto;
		super((prezzoUomo / 100) * this.percentualeBiglietto()),
			  (prezzoDonna / 100) * this.percentualeBiglietto()),
			  (prezzoBambino / 100) * this.percentualeBiglietto());
	}
	
	//metodo privato che calcola quanta percentuale avrà il biglietto con sconto applicato
	private int percentualeBiglietto() {
		return (100 - this.percentualeSconto);
	}

}
