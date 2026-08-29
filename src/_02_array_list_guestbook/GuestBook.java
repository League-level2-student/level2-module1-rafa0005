package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Name");
	
	ArrayList<String> names = new ArrayList<String>();
	
	
	
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.start();
	}

	private void start() {
		// TODO Auto-generated method stub
		
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed == button1 ) {
			String name = JOptionPane.showInputDialog("Add a name into the guestbook");
			names.add(name);
			if(buttonPressed == button2) {
				JOptionPane.showMessageDialog(null, name);
			}
		}
	}
	
}
