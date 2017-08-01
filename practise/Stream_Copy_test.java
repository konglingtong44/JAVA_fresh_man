package practise_20170720;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Stream_Copy_test {
	public static void main(String[] args) throws Exception {
		File f1 = new File("D:\\kong3.jpg");
		File cf1 = new File("D:\\kong4.jpg");
		
		FileInputStream fis1 = new FileInputStream(f1);
		FileOutputStream fos1 = new FileOutputStream(cf1, true);
		
		byte[]b = new byte[1024];
		int len = 0;
		
		while ((len = fis1.read(b)) != -1){
			fos1.write(b, 0, len);
		}
		fos1.close();
		fis1.close();
	}
}
