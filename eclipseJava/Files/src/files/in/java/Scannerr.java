package files.in.java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Scannerr {
	public static void main(String[] args) throws IOException {
		File file=new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		
		Scanner scanner=new Scanner(file);
		
		String text=new String();
		while (scanner.hasNext()) {
			text +=scanner.nextLine()+"\n";
//			System.out.println(scanner.nextLine());
		}
		
		
		System.out.println(text);
		
		scanner.close();
	}
}
