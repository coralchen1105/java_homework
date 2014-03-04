import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

//import java.awt.event.ActionListener;
import java.beans.*;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;


public class DiceRoller extends JFrame implements ActionListener, PropertyChangeListener{

	private JPanel contentPaneTop;
	private JPanel contentPaneBottom;
	private JTextField[] result      = new JTextField[16];
	private JLabel[]     labelGroup  = new JLabel[16];
	
	private JTextField rollTimes;
	private JButton btnStartRoll;
	
	DiceWorker worker;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceRoller frame = new DiceRoller();
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
	public DiceRoller() {
		super();
		setSize(1200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPaneTop = new JPanel();
		contentPaneBottom = new JPanel();
		
		
		GridLayout gl = new GridLayout(1,16);
		contentPaneTop.setLayout(gl);
		
		
		for(int i=0; i<result.length; i++){
			
			result[i] = new JTextField(); 
			
			result[i].setColumns(4);
			
			int labelName = i+3;
			labelGroup[i] = new JLabel(labelName + ":");
			
			JPanel cell = new JPanel();
			cell.add(result[i]);	
			cell.add(labelGroup[i]);
			cell.setBorder(new EmptyBorder(5,5,5,5));
			contentPaneTop.add(cell);
			
		}
		
		// enter roll times
		rollTimes = new JTextField();
		rollTimes.setColumns(10);
		rollTimes.setBounds(665, 43, 104, 28);
		contentPaneBottom.add(rollTimes);
		
		btnStartRoll = new JButton("Start Roll");
		btnStartRoll.setBounds(665, 83, 117, 29);
		contentPaneBottom.add(btnStartRoll);
		btnStartRoll.addActionListener(this);
		
		
		JLabel lblTimesToRoll = new JLabel("Times to Roll");
		lblTimesToRoll.setBounds(665, 15, 104, 16);
		contentPaneBottom.add(lblTimesToRoll);
		
		GridLayout frameGrid = new GridLayout(2,1);
		setLayout(frameGrid);
		add(contentPaneTop);
		add(contentPaneBottom);
	}
	
	public void actionPerformed(ActionEvent event){
		int timesToRoll = 0;
		try{
			timesToRoll = Integer.parseInt(rollTimes.getText());
			
			// create diceWorker constructor (get roll times)
			worker = new DiceWorker(timesToRoll);
			//btnStartRoll.setEnabled(false);
			worker.addPropertyChangeListener(this);
			
			// execute the doInBackground() and return result with worker object,
			// execute() is run in this thread, but schedule doInBackground() in
			// worker thread
			
			worker.execute();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
			
	}
	
	//respond when the worker's object task is completed
	public void propertyChange(PropertyChangeEvent event){
		
		try{
			int[] rollResult = (int[]) worker.get();
			for(int i= 0; i< rollResult.length; i++){
				result[i].setText(" " +rollResult[i]);
			}

		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
}
