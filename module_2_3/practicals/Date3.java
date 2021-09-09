package practicals;
import java.text.DateFormat;
import java.util.*;
//display time in different country's format

public class Date3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();
		
		//england format
		Locale locEngland=new Locale("en","ch");
		DateFormat de =DateFormat.getDateInstance(DateFormat.FULL,locEngland);
	    System.out.println("England format: "+de.format(d1));
	    
	    //italian format
	    Locale locItalian=new Locale("it","ch");
		DateFormat di =DateFormat.getDateInstance(DateFormat.FULL,locItalian);
	    System.out.println("Italian format: "+di.format(d1));
	    
	    //Russian format
	    Locale locRussian=new Locale("ru","ch");
		DateFormat dr =DateFormat.getDateInstance(DateFormat.FULL,locRussian);
	    System.out.println("Russian format: "+dr.format(d1));
	    
	    //french format
	    Locale locFrench=new Locale("fr","ch");
		DateFormat df =DateFormat.getDateInstance(DateFormat.FULL,locFrench);
	    System.out.println("French format: "+df.format(d1));

	}

}
