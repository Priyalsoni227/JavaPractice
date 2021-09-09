package collections;
import java.util.*;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("Mango");
		set.add("Apple");
		set.add("Banana");
		set.add("Mango");
		
		Iterator i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
 
	}

}
