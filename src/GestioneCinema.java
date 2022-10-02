import Controller.ManageCinema;
import Jframe.JframeM;
import Utente.Gestore;
public class GestioneCinema {
	
	public static void main(String args[])
	{	
		//creo un manager
		ManageCinema manager = new ManageCinema();
		//inizializzo il JFrameM
		JframeM frameM = new JframeM(manager);
	}//end main	  

}//end gestioneCinema
