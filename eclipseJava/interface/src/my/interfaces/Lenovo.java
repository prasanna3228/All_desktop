package my.interfaces;

public class Lenovo implements Laptop {

	@Override
	public void copy() {
		System.out.println("Lenovo copy code");
	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste code");
		
	}

	@Override
	public void cut() {
		System.out.println("Lenovo cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Lenovo keyboard code");
		
	}
	
	public void camera() {
		System.out.println("lenova camera code");
	}
	
		
}
