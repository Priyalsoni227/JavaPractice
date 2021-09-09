package instanceof_operator;

class Parent{ }

class Child extends Parent{ }

public class TestMain {
   public static void main(String[] args) {
	   Child cobj=new Child();
	   
	   //simple case
	   if(cobj instanceof Child) {
		   System.out.println("cobj is instance of Child");
	   }
	   else {
		   System.out.println("cobj is not an instance of Child");
	   }
	   
	   //returns true for Parent class also
	   if(cobj instanceof Parent) {
		   System.out.println("cobj is instance of Parent");
	   }
	   else {
		   System.out.println("cobj is not an instance of Parent");
	   }
	   
	   //returns true for all ancestors
	   if(cobj instanceof Object) {
		   System.out.println("cobj is instance of Object");
	   }
	   else {
		   System.out.println("cobj is not an instance of Object");
	   }
   }
}
