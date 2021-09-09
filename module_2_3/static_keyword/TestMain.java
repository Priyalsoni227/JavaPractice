package static_keyword;

//Java program to demonstrate use of static blocks

public class TestMain {
	static int a=10;
	static int b;
	
	static {
		System.out.println("Static block initialized");
		b=a*4;
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
	}

}
