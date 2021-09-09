package date;
import java.util.Date;
//getTime() Method

public class Test7 {

	public static void main(String[] args) {
		Date d=new Date(2020,0,1);
		System.out.println("Current number of milliseconds since January 1, 1970: "+d.getTime());

	}

}
