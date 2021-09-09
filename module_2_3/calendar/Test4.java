package calendar;
import java.util.Calendar;

public class Test4 {

	public static void main(String[] args) {
		// clone
        Calendar cal=Calendar.getInstance();
        System.out.println("Actual calendar object: "+cal.getTime());
        
        Calendar cal2=Calendar.getInstance();
        System.out.println("Cloned calendar object: "+cal2.getTime());
        
        //compareTo
        
        cal2.add(Calendar.HOUR, 10);
        cal2.add(Calendar.MINUTE, 10);
        cal2.add(Calendar.SECOND, 10);
        
        int i=cal2.compareTo(cal);
        System.out.println(i);
        
      
        
        //equals
        Calendar cal3=(Calendar)cal.clone();
        System.out.println("Cal and cal2 are equals: "+cal.equals(cal3));
        
        System.out.println("Today is "+cal.get(Calendar.DATE)+" day of "+cal.get(Calendar.MONTH)+" Month of the year "+cal.get(Calendar.YEAR));
	}

}
