package collections;
import java.util.*;

public class ArrayDequeue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Deque<String> deque=new ArrayDeque<String>();
       deque.add("Ravi");
       deque.add("Vijay");
       deque.add("Ajay");
       
       for(String s:deque) {
    	   System.out.println(s);
       }
       
       deque.offer("Vimal");
       deque.offer("Arvind");
       deque.offerFirst("Jay");
       
       System.out.println("After offerFirst: ");
       
       Iterator<String> itr=deque.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
       
       
       deque.pollLast();
       System.out.println("After pollLast: ");
       for(String s:deque) {
    	   System.out.println(s);
       }
       
	}

}
