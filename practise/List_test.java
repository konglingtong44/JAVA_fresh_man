package practise_20170719;

import java.util.ArrayList;
import java.util.List;


public class List_test {

	public static void main(String[] args) {
		
		List c = new ArrayList();
		c.add("成龙");
		//c.add("李连杰");
		c.add("张柏芝");
		c.add("李连杰");
	//	c.add(1, "文章"); //插入
		c.add("成龙");
		c.add("成龙");
		
		
		for (int i = 0; i < c.size(); i++) {
			String s = (String)c.get(i);
			System.out.println(s);
		}
		
		//List c2 = c.subList(1, 3);
	/*	c.set(3, "文章");
		System.out.println(c);*/
		
		System.out.println(c.indexOf("成龙"));
		System.out.println(c.lastIndexOf("成龙"));
	}
}
