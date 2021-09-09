package collections;
import java.util.*;
//HashSet from another Collection

public class HashSet2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		
		HashSet<String> set=new HashSet<String>(list);
		System.out.println(set);
		for(String s:set) {
			System.out.println(s);
		}

	}

}
