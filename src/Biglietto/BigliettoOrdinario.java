package Biglietto;

public class BigliettoOrdinario extends AbstractBiglietto{

	//dichiarazioni variabili statiche
	private static double	MAN_PRICE 	= 20.00;
	private static double 	WOMAN_PRICE	= 18.00;
	private static double 	CHILD_PRICE	= 8.00;
	
	/**
	 * Costruttore1
	 * @param IDfilm
	 */
	public BigliettoOrdinario(int IDfilm) {
		//inizializzo il costruttore della classe padre
		super(IDfilm,MAN_PRICE, WOMAN_PRICE, CHILD_PRICE);
	}//end costruttore 1
	
	/**
	 * Costruttore 2
	 */
	public BigliettoOrdinario() {
		//inizializzo il costruttore della classe padre
		super(MAN_PRICE, WOMAN_PRICE, CHILD_PRICE);
	}//end costruttore 2
}//end classe
