import java.util.Calendar;


public class SubCalendar extends Calendar {

	public static int YEARFIELD = 2;
	
	public static void outPutYearField(){
		System.out.println(SubCalendar.YEARFIELD);
		
	}
	
	@Override
	public void add(int field, int amount) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getGreatestMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void roll(int field, boolean up) {
		// TODO Auto-generated method stub

	}

}
