package date;
import java.util.Date;
//setTime() Method

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date d=new Date(2021,12,12);
        long l=1000;
        d.setTime(l);
        System.out.println(d);
	}

}
