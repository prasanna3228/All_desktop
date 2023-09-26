
public class Innerclass extends InnerC1 { //outer class
	static int a=999;
	private int id=101;
	public static void main(String[] args) {
		System.out.println("this is main method");
		Innerclass ic=new Innerclass();
		TestClass1 tc1=ic.new TestClass1();
		tc1.show();
		
		ic.cal();
		
	}
	
	
	
	public class TestClass1 extends Student{ //inner class
		public void show() {
			System.out.println(id);
			System.out.println(getMarks());
			giveExam();
		}
		public void add() {
			TestClass1 tc1=new TestClass1();
		}
		public int getMarks() {
			return 888;
		}
		@Override
		public void giveExam() {
			// TODO Auto-generated method stub
			System.out.println("exam given");
			
		}
		
	}
}
