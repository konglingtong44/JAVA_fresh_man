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
		System.out.println("请选择您选择的宠物种类");
		System.out.println("1.企鹅");
		System.out.println("2.狗");
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
			System.out.println("您是第一次进入QQ宠物，现为您进入创建QQ宠物界面");
			
			q = Creat_QQ();
			
			
			System.out.println(q.name);
		}
			List_QQ(q);
		
		
	}



	public static QQ Creat_QQ() {
		System.out.println("请输入您想要创建QQ宠物的姓名");
		QQ qq = new QQ();
		qq.Set_name();
		System.out.println("您输入的QQ宠物的姓名为" + qq.name);
		
		while(flag_sex_option)
		{
		System.out.println("请选择您QQ宠物的性别");
		System.out.println("1.公");
		System.out.println("2.母");
		int option_sex = getNumber();
		switch (option_sex) {
		case 1:
			qq.sex = "公";
			flag_sex_option = false;
			break;
		case 2 :
			qq.sex = "母";
			flag_sex_option = false;
			break;
		default:
			System.out.println("您输入有误，请重新选择");
			}	
		}
		System.out.println("您选择的" + qq.name + "的性别为" + qq.sex);
		System.out.println("现已为您进入QQ宠物界面");
		System.out.println("");
		flag_QQ = false;
		return qq;
	}
	
	public static void List_QQ(QQ q) {
		// TODO Auto-generated method stub
		System.out.println("1.显示"  + "信息");
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
