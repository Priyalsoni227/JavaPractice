package practicals;
import java.util.*;
//add time to date

public class Date2 {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		System.out.println("Current date: "+cal.getTime());
		
		cal.add(Calendar.YEAR, 2);
		cal.add(Calendar.MONTH, 2);
		cal.add(Calendar.DAY_OF_MONTH, 6);
		cal.add(Calendar.HOUR, 4);
		cal.add(Calendar.MINUTE, 10);
		cal.add(Calendar.SECOND, 20);
		
		System.out.println("New date: "+cal.getTime());

	}

}
