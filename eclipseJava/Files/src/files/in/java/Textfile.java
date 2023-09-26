package files.in.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Textfile {
	public static void main(String[] args) throws IOException {
		File file=new File("./sample1.txt");
		
//		if(file.exists()) {
//			System.out.println("THIS FILE ALREADY AVAILABLE");
//			
//		}else {
//			file.createNewFile();
//			System.out.println("NEW FILE CREATED ");
//		}
		
		FileInputStream fis =new FileInputStream(file);
		
		Scanner scanner=new Scanner(file);
		String text =new String();
		while(scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
		
		String s="THIS TEXT WRITING THROUTH JAVA CODE";
		FileWriter fw=new FileWriter(file);
		fw.write(s);
		
		fw.close();
			
	}
}
