package practise_20170707;

import java.util.Scanner;

/**
 * ���й���ϵͳ : ���� buy(); ���� printTicket(); �鿴��ˮ showFlow(); �鿴������ showMoney4day();
 * 
 * @author Administrator
 * 
 */
public class SuperMarket {

	// �����Ա����
	// ��������Ϣ
	static String slsId = "090115"; // ���
	static String slsName = "�������ֱ�����"; // ����
	static double slsPrice = 15.50; // ����
	static String slsUnit = "��"; // ��λ
	static int slsNumber = 0; // �����������֮���õ�
	static double slsMoney = 0; // ��֮���õ�
	// �п���Ϣ
	static String skId = "090028";
	static String skName = "��Ʒ�п�����ԭζĵ����";
	static double skPrice = 16.00;
	static String skUnit = "��";
	static int skNumber = 0;
	static double skMoney = 0;

	static boolean flag = true; // ����flag����Ϊ�Ƿ��˳�����ı�־

	// ����һ�����������洢ÿ�ν��˳ɹ��󱣴������ֵ
	static double[] flowData = new double[100];
	static int index = 0; // ����һ��������Ϊ��ʶ�����ж��Ƿ�ﵽ100��

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �Դ�ʵ������ļ������ܣ����ö�Ӧ�ļ�������
		while (flag) {
			System.out.println("��������Ҫ���еĲ���:");
			System.out.println("                        1����ʼ����");
			System.out.println("                        2������");
			System.out.println("                        3���鿴��ˮ");
			System.out.println("                        4���鿴���˵�");
			System.out.println("                        5���˳�");
			System.out.println();
			int choose = getNumber();
			// ʹ��switch���в�ͬ��ѡ���Ӧ�Ĺ���
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
				// �����Ϣ
				slsNumber = 0;
				skNumber = 0;
				slsMoney = 0;
				skMoney = 0;
				flag = false; // ���ñ�ʶ��ΪFALSE���ٽ���whileѭ��
				break;
			default:
				System.out.println("��������ȷ������:");
				break;
			}
		}
	}

	// ����ķ���
	public static void buy() {
		/*
		 * ͨ��������ӡ��Ʒ���۵�
		 */
		// �ж������Ƿ��Ѿ��ﵽ100������ﵽ100����������
		if (index >= 100) {
			System.out.println("��Ǹ��������Ʒ������������������");
			return;
		}
		// ��ӡ���
		System.out.println("                        ��ӭ����");
		System.out.println();
		System.out
				.println("=============================================================");
		System.out.println();
		System.out
				.println("��Ʒ���        ��Ʒ����                 ��Ʒ����              �Ƽ۵�λ");
		System.out.println(slsId + "       " + slsName + "                 "
				+ slsPrice + "              " + slsUnit);
		System.out.println(skId + "       " + skName + "       " + skPrice
				+ "           " + skUnit);

		/*
		 * ���û�����ÿ����Ʒ�Ĺ�������
		 */

		// ����������
		System.out.println("��������Ҫ�����" + slsName + "��������");
		System.out.println();
		slsNumber = getNumber(); // �õ��û�����ֵ
		// �п�����
		System.out.println("��������Ҫ�����" + skName + "��������");
		System.out.println();
		skNumber = getNumber();
	}

	// ���˵ķ�������ӡСƱ
	public static void printTicket() {
		/*
		 * ������ܱ��� ��Ʒ���� itemNumber; �ܼ��� totalItemsNumber; �ܽ�� totalMoney;
		 */
		slsMoney = slsPrice * slsNumber; // ���������½��
		skMoney = skPrice * skNumber; // �����п����
		int itemNumber = 2;
		int totalItemsNumber = slsNumber + skNumber;
		double totalMoney = slsMoney + skMoney; // �����ܽ��

		// ����if������ʾ���ַ������������7���־�ֻ��ʾ7��
		if (slsName.length() > 7)
			slsName = slsName.substring(0, 7) + "...";
		if (skName.length() > 7)
			skName = skName.substring(0, 7) + "...";

		/*
		 * �����Ʒ�ܼ۳���300Ԫ����95�� �����Ʒ�ܼ۳���600Ԫ����9�� �����Ʒ�ܼ۳���1000Ԫ���ܼ۴�8��
		 * �����Ʒ�ܼ۳���1000Ԫ�������������ֱ����ҹ��򳬹�30��, ���ܼ۴�8�ۺ�����20
		 */
		double afterMoney = totalMoney; // ��ʼ�����ۺ���ܽ��
		if (totalMoney >= 300 && totalMoney < 600) {
			afterMoney = afterMoney * 0.95; // �����Ʒ�ܼ۳���300Ԫ����95��
		}
		if (totalMoney >= 600 && totalMoney < 1000) {
			afterMoney = afterMoney * 0.9; // �����Ʒ�ܼ۳���600Ԫ����9��
		}
		if (totalMoney >= 1000) {
			afterMoney = totalMoney * 0.8; // �����Ʒ�ܼ۳���1000Ԫ���ܼ۴�8��
			if (slsNumber >= 30) {
				afterMoney = afterMoney - 20; // �����Ʒ�ܼ۳���1000Ԫ�������������ֱ����ҹ��򳬹�30��,
												// ���ܼ۴�8�ۺ�����20
			}
		}
		/*
		 * ��ӡ����СƱ
		 */
		// Ʊͷ
		// ֱ���ַ���������ӡ
		System.out.println("                ��  ӭ  ��  ��        ");
		System.out.println();
		System.out
				.println("          Ʒ��                 �ۼ�        ����        ���        ");
		System.out
				.println("------------------------------------------------------");
		// Ʊ��
		System.out.println(" " + slsName + "(" + slsId + ")    " + slsPrice
				+ " * " + slsNumber + " = " + slsMoney);
		System.out.println(" " + skName + "(" + skId + ") " + skPrice + " * "
				+ skNumber + " = " + skMoney);
		// Ʊ��
		System.out.println(" " + itemNumber + "����Ʒ   ����:" + totalItemsNumber
				+ "��");
		System.out.println(" �ܼƣ�" + (int) afterMoney + "Ԫ");
		String tip_o = " ��ϲ������δ��ۻ����Լ��" + (int) (totalMoney - afterMoney)
				+ "Ԫ";
		String tip_n = " ���ã������߱���δ��ۻ���Ż�����";
		String tip = totalMoney > afterMoney ? tip_o : tip_n;
		System.out.println(tip);
		System.out.println("   ƾ��СƱ����Ʊ");

		// �����ˮ��Ϣ
		flowData[index] = afterMoney;
		index++;
		// �����Ϣ
		slsNumber = 0;
		skNumber = 0;
		slsMoney = 0;
		skMoney = 0;
	}

	// �鿴��ˮ
	public static void showFlow() {
		for (int i = 0; i < index; i++) {
			System.out.println(flowData[i]);
		}
	}

	// �鿴���˵��ķ���
	public static void showMoney4day() {
		double sum = 0;
		for (int i = 0; i < index; i++) {
			sum += flowData[i];
		}
		System.out.println("��������˵�Ϊ��" + sum);
	}

	// ����¼��ķ���
	// ����¼��ķ���
	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
}