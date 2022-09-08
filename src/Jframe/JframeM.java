package Jframe;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import Utente.Cliente;
import Utente.IUtente;

//prova d'una interfaccia lato utente
public class JframeM extends JFrame{
	
	public static void main(String s[]) {
 
    	//codice nella main che serve a far partire l'interfaccia JFrameG
    	final IUtente controller = new Cliente(13,"christian","greco",true);
    	new Prova1(controller);

    	//defininione delle variabili
        JLabel title;                       //titolo iniziale dell'interfaccia
        JLabel h1, h2, h3, h4, h5, h6;      //cornice del titolo
        JList  films;                       //lista dei film
        String[] film = new String[100];
        JButton prenota = new JButton("prenota");
        JComboBox<String> sala; // menu' a cascata
        JComboBox<String> posto; // menu' a cascata
        String[] optionsSale = { "SELEZIONA SALA", "sala1", "sala2", "sala3", "sala4" };
        String[] optionsPosti = { "SELEZIONA POSTO", "posto1", "posto2", "posto3", "posto4" };

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
        title.setBounds(480,20,100,30);
        h1.setBounds(460,0,100,50);
        h2.setBounds(460,22,100,50);
        h3.setBounds(458,5,100,50);
        h4.setBounds(545,5,100,50);
        h5.setBounds(458,15,100,50);
        h6.setBounds(545,15,100,50);
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
        frame.add(title);
        frame.add(h1);
        frame.add(h2);
        frame.add(h3);
        frame.add(h4);
        frame.add(h5);
        frame.add(h6);
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
        
    }//end main 
}//end JFrameM
    	