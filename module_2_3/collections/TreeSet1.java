package collections;
import java.util.*;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		for(String s:set) {
			System.out.println(s);
		}
		
		System.out.println("\nTraversing element through Iterator in descending order");  
		Iterator i =set.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		set.add("Sumit");
		set.add("Ramesh");
		System.out.println("\nUpdated list: "+set);
		
		System.out.println("Highest Value: "+set.pollFirst());
		System.out.println("Lowest value: "+set.pollLast());
		
		System.out.println(set);
		
	}

}
