package Jframe;

import java.util.ArrayList;

import Utente.Cliente;
import Utente.Gestore;
import Utente.IUtente;

public class StartJFrame {

	//classe di prova
	//COSTRUTTORE
	public StartJFrame(final IUtente controller, ArrayList<String> ret) {
		try {
			if(controller instanceof Cliente) {
				new JframeU(controller,ret).Init();
			}else if(controller instanceof Gestore){
				new JframeG(controller).Init();
			}
		}catch(Exception e) {
			System.out.println("type not found: " + e);
		}

	}//startJFrame

}//end startJFrame
