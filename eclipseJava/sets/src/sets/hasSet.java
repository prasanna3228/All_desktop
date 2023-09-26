package sets;

import java.util.*;

public class hasSet {

	public static  void main(String[] args) {
		//HashSet -> HashMao => Array of node(key ,value)
		HashSet<Integer> hs=new HashSet<>();
		System.out.println(hs);
		hs.add(1);
		hs.add(2);
		hs.add(88);
		hs.add(1);
		hs.add(10);
		hs.add(12);
		System.out.println(hs);	
		
	}
}
