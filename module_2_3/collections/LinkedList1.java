package collections;
import java.util.*;

//LinkedList example to add elements

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList <String> ll=new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		
		System.out.println("After invoking add(E e) method: "+ll);
		
		//adding an element at the specified position
		
		ll.add(1,"Gaurav");
	    System.out.println("After invoking add(int index, E element) method: "+ll);
	    
	    LinkedList<String> ll2=new LinkedList<String>();
	    ll2.add("Sonoo");
	    ll2.add("Hanumat");
	    //Adding second list elements to the first one
	    ll.addAll(ll2);
	    System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll); 
	    
	    LinkedList<String> ll3=new LinkedList<String>();
	    ll3.add("John");
	    ll3.add("Rahul");
	    ll.addAll(1,ll3);
	    System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);
	    
	    ll.addFirst("Lokesh");
	    System.out.println("After invoking addFirst(E e) method: "+ll); 
	    
	    ll.addLast("Harsh");
	    System.out.println("After invoking addLast(E e) method: "+ll);  
	    
	    ll.remove("Vijay");
	    System.out.println("After invoking remove(object) method: "+ll);  
	    
	    ll.remove(0);
	    System.out.println("After invoking remove(index) method: "+ll);
	    
	    ll.removeAll(ll2);
	    System.out.println("After invoking removeAll() method: "+ll);   
	    
	    ll.removeFirst();
	    System.out.println("After invoking removeFirst() method: "+ll); 
	    
	    ll.removeLast();
	    System.out.println("After invoking removeLast() method: "+ll);
	    
	    ll.add("Gaurav");
	    ll.add("Rahul");
	    System.out.println(ll);
	    
	    ll.removeFirstOccurrence("Gaurav");
	    System.out.println("After invoking removeFirstOccurrence() method: "+ll); 
	    
	    ll.removeLastOccurrence("Rahul");
	    System.out.println("After invoking removeLastOccurrence() method: "+ll);  
	    
	    //traversing list of elements in reverse order
	    Iterator itr=ll.descendingIterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    ll.clear();
	    System.out.println("After invoking clear() method: "+ll); 
	    
	    
	    
	    
	    
		

	}

}
