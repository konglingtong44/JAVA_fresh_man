package practise_20170714;

interface Usb{
	void service();
}

class Ufan implements Usb{

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("风扇转了起来");
	}
	
}

public class Interface_test {
	public static void main(String[] args) {
		Usb fan = new Ufan();
		fan.service();
	}
}
