package collections;
import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ajay");
		set.add("Ravi");
		set.add("Sumit");
		
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Removing specific element from HashSet 
		set.remove("Ravi");
		System.out.println("\nAfter removing Ravi:"+set);
		
		HashSet<String> set1=new HashSet<String>();
		set1.add("Ramesh");
		set1.add("Gaurav");
		set.addAll(set1);
		System.out.println("Updated list:" +set);
		
		 //Removing all the new elements from HashSet 
		set.removeAll(set1);
		System.out.println("Updated list: "+set);
		
		 //Removing elements on the basis of specified condition
		set.removeIf(str->str.contains("Vijay"));
		System.out.println("Updated lisr: "+set);
		
		//Removing all the elements available in the set
		set.clear();
		System.out.println(set);
		
		

	}

}
