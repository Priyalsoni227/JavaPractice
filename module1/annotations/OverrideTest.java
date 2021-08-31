package annotations;


class Base{
    public void display(){
        System.out.println("Base display()");
    }
}

class Derived extends Base{
    @Override
    public void display(){
        System.out.println("Derived display()");
    }
    
    
}

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Derived obj=new Derived();
	        obj.display();
	    

	}

}

