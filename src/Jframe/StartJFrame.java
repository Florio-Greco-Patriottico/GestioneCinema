package Jframe;

import Utente.Cliente;
import Utente.Gestore;
import Utente.IUtente;

public class StartJFrame {

	//classe di prova
	//COSTRUTTORE
	public StartJFrame(final Cliente controller) {
		new JframeU(controller).Init();
		
	}//startJFrame
	
	public StartJFrame(final Gestore controller) {
		new JframeU(controller);
	}//startJFrame
	
	

	
}//end startJFrame
