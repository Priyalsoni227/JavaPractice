package collections;
import java.util.*;

public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet<String> set=new TreeSet<String>();
       set.add("A");
       set.add("B");
       set.add("C");
       set.add("D");
       set.add("E");
       
       System.out.println("Initial set: "+set);
       
       //NavigableSet operations.
       System.out.println("Reverse set: "+set.descendingSet());
       System.out.println("Head Set: "+set.headSet("C", true));
       System.out.println("Sub Set: "+set.subSet("A",false,"E",true));
       System.out.println("Tail Set: "+set.tailSet("C",false));
       
       // SortedSetSet operations.
       
       System.out.println("Head Set: "+set.headSet("C"));
       System.out.println("Sub Set: "+set.subSet("A", "E"));
       System.out.println("Tail Set: "+set.tailSet("C"));
       
	}

}
