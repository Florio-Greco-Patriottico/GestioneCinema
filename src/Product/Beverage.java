package Product;

public class Beverage extends AbstractProduct{

	/**
	 * Costruttore
	 * @param price
	 * @param name
	 * @param description
	 * @param quantity
	 */
	public Beverage(Double price,String name, String description, int quantity) {
		//inizializzo il costruttore della classe padre
		super(price, name, description, quantity);
	}//end costruttore
}//end Beverage
