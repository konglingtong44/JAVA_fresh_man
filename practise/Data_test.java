package practise_20170718;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Data_test {
	public static void main(String[] args) {
		//随机数练习1
		Random r1 = new Random();
		int n1 = r1.nextInt(666666);
		System.out.println(n1);
		
		//随机数练习2/时间练习
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		//随机数练习3
		double num2 = Math.random();
		System.out.println(num2);
		
		//日期输出1
/*		Calendar date = Calendar.getInstance();
		System.out.println(date.get(Calendar.YEAR));
		System.out.println(date.get(Calendar.MONTH)+1);
		System.out.println(date.get(Calendar.DATE));*/
		
		Date date = new Date();
		DateFormat date2 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		String str = date2.format(date);
		System.out.println(str);
		System.out.println(Math.abs(-3.14));
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.floor(3.14));
		System.out.println(Math.round(3.34));
	}
}
