package queue;

import java.util.*;

public class Qpractice {
//default capacity 11;
	public static void main(String[] args) {
		PriorityQueue<Integer> pq= 
				new PriorityQueue<>();//Comparator.reverseOrder()
		pq.add(8);
		pq.offer(9);
		pq.offer(2);
		pq.add(1);
		pq.add(10);
		System.out.println(pq);
		System.out.println(pq.peek()); 
		System.out.println(pq.poll()); //remove the element
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.contains(8));
		
//		for (Integer integer:pq) {
//			System.out.println(integer);
//			
//		}
//		while(!pq.isEmpty()) {
//			System.out.println(pq.poll());
//		}
		pq.clear();
		System.out.println(pq);
	}

}


