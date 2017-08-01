/*package practise_20170719;

import java.util.ArrayList;
import java.util.Collection;

class Person{
	int no;
	String name;
	
	public Person(int no, String name){
		this.no = no;
		this.name = name;
	}
	
	public String toString(){
		return "no:" + no + "  name" + name;
	}
	public boolean equals(Object obj){
		Person p = (Person)obj;
		return p.no == this.no && p.name.equals(this.name);
		
	}
	
	public int hashCode() {
		return 1;
	}
}

public class Collection_test2 {
	public static void main(String[] args) {
		Person k = new Person(1, "kkk");
		Collection c = new ArrayList();
		c.add(true);
		c.add("kkk");
		c.add(new Person(2, "lll"));
		c.add(k);
		System.out.println(c.contains("kkk"));
		System.out.println(c.contains(new Person(1, "kkk")));
		System.out.println(c.contains(k));
		System.out.println(k);
		System.out.println(c);
		System.out.println(c.size());
	}
}
*/