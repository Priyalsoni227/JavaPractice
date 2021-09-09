package instanceof_operator;

//A Java program to demonstrate that non-method
//members are accessed according to reference
//type (Unlike methods which are accessed according
//to the referred object)

class Parent2{
	int value=1000;
	void display() {
		System.out.println("from parent class");
	}
}

class Child2 extends Parent2{
	int value=10;
	void display() {
		System.out.println("from child class");
	}
}

public class TestMain4 {
    public static void main(String[] args) {
        Parent2 pobj=new Child2();
        System.out.println(pobj.value);
        pobj.display();
        
        // Using instanceof to make sure that par
        // is a valid reference before typecasting
        System.out.println("Value acccessed through parent reference with typecasting is "+
        ((Child2)pobj).value);
    }
}
