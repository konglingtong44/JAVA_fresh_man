package practise_20170719;

import java.util.ArrayList;
import java.util.List;


public class List_test {

	public static void main(String[] args) {
		
		List c = new ArrayList();
		c.add("����");
		//c.add("������");
		c.add("�Ű�֥");
		c.add("������");
	//	c.add(1, "����"); //����
		c.add("����");
		c.add("����");
		
		
		for (int i = 0; i < c.size(); i++) {
			String s = (String)c.get(i);
			System.out.println(s);
		}
		
		//List c2 = c.subList(1, 3);
	/*	c.set(3, "����");
		System.out.println(c);*/
		
		System.out.println(c.indexOf("����"));
		System.out.println(c.lastIndexOf("����"));
	}
}
