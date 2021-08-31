package annotations;


//Deprecated example
class A{
	void m() {
		System.out.println("Hello m");
	}
	
	@Deprecated
	void n() {
		System.out.println("Hello n");
	}
}

public class TestAnnotation3 {
public static void main(String[] args) {
	A obj=new A();
	obj.n();
}
}
