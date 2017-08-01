package practise_20170719;

import java.util.HashSet;

class Test{
	int id;
	String name;
	
	public int hashCode() {
		System.out.println(id);
		return id;
	}
	
/*	public String toString() {
		
		return "[id=" + id + ", name=" + name + "]";
	}*/
	
	public Test(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("equals"+id);
		Test p = (Test)obj;
		return p.id == this.id && p.name.equals(this.name);
	}
}

public class Hash_set_test2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Test(1, "kkk"));
		set.add(new Test(2, "lll"));
		set.add(new Test(3, "kkk"));
		set.add(new Test(1, "kkk"));
		System.out.println(set);
	}
}
