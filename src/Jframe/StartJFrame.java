package Jframe;

import Utente.Cliente;
import Utente.Gestore;
import Utente.IUtente;

public class StartJFrame {

	//classe di prova
	//COSTRUTTORE
	public StartJFrame(final IUtente controller) {
		if(controller instanceof Cliente) {
			new JframeU(controller).Init();
		}else if(controller instanceof Gestore){
			new JframeG(controller).Init();
		}
	}//startJFrame

}//end startJFrame
