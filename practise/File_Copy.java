package practise_20170720;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Copy {
	public static void main(String[] args) throws Exception {
		File kkk1 = new File("D:\\kkk1.txt");
		File kkk2 = new File("D:\\kkk2.txt");
		FileReader fr1 = new FileReader(kkk1);
		FileWriter fw1 = new FileWriter(kkk2);
		
		char [] c = new char[1024];
		int len = 0;
		while((len = fr1.read(c))!= -1){
			fw1.write(c, 0, len);
		}
		fw1.close();
		fr1.close();
	}
}
