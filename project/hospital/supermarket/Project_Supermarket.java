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
		System.out.println("===========Ո�x����Ҫ���յ����============");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("||             1.ُ����\t\t\t||");
		System.out.println("||             2.���з�\t\t\t||");
		System.out.println("||             3.�˳�ϵ�y \t\t||");
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
			System.out.println("\t\t     8\t\t��Ҋ \t\t8");
			System.out.println("\t\t     8\t\t\t\t8");
			System.out.println("\t\t     8888888888888888888888888888");
			flag_User = false;
			flag = false;
			break;
		default:
			System.out.println("��������");
			break;
		}
	}
	
	private static void check_list() {
		for (int j=0; j<i; j++){
			System.out.println("��" + (j+1) + "�P�۳���" + a[j] + "����");
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
			System.out.println("��������");
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
			System.out.println("��������");
			break;
		
		}
	}


	private static void check() {
		CLS();
		Sum_Money();
		System.out.println("===============================�Y�����===============================");
		System.out.println("");
		System.out.println("\t\t\t���ﳵ��Ʒ�ܼ�Ϊ" + Sum_money + "����");
		System.out.println("");
		System.out.println("\t\t     8888888888888888888888888888");
		System.out.println("\t\t     8\t\t\t\t8");
		System.out.println("\t\t     8\t       ����F�НM��ʮ�pһ�K��\t8");
		System.out.println("\t\t     8\t         �M���ٜpһ�ٰ�;    \t8");
		System.out.println("\t\t     8\t         �M400�p399���   \t8");
		System.out.println("\t\t     8\t\t\t\t8");
		System.out.println("\t\t     8888888888888888888888888888");
		
		if(Sum_money <= 50 && Sum_money > 0)
			Sum_money = Sum_money - 1;
		else if (Sum_money > 200 && Sum_money <=400)
			Sum_money = Sum_money - 180;
		else if (Sum_money > 400)
			Sum_money = Sum_money - 399;
		System.out.println("");
		System.out.println("\t\t\t�������Ҫ����" + Sum_money + "����");
		System.out.println("\t\t\t���Ƿ���Ҫ���");
		System.out.println("\t\t\t1.�ǣ�����Ҫ����");
		System.out.println("\t\t\t2.����߀��Ҫ�޸���Ʒ");
		
		int Check_Option = getNumber();
		switch (Check_Option) {
		case 1:
			System.out.println("���Ѹ���ɹ�");
			System.out.println("��ϵ�y�Ԅ��˳�����");
			
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
			System.out.println("��������");
		}
	}

	private static void Print_Customer() {
		CLS();
		System.out.println("================ُ���߽���================");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("||             1.�_ʼُ��\t\t||");
		System.out.println("||             2.�޸�ُ��܇�е���Ʒ\t||");
		System.out.println("||             3.�Y�~\t\t\t||");
		System.out.println("||             4.�˳�ُ����ϵ�y\t\t||");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("||             �����������x��\t\t||");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("==========================================");
	}
	
	private static void Print_Business() {
		CLS();
		System.out.println("================���з�����================");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("||             1.�鿴�u��؛����r\t||");
		System.out.println("||             2.������������䶯\t||");
		System.out.println("||             3.�鿴��ˮ\t\t||");
		System.out.println("||             4.�˳����з�ϵ�y\t\t||");
		System.out.println("||             �����������x��\t\t||");
		System.out.println("||\t\t\t\t\t||");
		System.out.println("==========================================");
	}
	
	private static void Buy(){
		while(flag_Buy_Option) {
			CLS();
			System.out.println("\t     8888888888888888888888888888");
			System.out.println("\t     8\t\t\t\t8");
			System.out.println("\t     8\t       ����F�НM��ʮ�pһ�K��\t8");
			System.out.println("\t     8\t         �M���ٜpһ�ٰ�;    \t8");
			System.out.println("\t     8\t         �M400�p399���   \t8");
			System.out.println("\t     8\t\t\t\t8");
			System.out.println("\t     8888888888888888888888888888");
			System.out.println("");
			System.out.println("***********************�x�ν���*********************");
			System.out.println("");
			System.out.println("\t\t\t ��� \t\t �۸񣨴���\t\t");
			System.out.println("1.��ɽʥˮ \t\t" + stock_Water + "\t\t" + price_Water);
			System.out.println("2.��մ� \t\t" + stock_Book1+ "\t\t" + price_Book1);
			System.out.println("3.����Ħ�г�ά������ \t" + stock_Book2 + "\t\t" + price_Book2);
			System.out.println("4.��½���\t\t" + stock_Food + "\t\t" + price_Food);
			System.out.println("5.�˳��xُ��Ʒ����");
			System.out.println("");
			System.out.println("\t\t�����������x��");
			System.out.println("***************************************************");

			Num_Revise();
			}
	}
	
	private static void List() {
		Print_List();
		System.out.println("");
		System.out.println("..��ϵ�y�Ԅ��˻���һ��");
		Print_Business();
		Business();
	}
	public static void Print_List(){
		CLS();
		System.out.println("**************************************************************************************************************************************");
		System.out.println("");
		System.out.println("\t\t\t ʣ�N��� \t�۸񣨴���\t���u������\tԓ��Ʒ�r�񿂔�\t����ǰ�G����\t���ۺ�����");
		System.out.println("1.��ɽʥˮ \t\t\t" + stock_Water + "\t" + price_Water + "\t\t" + num_Water + "\t\t" + num_Water*price_Water);
		System.out.println("2.��մ� \t\t\t" + stock_Book1+ "\t" + price_Book1 + "\t\t" + num_Book1 + "\t\t" + num_Book1*price_Book1);
		System.out.println("3.����Ħ�г�ά������ \t\t" + stock_Book2 + "\t" + price_Book2 + "\t\t" + num_Book2 + "\t\t" + num_Book2*price_Book2);
		System.out.println("4.��½���\t\t\t" + stock_Food + "\t" + price_Food + "\t\t" + num_Food + "\t\t" + num_Food*price_Food);
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
			System.out.println("\t\t\t\t1.�޸���Ʒ����");
			System.out.println("\t\t\t\t2.�˳�ُ��܇����");
			System.out.println("");
			System.out.println("\t\t\t\tՈ���������x��:");
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
				System.out.println("��ݔ�����`��Ո�����x��");
				break;
			}
		}	
	}
	
	private static void Stock_System() {
		while (flag_Stock_System){
			Print_List();
			System.out.println("");
			System.out.println("\t\t\t\t1.�޸���Ʒ����");
			System.out.println("\t\t\t\t2.�˳��޸�؛�����");
			System.out.println("");
			System.out.println("\t\t\t\tՈ���������x��:");
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
				System.out.println("��ݔ�����`��Ո�����x��");
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
		System.out.println("*************************************ُ��܇����****************************************");
		System.out.println("");
		System.out.println("\t\t\t ��� \t�۸񣨴���\t��ُ�I����\tԓ��Ʒ�r�񿂔�\t�G���X");
		System.out.println("1.��ɽʥˮ \t\t" + stock_Water + "\t" + price_Water + "\t\t" + num_Water + "\t\t" + num_Water*price_Water);
		System.out.println("2.��մ� \t\t" + stock_Book1+ "\t" + price_Book1 + "\t\t" + num_Book1 + "\t\t" + num_Book1*price_Book1);
		System.out.println("3.����Ħ�г�ά������ \t" + stock_Book2 + "\t" + price_Book2 + "\t\t" + num_Book2 + "\t\t" + num_Book2*price_Book2);
		System.out.println("4.��½���\t\t" + stock_Food + "\t" + price_Food + "\t\t" + num_Food + "\t\t" + num_Food*price_Food);
		Sum_Money();
		System.out.println("\t\t\t\t\t\t\t\t\t\t" + Sum_money);
	}
	
	public static void revise(){
		CLS();
		System.out.println("*****************ُ��܇�޸Ĳˆ�****************");
		System.out.println("\t        Ոݔ������Ҫ�޸ĵ���Ʒ��̖");
		Num_Revise();
		System.out.println("");
		System.out.println("***********************************************");
	}
	
	private static void Revise_Stock() {
		CLS();
		System.out.println("*****************����޸Ĳˆ�****************");
		System.out.println("\t        Ոݔ������Ҫ�޸ĵ���Ʒ��̖");
		Num_Revise_Stock();
		System.out.println("");
		System.out.println("**************************************************************************************************************************************");
	}

	private static void Num_Revise_Stock() {
		int Num_Stock =  getNumber();
		Print_List();
		switch (Num_Stock) {
		case 1:
			System.out.println("��ݔ���ɽ�}ˮ�ĬF���挍���");
			stock_Water = getNumber();
			break;
		case 2:
			System.out.println("��ݔ����Ղ��ĬF���挍���");
			stock_Book1 = getNumber();
			break;
		case 3:
			System.out.println("��ݔ��U�cĦ��܇�S��ˇ�g�ĬF���挍���");
			stock_Book2 = getNumber();
			break;
		case 4:
			System.out.println("��ݔ���R��I���ĬF���挍���");
			stock_Food = getNumber();
			break;
		default:
			System.out.println("��ݔ�����`��Ո�����x��");
			break;
			}
	}
	
	
	public static void Num_Revise(){
		int Buy_Option =  getNumber();
		
		switch (Buy_Option) {
		case 1:
			System.out.println("��ѡ������ɽʥˮ�������x���ɽ�}ˮ������");
			Num_trolley_Water = getNumber();
			if (Num_trolley_Water <= stock_Water){
				stock_Water = stock_Water - Num_trolley_Water;
				double Sum_money = Sum_Money();
				System.out.println("���ѹ�����" + Num_trolley_Water + "��ɽʥˮ" + "," + "���ﳵ��Ʒ�ܼ�Ϊ" + Sum_money + "����" );
			}
			else {
				System.out.println("��ѡ����������ڿ�棬������ѡ�����������");
			}
			break;
		case 2:
			System.out.println("��ѡ������մ��������x����Ղ�������");
			Num_trolley_Book1 = getNumber();
			if (Num_trolley_Book1<= stock_Book1){
				stock_Book1 = stock_Book1 - Num_trolley_Book1;
				double Sum_money = Sum_Money();
				System.out.println("���ѹ�����" + Num_trolley_Book1 + "��մ�" + "," + "���ﳵ��Ʒ�ܼ�Ϊ" + Sum_money + "����" );
			}
			else {
				System.out.println("��ѡ����������ڿ�棬������ѡ�����������");
			}
			break;
		case 3:
			System.out.println("��ѡ��������Ħ�г�ά�������������x��U�cĦ��܇�S��ˇ�g������");
			Num_trolley_Book2 = getNumber();
			if (Num_trolley_Book2 <= stock_Book2){
				stock_Book2 = stock_Book2 - Num_trolley_Book2;
				double Sum_money = Sum_Money();
				System.out.println("���ѹ�����" + Num_trolley_Book2 + "����Ħ�г�ά������" + "," + "���ﳵ��Ʒ�ܼ�Ϊ" + Sum_money + "����" );
			}
			else {
				System.out.println("��ѡ����������ڿ�棬������ѡ�����������");
			}
			break;
		case 4:
			System.out.println("��ѡ������½����������x���R��I��������");
			Num_trolley_Food = getNumber();
			if (Num_trolley_Food <= stock_Food){
				stock_Food = stock_Food - Num_trolley_Food;
				double Sum_money = Sum_Money();
				System.out.println("���ѹ�����" + Num_trolley_Food + "��½���" + "," + "���ﳵ��Ʒ�ܼ�Ϊ" + Sum_money + "����" );
			}
			else {
				System.out.println("��ѡ����������ڿ�棬������ѡ�����������");
			}
			break;
		case 5:
			Print_Customer();
			flag_Customer = true;
			flag_Buy_Option = false;
			break;
		default:
			System.out.println("��ݔ�����`��Ո�����x��");
			break;
			}
	}
	
	public static void CLS() {
		for(int i= 0 ; i<10; i++)
		System.out.println("\n");
	}
}
