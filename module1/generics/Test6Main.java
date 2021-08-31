package generics;

import java.util.ArrayList;


//Using generics converts run time exceptions into 
//compile time exception.
public class Test6Main {
	public static void main(String[] args) {
		  ArrayList<String> al=new ArrayList<String>();
		  al.add("Sachin");
		  al.add("Rahul");
		  
		  al.add(10); //compiler doesn't allow this 
		  
		  String s1=(String)al.get(0);
		  String s2=(String)al.get(1);
		  String s3=(String)al.get(2);
	  }
}
