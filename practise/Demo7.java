package practise_20170718;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo7 {

	public static void main(String[] args) throws Exception {
		File file = new File("d:\\a.txt");
		FileInputStream fis = new FileInputStream(file);
		fis.close();
		System.out.println("∂¡»°ÕÍ±œ ");
	}
}
