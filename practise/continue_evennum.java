package practise_20170707;

public class continue_evennum {
	public static void main(String[] args){
		int sum = 0;
		for (int num = 0; num <= 100; num++){
			if (num%2 != 0)		{continue;}
			sum += num;
		}
		System.out.println("1~100µÄÅ¼”µºÍÊÇ "+ sum);
	}

}
