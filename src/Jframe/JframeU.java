package Jframe;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import Utente.Cliente;
import Utente.IUtente;

public class JframeU extends JFrame{
	
	//DICHIARAZIONE CONTROLLER
	private final IUtente controller;
	
	//DICHIARAZIONE PANNELLO PADRE
	private JPanel mainPanel;
	
	//titolo finestra
	private final String title = "INSERISCI I DATI DEL BIGLIETTO";
	
	//DICHIARAZIONE DI TUTTI I PANNELLI
	//(i pannelli vanno dichiarati prima di essere creati)
	private JComboBox<String> gendersCombo;
	private JTextField NameField;		//sottopannello nome
	private JTextField SurnameField;	//sottopannello cognome
	private JTextField AgeField;		//sottopannello eta'
	private JButton saveButton;			//sottopannello bottone salva
	private JButton exitButton;			//sottopannello bottone exit
	
	//COSTRUTTORE
	JframeU(final IUtente controller){
		this.controller = controller;
		this.Init();
	}
	
	//inizializzo le finestre
	private void Init() {
		this.setTitle(this.title);
		this.setSize(800, 600); 
		this.setLocation(400, 200); //localizzazione finestra nel desktop
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setBorder(new EmptyBorder(10, 50, 300, 300)); //distanza dai bordi del pannello padre
		mainPanel.add(createGendersPanel());	//aggiunge al pannello padre il pannello principale per il genere
		mainPanel.add(createDatePanel());		//aggiunge al pannello padre il pannello principale per il nome,cognome,eta'		
		mainPanel.add(createButtonsPanel());	//aggiunge al pannello padre il pannello principale per i bottoni
		
		this.getContentPane().add(mainPanel);
		this.pack();	
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setVisible(true);			
	}
	
	//PANNELLO relativo alla scelta del genere
	private JPanel createGendersPanel() {
		JPanel gendersPanel = new JPanel();	//creazione pannello principale genere
		gendersPanel.setLayout(new BoxLayout(gendersPanel, BoxLayout.Y_AXIS));
		gendersPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); //distanza dai bordi

		//testo sopra la text
		JLabel gendersLabel = new JLabel("Selezionare il genere: ");  //testo sopra la text
		gendersPanel.add(gendersLabel);		//aggiunge la scritta "selezionare il genere" al pannello principale
		
		//box con scelta tra M ed F
		gendersCombo = new JComboBox<>();
		gendersCombo.addItem("M");			//aggiunge "M" tra le scelte
		gendersCombo.addItem("F");			//aggiunge "F" tra le scelte
		gendersPanel.add(gendersCombo);		//aggiunge il sottopannello per la scelta al pannello principale
		
		return gendersPanel;
	}
	
	//PANNELLI relativi alle textbox nome, cognome ed età
	private JPanel createDatePanel() {
		JPanel datePanel = new JPanel();	//creazione pannello principale date
		datePanel.setLayout(new BoxLayout(datePanel, BoxLayout.Y_AXIS));
		datePanel.setBorder(new EmptyBorder(10, 10, 10, 10)); //distanza dai bordi
		
		//pannello età 
		datePanel.add(Box.createVerticalStrut(20)); //pone i pannelli in verticale
		JLabel AgeLabel = new JLabel("Età: "); 		//testo sopra la text
	    datePanel.add(AgeLabel); 					//aggiunge il sottopannello al pannello principale
		AgeField = new JTextField("Età"); 			//testo nella text
		datePanel.add(AgeField);					//aggiunge la scritta nel sottopannello al pannello principale
		
		//pannello nome
		datePanel.add(Box.createVerticalStrut(20)); //pone i pannelli in verticale
		JLabel NameLabel = new JLabel("Nome: ");	//testo sopra la text
	    datePanel.add(NameLabel);					//aggiunge il sottopannello al pannello principale
		NameField = new JTextField("nome");			//testo nella text
		datePanel.add(NameField);					//aggiunge la scritta nel sottopannello al pannello principale
		
		//pannello cognome
		datePanel.add(Box.createVerticalStrut(20)); 	//pone i pannelli in verticale
		JLabel SurnameLabel = new JLabel("Cognome: ");  //testo sopra la text
	    datePanel.add(SurnameLabel);					//aggiunge il sottopannello al pannello principale
		SurnameField = new JTextField("Cognome"); 		//testo nella text
		datePanel.add(SurnameField);					//aggiunge la scritta nel sottopannello al pannello principale
		
		return datePanel;
	}
	
	private JPanel createButtonsPanel() {
		//impostazioni pannello contenente i bottoni
		JPanel buttonsPanel = new JPanel(); //creazione pannello principale bottoni
		buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.X_AXIS));
		buttonsPanel.setBorder(new EmptyBorder(10, 60, 10, 10));	//distanza dai bordi
		
		
		//BOTTONE SALVA
		saveButton = new JButton("SALVA"); 
		
		//la parte sottostante può servire per gestire l'evento 
		
		 /** saveButton.addActionListener(event -> {
		 
			controller.createCurrentOrder((CityImpl)citiesCombo.getSelectedItem(), addressField.getText(), (Restaurant)restaurantCombo.getSelectedItem());
			this.setVisible(false);
			this.dispose();
			new ViewPlacing(this.controller);
			
		});*/
		
		buttonsPanel.add(saveButton);	//aggiunge il bottone save al pannello buttonsPannel
								
		
		//BOTTONE ESCI
		exitButton = new JButton("ESCI");
		
		//la parte sottostante può servire per gestire l'evento 
		/** exitButton.addActionListener(event -> {
		 
			this.dispose();
			ViewWorker.getInstance().dispose();
		});*/
		buttonsPanel.add(exitButton);	//aggiunge il bottone exit al pannello buttonsPannel
		
		buttonsPanel.add(Box.createHorizontalStrut(60)); //pone i bottoni in orizzontale
		
		return buttonsPanel;
	}
}
