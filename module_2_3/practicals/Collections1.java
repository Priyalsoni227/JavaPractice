package practicals;
import java.util.*;
//convert an array into a collection

public class Collections1 {

	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4};
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(Integer i:arr) {
			list.add(i);
		}
		
		for(Integer i:list) {
			System.out.println(i);
		}
		
		
		

	}

}
