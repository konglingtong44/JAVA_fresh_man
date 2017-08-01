package practise_20170712;

class Calculator{
	private int num1;
	private int num2;
	private char option;

	public Calculator(int n1, int n2, char o1){
		num1 = n1; 
		num2 = n2;
		if(o1 == '+'|| o1 == '-' || o1 == '*' || o1 == '/'){
			option = o1;
		}else{
			option = '+';
		}
	}
	
	public void print(){
		switch(option){
		case '+':
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		break;
		case '-':
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		break;
		case '*':
		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		break;
		case '/':
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		break;
		}
	}
}

public class Calclater {
	public static void main(String[] args) {
		Calculator c = new Calculator(2, 3, '*');
		c.print();
	}
}
