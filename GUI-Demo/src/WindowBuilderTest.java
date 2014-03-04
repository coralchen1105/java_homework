import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;


public class WindowBuilderTest extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField content1;
	private JTextField content2;
	private JLabel label_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderTest frame = new WindowBuilderTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilderTest() {
		
		// JFrame feature
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//JPanel object: contentPane
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// create a 'combine' button
		JButton btnCombine = new JButton("combine");
		btnCombine.setBounds(261, 41, 141, 34);
		contentPane.add(btnCombine);
		
		btnCombine.addActionListener(this);
		
		// label 1 to display result (content 1 + content 2)
		label_3 = new JLabel("");
		label_3.setBounds(5, 176, 412, 53);
		contentPane.add(label_3);
		
		// TextFiled 1 of displaying content 1 
		content1 = new JTextField();
		content1.setBounds(5, 5, 220, 53);
		content1.setText("textFiled");
		contentPane.add(content1);
		content1.setColumns(10);
		
		// TextFiled 2 for displaying content 2
		content2 = new JTextField();
		content2.setBounds(5, 70, 220, 53);
		content2.setText("textFiled");
		content2.setColumns(10);
		contentPane.add(content2);
		
		// A label of title to indicate the content display
		JLabel lblDisplayContent = new JLabel("display content");
		lblDisplayContent.setBounds(5, 130, 121, 34);
		contentPane.add(lblDisplayContent);
	}
	
	public void actionPerformed(ActionEvent event){
		try{
			String contentOne = (String) content1.getText();
			String contentTwo = (String) content2.getText();
			label_3.setText(contentOne + contentTwo);
			
		}catch(NumberFormatException nfe){
			content1.setText("NONE");
			content2.setText("None");
			label_3.setText("Nothing is here!");
		}
		
	}
}
