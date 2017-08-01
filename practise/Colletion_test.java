package practise_20170719;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Colletion_test {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("k");
		c.add(true);
		c.add("k");
		c.add("t");
		c.add("t");
		System.out.println(c);
		System.out.println(c.size());
		
		Collection c2 = new ArrayList();
		c2.add("ll");
		c2.add("ll");
		
		c.addAll(c2);
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.contains("k"));
		System.out.println(c.contains("o"));
		
		c.remove("k");
		c.remove("k");
	//	c.clear();
	//	c.removeAll(c2);
		
		System.out.println(c);
		
	//	c.retainAll(c2);
		System.out.println(c);
		
		Object arr[] = c.toArray();
		for (int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);}
		
		Iterator iterator = c.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println(c);
	}
}
