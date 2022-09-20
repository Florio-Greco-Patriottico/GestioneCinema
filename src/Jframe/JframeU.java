package Jframe;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;

import Utente.Cliente;
import Utente.IUtente;

public class JframeU extends JFrame{
	
	//DICHIARAZIONE CONTROLLER
	private final IUtente controller;
	
	//COSTRUTTORE
	JframeU(final IUtente controller){
		this.controller = controller;
	}//end costruttore
	
	public void Init() {
		// Create frame with title Registration Demo
        JFrame frame= new JFrame(); 
        frame.setTitle("Cinema - Registration");
         
               // Panel to define the layout. We are using GridBagLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
 
        JPanel headingPanel = new JPanel();
        JLabel headingLabel = new JLabel("This is the heading panel for registration");
        headingPanel.add(headingLabel);
         
               // Panel to define the layout. We are using GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        // Constraints for the layout
        GridBagConstraints constr = new GridBagConstraints();
        constr.insets = new Insets(7, 7, 7, 7);     
        constr.anchor = GridBagConstraints.WEST;
 
        // Set the initial grid values to 0,0
        constr.gridx=0;
        constr.gridy=0;
  
        // Declare the required Labels
        JLabel userNameLabel = new JLabel("Enter your name :");
        JLabel surnameLabel = new JLabel("Enter surname :");
        JLabel ageLabel = new JLabel("Enter your age :");
        JLabel typeLabel = new JLabel("Choose ticket's type :");
        
         
        // Declare Text fields
        JTextField userNameTxt = new JTextField(20);
        JTextField ageTxt = new JTextField(20);
        JTextField surnameTxt = new JTextField(20);
        JTextField typeTxt = new JTextField(20);
        JComboBox<String> dropDown = new JComboBox<>();
        String[] optionsBoolean = { "--", "TRUE", "FALSE" }; // elementi menu a cascata
        dropDown = new JComboBox<>(optionsBoolean);
         
        panel.add(userNameLabel, constr);
        constr.gridx=1;
        panel.add(userNameTxt, constr);
        constr.gridx=0; constr.gridy=1;
         
        panel.add(ageLabel, constr);
        constr.gridx=1;
        panel.add(ageTxt, constr);
        constr.gridx=0; constr.gridy=2;
         
        panel.add(surnameLabel, constr);
        constr.gridx=1;
        panel.add(surnameTxt, constr);
        constr.gridy=3;
        
        panel.add(typeLabel, constr);
        constr.gridx=0;
        panel.add(dropDown, constr);
        constr.gridy=6;
         
        constr.gridwidth = 2;
        constr.anchor = GridBagConstraints.CENTER;
  
        // Button with text "Register"
        JButton button = new JButton("Register");
        // add a listener to button
        button.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            headingLabel.setText("Thanks for registering. We'll get back to you shortly.");
            userNameTxt.setText("");
            ageTxt.setText("");
            surnameTxt.setText("");
          }
        });
  
        // Add label and button to panel
        panel.add(button, constr);
  
        mainPanel.add(headingPanel);
        mainPanel.add(panel);
 
        // Add panel to frame
        frame.add(mainPanel);
        frame.pack();
                frame.setSize(400, 400);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }//end init
	
	
	/*
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
		/*
		buttonsPanel.add(saveButton);	//aggiunge il bottone save al pannello buttonsPannel
								
		
		//BOTTONE ESCI
		exitButton = new JButton("ESCI");
		
		//la parte sottostante può servire per gestire l'evento 
		/** exitButton.addActionListener(event -> {
		 
			this.dispose();
			ViewWorker.getInstance().dispose();
		});*/
		/*
		buttonsPanel.add(exitButton);	//aggiunge il bottone exit al pannello buttonsPannel
		
		buttonsPanel.add(Box.createHorizontalStrut(60)); //pone i bottoni in orizzontale
		
		return buttonsPanel;
	}
	*/
	
	
	//end init
	
	
	
	/*
	//DICHIARAZIONE PANNELLO PADRE
	private JPanel mainPanel;
	
	
	//titolo finestra
	private final String title = "INSERISCI I DATI DEL BIGLIETTO";
	
	//DICHIARAZIONE DI TUTTI I PANNELLI
	//(i pannelli vanno dichiarati prima di essere creati)
	private JComboBox<String> gendersCombo;
	private JTextField NameField;				//sottopannello nome
	private JTextField SurnameField;			//sottopannello cognome
	private JTextField AgeField;				//sottopannello eta'
	private JButton saveButton;					//sottopannello bottone salva
	private JButton exitButton;					//sottopannello bottone exit
	
	*/

	
	/*
	//inizializzo le finestre
	private void Init() {
		this.setTitle(this.title);
		this.setSize(800, 600); 
		this.setLocation(400, 200); //localizzazione finestra nel desktop
		
		mainPanel = new JPanel();	//creazione pannello padre
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
	
	*/
	
}
