package Product;

public interface IProduct {

	
	//metodo per ritornare il nome 
	public String getName();
	//metodo per ritornare la descrizione
	public String getDescription();
	//metodo per ritornare il prezzo
	public double getPrice();
	//metodo per ritornare la quantit�
	public int    getQuantity();
	//metodo per settare la quantit�
	public void   setQuantity(int q);
	//metodo per impostare il prezzo
	public void   setPrice(double p);
	//metodo per impostare la descrizione
	public void   setDescription(String n);
	//metodo per impostare il nome
	public void   setName(String n);
	
}//end IProduct
