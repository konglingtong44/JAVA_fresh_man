package practise_20170720;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Buffer_Read_test {
	public static void main(String[] args) throws Exception {
		File kkk1 = new File("D:\\kkk1.txt");
		FileReader fr1 = new FileReader(kkk1);
		BufferedReader br1 = new BufferedReader(fr1);
		String content ="";
		while((content = br1.readLine()) != null){
			System.out.println(content);
		}
	}
}
