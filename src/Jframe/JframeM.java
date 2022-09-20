package Jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Utente.Cliente;
import Utente.Gestore;
import Utente.IUtente;

//prova d'una interfaccia lato utente
public class JframeM extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
		//dichairazione degli attributi funzionali
		String[] optionsSale = null;
		
		//costruttore
		public JframeM(String[] sale) {		
			this.optionsSale = sale;			
			System.out.println("Start JFrameM.....");
		}//end costruttore
		
		public void start() {
			//codice nella main che serve a far partire l'interfaccia JFrameG
			final IUtente controllerg  = new Gestore(30, "Mario", "Mario", true);
			new StartJFrame(controllerg, null, this.optionsSale);
			this.init();
		}//end start

		
		public void init() {
			//defininione delle variabili
	        JLabel title;                       //titolo iniziale dell'interfaccia
	        JLabel h1, h2, h3, h4, h5, h6;      //cornice del titolo
	        JList  films;                    	//lista dei film
	        String[] film = new String[100];
	        JButton prenota = new JButton("prenota");
	        JComboBox<String> sala; 	// menu' a cascata
	        JComboBox<String> posto; 	// menu' a cascat
	        String[] optionsPosti = { "SELEZIONA POSTO", "posto1", "posto2", "posto3", "posto4" };

	        //inizializzazione delle variabili
	                
	        //sezione lista film
	        for(int i = 0; i < 23; i++){
	            String n = "Film" + i;
	            film[i] = n;
	        }//end for
	        
	        //inizializzo la JList
	        films = new JList(film);
	        films.setVisibleRowCount(1);
	        
	        // inizializzo il pannello per le scelte multiple
	        sala = new JComboBox<>(optionsSale);
	        posto = new JComboBox<>(optionsPosti);
	        

	        //definisco le proprietà delle mie variabili
	        films.setBounds(0,75,1000,50);
	        films.setLayoutOrientation(JList.HORIZONTAL_WRAP);
	        sala.setBounds(180, 310, 200, 30);
	        posto.setBounds(180, 310, 200, 30);

	        //creo un JFrame
	        JFrame frame = new JFrame("Gestione Cinema");
	        
	        //creo un pannello per la parte inferiore
	        JPanel Panel = new JPanel();
	        
	        //creo un panel per sala e posto
	        JPanel SalaPostoPanel = new JPanel();        
	        //creo un panel per il bottone
	        JPanel buttonPanel = new JPanel();
	        
	        //aggiungo i miei componenti
	        frame.add(films);
	        frame.add(Panel);
	        //frame.getContentPane().add(new JScrollPane(films));
	        
	        //definisco i settaggi del frame
	        frame.setSize(1000, 400);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	        
	        //aggiungo a panel(cioe il pannello per la parte sottostante)
	        //i due pannelli per sala e posto e per il bottone
	        Panel.add(SalaPostoPanel);
	        Panel.add(buttonPanel);
	        
	        //pannello con i due box sala e posto
	        SalaPostoPanel.add(sala);
	        SalaPostoPanel.add(posto);
	        SalaPostoPanel.setBorder(new EmptyBorder(150,150,10,150));
	        
	        //pannello con bottone prenota
	        buttonPanel.add(prenota);
	        buttonPanel.setBorder(new EmptyBorder(10,150,100,150));
	    
	        prenota.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                    	//inizializzo un array contente le scelte del cliente
                    	ArrayList<String> ret = new ArrayList();
                    	ret.add((String) sala.getSelectedItem());
                    	ret.add((String) posto.getSelectedItem());
                    	
                    	//apro l'interfaccia cliente
                    	final IUtente controlleru = new Cliente(0,"null","null",true);
                    	new StartJFrame(controlleru, ret, null);
                    } catch (Exception ex) {
                        System.out.println("Error : " + ex);
                    }

                }
            });
	        
		}//end init
}//end JFrameM
    	