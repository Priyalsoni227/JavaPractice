package generics;


//Generic function
class Test3{
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName()+" = "+element);
	}
}

public class Test3Main {
   public static void main(String[] args) {
	   Test3.genericDisplay(11);
	   Test3.genericDisplay("Hello World");
	   Test3.genericDisplay(1.0);
	   
	   
   }
}
