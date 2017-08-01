package practise_20170720;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Stream_Read_test {
	public static void main(String[] args) {
		read1();
		
		read2();
	}

	private static void read2() {
		// TODO Auto-generated method stub
		File f4 = new File("D:\\kkk4.txt");
		
		if(!f4.exists()){
			try {
				f4.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream fis2 = null;
		try {
			fis2 = new FileInputStream(f4);
			byte []a = new byte[1];
			while(fis2.read(a) != -1){
				System.out.print(new String(a ));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void read1() {
		// TODO Auto-generated method stub
		File f3 = new File("D:\\kkk3.txt");
		if(!f3.exists()){
			try {
				f3.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f3);
			int con = fis.read();
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
