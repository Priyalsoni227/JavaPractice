package practicals;
import java.util.*;
//rotate elements of the List

public class Collections5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//before rotating
		for(Integer i:list) {
			System.out.println("Before rotating: "+i);
		}
		
		Integer length=list.size();
		Integer temp=list.get(length-1);
		
		for(int i=length-1;i>=0;i--) {
			if(i==0) {
				list.set(i, temp);
			}
			else {
				int element=list.get(i-1);
				list.set(i, element);	
			}
			
		}
		
		//after rotating
		for(Integer i:list) {
	         System.out.println("After rotating: "+i);
		}

	}

}
