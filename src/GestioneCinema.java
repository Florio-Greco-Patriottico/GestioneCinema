import Controller.ManageCinema;
import Jframe.JframeM;
public class GestioneCinema {
	
	public static void main(String args[])
	{	
		//creo un manager
		ManageCinema manager = new ManageCinema();
		String[] ret = manager.getSale();
		//inizializzo il JFrameM
		JframeM frameM = new JframeM(ret);
		//avvio il JFrameM
		frameM.start();

	}//end main	  

}//end gestioneCinema
