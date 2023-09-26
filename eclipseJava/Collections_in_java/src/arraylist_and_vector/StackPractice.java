package arraylist_and_vector;

import java.util.*;

public class StackPractice {
	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		
		st.add("prasanna");
		st.add("kumar");
		st.add("kl");
//		System.out.println(st.pop());
//		System.out.println(st.peek());
		System.out.println(st.push("klll"));
		
		st.push("ms");
		st.push(null);
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.capacity());
	}
}
