import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
import java.util.*;

public class BeatBox {
	JFrame mainFrame;
	JPanel rightPanel;
	JPanel leftPanel;
	JPanel centerPanel;
	ArrayList<JCheckBox> checkBoxList;
	String[] labelName = {"student name", "student number", "student account","student subject"};
	Label rightPanelLabel  = new Label(); 
	Label leftPanelLabel   = new Label();
	Label centerPanelLabel = new Label();
	
	public static void main(String [] args){
		BeatBox beatBox = new BeatBox();
		beatBox.buildGUI();
	}
	
	// action event listener (buttons) 
	public class changeRightPanelLabel implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			String actionComand = e.getActionCommand();
			//System.out.println(actionComand);
			rightPanelLabel.setText(actionComand);
	    }
	}
	
	// item event listener (checkBoxes)
	
	public class checkBoxClick implements ItemListener{
		
		public void itemStateChanged(ItemEvent e){
			if(e.getStateChange() == ItemEvent.SELECTED){
				System.out.println("selected");
				leftPanelLabel.setText("selected");
			
			}else{
				System.out.println("deselected");
				leftPanelLabel.setText("deselected");
			}
		}	
	}
	
	public void buildGUI() {
		mainFrame = new JFrame("Beat Box");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		rightPanel  = new JPanel();
		leftPanel   = new JPanel();
		centerPanel = new JPanel();
		
//		for(int i=0; i<4;i++){
//			rightPanel.add(new JButton(labelName[i]));
//			
//		}
		
	// right panel widgets	
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		mainFrame.getContentPane().add(BorderLayout.EAST, rightPanel);
		
		JButton studentName    = new JButton("Student Name");
		studentName.addActionListener(new changeRightPanelLabel());
		rightPanel.add( studentName);
		
		JButton studentNumber  = new JButton("Student Number");
		studentNumber.addActionListener(new changeRightPanelLabel());
		rightPanel.add( studentNumber );
		
		JButton studentAccount = new JButton("Student Account");
		studentAccount.addActionListener(new changeRightPanelLabel());
		rightPanel.add( studentAccount);
		
		JButton studentSubject = new JButton("Student Subject");
		studentSubject.addActionListener(new changeRightPanelLabel());
		rightPanel.add( studentSubject);
		
		JTextField field = new JTextField("Your name", 20);
		rightPanel.add(field);
				
		rightPanel.add( rightPanelLabel);
		
	// left panel widgets
		
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		mainFrame.getContentPane().add(BorderLayout.WEST, leftPanel);
		
		JCheckBox checkOne = new JCheckBox("Student Name");
		checkOne.addItemListener(new checkBoxClick());
		leftPanel.add(checkOne);
		
		JCheckBox checkTwo = new JCheckBox("Student Number");
		checkTwo.addItemListener(new checkBoxClick());
		leftPanel.add(checkTwo);
		
		JCheckBox checkThree = new JCheckBox("Student Account");
		checkThree.addItemListener(new checkBoxClick());
		leftPanel.add(checkThree);
		
		JCheckBox checkFour = new JCheckBox("Student Subject");
		checkFour.addItemListener(new checkBoxClick());
		leftPanel.add(checkFour);
		
		leftPanel.add(leftPanelLabel);
		mainFrame.getContentPane().add(BorderLayout.EAST, rightPanel);
		mainFrame.setSize(500,500);
		mainFrame.setVisible(true);
	}

}
	
