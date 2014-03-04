import java.util.*;
public class HolidayCheck {
	BitSet allYear;
	
	//create constructor for HolidayCheck
	public HolidayCheck(){
		allYear = new BitSet(365);
		int[] holiday = {1,15,50,148,185,200,250,257,301,359};
		for(int i = 0; i <holiday.length; i++){
			allYear.set(holiday[i]);
		}
		
	}
	
	public boolean checkHoliday(int dayToCheck){
		Boolean result = allYear.get(dayToCheck);
		System.out.print(result);
		return result;
	}
	
	public static void main(String[] args){
		HolidayCheck hc = new HolidayCheck();
		int input = 1;
		Boolean isHoliday = hc.checkHoliday(input);
		
		if(isHoliday){
			System.out.println(input + " is holiday");
		}else{
			System.out.println(input + " is not holiday");
		}
		
	}
	
}
