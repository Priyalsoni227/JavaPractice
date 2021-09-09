package date;
import java.util.Date;
import java.time.Instant;

//from() Method

public class Test6 {

	public static void main(String[] args) {
		Date d=new Date();
		Instant i = Instant.now();
		System.out.println(d.from(i));
		

	}

}
