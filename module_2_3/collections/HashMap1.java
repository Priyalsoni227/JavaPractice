package collections;
import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(100, "Amit");
		map.put(101,"Vijay");
		map.put(102, "Ajay");
		
	     System.out.println("After invoking put() method "); 
	    for(Map.Entry<Integer, String> entry:map.entrySet()) {
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	    
	    map.putIfAbsent(103, "Gaurav");
	    System.out.println("After invoking putAll() method ");

	    for(Map.Entry<Integer, String> entry:map.entrySet()) {
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	    
	    //remove
	    map.remove(103);
	    map.remove(100,"Amit");
	    System.out.println("Updated list of elements: "+map);  
	    for(Map.Entry<Integer, String> entry:map.entrySet()) {
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	    
	    map.put(100, "Sumit");
	    //replace
	    map.replace(102, "Gaurav");
	    map.replace(101,"Vijay","Ajay");
	    System.out.println("Updated list of elements: "+map);  
	    for(Map.Entry<Integer, String> entry:map.entrySet()) {
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	    
	    map.replaceAll((k,v)->"Ajay");
	    System.out.println("Updated list of elements: "+map);  
	    for(Map.Entry<Integer, String> entry:map.entrySet()) {
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	    
	}

}
