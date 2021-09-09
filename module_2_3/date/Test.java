package date;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		long milis=System.currentTimeMillis();
		Date date2=new Date(milis);
		System.out.println(date2);

	}

}
