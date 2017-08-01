package practise_20170707;

import java.util.Scanner;


public class Project_Supermarket {
	
	static double Sum_money;
	static double Business_sum;
	static int stock_Water = 10;
	static double price_Water = 6.6;
	static int stock_Book1 = 20;
	static double price_Book1 = 7.12;
	static int stock_Book2 = 30;
	static double price_Book2 = 22.2;
	static int stock_Food = 40;
	static double price_Food = 99.9;
	static int num_Water = 0;
	static int num_Book1 = 0;
	static int num_Book2 = 0;
	static int num_Food = 0;
	static int Buy_Option;
	static int Customer_System;
	static int Customer_option;
	static int Business_option;
	static int Num_trolley_Water = 0;
	static int Num_trolley_Book1 = 0;
	static int Num_trolley_Book2 = 0;
	static int Num_trolley_Food = 0;
	
	static boolean flag_User = true;
	static boolean flag = true;
	static boolean flag_Customer;
	static boolean flag_Business;
	static boolean flag_Buy_Option;
	static boolean flag_Shopping_trolley;
	static boolean flag_Stock_System;
	
	static double a[] = new double[999];
	static int i = 0;
	
	public static void main(String[] args) {

		while (flag) {

			while (flag_User) {
				Option_User();
			}

			while (flag_Customer) {
				Customer();
			}

			while (flag_Business) {
				Business();
			}
		}
	}

	private static void Option_User() {
		CLS();
		System.out.println("===========請選擇需要服務的身份============");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("||             1.購物者\t\t\t||");
		System.out.println("||             2.超市方\t\t\t||");
		System.out.println("||             3.退出系統 \t\t||");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("==========================================");
	
		int user_option = getNumber();

		switch (user_option) {
		case 1:
			
			Print_Customer();
			flag_Customer = true;
			flag_User = false;
			break;
		case 2:
			Print_Business();
			flag_Business = true;
			flag_Customer = false;
			flag_User = false;
			break;
		case 3:
			CLS();
			System.out.println("");
			System.out.println("\t\t     8888888888888888888888888888");
			System.out.println("\t\t     8\t\t\t\t8");
			System.out.println("\t\t     8\t\t再見 \t\t8");
			System.out.println("\t\t     8\t\t\t\t8");
			System.out.println("\t\t     8888888888888888888888888888");
			flag_User = false;
			flag = false;
			break;
		default:
			System.out.println("输入有误");
			break;
		}
	}
	
	private static void check_list() {
		for (int j=0; j<i; j++){
			System.out.println("第" + (j+1) + "筆售出為" + a[j] + "大洋");
		}
	}
	
	private static void Customer () {
		
		Customer_option = getNumber();
		
		switch (Customer_option) {
		case 1:
			flag_Buy_Option = true;
			Buy();
			break;
		case 2:
			flag_Shopping_trolley = true;
			Shopping_trolley();
			break;
		case 3:
			check();
			break;
		case 4:
			flag_User = true;
			flag_Customer = false;
			Option_User();
			break;
		default:
			System.out.println("输入有误");
			Print_Customer();
			break;
		}
	}

	private static void Business() {
		
		Business_option = getNumber();
		
		switch (Business_option) {
		case 1:
			List();
			break;
		case 2:
			flag_Stock_System = true;
			Stock_System();
			break;
		case 3:
			check_list();
			break;
			
		case 4:
			flag_User = true;
			flag_Business = false;
			Option_User();
			break;
			
		default:
			System.out.println("输入有误");
			break;
		
		}
	}


	private static void check() {
		CLS();
		Sum_Money();
		System.out.println("===============================結算界面===============================");
		System.out.println("");
		System.out.println("\t\t\t购物车商品总价为" + Sum_money + "大洋");
		System.out.println("");
		System.out.println("\t\t     8888888888888888888888888888");
		System.out.println("\t\t     8\t\t\t\t8");
		System.out.println("\t\t     8\t       本店現有滿五十減一塊；\t8");
		System.out.println("\t\t     8\t         滿二百減一百八;    \t8");
		System.out.println("\t\t     8\t         滿400減399活動   \t8");
		System.out.println("\t\t     8\t\t\t\t8");
		System.out.println("\t\t     8888888888888888888888888888");
		
		if(Sum_money <= 50 && Sum_money > 0)
			Sum_money = Sum_money - 1;
		else if (Sum_money > 200 && Sum_money <=400)
			Sum_money = Sum_money - 180;
		else if (Sum_money > 400)
			Sum_money = Sum_money - 399;
		System.out.println("");
		System.out.println("\t\t\t您如今需要付款" + Sum_money + "大洋");
		System.out.println("\t\t\t您是否需要付款？");
		System.out.println("\t\t\t1.是，我想要付款");
		System.out.println("\t\t\t2.否，我還需要修改物品");
		
		int Check_Option = getNumber();
		switch (Check_Option) {
		case 1:
			System.out.println("您已付款成功");
			System.out.println("本系統自動退出界面");
			
			a[i] = Sum_money;	
			i++;
			
			num_Book1 = Num_trolley_Book1 + num_Book1;
			num_Book2 = Num_trolley_Book2 + num_Book2;
			num_Food = Num_trolley_Food + num_Food;
			num_Water = Num_trolley_Water + num_Water;
			Num_trolley_Book1 = 0;
			Num_trolley_Book2 = 0;
			Num_trolley_Food = 0;
			Num_trolley_Water = 0;
			Sum_money = 0;
			flag_User = true;
			flag_Customer = false;
			Option_User();
			break;
		case 2:
			flag_Shopping_trolley = true;
			Shopping_trolley();
			break;
		default:
			System.out.println("输入有误");
		}
	}

	private static void Print_Customer() {
		CLS();
		System.out.println("================購物者界面================");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("||             1.開始購物\t\t||");
		System.out.println("||             2.修改購物車中的物品\t||");
		System.out.println("||             3.結賬\t\t\t||");
		System.out.println("||             4.退出購物者系統\t\t||");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("||             请做出您的選擇：\t\t||");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("==========================================");
	}
	
	private static void Print_Business() {
		CLS();
		System.out.println("================超市方界面================");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("||             1.查看賣出貨物情況\t||");
		System.out.println("||             2.货物因故数量变动\t||");
		System.out.println("||             3.查看流水\t\t||");
		System.out.println("||             4.退出超市方系統\t\t||");
		System.out.println("||             请做出您的選擇：\t\t||");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("==========================================");
	}
	
	private static void Buy(){
		while(flag_Buy_Option) {
			CLS();
			System.out.println("\t     8888888888888888888888888888");
			System.out.println("\t     8\t\t\t\t8");
			System.out.println("\t     8\t       本店現有滿五十減一塊；\t8");
			System.out.println("\t     8\t         滿二百減一百八;    \t8");
			System.out.println("\t     8\t         滿400減399活動   \t8");
			System.out.println("\t     8\t\t\t\t8");
			System.out.println("\t     8888888888888888888888888888");
			System.out.println("");
			System.out.println("***********************選單界面*********************");
			System.out.println("");
			System.out.println("\t\t\t 库存 \t\t 价格（大洋）\t\t");
			System.out.println("1.崂山圣水 \t\t" + stock_Water + "\t\t" + price_Water);
			System.out.println("2.悟空传 \t\t" + stock_Book1+ "\t\t" + price_Book1);
			System.out.println("3.禅与摩托车维修艺术 \t" + stock_Book2 + "\t\t" + price_Book2);
			System.out.println("4.马陆面包\t\t" + stock_Food + "\t\t" + price_Food);
			System.out.println("5.退出選購商品界面");
			System.out.println("");
			System.out.println("\t\t请做出您的選擇：");
			System.out.println("***************************************************");

			Num_Revise();
			}
	}
	
	private static void List() {
		Print_List();
		System.out.println("");
		System.out.println("..本系統自動退回上一層");
		Print_Business();
		Business();
	}
	public static void Print_List(){
		CLS();
		System.out.println("**************************************************************************************************************************************");
		System.out.println("");
		System.out.println("\t\t\t 剩餘库存 \t价格（大洋）\t已賣出數量\t該物品價格總數\t打折前縂收入\t打折后總收入");
		System.out.println("1.崂山圣水 \t\t\t" + stock_Water + "\t" + price_Water + "\t\t" + num_Water + "\t\t" + num_Water*price_Water);
		System.out.println("2.悟空传 \t\t\t" + stock_Book1+ "\t" + price_Book1 + "\t\t" + num_Book1 + "\t\t" + num_Book1*price_Book1);
		System.out.println("3.禅与摩托车维修艺术 \t\t" + stock_Book2 + "\t" + price_Book2 + "\t\t" + num_Book2 + "\t\t" + num_Book2*price_Book2);
		System.out.println("4.马陆面包\t\t\t" + stock_Food + "\t" + price_Food + "\t\t" + num_Food + "\t\t" + num_Food*price_Food);
		Business_Sum();
		double Business_Sum_before = Business_sum;
	/*	if(Business_sum <= 50 && Business_sum > 0)
			Business_sum = Business_sum - 1;
		else if (Business_sum > 200 && Business_sum <=400)
			Business_sum = Business_sum - 180;
		else if (Business_sum > 400)
			Business_sum = Business_sum - 399;*/
		Business_sum = 0;
		for (int j = 0; j < i; j++) {

			{
				Business_sum = Business_sum + a[j];
			}
		}
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t" + Business_Sum_before + "\t\t" + Business_sum);
		System.out.println("");
		System.out.println("**************************************************************************************************************************************");
	}
	
	public static void Shopping_trolley() {
		while (flag_Shopping_trolley){
			Print_Shopping_trolley ();
			System.out.println("");
			System.out.println("\t\t\t\t1.修改物品數量");
			System.out.println("\t\t\t\t2.退出購物車界面");
			System.out.println("");
			System.out.println("\t\t\t\t請做出您的選擇:");
			System.out.println("***************************************************************************************");
			int Shopping_trolley_Option = getNumber();
			System.out.println("");
			switch (Shopping_trolley_Option) {
			case 1:
				revise();
				break;
			case 2:
				flag_Shopping_trolley = false;
				Print_Customer();
				Customer();
				break;
			default:
				System.out.println("您輸入有誤，請重新選擇");
				break;
			}
		}	
	}
	
	private static void Stock_System() {
		while (flag_Stock_System){
			Print_List();
			System.out.println("");
			System.out.println("\t\t\t\t1.修改物品數量");
			System.out.println("\t\t\t\t2.退出修改貨物界面");
			System.out.println("");
			System.out.println("\t\t\t\t請做出您的選擇:");
			System.out.println("***************************************************************************************");
			int Stock_System_Option = getNumber();
			
			switch (Stock_System_Option) {
			case 1:
				Revise_Stock();
				break;
			case 2:
				flag_Stock_System = false;
				Print_Business();
				Business();
				break;
			default:
				System.out.println("您輸入有誤，請重新選擇");
				break;
			}
		}	
	}

	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	
	public static double Sum_Money() {
		Sum_money = price_Water*Num_trolley_Water + price_Book1*Num_trolley_Book1 + price_Book2*Num_trolley_Book2 + price_Food*Num_trolley_Food;
		return Sum_money;
	}
	
	public static double Business_Sum() {
		Business_sum = num_Water*price_Water + num_Book1*price_Book1 + num_Book2*price_Book2 + num_Food*price_Food;
		return Business_sum;
	}
	public static void Print_Shopping_trolley () {
		CLS();
		System.out.println("*************************************購物車界面****************************************");
		System.out.println("");
		System.out.println("\t\t\t 库存 \t价格（大洋）\t已購買數量\t該物品價格總數\t縂金錢");
		System.out.println("1.崂山圣水 \t\t" + stock_Water + "\t" + price_Water + "\t\t" + num_Water + "\t\t" + num_Water*price_Water);
		System.out.println("2.悟空传 \t\t" + stock_Book1+ "\t" + price_Book1 + "\t\t" + num_Book1 + "\t\t" + num_Book1*price_Book1);
		System.out.println("3.禅与摩托车维修艺术 \t" + stock_Book2 + "\t" + price_Book2 + "\t\t" + num_Book2 + "\t\t" + num_Book2*price_Book2);
		System.out.println("4.马陆面包\t\t" + stock_Food + "\t" + price_Food + "\t\t" + num_Food + "\t\t" + num_Food*price_Food);
		Sum_Money();
		System.out.println("\t\t\t\t\t\t\t\t\t\t" + Sum_money);
	}
	
	public static void revise(){
		CLS();
		System.out.println("*****************購物車修改菜單****************");
		System.out.println("\t        請輸入您想要修改的物品序號");
		Num_Revise();
		System.out.println("");
		System.out.println("***********************************************");
	}
	
	private static void Revise_Stock() {
		CLS();
		System.out.println("*****************庫存修改菜單****************");
		System.out.println("\t        請輸入您想要修改的物品序號");
		Num_Revise_Stock();
		System.out.println("");
		System.out.println("**************************************************************************************************************************************");
	}

	private static void Num_Revise_Stock() {
		int Num_Stock =  getNumber();
		Print_List();
		switch (Num_Stock) {
		case 1:
			System.out.println("请輸入嶗山聖水的現有真實庫存");
			stock_Water = getNumber();
			break;
		case 2:
			System.out.println("请輸入悟空傳的現有真實庫存");
			stock_Book1 = getNumber();
			break;
		case 3:
			System.out.println("请輸入禪與摩托車維修藝術的現有真實庫存");
			stock_Book2 = getNumber();
			break;
		case 4:
			System.out.println("请輸入馬陸麵包的現有真實庫存");
			stock_Food = getNumber();
			break;
		default:
			System.out.println("您輸入有誤，請重新選擇");
			break;
			}
	}
	
	
	public static void Num_Revise(){
		int Buy_Option =  getNumber();
		
		switch (Buy_Option) {
		case 1:
			System.out.println("请选择购买崂山圣水或重新選擇嶗山聖水的数量");
			Num_trolley_Water = getNumber();
			if (Num_trolley_Water <= stock_Water){
				stock_Water = stock_Water - Num_trolley_Water;
				double Sum_money = Sum_Money();
				System.out.println("您已购买了" + Num_trolley_Water + "崂山圣水" + "," + "购物车商品总价为" + Sum_money + "大洋" );
			}
			else {
				System.out.println("您选择的数量大于库存，请重新选择或明日再来");
			}
			break;
		case 2:
			System.out.println("请选择购买悟空传或重新選擇悟空傳的数量");
			Num_trolley_Book1 = getNumber();
			if (Num_trolley_Book1<= stock_Book1){
				stock_Book1 = stock_Book1 - Num_trolley_Book1;
				double Sum_money = Sum_Money();
				System.out.println("您已购买了" + Num_trolley_Book1 + "悟空传" + "," + "购物车商品总价为" + Sum_money + "大洋" );
			}
			else {
				System.out.println("您选择的数量大于库存，请重新选择或明日再来");
			}
			break;
		case 3:
			System.out.println("请选择购买禅与摩托车维修艺术或重新選擇禪與摩托車維修藝術的数量");
			Num_trolley_Book2 = getNumber();
			if (Num_trolley_Book2 <= stock_Book2){
				stock_Book2 = stock_Book2 - Num_trolley_Book2;
				double Sum_money = Sum_Money();
				System.out.println("您已购买了" + Num_trolley_Book2 + "禅与摩托车维修艺术" + "," + "购物车商品总价为" + Sum_money + "大洋" );
			}
			else {
				System.out.println("您选择的数量大于库存，请重新选择或明日再来");
			}
			break;
		case 4:
			System.out.println("请选择购买马陆面包或重新選擇馬陸麵包的数量");
			Num_trolley_Food = getNumber();
			if (Num_trolley_Food <= stock_Food){
				stock_Food = stock_Food - Num_trolley_Food;
				double Sum_money = Sum_Money();
				System.out.println("您已购买了" + Num_trolley_Food + "马陆面包" + "," + "购物车商品总价为" + Sum_money + "大洋" );
			}
			else {
				System.out.println("您选择的数量大于库存，请重新选择或明日再来");
			}
			break;
		case 5:
			Print_Customer();
			flag_Customer = true;
			flag_Buy_Option = false;
			break;
		default:
			System.out.println("您輸入有誤，請重新選擇");
			break;
			}
	}
	
	public static void CLS() {
		for(int i= 0 ; i<10; i++)
		System.out.println("\n");
	}
}
