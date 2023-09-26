package map;

import java.util.*;

public class Mapp {

	public static void main(String[] args) {
		
		Map<Integer,String> m= new Hashtable<>();
		m.put(1, "hyd");
		m.put(2, "chennai");
		m.put(3, "delhi");
		
		Set<Integer> keys=m.keySet();
		for (Integer key:keys) {
			System.out.println(key);
		}
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m);
		System.out.println(m.get(1));
		m.remove(1);
		System.out.println(m);
		System.out.println(m.containsKey(1));
		m.put(1, "hellooo"); //updation
		System.out.println(m);
		Collection<String> values=m.values();
		for (String value:values) {
			System.out.println(value);
		}
	}

}
