package Jframe;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.ManageCinema;
import Utente.AbstractUtente;
import Utente.Cliente;
import Utente.IUtente;

public class JframeU extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	//DICHIARAZIONE CONTROLLER
	private final IUtente controller;
	private ArrayList<String> parametri = new ArrayList();
	private ManageCinema  	  manager;
	
	//COSTRUTTORE
	JframeU(final IUtente controller,ManageCinema manager){
		System.out.println("Start JFrameU.....");
		this.controller = controller;
		this.manager = manager;
		
	}//end costruttore
	
	public void Init() {
		// Create frame with title Registration Demo
        JFrame frame= new JFrame(); 
        frame.setTitle("Cinema - Registration");
         
               // Panel to define the layout. We are using GridBagLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
 
        JPanel headingPanel = new JPanel();
        JLabel headingLabel = new JLabel("Questo è il pannello per la registrazione");
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
        JLabel userNameLabel = new JLabel("Inserisci nome :");
        JLabel surnameLabel = new JLabel("Inserisci cognome :");
        JLabel ageLabel = new JLabel("Inserire eta' :");
        JLabel typeLabel = new JLabel("Uomo/Donna (T/F) :");
        
         
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
                frame.setSize(500, 500);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            
            Cliente utente = null;
            public void actionPerformed(ActionEvent e) {
            	try {            		
            		//creo l'utente in base ai dati che ho catturato
            		utente = new Cliente(Integer.parseInt(ageTxt.getSelectedText()), 
            				userNameTxt.getSelectedText(), 
            				surnameTxt.getSelectedText(), 
            				Boolean.parseBoolean(typeTxt.getSelectedText()));
            		System.out.println(utente.toString());
            		//aggiungo l'utente
            		manager.addUsers(utente);
            	}catch(Exception ex) {
            		System.out.println(ex);
            	}      	
            }
        });               
    }//end init
}
