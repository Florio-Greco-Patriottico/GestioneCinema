import Controller.ManageCinema;
import Jframe.JframeM;
import Utente.Gestore;
public class GestioneCinema {
	
	public static void main(String args[])
	{	
		//creo un manager
		ManageCinema manager = new ManageCinema();
		String[] ret = manager.getSale();
		Gestore  g   = manager.getGestore();
		//inizializzo il JFrameM
		JframeM frameM = new JframeM(manager);
		//avvio il JFrameM
		frameM.start();

	}//end main	  

}//end gestioneCinema
