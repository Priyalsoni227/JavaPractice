package static_keyword;


//java program to demonstrate execution
//of static blocks and variables

// static block and static variables are executed in order they are present in a program.
public class TestMain2 {
  static int a=m1();
  
  static {
	  System.out.println("Static block initialized");
  }
  
  static int m1() {
	  System.out.println("from m1()");
	  return 20;
  }
  
  public static void main(String[] args) {
	  System.out.println("Value of a: "+a);
	  System.out.println("From main");	
  }
}
