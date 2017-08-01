package practise_20170720;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_Write_test {
	public static void main(String[] args) throws Exception {
		File kkk1 = new File("D:\\kkk1.txt");
		FileWriter fw1 = new FileWriter(kkk1, true);
		BufferedWriter bw = new BufferedWriter(fw1);
		bw.newLine();
		bw.write("sss");
		bw.newLine();
		bw.write("sssss");
		bw.close();
	}
	
}
