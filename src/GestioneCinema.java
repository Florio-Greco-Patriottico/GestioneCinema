import Bar.AbstractBar;
import Bar.Bar;
import Film.AbstractFilm;
import Film.Film;
import Jframe.JframeU;
import Product.Beverage;
import Product.Snack;
import Utente.Commesso;
import Utente.Gestore;
import Jframe.*;
public class GestioneCinema {
	
	public static void main(String args[])
	{	
		//inizializzo un Gestore
		/*Gestore gestore = new Gestore(0, null, null, false);
		//iniazializzo il bar
		AbstractBar bar 		= new Bar(null);
		//inizializzo un Commesso
		Commesso commesso = new Commesso(0, null, null, false);
		//aggiungo il commesso al bar
		bar.addShopAssistant(commesso); 
		//inizializzo dei prodotti per il bar
		Beverage cocacola = new Beverage();
		Snack snack	  = new Snack();
		//aggiungo i prodotti al bar
		bar.addProduct(snack);
		bar.addProduct(cocacola);*/
		
		JframeM frameM = new JframeM();
		frameM.start();
	}//end main	  

}//end gestioneCinema
