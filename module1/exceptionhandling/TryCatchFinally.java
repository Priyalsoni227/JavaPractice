package exceptionhandling;

public class TryCatchFinally {
public static void main(String[] args) {
	try {
		int[] numbers= {1,2,3};
		System.out.println(numbers[10]);
	}
	catch(Exception e){
		System.out.println("Something went wrong");
	}
	finally {
		System.out.println("The 'try catch' is finished");
	}
}
}
