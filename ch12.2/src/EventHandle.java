import javax.swing.*;
import java.awt.event.*;


public class EventHandle implements ActionListener {
	
	JButton btn;
	
	public static void main(String [] argus){
		
		EventHandle gui = new EventHandle();
		gui.go();
		
	}
	
	public void go(){
		
		JFrame frame = new JFrame();
		btn = new JButton("Click me");
		
		//this refers to this class object
		//register this button with ActionListener interface, so once the ActionEvent happen and return the ActionEvent object, 
		//then the ActionListener interface will call its method back to this object
		btn.addActionListener(this);
		
		//set frame outlook
		frame.getContentPane().add(btn);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		}
	
	
	// this method is override the interface abstract method, which is the call back function that responds to Listener (this object);
	// when the ActionEvent e object return, the this method will take action. ActionEvent is event happen via user behaviors(trigger from event sources)
	public void actionPerformed(ActionEvent e){
		btn.setText("YOU CLICK ME!");
		
	}
}
