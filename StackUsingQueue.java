package Important;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	static class Stack{
	
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();
	
	 static int current_size;
	 
	 Stack()
	 {
		 current_size=0;
		 
	 }
	 // Push all the remaining  
     // elements in q1 to q2.  

	 static void push(int data)
	 {
		 current_size++;
		 q2.add(data);
		 
		 while(!q1.isEmpty())
		 {
			 q2.add(q1.peek());
			 q1.remove();
		 }
		 
		  // swap the names of two queues  
		 Queue<Integer> q= q1;
		 q1=q2;
		 q2=q;
	 }
	 
	 static void pop()
	 {
		 /// if no elements in q1
		 if(q1.isEmpty())
			 return ;
		 q1.remove();
		 current_size--;
	 }
	
	 static int top()
	 {
		 if(q1.isEmpty())
			 return -1;
		 else
			 return q1.peek();
	 }
	 
	 static int size()
	 {
		 return current_size;
		 
	 }
	};
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack s = new Stack();  
		    s.push(1);  
		    s.push(2);  
		    s.push(3);  
		  
		    System.out.println("current size: " + s.size());  
		    System.out.println(s.top());  
		    s.pop();  
		    System.out.println(s.top());  
		    s.pop();  
		    System.out.println(s.top());  
		  
		    System.out.println("current size: " + s.size()); 
	}

}
