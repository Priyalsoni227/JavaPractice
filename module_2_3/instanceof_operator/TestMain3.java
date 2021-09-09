package instanceof_operator;

class Parent1{ }

class Child1 extends Parent1{ }

public class TestMain3 {
public static void main(String[] args) {
	
	//parent object is
	// not an instance of Child
	Parent1 pobj=new Parent1();
	if(pobj instanceof Child1) {
		System.out.println("pobj is instance of Child1");
	}
	else {
		System.out.println("pobj is not an instance of Child1");
	}
	
	//parent reference
	// referring to a Child is an instance of Child
	Parent1 pobj2=new Child1();
	if(pobj2 instanceof Child1) {
		System.out.println("pobj is instance of Child1");
	}
	else {
		System.out.println("pobj is not an instance of Child1");
	}
}
}
