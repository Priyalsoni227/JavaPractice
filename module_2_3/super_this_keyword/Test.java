package super_this_keyword;

//Use of super with variables

class Vehicle{
	int maxSpeed = 120;
}

class Car extends Vehicle{
	int maxSpeed=180;
	void display(){
		System.out.println("Maximum speed: "+super.maxSpeed);
	}
}

public class Test {
    public static void main(String[] args) {
    	Car small = new Car();
    	small.display();
    }
}
