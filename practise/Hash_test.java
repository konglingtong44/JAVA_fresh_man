package practise_20170719;
import java.util.HashSet;



class PPerson{
	
	int id;
	String name;
	
	public PPerson(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public int hashCode() {
		System.out.println(id);
		return id;
	}
	// alt + shift + s
	
	public boolean equals(Object obj) {
		System.out.println("equals"+id);
		PPerson p = (PPerson)obj;
		return p.id == this.id && p.name.equals(this.name);
	}
}


public class Hash_test {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new PPerson(1,"����"));
		set.add(new PPerson(2,"������"));
		set.add(new PPerson(3,"����"));
		set.add(new PPerson(1,"����"));
		System.out.println(set);
	}
}
