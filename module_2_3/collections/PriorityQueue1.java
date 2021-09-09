package collections;
import java.util.*;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jay");
		queue.add("Rahul");
		
		System.out.println("Head: "+queue.element());
		System.out.println("Head: "+queue.peek());
		System.out.println("Iterating the queue elements");
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		queue.remove();
		queue.poll();
		System.out.println("After removing 2 elements: ");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}