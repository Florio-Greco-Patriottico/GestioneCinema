package Product;

import java.util.Objects;

public abstract class AbstractProduct implements IProduct {
	
	//classe abstractProduct
	//attributi funzionali
	private double price;							//variabile per il prezzo del prodotto
	private String name;							//variabile per il nome del prodotto
	private String description;						//variabile per la descrizione del prodotto
	private int    quantity;						//variabile per la quantita'
	
	
	/**
	 * Costruttore
	 * @param i
	 * @param n
	 * @param d
	 * @param j
	 */
	public AbstractProduct(double i, String n, String d, int j) {
		super();
		//inizializzo gli attributi funzionali
		this.price 		 = i;
		this.name  		 = n;
		this.description = d;
		this.quantity    = j;
	}//end costruttore
	
	/**
	 * Costruttore 2
	 * @param price
	 * @param name
	 * @param description
	 * @param quantity
	 */
		public AbstractProduct(Double price,String name, String description, int quantity) {
			super();
			//inizializzo gli attributi funzionali
			this.price 		 = price;
			this.name  		 = name;
			this.description = description;
			this.quantity    = quantity;
		}//end costruttore
	
	//METODI DERIVATI DALL'INTERFACCIA
	/**
	 * Metodo per ritornare il nome
	 * @return name
	 */
	@Override
	public String getName() {
		return this.name;
	}//end getName()

	/**
	 * Metodo per ritornare la descrizione
	 * @return description
	 */
	@Override
	public String getDescription() {
		return this.description;
	}//end getDescription()

	/**
	 * Metodo per ritornare il prezzo
	 * @return price
	 */
	@Override
	public double getPrice() {
		return this.price;
	}//end getPrice()

	/**
	 * Metodo per ritornare le quantità
	 * @return quantity
	 */
	@Override
	public int getQuantity() {
		return this.quantity;
	}//end getQuantity

	/**
	 * Metodo per impostare la quantita
	 * @parms q
	 */
	@Override
	public void setQuantity(int q) {
		//controllo se il parametro e' valido
		if(q > 0) {
			//controllo se vi e' gia' una quantita'
			if(this.quantity > 0) {
				System.out.println("Il prodotto ha ancora giacenze");
			}else if(this.quantity <= 0) {
				this.quantity = q;
				//notifico
				System.out.println("Le giacenze del prodotto sono cambiate a : " +  getQuantity());
			}
		}else {
			System.out.println("Scegliere un valore vali ( > 0)");
		}
	}//end setQuantity()

	/**
	 * Meotodo per impostare il prezzo
	 * @parms p
	 */
	@Override
	public void setPrice(double p) {
		//controllo se il prezzo e' maggiore di 0
		if(p > 0.0) {
			this.price = p;
			//notifico
			System.out.println("Prezzo del prodotto cambiato a :" + getPrice());
		}else {
			System.out.println("Impostare un prezzo valido (> 0)");
		}
	}//end setPrice()

	/**
	 * Metodo per impostare la descrizione
	 * @parms d
	 */
	@Override
	public void setDescription(String d) {
		try {
			this.description = d;
			//notifico
			System.out.println("La descrizione del prodotto � stata cambiata in: " + getDescription() );
		}catch(Exception e) {
			System.out.println(e);
		}
	}//end setDescription()

	/**
	 * Metodo per impostare il nome
	 * @parms n
	 */
	@Override
	public void setName(String n) {
		try {
			this.name = n;
			//notifico
			System.out.println("Il nome del prodotto � stato cambiato in: " + getName() );
		}catch(Exception e) {
			System.out.println(e);
		}
	}//end setName()
	
	/**
	 * Metodo toString()
	 */
	@Override
	public String toString() {
		return "AbstractProduct [price=" + price + ", name=" + name + ", description=" + description + ", quantity="
				+ quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, name, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractProduct other = (AbstractProduct) obj;
		return Objects.equals(description, other.description) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}

}//end AbstractProduct
