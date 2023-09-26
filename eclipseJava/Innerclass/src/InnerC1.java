
public class InnerC1 {
	public static void main(String[] args) {
		System.out.println("this is class 1");
	}

	class InnerC2{  //this is not inner class okey!
		public static void main(String[] args) {
			System.out.println("this is class 2");
		}
	}
	class InnerC3{
		public static void main(String[] args) {
			System.out.println("this is class 3");
		}
	}
	
	public void cal() {
		int a=100;
		System.out.println("this is innerc1 class method : "+a);
	}

}
