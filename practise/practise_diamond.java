package practise_20170707;

public class practise_diamond {
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int num_space = 1; num_space <= 5 - row; num_space++) {
				System.out.print(" ");
			}
			for (int num_sign = 0; num_sign < 2 * row - 1; num_sign++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row =0; row < 5; row++) {
			for (int num_space = 0; num_space <= row; num_space++) {
				System.out.print(" ");
			}
			for (int num_sign = 2 * (4-row) - 1; num_sign > 0; num_sign--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
