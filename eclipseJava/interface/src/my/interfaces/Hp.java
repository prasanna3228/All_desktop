package my.interfaces;

public class Hp implements Laptop {

	@Override
	public void copy() {
		System.out.println("Hp copy code");
	}

	@Override
	public void paste() {
		System.out.println("hp paste code");
		
	}

	@Override
	public void cut() {
		System.out.println("hp cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("hp keyboard code");
		
	}
	
	public void printing() {
		System.out.println("hp printing code");
	}
	
		
}
