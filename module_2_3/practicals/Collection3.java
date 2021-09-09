package practicals;
import java.util.*;
//Iterate through elements of HashMap

import java.util.HashMap;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,String> map=new HashMap<Integer,String>();
       map.put(1, "Amit");
       map.put(2, "Vijay");
       map.put(3, "Ajay");
       
       Set set=map.entrySet();
       Iterator itr=set.iterator();
       
       while(itr.hasNext()) {
    	   Map.Entry<Integer,String> entry=(Map.Entry)itr.next();
    	   System.out.println(entry.getKey()+" "+entry.getValue());
       }
       
	}

}
