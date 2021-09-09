package date;
import java.util.Date;

//Java Date after() Method
public class Test1 {
    public static void main(String[] args) {
    	Date d1=new Date(2021,10,21);
    	Date d2=new Date(1980,2,12);
    	
    	System.out.println("Date d1 is after d2: "+d1.after(d2));
    }
}
