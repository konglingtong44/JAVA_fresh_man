package practise_20170720;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Stream_Write_test {
	public static void main(String[] args) throws Exception {
		File f1 = new File("D:\\kkk1.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write("123".getBytes());
		fos.write("123".getBytes());
	}
}
