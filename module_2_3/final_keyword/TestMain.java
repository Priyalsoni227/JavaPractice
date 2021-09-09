package final_keyword;


//Java program to demonstrate different
//ways of initializing a final variable
public class TestMain {
final int THRESHOLD = 5;
final int CAPACITY;
final int MINIMUM;

static final double PI = 3.14;
static final double EULERCONSTANT;

{
	CAPACITY = 25;
}

static {
	EULERCONSTANT = 2.3;
}

TestMain(){
	MINIMUM = -1;
}

public static void main(String[] args) {
	TestMain obj = new TestMain();
	System.out.println(obj.THRESHOLD);
	System.out.println(obj.CAPACITY);
	System.out.println(obj.MINIMUM);
	System.out.println(PI);
	System.out.println(EULERCONSTANT);
	
}
}
