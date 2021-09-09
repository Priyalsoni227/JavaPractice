package date;

import java.util.Date;

//Java Date before() Method

public class Test2 {

	public static void main(String[] args) {
		Date d1=new Date(2021,10,21);
    	Date d2=new Date(1980,2,12);
    	
    	System.out.println("Date d2 is after d1: "+d2.before(d1));

	}

}
