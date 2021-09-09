package super_this_keyword;

// Use of super with constructors

class Person1{
	public Person1() {
		System.out.println("This is Person constructor");
	}
}

class Student1 extends Person1{
	public Student1() {
		super();
		System.out.println("This is Student contructor");
	}
}

public class Test3 {
  public static void main(String[] args) {
	  Student1 s= new Student1();
  }
}
