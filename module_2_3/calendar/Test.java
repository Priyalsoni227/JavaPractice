package calendar;
import java.util.Calendar;

//add method

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calendar	cal=Calendar.getInstance();
       System.out.println(cal.getTime());
       
       cal.add(Calendar.YEAR, 9);
       System.out.println(cal.getTime());
       
       cal.add(Calendar.MONTH, 2);
       System.out.println(cal.getTime());
       
       cal.add(Calendar.DAY_OF_MONTH, 15);
       System.out.println(cal.getTime());
       
       cal.add(Calendar.HOUR, 2);
       System.out.println(cal.getTime());
       
       cal.add(Calendar.MINUTE, 20);
       System.out.println(cal.getTime());
       
       cal.add(Calendar.SECOND, 10);
       System.out.println(cal.getTime());
	}

}
