package practise_20170718;

import java.util.Arrays;

public class Arr_copy {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = new int[10];
		System.arraycopy(arr1, 2, arr2, 5, 3);
		System.out.println(Arrays.toString(arr2));
	}
}
