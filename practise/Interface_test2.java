package practise_20170714;

class Student{
	String name;
	
	public Student(String name){
		this.name = name;
	}
	
	public void study(){
		System.out.println(name + "����ѧϰ");
	}
}

interface Make_Money{
	void Makemoney();
}

class MoneyStudent extends Student implements Make_Money{

	public MoneyStudent(String name) {
		super(name);
	}

	@Override
	public void Makemoney() {
		System.out.println(name + "����Ŭ��׬Ǯ");
		
	}
	
}

public class Interface_test2 {
	public static void main(String[] args) {
		MoneyStudent student = new MoneyStudent("kkk");
		student.study();
		student.Makemoney();
	}
}
