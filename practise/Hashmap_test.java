package practise_20170719;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.sun.xml.internal.stream.Entity;


public class Hashmap_test {
	public static void main(String[] args) {
		Map <String, String> map = new HashMap <String, String> ();
		
		map.put("т©Ёв1", "це1");
		map.put("т©Ёв2", "це2");
		map.put("т©Ёв3", "це3");
		System.out.println(map);
		
		//map.remove("т©Ёв1");
		
		Set<String> key = map.keySet();
		Iterator <String> it = key.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
		
		Collection<String> val = map.values();
		Iterator <String> it2 = val.iterator();
		while (it2.hasNext()){
			System.out.println(it2.next());
		}
		
		for (Entry<String, String> e : map.entrySet()){
			System.out.println(e.getKey() +" -- "+ e.getValue() );
		}
	}
}
