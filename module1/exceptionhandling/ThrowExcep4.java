package exceptionhandling;

//java program to demonstrate multiple exception in throws’ keyword in java

public class ThrowExcep4 {
  static void throwOne(int a) throws NullPointerException, ArithmeticException{
	  if(a==100) 
		  throw new NullPointerException ("Warning NullPointerException");
	  else
		  throw new ArithmeticException("Warning ArithmeticException");
  }
  
  public static void main(String[] args) {
	  try {
		  throwOne(100);
	  }
	  catch(Exception e) {
		  System.out.println("Caught "+e);
	  }
  }
}
