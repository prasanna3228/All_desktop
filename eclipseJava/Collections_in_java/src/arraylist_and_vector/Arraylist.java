package arraylist_and_vector;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> all=new ArrayList<>();
		all.add(5);
		all.add(0,88);
		all.add(20);
		all.add(4);
		System.out.println(all);
		System.out.println(all.get(0));
//		all.removeAll(all);
		all.sort(null);
		System.out.println(all);
		System.out.println(all.size());
		System.out.println();
		
		ArrayList<String> str =new ArrayList<>();
		str.add("prasanna");
		str.add("12");
		System.out.println(str);
	}

}
