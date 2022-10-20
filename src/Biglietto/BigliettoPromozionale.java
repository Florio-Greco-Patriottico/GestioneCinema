package Biglietto;

public class BigliettoPromozionale extends AbstractBiglietto{
	
	private static double	MAN_PRICE 	= 10.00;
	private static double 	WOMAN_PRICE = 9.00;
	private static double 	CHILD_PRICE	= 4.00;
	
	
	public BigliettoPromozionale(int IDfilm) {
		super(IDfilm,MAN_PRICE, WOMAN_PRICE, CHILD_PRICE);
	}
	
	public BigliettoPromozionale() {
		super(MAN_PRICE, WOMAN_PRICE, CHILD_PRICE);
	}
}
