package Jframe;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controller.ManageCinema;
import Film.Film;
import Sala.AbstractSala;
import Sala.Sala2D;
import Sala.Sala3D;
import Utente.AbstractUtente;
import Utente.Cliente;
import Utente.Gestore;
import Utente.IUtente;

//classe Jframe per il gestore, questo Jframe servir� al gestore per inserire i dati relativi al film da aggiungere
//al cinema e associarlo ad una sala disponibile scelta a discrezione del gestore
public class JframeG extends JFrame{
    		
	private static final long serialVersionUID = 1L;
	
			//DICHIARAZIONE CONTROLLER
			private final IUtente controller;
			String[] optionsSale = null;
			private ManageCinema manager;
			//costruttore
			public JframeG(final IUtente controller, ManageCinema manager) {
				this.optionsSale = manager.getSale();
				System.out.println("Start JFrameG.....");
				this.controller = controller;
				this.manager    = manager;
			}//end costruttore
			
			public void start() {
				this.Init();
			}//end start
			
			public void Init() {
	            // defininione delle variabili
	            Gestore gestore = new Gestore(30, "Mario", "Mario", true);
	            JLabel title; // titolo iniziale dell'interfaccia
	            JLabel h1, h2, h3, h4, h5, h6; // cornice del titolo
	            JLabel name, gender, plot, movieType, entranceType, sala; // variabili relative al film
	            JTextField Name, Gender, Plot; // variabili JTextField
	            JComboBox<String> dropDown; // menu' a cascata
	            JComboBox<String> dropDown2; // menu' a cascata
	            JComboBox<String> dropDown3; // menu' a cascata
	            JButton save; // menu' per salvare
	            JButton reset; // menu' per resettare
	            JButton visualizzaUtenti; // menu' per resettare
	            String[] optionsBoolean = { "--", "TRUE", "FALSE" }; // elementi menu a cascata

	            // inizializzazione delle variabili
	            // titolo
	            title = new JLabel("GESTIONE CINEMA : INSERISCI IL FILM");
	            
	            // inizializzo le variabili che comporranno la cornice del Jfraem
	            h1 = new JLabel("");
	            h2 = new JLabel("");
	            h3 = new JLabel("");
	            h4 = new JLabel("");
	            h5 = new JLabel("");
	            h6 = new JLabel("");
	            
	            // inizializzo le variaibli che comporranno il corpo del Jframe
	            name = new JLabel("NOME: ");
	            gender = new JLabel("GENERE: ");
	            plot = new JLabel("TRAMA: ");
	            movieType = new JLabel("VISIONE IN 3D: ");
	            entranceType = new JLabel("CONSENTITO AI MINORI: ");
	            sala = new JLabel("SALA: ");
	            
	            // inizializzo le variabili JTextField
	            Name = new JTextField();
	            Gender = new JTextField();
	            Plot = new JTextField();
	            
	            // inizializzo i bottoni save e reset
	            save = new JButton("SALVA");
	            reset = new JButton("RESET");
	            visualizzaUtenti = new JButton("Utenti");
	            
	            // inizializzo il pannello per le scelte multiple
	            dropDown = new JComboBox<>(optionsBoolean);
	            dropDown2 = new JComboBox<>(optionsBoolean);
	            dropDown3 = new JComboBox<>(this.optionsSale);
	             
	            // definisco le propriet� delle mie variabili
	            // variabili che compongo l'intesatazione del Jframe
	            title.setBounds(75, 20, 600, 30);
	            h1.setBounds(460, 0, 100, 50);
	            h2.setBounds(460, 22, 100, 50);
	            h3.setBounds(458, 5, 100, 50);
	            h4.setBounds(545, 5, 100, 50);
	            h5.setBounds(458, 15, 100, 50);
	            h6.setBounds(545, 15, 100, 50);
	            
	            // variabili che compongono il corpo del Jframe
	            name.setBounds(80, 60, 100, 30);
	            Name.setBounds(180, 60, 200, 30);
	            gender.setBounds(80, 100, 200, 50);
	            Gender.setBounds(180, 110, 200, 30);
	            plot.setBounds(80, 150, 200, 50);
	            Plot.setBounds(180, 160, 200, 30);
	            movieType.setBounds(80, 200, 300, 50);
	            dropDown.setBounds(330, 213, 140, 30);
	            entranceType.setBounds(80, 250, 300, 50);
	            dropDown2.setBounds(380, 260, 140, 30);
	            sala.setBounds(80, 300, 300, 50);
	            dropDown3.setBounds(180, 310, 200, 30);
	            // imposto la posizione dei tasti salva e reset
	            save.setBounds(100, 510, 140, 30);
	            reset.setBounds(260, 510, 140, 30);
	            visualizzaUtenti.setBounds(430, 510, 140, 30);
	            
	            // creo un JFrame
	            JFrame frame = new JFrame("Gestione Cinema");

	            // aggiungo i miei componenti
	            frame.add(title);
	            frame.add(h1);
	            frame.add(h2);
	            frame.add(h3);
	            frame.add(h4);
	            frame.add(h5);
	            frame.add(h6);
	            // aggiungo i Jlabel del corpo
	            frame.add(name);
	            frame.add(gender);
	            frame.add(plot);
	            frame.add(movieType);
	            frame.add(sala);
	            frame.add(entranceType);
	            // aggiungo i JTextField
	            frame.add(Name);
	            frame.add(Gender);
	            frame.add(Plot);
	            frame.add(dropDown);
	            frame.add(dropDown2);
	            frame.add(dropDown3);
	            frame.add(save);
	            frame.add(reset);
	            frame.add(visualizzaUtenti);
	            // frame.getContentPane().add(new JScrollPane(films));
	            
	            // definisco i settaggi del frame
	            frame.setTitle("INTERFACCIA GESTORE - GESTIONE CINEMA");
	            // imposto il font ai miei JLabel
	            title.setFont(new Font("Courier", Font.BOLD, 25));
	            name.setFont(new Font("Courier", Font.BOLD, 20));
	            gender.setFont(new Font("Courier", Font.BOLD, 20));
	            plot.setFont(new Font("Courier", Font.BOLD, 20));
	            entranceType.setFont(new Font("Courier", Font.BOLD, 20));
	            movieType.setFont(new Font("Courier", Font.BOLD, 20));
	            sala.setFont(new Font("Courier", Font.BOLD, 20));
	            Name.setFont(new Font("Courier", Font.BOLD, 20));
	            Gender.setFont(new Font("Courier", Font.BOLD, 20));
	            Plot.setFont(new Font("Courier", Font.BOLD, 20));
	            dropDown.setFont(new Font("Courier", Font.BOLD, 20));
	            dropDown2.setFont(new Font("Courier", Font.BOLD, 20));
	            dropDown3.setFont(new Font("Courier", Font.BOLD, 20));
	            save.setFont(new Font("Courier", Font.BOLD, 20));
	            reset.setFont(new Font("Courier", Font.BOLD, 20));
	            visualizzaUtenti.setFont(new Font("Courier", Font.BOLD, 20));
	            // imposto le impostazioni di visualizzazione del JFrame
	            frame.setLayout(null);
	            frame.setSize(700, 600);
	            frame.setLocationRelativeTo(null);
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setVisible(true);

	            // eventi bottoni
	            // evento reset
	            reset.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    Name.setText("");
	                    Gender.setText("");
	                    Plot.setText("");
	                    dropDown.setSelectedIndex(0);
	                    dropDown2.setSelectedIndex(0);
	                    dropDown3.setSelectedIndex(0-1);
	                }
	            });
	            
	            visualizzaUtenti.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                	try {
		                		ArrayList<Cliente> u = new ArrayList<Cliente>(manager.getUsers());	        
		                		System.out.println("Lista degli utenti: \n");
		                		u.stream()
		                		.forEach(x -> System.out.println("Utente : " + u.indexOf(x) 
		                		+ "Nome : " + x.getName()
		                		+ "Cognome: " + x.getSurname()
		                		+ "Eta' : " + x.getAge()
		                		+ "Sala : " + x.getSala() 
		                		+ "Film : " + x.getFilm()+ "\n"));	                		
	                	}catch(Exception ex) {
	                		System.out.println(ex);
	                	}
	                }
	            });
	            
	            // evento save
	            save.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    try {
	                        // creo l'oggetto film
	                        boolean a, b;
	                        if (dropDown.getSelectedItem().toString().equals("TRUE")) {
	                            a = true;
	                        } else {
	                            a = false;
	                        }
	                        if (dropDown2.getSelectedItem().toString().equals("TRUE")) {
	                            b = true;
	                        } else {
	                            b = false;
	                        }
	                        Film film = new Film(Name.getText(), Gender.getText(),Plot.getText(), a, b);
	                        System.out.println(film.getName());
	                        // aggiungo il film alla sala
	                        //invio il film
	                        manager.addFilm(film,dropDown3.getSelectedItem().toString());
	                        
	                    } catch (Exception ex) {
	                        System.out.println(ex);
	                    }
	                    	
	                }
	            });
			}//end init
				
    }// end JframeG
