
class Animal{
	public static void main(String[] args) {
		System.out.println("kkk");
		
		Dog g=new Dog();
		Monkey m=new Monkey();
		g.makingSound();
		m.makingSound();
	}
}


class Dog extends Animal{
	public void makingSound() {
		System.out.println("this dog sound is very horrible");
	}
}


class Monkey extends Animal{
	public  void makingSound() {
		System.out.println("mokey sound was  kich kich");
	}
	

	
}