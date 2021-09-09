package practicals;
import java.util.*;
// find a sublist in a List

public class Collections4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> list1=new ArrayList<String>();
       list1.add("Apple");
       list1.add("Mango");
       list1.add("Banana");
       list1.add("Pineapple");
       list1.add("Orange");
       list1.add("Dragon fruit");
       list1.add("Guava");
       list1.add("Pineapple");
       list1.add("Orange");
       
       List<String> list2=new ArrayList<String>();
       list2.add("Pineapple");
       list2.add("Orange");
       
       System.out.println("The first occurrence of sublist is present at position: "+Collections.indexOfSubList(list1,list2));
       System.out.println("The last occurrence of sublist is present at position: "+Collections.lastIndexOfSubList(list1,list2));
	}

}
