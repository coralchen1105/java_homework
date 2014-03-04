import static java.lang.System.out;
import java.util.*;

public class FullMoons {
	
	//create constant of 1 day millis 
	static int DAY_IM = 1000 * 60 *60 *24;
	
	public static void main(String[] args){
		
		//create subclass object c to hold current Calendar attributes 
		Calendar c = Calendar.getInstance();
		
		//set object c current calendar
		c.set(2004,0,7,15,40);
		//convert the current time of object c to millis
		long day1 = c.getTimeInMillis();
		
		//Next full moon day, if use CONSTANTS in current class, no Class name call required
		
		for(int x = 0; x<3; x++){

			day1 += (DAY_IM *29.52);
			c.setTimeInMillis(day1);
			out.println(String.format("Full moon on %tc", c));
		}
		
	}
}
