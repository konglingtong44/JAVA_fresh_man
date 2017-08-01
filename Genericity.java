package practise_20170719;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Genericity {
	public static void main(String[] args) {
		Byte [] arr = {10,20,30,40,50};
		Test1.reverse(arr);
		System.out.println(Arrays.toString(arr));
		
		Integer arr2[] = {1, 2, 3, 4, 5};
		Test1.reverse(arr2);
		System.out.println(Arrays.toString(arr2));
		
		Character arr3[] = {'a', 'b', 'c', 'd', 'e'};
		Test1.reverse(arr3);
		System.out.println(Arrays.toString(arr3));
		
		
		Byte [] arr4 = {5,4, 3,2,1};
		new Test2().reverse(arr4);
		System.out.println(Arrays.toString(arr4));
		
		Integer arr5[] = {1000, 2000, 3000, 4000, 5000};
		new Test2().reverse(arr5);
		System.out.println(Arrays.toString(arr5));
		
		Character arr6[] = {'e', 'd', 'c', 'b', 'a'};
		new Test2().reverse(arr6);
		System.out.println(Arrays.toString(arr6));
		
	}
}

class Test1{
	public static <T>void reverse(T arr[]){
		for (int start = 0, end = arr.length-1; start<end; start++, end--){
			T temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
}

class Test2 <T>{
	public void reverse(T arr[]){
		for (int start = 0, end = arr.length-1; start<end; start++, end--){
			T temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
}