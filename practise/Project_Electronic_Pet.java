package practise_20170714;

import java.util.Scanner;

abstract class Pet{
	String name;
	String health;
	String intimacy;
	
	public void Set_name(){
		this.name = Project_Electronic_Pet.getString();
	}
}

class Dog extends Pet{
	String type;
}


class QQ extends Pet{
	String sex;
	public void Set_sex(){
		this.sex = Project_Electronic_Pet.getString();
	}
}

public class Project_Electronic_Pet {
	
	static boolean flag_QQ = true;
	static boolean  flag_sex_option = true;
	
	public static void main(String[] args) {
		System.out.println("��ѡ����ѡ��ĳ�������");
		System.out.println("1.���");
		System.out.println("2.��");
		int option_type = getNumber();
		switch (option_type) {
		case 1:
			QQ();
			
			break;
		case 2:
			Dog();
			break;
		}
	}
	
	public static void QQ() {
		QQ q = new QQ();
		while(flag_QQ){
			System.out.println("���ǵ�һ�ν���QQ�����Ϊ�����봴��QQ�������");
			
			q = Creat_QQ();
			
			
			System.out.println(q.name);
		}
			List_QQ(q);
		
		
	}



	public static QQ Creat_QQ() {
		System.out.println("����������Ҫ����QQ���������");
		QQ qq = new QQ();
		qq.Set_name();
		System.out.println("�������QQ���������Ϊ" + qq.name);
		
		while(flag_sex_option)
		{
		System.out.println("��ѡ����QQ������Ա�");
		System.out.println("1.��");
		System.out.println("2.ĸ");
		int option_sex = getNumber();
		switch (option_sex) {
		case 1:
			qq.sex = "��";
			flag_sex_option = false;
			break;
		case 2 :
			qq.sex = "ĸ";
			flag_sex_option = false;
			break;
		default:
			System.out.println("����������������ѡ��");
			}	
		}
		System.out.println("��ѡ���" + qq.name + "���Ա�Ϊ" + qq.sex);
		System.out.println("����Ϊ������QQ�������");
		System.out.println("");
		flag_QQ = false;
		return qq;
	}
	
	public static void List_QQ(QQ q) {
		// TODO Auto-generated method stub
		System.out.println("1.��ʾ"  + "��Ϣ");
		System.out.println("2.");
	}
	
	public static void Dog() {
		// TODO Auto-generated method stub
		
	}
	
	public static String getString() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		return str;
	}
	
	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
}
