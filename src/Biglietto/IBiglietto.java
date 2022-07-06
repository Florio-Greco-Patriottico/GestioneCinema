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
	public int getMatricola();
	
	//metodo per ottenere il prezzo per un uomo
	public double getPrezzoUomo();
	
	//metodo per ottenere il prezzo per una donna
	public double getPrezzoDonna();
	
	//metodo per ottenere il prezzo per un bambino
	public double getPrezzoBambino();
	
	//metodo per modificare il prezzo per un uomo
	public double setPrezzoUomo();
		
	//metodo per modificare il prezzo per una donna
	public double setPrezzoDonna();
		
	//metodo per modificare il prezzo per un bambino
	public double setPrezzoBambino();

}//end IBiglietto
