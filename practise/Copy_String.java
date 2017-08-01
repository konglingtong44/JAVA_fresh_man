package practise_20170718;

public class Copy_String {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append(123456789);
		sb.append(false)
		.append("a")
		.append(3.14)
		.append(sb);
		System.out.println(sb);
		sb.delete(1, 2);
		sb.deleteCharAt(2);
		System.out.println(sb);
		sb.insert(1, 'b');
		System.out.println(sb);
		sb.replace(1, 3, "kkk");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}
}
