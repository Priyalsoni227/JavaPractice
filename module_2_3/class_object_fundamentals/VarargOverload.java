package class_object_fundamentals;

//Overloading Varargs Methods

public class VarargOverload {
   private void test(int... args) {
	   int sum=0;
	   for(int n:args) {
		   sum+=n;
	   }
	   System.out.println("sum is: "+sum);
   }
   
   private void test(boolean p, String... args) {
	   boolean negate=!p;
	   System.out.println("negate = "+negate);
	   System.out.println("args.length = "+args.length);
   }
   
   public static void main(String[] args) {
	   VarargOverload obj= new VarargOverload();
	   obj.test(2,4);
	   obj.test(false, "Hello", "World");
   }
}
