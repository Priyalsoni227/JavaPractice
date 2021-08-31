package generics;
import java.util.*;


//we don't need to typecast individual members of arraylist when using generics
public class Test7Main {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Hello");
	al.add("World");
	
	String s1=al.get(0);
	String s2=al.get(1);
	
	System.out.println(s1);
	System.out.print(s2);
}
}
