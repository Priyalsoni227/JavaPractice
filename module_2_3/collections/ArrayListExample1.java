package collections;
import java.util.*;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		System.out.println(list);
		
		System.out.println("\nReturning element: "+list.get(1));
		list.set(1, "Dates");
		
		//traversing list through iterator
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list);
		
		//traversing list through for each loop
		System.out.println("\nSorted list: ");
		for(String s:list) {
			System.out.println(s);
		}
		
		list.remove(0);
		list.remove("Dates");
		
		System.out.println("\nRemoving elements: ");
		for(String s:list) {
			System.out.println(s);
		}

	}

}
