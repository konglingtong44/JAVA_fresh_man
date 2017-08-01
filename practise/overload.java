package practise_20170710;

 class overload {
	public static final void main(String[] args){
		int  result = add (3, 4, 5);
		System.out.println(result);
		result = add (7, 8);
		System.out.println(result);
	}
	
	public static int add(int a, int b, int c){
		return a + b + c;
	}
	
	public static int add(int a, int b){
		return a + b;
	}
}
