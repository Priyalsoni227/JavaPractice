package calendar;
import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calendar cal1=Calendar.getInstance();
       Calendar cal2=Calendar.getInstance();
       cal2.add(Calendar.YEAR, 15);
       
       //after method
       System.out.println(cal2.after(cal1));
       
       //before method
       System.out.println(cal1.before(cal2));
	}

}
