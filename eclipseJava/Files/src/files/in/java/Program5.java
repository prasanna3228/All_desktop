package files.in.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program5 {


	public static void main(String[] args) throws IOException {
		File file=new File("./sample.txt");

		if(file.exists())
			file.delete();
		file.createNewFile();
		String s="hellooo ";
		FileOutputStream fos=new FileOutputStream(file);
		for(char ch:s.toCharArray()) {
			fos.write((int)ch);
		}
		fos.write(65);
		fos.write(66);
		
		fos.flush();
		fos.close();
	}
}
