package practise_20170720;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Newfile {
	public static void main(String[] args) throws IOException {
		File f1 = new File ("D:\\kkk1.txt");
		System.out.println(f1.exists());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
	//	f1.deleteOnExit();
		f1.renameTo(new File("D:\\kkk2.txt"));
		if(!f1.exists()){
			f1.createNewFile();
		}
		
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getName());
		System.out.println(f1.getPath());
		System.out.println(f1.getParent());
		System.out.println(f1.length());
		System.out.println(f1.lastModified());
		
		Date d = new Date(f1.lastModified());
		DateFormat format = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		String date = format.format(d);
		System.out.println(date);
		
	}
}

