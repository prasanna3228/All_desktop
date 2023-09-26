package files.in.java;

import java.io.File;
import java.io.IOException;

public class Files {
	public static void main(String[] args) throws IOException {
		File  f=new File("D:\\Textfiles\\resume2.txt");
		
		if(f.exists()) {
			System.out.println("file  available");
			f.delete()
;		}else {
			System.out.println(f.createNewFile());
		}
			
	}
}
