package arraylist_and_vector;

import java.util.*;

public class VectorPractice {
	public static void main(String[] args) {
		
		Vector v1 =new Vector();
		v1.add("prasanna");
		v1.add("kumar");
		v1.add(0,"bollu");
				
		System.out.println(v1);
		Vector v2=new Vector();
		v2.add("kl");
		v2.add("ms");
		Vector v3=new Vector();
		v2.add("kl");
		v2.add("ms");
		
		v1.addAll(v2);
//		v1.remove(0);
//		v1.removeAll(v2);
		v1.set(0, "helloo");
//		System.out.println(v1);
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
//		System.out.println(v1.contains("prasanna"));
//		System.out.println(v1.containsAll(v3));
		System.out.println(23);
	
	}
}
