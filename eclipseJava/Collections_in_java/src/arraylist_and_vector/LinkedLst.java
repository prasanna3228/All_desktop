package arraylist_and_vector;

import java.util.*;

public class LinkedLst {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Y1");
		ll.add("Y2");ll.add("Y2");
		ll.add("Y3");
		ll.set(0, null);
		System.out.println(ll.getLast());
		System.out.println(ll.indexOf("Y2"));
		
	}
}

















