package garbage;

public class GcPractice {

	public void finalize() {
		System.out.println("Finalize method is called");
	}
	public static void main(String[] args) {
		
		GcPractice gcp1=new GcPractice();
		GcPractice gcp2=new GcPractice();
		GcPractice gcp3=new GcPractice();
		gcp1=null;
		new GcPractice();
		System.gc();
//		System.out.println();
		
	}

}
