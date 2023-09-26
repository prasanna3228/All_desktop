import java.util.Scanner;

public class Bank {
	
	static int currentBalance=1000;
	public void deposite() {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		currentBalance= currentBalance+amount;
		System.out.println("deposite done  :"+currentBalance);
		
	}
	static void withdrawal() {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		
		if(currentBalance >amount) {
			currentBalance=currentBalance-amount;
		}else {
			System.out.println("founds not sufficient");
		}	
		sc.close();
	}
	
	static int  GetCbalance() {
		return currentBalance;
	}
	
	public static void main(String[] args) {
		Bank bank=new Bank();
		System.out.println("current balance:"+bank.GetCbalance());
		bank.deposite();
		System.out.println("current balance:"+bank.GetCbalance());
		withdrawal();
		System.out.println("Available balance:"+bank.GetCbalance());
			
	
	}
}
