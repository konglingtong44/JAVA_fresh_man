package practise_20170720;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Stream_Read_test2 {
	public static void main(String[] args) {
		//read3();
		read4();
	}

	private static void read4() {
		// TODO Auto-generated method stub
		File ff2 = new File("D:\\ff2.txt");
		if (!ff2.exists()) {
			try {
				ff2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream ffis2 = null;
		
		try {
			ffis2 = new FileInputStream(ff2);
			
			byte[] b = new byte[4];
			int len = 0;
			while((len = ffis2.read(b)) != -1){
				System.out.println(new String(b, 0, len));
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ffis2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}/*

	private static void read3() {
		File ff1 = new File("D:\\ff1.txt");
		if(!ff1.exists()){
			try {
				ff1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream ffis1 = null;
		
		try {
			ffis1 = new FileInputStream(ff1);
			String t1  = null;
			byte [] a = new byte[1];
			System.out.println(ffis1.read(a));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ffis1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
*/