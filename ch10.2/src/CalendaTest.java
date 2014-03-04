import java.util.Calendar;
import java.util.Date;


public class CalendaTest {
	
	public static void main(String [] argus){
		
		Calendar c = Calendar.getInstance();
		//print out the current calendar c attributes
		
		
		c.add(Calendar.DATE, 35);
		
		
		
		System.out.println(c.getTime());
		System.out.println(c.get(c.DAY_OF_MONTH));
		System.out.println(c.getMaximum(Calendar.DAY_OF_WEEK));
		System.out.println((Calendar.YEAR));
		Calendar.getInstance().get(Calendar.YEAR);
		
		//Sets the values for the calendar fields YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY, and MINUTE.
		c.set(2014, 6, 6, 15, 40);
	
		SubCalendar s1 = new SubCalendar();
		s1.outPutYearField();
		s1.YEARFIELD = 3;
		SubCalendar s2 = new SubCalendar();
		s2.outPutYearField();
		SubCalendar.outPutYearField();
		//once use get() to call Calendar.YEAR, the YEAR changed, otherwise, nothing change even you set()
		//Actually you can still use Calendar to call static method,as static method is called via class name
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(Calendar.YEAR); 
		
		
		long day1 =c.getTimeInMillis();
		//add 1 hour
		day1 += 1000*60*60;
		
		
		//change value for calendar fields.
		c.setTimeInMillis(day1);
		
		System.out.println("new hours" + c.get(Calendar.YEAR));
		
		//get the current set day
		Date d = c.getTime();
		System.out.println(d);
		
	}
}
