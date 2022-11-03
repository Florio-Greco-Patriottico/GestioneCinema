package Biglietto;

public class BigliettoPromozionale extends AbstractBiglietto{
	//Dichiarazione degli attributi funzionali
	private static double	MAN_PRICE 	= 10.00;
	private static double 	WOMAN_PRICE = 9.00;
	private static double 	CHILD_PRICE	= 4.00;
	
	/**
	 * Costruttore 1
	 * @param IDfilm
	 */
	public BigliettoPromozionale(int IDfilm) {
		//inizializzo il costruttore della classe padre
		super(IDfilm,MAN_PRICE, WOMAN_PRICE, CHILD_PRICE);
	}//end costruttore 1
	
	/**
	 * Costruttore 2
	 */
	public BigliettoPromozionale() {
		//inizializzo il costruttore della classe padre
		super(MAN_PRICE, WOMAN_PRICE, CHILD_PRICE);
	}//end csotruttore 2
}//end classe
