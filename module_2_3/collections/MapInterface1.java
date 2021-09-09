package collections;
import java.util.*;

public class MapInterface1 {

	public static void main(String[] args) {
		// non-generic
		Map map=new HashMap();
		map.put(1, "Amit");
		map.put(5,"Rahul");
		map.put(2,"Jai");
		map.put(6, "Amit");
		
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
       //generic
		
		Map<Integer,String> map2=new HashMap<Integer,String>();
		map2.put(100, "Amit");
		map2.put(101, "Vijay");
		map2.put(102, "Rahul");
		
		for(Map.Entry m:map2.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
