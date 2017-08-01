package practise_20170720;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_Read_test {
	public static void main(String[] args) throws Exception {
		File kkk1 = new File("D:\\kkk1.txt");
		FileReader fr = new FileReader(kkk1);
		int len = 0;
		char [] c = new char [1024];
		while((len = fr.read(c)) != -1){
			
			System.out.println(new String(c, 0, len));
		}
		fr.close();
	}
	
}
