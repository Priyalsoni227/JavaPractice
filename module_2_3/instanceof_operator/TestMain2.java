package instanceof_operator;

//Java program to demonstrate that instanceof
//returns false for null

class Test{ }

public class TestMain2 {
  public static void main(String[]args) {
	  Test obj=null;
	  
	  if(obj instanceof Test) {
		  System.out.println("obj is an instance of Test");
	  }
	  else {
		  System.out.println("obj is not an instance of Test");
	  }
  }
}
