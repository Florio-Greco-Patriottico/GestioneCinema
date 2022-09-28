package Jframe;

import java.util.ArrayList;

import Controller.ManageCinema;
import Utente.Cliente;
import Utente.Gestore;
import Utente.IUtente;

public class StartJFrame {

	//classe di prova
	//COSTRUTTORE
	public StartJFrame(final IUtente controller,ManageCinema manager) {
		try {
			if(controller instanceof Cliente) {
				new JframeU(controller,manager).Init();
			}else if(controller instanceof Gestore){
				new JframeG(controller,manager).Init();
			}
		}catch(Exception e) {
			System.out.println("type not found: " + e);
		}

	}//startJFrame

}//end startJFrame
