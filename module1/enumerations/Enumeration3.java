package enumerations;


enum Color2{
	RED, YELLOW, GREEN;
	
	private Color2() {
		System.out.println("The Constructor called for "+this.toString());
	}
	
	public void colorInfo() {
		System.out.println("Universal color");
	}
}

public class Enumeration3 {
  public static void main(String[] args) {
	  Color2 c=Color2.RED;
	  System.out.println(c);
	  c.colorInfo();
  }
}
