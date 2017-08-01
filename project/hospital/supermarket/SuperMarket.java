package practise_20170707;

import java.util.Scanner;

/**
 * 超市管理系统 : 购物 buy(); 结账 printTicket(); 查看流水 showFlow(); 查看总收入 showMoney4day();
 * 
 * @author Administrator
 * 
 */
public class SuperMarket {

	// 定义成员变量
	// 少林寺信息
	static String slsId = "090115"; // 编号
	static String slsName = "少林寺酥饼核桃"; // 名字
	static double slsPrice = 15.50; // 单价
	static String slsUnit = "个"; // 单位
	static int slsNumber = 0; // 购买的数量，之后用到
	static double slsMoney = 0; // 金额，之后用到
	// 尚康信息
	static String skId = "090028";
	static String skName = "精品尚康杂粮原味牡丹饼";
	static double skPrice = 16.00;
	static String skUnit = "个";
	static int skNumber = 0;
	static double skMoney = 0;

	static boolean flag = true; // 定义flag，作为是否退出程序的标志

	// 定义一个数组用来存储每次结账成功后保存的消费值
	static double[] flowData = new double[100];
	static int index = 0; // 定义一个索引作为标识符，判断是否达到100次

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 以此实现所需的几个功能，调用对应的几个方法
		while (flag) {
			System.out.println("请输入您要进行的操作:");
			System.out.println("                        1、开始购物");
			System.out.println("                        2、结账");
			System.out.println("                        3、查看流水");
			System.out.println("                        4、查看总账单");
			System.out.println("                        5、退出");
			System.out.println();
			int choose = getNumber();
			// 使用switch进行不同的选择对应的功能
			switch (choose) {
			case 1:
				buy();
				break;
			case 2:
				printTicket();
				break;
			case 3:
				showFlow();
				break;
			case 4:
				showMoney4day();
				break;
			case 5:
				// 清空信息
				slsNumber = 0;
				skNumber = 0;
				slsMoney = 0;
				skMoney = 0;
				flag = false; // 设置标识符为FALSE不再进行while循环
				break;
			default:
				System.out.println("请输入正确的数字:");
				break;
			}
		}
	}

	// 购物的方法
	public static void buy() {
		/*
		 * 通过变量打印商品报价单
		 */
		// 判断人数是否已经达到100，如果达到100则跳出方法
		if (index >= 100) {
			System.out.println("抱歉，今天商品售罄，请明天早点儿来");
			return;
		}
		// 打印输出
		System.out.println("                        欢迎光临");
		System.out.println();
		System.out
				.println("=============================================================");
		System.out.println();
		System.out
				.println("商品编号        商品名称                 商品单价              计价单位");
		System.out.println(slsId + "       " + slsName + "                 "
				+ slsPrice + "              " + slsUnit);
		System.out.println(skId + "       " + skName + "       " + skPrice
				+ "           " + skUnit);

		/*
		 * 让用户输入每种商品的购买数量
		 */

		// 少林寺数量
		System.out.println("请输入您要购买的" + slsName + "的数量：");
		System.out.println();
		slsNumber = getNumber(); // 得到用户输入值
		// 尚康数量
		System.out.println("请输入您要购买的" + skName + "的数量：");
		System.out.println();
		skNumber = getNumber();
	}

	// 结账的方法，打印小票
	public static void printTicket() {
		/*
		 * 计算汇总变量 商品项数 itemNumber; 总件数 totalItemsNumber; 总金额 totalMoney;
		 */
		slsMoney = slsPrice * slsNumber; // 计算少林寺金额
		skMoney = skPrice * skNumber; // 计算尚康金额
		int itemNumber = 2;
		int totalItemsNumber = slsNumber + skNumber;
		double totalMoney = slsMoney + skMoney; // 计算总金额

		// 利用if控制显示的字符串，如果大于7个字就只显示7个
		if (slsName.length() > 7)
			slsName = slsName.substring(0, 7) + "...";
		if (skName.length() > 7)
			skName = skName.substring(0, 7) + "...";

		/*
		 * 如果商品总价超过300元，打95折 如果商品总价超过600元，打9折 如果商品总价超过1000元，总价打8折
		 * 如果商品总价超过1000元，并且少林寺酥饼核桃购买超过30份, 则总价打8折后，立减20
		 */
		double afterMoney = totalMoney; // 初始化打折后的总金额
		if (totalMoney >= 300 && totalMoney < 600) {
			afterMoney = afterMoney * 0.95; // 如果商品总价超过300元，打95折
		}
		if (totalMoney >= 600 && totalMoney < 1000) {
			afterMoney = afterMoney * 0.9; // 如果商品总价超过600元，打9折
		}
		if (totalMoney >= 1000) {
			afterMoney = totalMoney * 0.8; // 如果商品总价超过1000元，总价打8折
			if (slsNumber >= 30) {
				afterMoney = afterMoney - 20; // 如果商品总价超过1000元，并且少林寺酥饼核桃购买超过30份,
												// 则总价打8折后，立减20
			}
		}
		/*
		 * 打印购物小票
		 */
		// 票头
		// 直接字符串常量打印
		System.out.println("                欢  迎  光  临        ");
		System.out.println();
		System.out
				.println("          品名                 售价        数量        金额        ");
		System.out
				.println("------------------------------------------------------");
		// 票体
		System.out.println(" " + slsName + "(" + slsId + ")    " + slsPrice
				+ " * " + slsNumber + " = " + slsMoney);
		System.out.println(" " + skName + "(" + skId + ") " + skPrice + " * "
				+ skNumber + " = " + skMoney);
		// 票脚
		System.out.println(" " + itemNumber + "项商品   共计:" + totalItemsNumber
				+ "件");
		System.out.println(" 总计：" + (int) afterMoney + "元");
		String tip_o = " 恭喜您！这次打折活动您节约了" + (int) (totalMoney - afterMoney)
				+ "元";
		String tip_n = " 您好，您不具备这次打折活动的优惠条件";
		String tip = totalMoney > afterMoney ? tip_o : tip_n;
		System.out.println(tip);
		System.out.println("   凭此小票换发票");

		// 添加流水信息
		flowData[index] = afterMoney;
		index++;
		// 清空信息
		slsNumber = 0;
		skNumber = 0;
		slsMoney = 0;
		skMoney = 0;
	}

	// 查看流水
	public static void showFlow() {
		for (int i = 0; i < index; i++) {
			System.out.println(flowData[i]);
		}
	}

	// 查看总账单的方法
	public static void showMoney4day() {
		double sum = 0;
		for (int i = 0; i < index; i++) {
			sum += flowData[i];
		}
		System.out.println("今天的总账单为：" + sum);
	}

	// 键盘录入的方法
	// 键盘录入的方法
	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
}