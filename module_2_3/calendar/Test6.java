package calendar;
import java.util.*;

public class Test6 {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		
		//getActualMinimum
		int year=cal.getActualMinimum(Calendar.YEAR);
		System.out.println("Minimum year value: "+year);
		
		int month=cal.getActualMinimum(Calendar.MONTH);
		System.out.println("Minimum month value: "+month);
		
		int day=cal.getActualMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Minimum day value: "+day);
		
		int hour=cal.getActualMinimum(Calendar.HOUR);
		System.out.println("Minimum hour value: "+hour);
		
		int minute=cal.getActualMinimum(Calendar.MINUTE);
		System.out.println("Minimum minute value: "+minute);
		
		int second=cal.getActualMinimum(Calendar.SECOND);
		System.out.println("Minimum second value: "+second);
		
		//getActualMaximum
		int year1=cal.getActualMaximum(Calendar.YEAR);
		System.out.println("Maximum year value: "+year1);
		
		int month1=cal.getActualMaximum(Calendar.MONTH);
		System.out.println("Maximum month value: "+month1);
		
		int day1=cal.getActualMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum day value: "+day1);
		
		int hour1=cal.getActualMaximum(Calendar.HOUR);
		System.out.println("Maximum hour value: "+hour1);
		
		int minute1=cal.getActualMaximum(Calendar.MINUTE);
		System.out.println("Maximum minute value: "+minute1);
		
		int second1=cal.getActualMaximum(Calendar.SECOND);
		System.out.println("Maximum second value: "+second1);

	}

}
