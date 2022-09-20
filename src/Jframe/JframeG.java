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

import Film.Film;
import Sala.AbstractSala;
import Sala.Sala2D;
import Sala.Sala3D;
import Utente.Gestore;

//classe Jframe per il gestore, questo Jframe servirà al gestore per inserire i dati relativi al film da aggiungere
//al cinema e associarlo ad una sala disponibile scelta a discrezione del gestore
public class JframeG {
    		
			/*
            // dichiaro le sale
            Sala2D sala1 = new Sala2D("Sala1 - 2D", 1, 10, false);
            Sala3D sala2 = new Sala3D("Sala2 - 3D", 2, 10, true);
            Sala2D sala3 = new Sala2D("Sala3 - 2D", 3, 10, false);
            Sala3D sala4 = new Sala3D("Sala4 - 3D", 4, 10, true);
            // lista delle sale
            ArrayList<AbstractSala> sale = new ArrayList();
            // aggiungo le sale alla lista
            sale.add(sala1);
            sale.add(sala2);
            sale.add(sala3);
            sale.add(sala4);

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
            String[] optionsBoolean = { "--", "TRUE", "FALSE" }; // elementi menu a cascata
            String[] optionsSale = { "SELEZIONA SALA", "sala1", "sala2", "sala3", "sala4" };

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
            plot = new JLabel("POSTO: ");
            movieType = new JLabel("TIPOLOGIA DEL FILM: ");
            entranceType = new JLabel("TIPOLOGIA ENTRATA FILM: ");
            sala = new JLabel("SALA: ");
            // inizializzo le variabili JTextField
            Name = new JTextField();
            Gender = new JTextField();
            Plot = new JTextField();
            // inizializzo i bottoni save e reset
            save = new JButton("SALVA");
            reset = new JButton("RESET");
            // inizializzo il pannello per le scelte multiple
            dropDown = new JComboBox<>(optionsBoolean);
            dropDown2 = new JComboBox<>(optionsBoolean);
            dropDown3 = new JComboBox<>();
            // inizializzo il dropdown3
            for (int i = 0; i < sale.size(); i++) {
                String a = sale.get(i).getName();
                dropDown3.insertItemAt(a, i);
            } // end for
              // definisco le proprietà delle mie variabili
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
            save.setBounds(200, 510, 140, 30);
            reset.setBounds(360, 510, 140, 30);
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
            // evento save
            save.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        // creo l'oggetto film
                        boolean a, b;
                        if (dropDown.getSelectedItem().equals("TRUE")) {
                            a = true;
                        } else {
                            a = false;
                        }
                        if (dropDown2.getSelectedItem().equals("TRUE")) {
                            b = true;
                        } else {
                            b = false;
                        }
                        Film film = new Film(Name.getText(), Gender.getText(), Plot.getText(), a, b);
                        film.toString();
                        // aggiungo il film alla sala
                        int sel = 0;
                        AbstractSala current = null;
                        sel = dropDown3.getSelectedIndex();
                        current = sale.get(sel);
                        current.addFilm(film);
                        current.toString();
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            });
            */
    }// end JframeG
