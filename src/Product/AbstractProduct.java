package Product;

import java.util.Objects;

public abstract class AbstractProduct implements IProduct {
	
	//classe abstractProduct
	//attributi funzionali
	private double price;							//variabile per il prezzo del prodotto
	private String name;							//variabile per il nome del prodotto
	private String description;						//variabile per la descrizione del prodotto
	private int    quantity;						//variabile per la quantit�
	
	
	//costruttore
	public AbstractProduct() {
		super();
		//inizializzo gli attributi funzionali
		this.price 		 = 0.0;
		this.name  		 = null;
		this.description = null;
		this.quantity    = 0;
	}//end costruttore
	
	//METODI DERIVATI DALL'INTERFACCIA
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public int getQuantity() {
		return this.quantity;
	}

	@Override
	public void setQuantity(int q) {
		//controllo se il parametro � valido
		if(q > 0) {
			//controllo se vi � gi� una quantit�
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

	}

	@Override
	public void setPrice(double p) {
		//controllo se il prezzo � maggiore di 0
		if(p > 0.0) {
			this.price = p;
			//notifico
			System.out.println("Prezzo del prodotto cambiato a :" + getPrice());
		}else {
			System.out.println("Impostare un prezzo valido (> 0)");
		}
		
	}

	@Override
	public void setDescription(String d) {
		try {
			this.description = d;
			//notifico
			System.out.println("La descrizione del prodotto � stata cambiata in: " + getDescription() );
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void setName(String n) {
		try {
			this.name = n;
			//notifico
			System.out.println("Il nome del prodotto � stato cambiato in: " + getName() );
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
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
