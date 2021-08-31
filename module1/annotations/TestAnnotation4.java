package annotations;



class DeprecatedTest{
	@Deprecated
	public void Display() {
		System.out.println("DeprecatedTest display");
	}
}

public class TestAnnotation4 {
	@SuppressWarnings({"checked","deprecation"})
   public static void main(String[] args) {
	   DeprecatedTest d=new DeprecatedTest();
	   d.Display();
   }
}
