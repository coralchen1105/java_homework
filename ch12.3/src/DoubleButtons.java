import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
public class DoubleButtons {
	JFrame jFrame;
	JLabel jLabel;
	MyDrawPanel myDrawPanel = new MyDrawPanel();
	
	class ColorButton implements ActionListener {
		
		public void actionPerformed(ActionEvent e){
		jFrame.repaint();
		}
		
	}
	
	class LabelButton implements ActionListener {
		
		public void actionPerformed(ActionEvent e){
			
			String labelText = jLabel.getText();
			
			if(labelText == "I am label"){
				jLabel.setText("change");
			}else if(labelText == "change"){
				jLabel.setText("I am label");
			}
			
		}
	}
	
	/***
	 * @author Coral
	 * @param 
	 * @return return nothing
	 * 
	 */
	public void go(){
		jFrame = new JFrame();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create inner class objects
		ColorButton cb = new ColorButton();
		LabelButton lb = new LabelButton();
				
		// create widgets to be changed by buttons
		jLabel = new JLabel("I am label");
		
		
		//create two buttons and register button with the ActionListener
		JButton colorButton = new JButton("change color");
		colorButton.addActionListener(cb);
		
		JButton labelButton = new JButton("change label");
		labelButton.addActionListener(lb);
		
		//set frame widgets
		
		jFrame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		jFrame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
		jFrame.getContentPane().add(BorderLayout.EAST, labelButton);
		jFrame.getContentPane().add(BorderLayout.WEST, jLabel);
		
		jFrame.setSize(400,400);
		jFrame.setVisible(true);
		
	}
	
	public static void main(String [] args){
		DoubleButtons doubleButtons = new DoubleButtons();
		doubleButtons.go();
	}
	
}
