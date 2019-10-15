package Important;

import java.util.LinkedList;
import java.util.Queue;

public class StackusingSingleQueue {
	
	static class Stack
	{
		
		static Queue<Integer> q  = new LinkedList<Integer>();
		void push(int data)
		{
			int size=q.size();
			
			q.add(data);
			
			for(int i=0;i<size;i++) 
			{
				int val=q.remove(); // dequeueing from the queue and adding back to the same queue until q.size
				q.add(val);
			}
		}
		
		int pop()
		{
			if(q.isEmpty())
			{
				System.out.println("No elements");
				return -1;
			}
			int value=q.remove(); // remove the last value which was first added 
			return value;
				
		}
		
		int top()
		{
			if(q.isEmpty())
				return -1;
			else
				return q.peek();
		}
		
		boolean isEmpty()
		{
			return q.isEmpty();
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        System.out.println("Top element :" + s.top()); 
        s.pop(); 
        s.push(30); 
        s.pop(); 
        System.out.println("Top element :" + s.top()); 
	}

}
