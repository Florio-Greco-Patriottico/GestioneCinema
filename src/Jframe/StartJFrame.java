package Jframe;

import Utente.Cliente;
import Utente.Gestore;
import Utente.IUtente;

public class StartJFrame {

	//classe di prova
	//COSTRUTTORE
	public StartJFrame(final IUtente controller) {
		try {
			if(controller instanceof Cliente) {
				new JframeU(controller).Init();
			}else if(controller instanceof Gestore){
				new JframeG(controller).Init();
			}
		}catch(Exception e) {
			System.out.println("type not found: " + e);
		}

	}//startJFrame

}//end startJFrame
