package generics;
import java.util.*;


//not using generics can cause runtime exceptions
public class Test5Main {
  public static void main(String[] args) {
	  ArrayList al=new ArrayList();
	  al.add("Sachin");
	  al.add("Rahul");
	  al.add(10); //compiler allows this 
	  
	  String s1=(String)al.get(0);
	  String s2=(String)al.get(1);
	  
	  //causes runtime exception
	  String s3=(String)al.get(2);
  }
}
