package practise_20170710;

public class Array_Test2 {
	public static void main(String[] args) {
		int a[] = {1,6,4,5,2};
		int result = max(a);
		System.out.println(result);
		System.out.println(a.length);
	}
	public static int max (int a[]){
		int max=a[0];
		for(int i=a[0]; i<a.length; i++){
			if(max<a[i]){
				max = a[i];
			}
		}
		return max;
		
	}
}
