package exceptionhandling;

//java program to demonstrate throws’ keyword in java.
public class ThrowExcep3 {
static void throwOne() throws IllegalAccessException{
	System.out.println("Inside throwOne");
	throw new IllegalAccessException("demo");
	
}

public static void main(String[] args) {
	try {
		throwOne();
	}
	
	catch(IllegalAccessException e) {
		System.out.println("Caught "+e);
	}
}
}
