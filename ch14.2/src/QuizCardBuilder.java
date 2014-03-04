import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class QuizCardBuilder {
	
	private JTextArea question;
	private JTextArea answer;
	private JFrame frame;
	private ArrayList<QuizCard> cardList;
	
	// create inner classes for listener (implement event listener)
	
	public class NextCardListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			cardList.add(card);
			clearCard();
		}
	}
	
	public class saveCardListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			cardList.add(card);
			
			//select file from local
			JFileChooser fileSave = new JFileChooser();
			fileSave.showSaveDialog(frame);
			saveFile(fileSave.getSelectedFile());
			
			clearCard();
			
		}
	}
	
	public class newCardListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			cardList.clear();
			clearCard();
		}
	}
	
	public static void main(String[] argus){
		QuizCardBuilder builder = new QuizCardBuilder();
		builder.buildGUI();
	}
	

	public void buildGUI(){
		
		frame   = new JFrame("Quiz Card Builder");
		JPanel  mainPanel = new JPanel();
		
	// Build all interface attributes	
		
		//set FONT object with the default font info
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		
		//set question area GUI
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigFont);
		
		JScrollPane qScrollPane = new JScrollPane(question);
		qScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		//set answer area GUI
		
		answer = new JTextArea(6,20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(bigFont);
		
		JScrollPane aScrollPane = new JScrollPane(answer);
		aScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nextButton = new JButton("Next Bar");
		
		// create QuizCard object
		cardList = new ArrayList<QuizCard>();
		
		JLabel qLabel = new JLabel("Question");
		JLabel aLabel = new JLabel("Answer");
		
		// create Menu bar
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem newMenuItem = new JMenuItem("new");
		JMenuItem saveMenuItem = new JMenuItem("save");
		
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		menuBar.add(fileMenu);
		
		
	// add all attributes to mainPanel
		
		mainPanel.add(qLabel);
		mainPanel.add(qScrollPane);
		mainPanel.add(aLabel);
		mainPanel.add(aScrollPane);
		mainPanel.add(nextButton);
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(500, 600);
		frame.setVisible(true);
		
		
	// add event listener
		
		nextButton.addActionListener(new NextCardListener());
		saveMenuItem.addActionListener(new saveCardListener());
		newMenuItem.addActionListener(new newCardListener());
		
	}
	
	public void clearCard(){
		question.setText("");
		answer.setText("");
		question.requestFocus();
	}
	
	public void saveFile(File file){
		try{
			//create a file and the connection between the file and bufferedWriter
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for(QuizCard card: cardList){
				writer.write(card.getQuestion() + "/");
				writer.write(card.getAnswer() + "\n");
			}
			writer.close();
			
		}catch(IOException ex){
			System.out.println("Couldn't save file");
			ex.printStackTrace();
		}
		
	}
	
	
}
