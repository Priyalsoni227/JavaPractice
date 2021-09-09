package calendar;
import java.util.Calendar;

//clear method

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        
        cal.clear(Calendar.YEAR);
        System.out.println("Year: "+cal.getTime());
        
        cal.clear(Calendar.MONTH);
        System.out.println("Month: "+cal.getTime());
        
//        System.out.println(cal.isSet(Calendar.MONTH));

        cal.clear(Calendar.DAY_OF_MONTH);
        System.out.println("Day of month: "+cal.getTime());
//        System.out.println(cal.isSet(Calendar.DAY_OF_MONTH));
        
        cal.clear(Calendar.HOUR);
        cal.clear(Calendar.MINUTE);
        cal.clear(Calendar.SECOND);
        System.out.println(cal.getTime());
//      System.out.println(cal.isSet(Calendar.HOUR));
        
	}

}
