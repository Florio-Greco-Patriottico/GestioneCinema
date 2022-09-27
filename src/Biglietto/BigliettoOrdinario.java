package Biglietto;

public class BigliettoOrdinario extends AbstractBiglietto{

	//dichiarazioni variabili statiche
	private static double	MAN_PRICE 	= 20.00;
	private static double 	WOMAN_PRICE	= 18.00;
	private static double 	CHILD_PRICE	= 8.00;
	
	
	public BigliettoOrdinario(int IDfilm, double ManPrice, double WomanPrice, double ChildPrice) {
		super(IDfilm, ManPrice, WomanPrice, ChildPrice);
	}
}
