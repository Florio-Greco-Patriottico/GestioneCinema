package Biglietto;

public class BigliettoPromozionale extends AbstractBiglietto{
	
	private static double	MAN_PRICE 	= 10.00;
	private static double 	WOMAN_PRICE = 9.00;
	private static double 	CHILD_PRICE	= 4.00;
	
	public BigliettoPromozionale(int IDfilm, double ManPrice, double WomanPrice, double ChildPrice) {
		super(IDfilm, ManPrice, WomanPrice, ChildPrice);
	}
	

}
