package Product;

public class Snack extends AbstractProduct{
	
	/**
	 * Costruttore
	 * @param price
	 * @param name
	 * @param description
	 * @param quantity
	 */
	public Snack(Double price,String name, String description, int quantity) {
		//inizializzo il costruttore della classe padre
		super(price, name, description, quantity);
	}//end costruttore
}//end snack
