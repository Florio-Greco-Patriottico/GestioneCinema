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

import Controller.ManageCinema;
import Film.AbstractFilm;
import Sala.AbstractSala;
import Utente.Cliente;
import Utente.Gestore;
import Utente.IUtente;

//prova d'una interfaccia lato utente
public class JframeM extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
		//dichairazione degli attributi funzionali
		private  String[] optionsSale = null;
		private  IUtente controllerg = new Gestore(0, "nome", "nome", true); 
		private  String[] optionsPosti;
		private  JComboBox<String> posto;
		private  JComboBox<String> films;
		private  String[] film 	= new String[100];
		private  ArrayList<AbstractFilm> Film;
		private  ManageCinema manager;
				
		//costruttore
		public JframeM(ManageCinema manager) {		
			this.optionsSale  = manager.getSale();	
			this.manager	  = manager;
			this.optionsPosti = new String[100];
			this.posto  	  = new JComboBox<String> (optionsPosti);
			this.films  	  = new JComboBox<String> (film);
			this.Film	  	  = new ArrayList<AbstractFilm>();
			
			try {
				this.start();
				System.out.println("Start JFrameM.....");
			}catch(Exception e) {
				System.out.println(e);
			}
		}//end costruttore


		public void start() {
			try {
				new StartJFrame(this.controllerg,this.manager);
				System.out.println("Start JFrameG.....");
				this.init();								
			}catch(Exception e) {
				System.out.println(e);
			}
		}//end start

		
		public void init() {
			//defininione delle variabili
	        JLabel title;                       	//titolo iniziale dell'interfaccia
	        JLabel h1, h2, h3, h4, h5, h6;      	//cornice del titolo
	        JButton prenota = new JButton("prenota");
	        JComboBox<String> sala; 				
	        this.Film 		  = manager.getFilms();
	        
	        //inizializzazione delle variabili   
	        
	        //inizializzo i film
	        try {	        
	        	films.removeAllItems();
	        	for(int i = 0; i < Film.size(); i++) {
	        		film[i] = " - " + Film.get(i).getName();
	        		films.addItem(film[i]);
	        	}
	        }catch(Exception e) {
	        	System.out.println(e);
	        }	        
	        // inizializzo il pannello per le scelte multiple
	        sala = new JComboBox<>(optionsSale);
	        
	        //definisco le proprietà delle mie variabili
	        films.setBounds(0,75,1000,50);
	        sala.setBounds(180, 310, 200, 30);
	        this.posto.setBounds(180, 310, 200, 30);
	        
	        
	        //creo un JFrame
	        JFrame frame = new JFrame("Gestione Cinema");
	        
	        //creo un pannello per la parte inferiore
	        JPanel Panel = new JPanel();
	        
	        //creo un panel per sala e posto
	        JPanel SalaPostoPanel = new JPanel();        
	        //creo un panel per il bottone
	        JPanel buttonPanel = new JPanel();
	        SalaPostoPanel.add(this.posto);
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
	        
	        SalaPostoPanel.setBorder(new EmptyBorder(150,150,10,150));
	        
	        //pannello con bottone prenota
	        buttonPanel.add(prenota);
	        buttonPanel.setBorder(new EmptyBorder(10,150,100,150));
	    
	        sala.addActionListener(new ActionListener() {
	        	Gestore g = manager.getGestore();

				@Override
				public void actionPerformed(ActionEvent e) {
					try {
			        	AbstractSala current = g.getSala(sala.getSelectedItem().toString());
			        	int j = current.getNpostiLiberi();
						posto.removeAllItems();
						optionsPosti[0] = "---";
			        	for(int i = 1; i < j; i++) {
			        		optionsPosti[i] = "posto " + i;	
			        		posto.addItem(optionsPosti[i]);
			        	}	
		        	}catch(Exception ex) {
		        		System.out.println(ex);
		        	}	
				}
	        });
	        
	        prenota.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!posto.getSelectedItem().toString().equals("---")) {
                    	try {
                        	//inizializzo un array contente le scelte del cliente
                        	ArrayList<String> ret = new ArrayList();
                        	ret.add((String) sala.getSelectedItem());
                        	ret.add((String) posto.getSelectedItem());
                        	
                        	//apro l'interfaccia cliente
                        	final IUtente controlleru = new Cliente(0,"null","null",true);
                        	//salvo la sala
                        	manager.SaveLastSala(sala.getSelectedItem().toString(), films.getSelectedItem().toString());
                        	//apro il JframeU
                        	new StartJFrame(controlleru, manager);
                        } catch (Exception ex) {
                            System.out.println("Error : " + ex);
                        }
                    }
                }
            });
		}//end init
}//end JFrameM
    	