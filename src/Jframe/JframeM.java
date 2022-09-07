package Jframe;

import java.awt.*;
import javax.swing.*;

import Utente.Cliente;
import Utente.IUtente;
import it.fooddelivery.controller.Manager;
import it.fooddelivery.controller.ManagerFactory;
import it.fooddelivery.view.View;
import it.fooddelivery.view.ViewWelcome;
import it.fooddelivery.view.ViewWorker;

//prova d'una interfaccia lato utente
public class JframeM {
    public static void main(String s[]) {
 
    	final IUtente controller = new Cliente(13,"christian","greco",true);
		new Prova1(controller);
    }
    
    
/*	
    	//defininione delle variabili
        JLabel title;                       //titolo iniziale dell'interfaccia
        JLabel h1, h2, h3, h4, h5, h6;      //cornice del titolo
        JList  films;                       //lista dei film
        String[] film = new String[100];

        //inizializzazione delle variabili
        //titolo
        title = new JLabel("CINEMA");
        h1    = new JLabel("-----------");
        h2    = new JLabel("-----------");
        h3    = new JLabel("|");
        h4    = new JLabel("|");
        h5    = new JLabel("|");
        h6    = new JLabel("|");
        //sezione lista film
        for(int i = 0; i < 100; i++){
            String n = "Film" + i;
            film[i] = n;
        }//end for

        //inizializzo la JList
        films = new JList(film);
        films.setVisibleRowCount(1);

        //definisco le proprietà delle mie variabili
        title.setBounds(480,20,100,30);
        h1.setBounds(460,0,100,50);
        h2.setBounds(460,22,100,50);
        h3.setBounds(458,5,100,50);
        h4.setBounds(545,5,100,50);
        h5.setBounds(458,15,100,50);
        h6.setBounds(545,15,100,50);
        films.setBounds(0,55,1000,50);
        films.setLayoutOrientation(JList.HORIZONTAL_WRAP);

        //creo un JFrame
        JFrame frame = new JFrame("Gestione Cinema");
        //cre un panel
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        //aggiungo i miei componenti
        frame.add(title);
        frame.add(h1);
        frame.add(h2);
        frame.add(h3);
        frame.add(h4);
        frame.add(h5);
        frame.add(h6);
        frame.add(films);
        frame.add(panel);
        //frame.getContentPane().add(new JScrollPane(films));
        //definisco i settaggi del frame
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
     
    }//end main
    
 */  
}//end JFrameM
    	