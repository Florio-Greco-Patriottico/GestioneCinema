package Jframe;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JframeG extends JFrame{
	
	public static void main(String args[]) {
		// creo il jframe
	    JFrame win;
	    win = new JFrame("COMPILARE I SEGUENTI DATI");
	    
	    JButton uno=new JButton("Uno");
	    
	    Container c = win.getContentPane();
	    c.add(new JLabel("Buona Lezione"));
	    
	    win.setSize(1000,1000);
	    win.setDefaultCloseOperation
	        (JFrame.EXIT_ON_CLOSE);
	    win.setVisible(true);
	}
	
	
}
