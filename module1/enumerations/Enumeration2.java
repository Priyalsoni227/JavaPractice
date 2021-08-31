package enumerations;


//working of values(),ordinal() and valueOf()
enum Color1{
	RED,YELLOW,GREEN;
}

public class Enumeration2 {
public static void main(String[] args) {
	Color1 arr[]=Color1.values();
	for(Color1 c:arr) {
		System.out.println(c+" at index "+c.ordinal());
	}
	
	System.out.println(Color1.valueOf("RED"));
}
}
