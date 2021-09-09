package date;
import java.util.Date;

//equals method

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date d1=new Date(2021,0,12);
        Date d2=new Date(1980,2,20);
        Date d3=new Date(2021,0,12);
        
        System.out.println("Date d1 equals d2: "+d1.equals(d2));
        System.out.println("Date d2 equals d3: "+d1.equals(d3));
        
        
	}

}
