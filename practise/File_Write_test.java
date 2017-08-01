package practise_20170720;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Write_test {
	public static void main(String[] args) throws Exception {
		File kkk1 = new File("D:\\kkk1.txt");
		FileWriter fw = new FileWriter(kkk1, true);
		fw.write("´ó¼ÒºÃ");
		fw.close();
	}
	
}
