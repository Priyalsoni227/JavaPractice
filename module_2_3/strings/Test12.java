package strings;
import java.util.*;

public class Test12 {
  public static void main(String[] args) {
	  System.out.println("Using constructor 1 - ");
	  StringTokenizer st1 = new StringTokenizer("I am Priyal Soni");
	  while(st1.hasMoreTokens()) {
		  System.out.println(st1.nextToken());
	  }
	  
	  System.out.println("Using constructor 2 - ");
	  StringTokenizer st2 = new StringTokenizer("Java : Code : String"," : ");
	  while(st2.hasMoreTokens()) {
		  System.out.println(st2.nextToken());
	  }
	  
	  System.out.println("Using constructor 3 - ");
	  StringTokenizer st3 = new StringTokenizer("Java : Code : String"," : ",true);
	  while(st3.hasMoreTokens()) {
		  System.out.println(st3.nextToken());
	  }
  }
}
