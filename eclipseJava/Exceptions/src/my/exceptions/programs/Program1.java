package my.exceptions.programs;

import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args)  {
		System.out.println("program execution start");
		int fNumber=47;
		int sNumber=0;
		
		Scanner s=new Scanner(System.in);  ///input values taking
		
		int a=s.nextInt();
		int result=0;
		
		
		try {
			 result=fNumber/a;
			System.out.println("output is:"+ result);
		}catch(ArithmeticException e){
			System.out.println( e.getMessage()); //
			System.out.println(e.toString());
			throw e;
		}finally {
			System.out.println("finally blockkk");
		}
				
		System.out.println(result); 
		s.close();
		
	}
	
}