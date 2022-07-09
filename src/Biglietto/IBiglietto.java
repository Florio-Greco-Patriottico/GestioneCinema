package Biglietto;

//interfaccia della classe BigliettoOrdinario e BigliettoPromozionale
//prevede i seguenti metodi:
//1. get matricola
//2. get prezzo uomo
//3. get prezzo donna
//4. get prezzo bambino
//5. set prezzo uomo
//6. set prezzo donna
//7. set prezzo bambino

public interface IBiglietto {
	
	//INTERFACCIA PUBBLICA DELLA CLASSE
	
	//metodo per ottenere il numero di matricola
	int getNumber();
	
	//metodo per ottenere il prezzo per un uomo
	double getManPrice();
	
	//metodo per ottenere il prezzo per una donna
	double getWomanPrice();
	
	//metodo per ottenere il prezzo per un bambino
	double getChildPrice();
	
	//metodo per modificare il prezzo per un uomo
	void setManPrice(double manprice);
		
	//metodo per modificare il prezzo per una donna
	void setWomanPrice(double womanprice);
		
	//metodo per modificare il prezzo per un bambino
	void setChildPrice(double childprice);

}//end IBiglietto
