package calendar;
import java.util.*;

public class Test5 extends GregorianCalendar{

	public static void main(String[] args) {
		Test5 cal=new Test5();
		System.out.println("The current date is: "+cal.getTime());
		cal.clear();
		cal.set(GregorianCalendar.YEAR,1998);
		//complete
		cal.complete();
		System.out.println("New date is: "+cal.getTime());
		cal.set(GregorianCalendar.MONTH, 10);
		System.out.println("New month is: "+cal.getTime());
		
		cal.clear();
		cal.set(GregorianCalendar.YEAR, 1998);
		cal.set(GregorianCalendar.MONTH, 10);
		cal.set(GregorianCalendar.DAY_OF_MONTH, 20);
		cal.set(GregorianCalendar.HOUR, 22);
		cal.set(GregorianCalendar.MINUTE, 11);
		cal.set(GregorianCalendar.SECOND, 7);
		
		System.out.println("New date is: "+cal.getTime());
		
		cal.clear();
		//computeFields
		cal.set(GregorianCalendar.YEAR, 2000);
		System.out.println("New Date: "+cal.getTime());
		cal.computeFields();
		System.out.println("New Date: "+cal.getTime());
		
		
		

	}

}
