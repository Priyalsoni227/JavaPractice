package exceptionhandling;

//program to check whether eligible or not in voting registration using throw keyword
public class ThrowExcep2 {
	static void ageCheck(int age) {
		if(age<18) {
			throw new ArithmeticException("Not eligible for voting");
		}
		else {
			System.out.println("Eligible for voting");
		}
	}
	
	public static void main(String[] args) {
		ageCheck(16);
	}

}
