package practise_20170707;

public class diamond {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print(" ");
			}
			for (int k =2*i - 1; k >0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}