package practise_20170718;

import java.util.Arrays;

public class practise {
/*	public static void main(String[] args) {
		char b[] = {97, 98, 99};
		String s = new String(b);
		System.out.println(s);
	}*/
	
/*	public static void main(String[] args) {
		char c[] = {'一', '二', '三', '四'};
		String s = new String(c, 1, 2);
		System.out.println(s);
	}*/
	
/*	public static void main(String[] args) {
		String s = "abckkkkkkkabc";
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("ck"));
		System.out.println(s.lastIndexOf("ka"));
	}*/
	
/*	public static void main(String[] args) {
		String s = "xxx.java";
		System.out.println(s.endsWith("kva"));
		System.out.println(s.isEmpty());
		System.out.println(s.contains(".j"));
		System.out.println(s.equals("xxx.java"));
		System.out.println(s.equalsIgnoreCase("xxx.JAVA"));
	}*/
	
/*	public static void main(String[] args) {
		byte[] b = {97,98,99};
		String s = new String(b);
	//	b = s.getBytes(); 
		char[] c = s.toCharArray();
		System.out.println(c);
	}*/
	
/*	public static void main(String[] args) {
		String s = "abskdfsdfabcsdfabcksdfsdf";
		s = s.replace("abc","xxx");
		System.out.println(s);
	}*/
	
/*	public static void main(String[] args) {
		String s = "门前大桥下,游过一群鸭,快来快来数一数,二四六七八";
		String [] ss = s.split(",");
	
		System.out.println(Arrays.toString(ss));
		for (int i = 0; i < ss.length; i++) {
			System.out.println("["+ss[i]+"]");
		}
	}*/
	
	public static void main(String[] args) {
		System.out.println("ABC".toLowerCase());
		System.out.println("abc".toUpperCase());
		System.out.println("    abc     ".trim());
	}
}
