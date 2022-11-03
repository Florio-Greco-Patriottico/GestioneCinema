package Bar;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import Product.AbstractProduct;
import Utente.AbstractUtente;

public abstract class AbstractBar implements Ibar {

	//dichiarazione degli attributi funzionali
	private String name;
	private List<AbstractProduct> product;
	private List<AbstractUtente>  dependents;
	
	//costruttore
	public AbstractBar(String name) {
		super();
		//inizializzo gli attributi funzionali
		this.name 	= name;
		this.product = new LinkedList();
		this.dependents = new LinkedList();
	}//end costruttore
	
	
	//METODI DERIVATI DALL'INTERFACCIA
	/**
	 * Metodo che ritorna il nome
	 */
	@Override
	public String getName() {
		return this.name;
	}//end metodo getName()
	
	/**
	 * Metodo che ritorna i prodotti
	 */
	@Override
	public void getProduct() {
		System.out.println("Product:");
		this.product.stream().forEach(System.out::println);
	}//end metodo getProduct()

	/**
	 * Metodo che ritorna i commessi
	 */
	@Override
	public void getShopAssistant() {
		System.out.println("Dependents: ");
		this.dependents.stream().forEach(System.out::println);
	}//end metodo getShopAssistant()

	/**
	 * Metodo per aggiungere i prodotti al bar
	 */
	@Override
	public void addProduct(AbstractProduct p) {
		try {
			//controllo se il prodotto e' provvisto degli attributi
			if(p.getPrice() > 0 && p.getQuantity() > 0 && p.getName() != null) {
				//allora posso aggiungerlo
				this.product.add(p);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}//end metodo addProduct()

	/**
	 * Metodo per aggiungere un commesso al bar
	 */
	@Override
	public boolean addShopAssistant(AbstractUtente u) {
		boolean ret = true;
		try {
			//controllo se il commesso ha almeno 18 anni
			if(u.getAge() >= 18) {
				//allora posso aggiungerlo
				this.dependents.add(u);
				
			}else {
				ret = false;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return ret;
	}//end metoto addShopAssistant()

	
	@Override
	public int hashCode() {
		return Objects.hash(dependents, name, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractBar other = (AbstractBar) obj;
		return Objects.equals(dependents, other.dependents) && Objects.equals(name, other.name)
				&& Objects.equals(product, other.product);
	}

	@Override
	public String toString() {
		return "Bar [name=" + name + ", product=" + product + ", dependents=" + dependents + "]";
	}

}//end Bar
