package files.in.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program1 {


	public static void main(String[] args) throws IOException {
		File file=new File("./sample.txt");

		if(!file.exists())
			file.createNewFile();

		FileInputStream fis=new FileInputStream(file);
		int ascciCode;
		while((ascciCode=fis.read())!=-1) {
			System.out.print((char)ascciCode);
		}
		//		 System.out.println( fis.read());

		fis.close();
	}
}
