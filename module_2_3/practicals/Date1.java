package practicals;
import java.util.*;
// display current date and time 

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date date=new Date();
        System.out.println("Current date and time using Date class: "+date);
        
        Calendar cal=Calendar.getInstance();
        System.out.println("Current date and time using Calendar class: "+cal.getTime());
	}

}
