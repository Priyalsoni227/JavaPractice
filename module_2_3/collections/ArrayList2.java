package collections;
import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Is the ArrayList empty: "+list.isEmpty());
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		System.out.println("Is the ArrayList empty: "+list.isEmpty());
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Ravi");
		list2.add("Hanumat");
		
		ListIterator<String> litr=list.listIterator(list.size());
	    System.out.println("Traversing list through List Iterator:"); 
	    while(litr.hasPrevious()) {
	    	System.out.println(litr.previous());
	    }
		
		System.out.println("\nTraversing list through for loop: ");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\nTraversing list through forEach method: ");
		list.forEach(a->{
			System.out.println(a);
		});
		
		list.retainAll(list2);
		
		System.out.println("\nTraversing list through forEachRemaining method: ");
		Iterator<String> itr=list.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
		
		

	}

}
