package practicals;
import java.util.*;
// change a collection to an array

public class Collections2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Pineapple");
		
		System.out.println(list);
		String arr[]=list.toArray(new String[list.size()]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
