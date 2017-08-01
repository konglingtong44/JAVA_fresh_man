package practise_20170710;

import java.util.Arrays;

public class Bubble_sort {
	public static void main(String[] args) {
		int a[] = {6, 20, 15, 5, 3};
		Bubble1(a);
		System.out.println("從小到大為" + Arrays.toString(a));
		Bubble2(a);
		System.out.println("從大到小為"+ Arrays.toString(a));
	}

	private static void Bubble2(int[] a) {
		for (int i = 0; i<a.length-1; i++){
			for(int j = 0; j<a.length-1-i; j++){
				if(a[j]<a[j+1]){
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
	}

	private static void Bubble1(int a[]) {
		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<a.length-i-1; j++){
				if(a[j] > a[j+1]){
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	
}
