package practicals;
import java.text.DateFormat;
import java.util.*;
// display date in different formats

public class Date4 {

	public static void main(String[] args) {
		Date currentDate=new Date();
		System.out.println("Current date: "+currentDate);
		
		String str=DateFormat.getInstance().format(currentDate);
		System.out.println("Usinf getInstance: "+str);
		
		str=DateFormat.getDateInstance().format(currentDate);
		System.out.println("Usinf getDateInstance: "+str);
		
		str=DateFormat.getTimeInstance().format(currentDate);
		System.out.println("Usinf getTimeInstance: "+str);
		
		str=DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);
		System.out.println("Usinf getTimeInstance short: "+str);
		
		str=DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
		System.out.println("Usinf getTimeInstance medium: "+str);
		
		str=DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);
		System.out.println("Usinf getTimeInstance long: "+str);
		
		str=DateFormat.getDateTimeInstance().format(currentDate);
		System.out.println("Usinf getDateTimeInstance: "+str);

	}

}
