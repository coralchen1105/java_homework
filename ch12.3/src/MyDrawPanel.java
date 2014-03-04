import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel{
	
	public void paintComponent(Graphics g){
		
		//set RGB random color
		int red   = (int) (Math.random()*255);
		int green = (int) (Math.random()*255);
		int blue  = (int) (Math.random()*255);
		
		Color randomColor = new Color(red,green,blue);
		g.setColor(randomColor);
		
		g.fillOval(20, 50, 100, 100);
	}
	
}
